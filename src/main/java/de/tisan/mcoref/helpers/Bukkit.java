package de.tisan.mcoref.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.tisan.mcoref.events.core.BukkitEventManager;
import de.tisan.mcoref.plugins.BukkitPluginManager;
import de.tisan.mcoref.plugins.commands.BukkitCommandManager;

public class Bukkit {
	private static BukkitPluginManager pluginManager;
	private static BukkitCommandManager commandManager;
	
	public static void sendMessage(EntityPlayer player, String message) {
		player.addChatComponentMessage(new ChatComponentText(message));
	}

	public static void sendMessage2(EntityPlayer player, String message) {
		player.addChatComponentMessage(new ChatComponentText(EnumChatFormatting.AQUA + message));
	}

	public static void broadcastMessage(String message) {
		if (Bukkit.isServer()) {
			for (EntityPlayer pl : Bukkit.getPlayers()) {
				Bukkit.sendMessage(pl, message);
			}
		} else {
			Bukkit.sendMessage(Bukkit.getClientPlayer(), message);
		}

	}

	public static EntityPlayer getPlayer(String name) {
		if (Bukkit.isServer()) {
			for (Object pl : MinecraftServer.getServer().getConfigurationManager().playerEntityList) {
				if (pl instanceof EntityPlayer) {
					EntityPlayer p = (EntityPlayer) pl;
					if (p.getCommandSenderName().equals(name)) {
						return p;
					}
				}
			}

		}
		return null;
	}
	
	@SideOnly(Side.CLIENT)
	public static EntityPlayer getClientPlayer() {
		if(Bukkit.isClient()){
			return Minecraft.getMinecraft().thePlayer;
		}
		return null;
	}

	public static ArrayList<EntityPlayer> getPlayers() {
		if (Bukkit.isServer()) {
			ArrayList<EntityPlayer> players = new ArrayList<EntityPlayer>();
			for (Object pl : MinecraftServer.getServer().getConfigurationManager().playerEntityList) {
				if (pl instanceof EntityPlayer) {
					EntityPlayer p = (EntityPlayer) pl;
					players.add(p);
				}
			}
			return players;
		}
		return null;
	}
	
	public static boolean isServer() {
		return FMLCommonHandler.instance().getEffectiveSide().equals(Side.SERVER);
	}
	public static boolean isClient() {
		return !Bukkit.isServer();
	}
	private static BukkitEventManager manager;
	
	public static BukkitEventManager getEventManager(){
		return (Bukkit.manager == null ? (Bukkit.manager = new BukkitEventManager()) : Bukkit.manager);
	}

	public static void initPluginManager() {
		if(Bukkit.pluginManager == null){
			Bukkit.pluginManager = new BukkitPluginManager();
		}
	}

	public static void initCommandManager() {
		if(Bukkit.commandManager == null){
			Bukkit.commandManager = new BukkitCommandManager();
		}
	}

	public static BukkitPluginManager getPluginManager() {
		return Bukkit.pluginManager;
	}

	public static BukkitCommandManager getCommandManager() {
		return Bukkit.commandManager;
	}
	@SideOnly(Side.CLIENT)
	public static ArrayList<ServerListEntry> getMinecraftMultiplayerServerListEntries(){
		ArrayList<ServerListEntry> groups = new ArrayList<ServerListEntry>();
		try{
			Map<String, Object> obj = NBTStreamReader.read(new FileInputStream(new File(Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "\\servers.dat")), false);
			String ll = "";
			for(Object o: obj.values()){
				ll += o.toString().replace("\r\n", "").replace("\n", "");
			}
			int i = 0;
			int length = 0;
			int begin = 0;
			System.out.println(ll);
			while(true){
				char current = ll.charAt(i);
				if(current == '{') {
					begin = i;
					
				} else if(current == '}') {
					groups.add(new ServerListEntry(ll.substring(begin + 1, i).split(", ")));
				}
				i++;
				if(i == ll.length()){
					break;
				}
			}
		} catch(Exception ex){
			ex.printStackTrace();
		}
		
		return groups;
	}
}
