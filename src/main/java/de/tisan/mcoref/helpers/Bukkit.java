package de.tisan.mcoref.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Map;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import de.tisan.mcoref.events.core.BukkitEventManager;
import de.tisan.mcoref.plugins.BukkitPluginManager;
import de.tisan.mcoref.plugins.commands.BukkitCommandManager;
import de.tisan.mcoref.plugins.players.BukkitPlayer;

public class Bukkit {
	private static BukkitPluginManager pluginManager;
	private static BukkitCommandManager commandManager;

	public static void sendMessage(BukkitPlayer player, String message) {
		player.addChatComponentMessage(new ChatComponentText(message));
	}

	public static void broadcastMessage(String message) {
		if (Bukkit.isServer()) {
			for (BukkitPlayer pl : Bukkit.getPlayers()) {
				Bukkit.sendMessage(pl, message);
			}
		} else {
			Bukkit.sendMessage(Bukkit.getClientPlayer(), message);
		}

	}

	public static BukkitPlayer getPlayer(String name) {
		if (Bukkit.isServer()) {
			for (Object pl : MinecraftServer.getServer().getConfigurationManager().playerEntityList) {
				if (pl instanceof BukkitPlayer) {
					BukkitPlayer p = (BukkitPlayer) pl;
					if (p.getCommandSenderName().equals(name)) {
						return p;
					}
				}
			}

		}
		return null;
	}

	@SideOnly(Side.CLIENT)
	public static BukkitPlayer getClientPlayer() {
		if (Bukkit.isClient()) {
			return new BukkitPlayer(Minecraft.getMinecraft().thePlayer);
		}
		return null;
	}

	@SideOnly(Side.CLIENT)
	public static EntityPlayer getClientVanillaPlayer() {
		if (Bukkit.isClient()) {
			return Minecraft.getMinecraft().thePlayer;
		}
		return null;
	}

	//@SideOnly(Side.SERVER)
	public static ArrayList<BukkitPlayer> getPlayers() {
		if (Bukkit.isServer()) {
			ArrayList<BukkitPlayer> players = new ArrayList<BukkitPlayer>();
			for (Object pl : MinecraftServer.getServer().getConfigurationManager().playerEntityList) {
				if (pl instanceof EntityPlayer) {
					EntityPlayer p = (EntityPlayer) pl;
					players.add(new BukkitPlayer(p));
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

	public static BukkitEventManager getEventManager() {
		return (Bukkit.manager == null ? (Bukkit.manager = new BukkitEventManager()) : Bukkit.manager);
	}

	public static void initPluginManager() {
		if (Bukkit.pluginManager == null) {
			Bukkit.pluginManager = new BukkitPluginManager();
		}
	}

	public static void initCommandManager() {
		if (Bukkit.commandManager == null) {
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
	public static ArrayList<ServerListEntry> getMinecraftMultiplayerServerListEntries() {
		ArrayList<ServerListEntry> groups = new ArrayList<ServerListEntry>();
		try {
			Map<String, Object> obj = NBTStreamReader.read(new FileInputStream(new File(Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "\\servers.dat")), false);
			String ll = "";
			for (Object o : obj.values()) {
				ll += o.toString().replace("\r\n", "").replace("\n", "");
			}
			int i = 0;
			int length = 0;
			int begin = 0;
			System.out.println(ll);
			while (true) {
				char current = ll.charAt(i);
				if (current == '{') {
					begin = i;

				} else if (current == '}') {
					groups.add(new ServerListEntry(ll.substring(begin + 1, i).split(", ")));
				}
				i++;
				if (i == ll.length()) {
					break;
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return groups;
	}
}
