package de.tisan.mcoref.helpers;

import java.util.ArrayList;

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

public class Bukkit {
	private static BukkitPluginManager pluginManager;
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
}
