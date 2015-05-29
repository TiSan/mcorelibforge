package de.tisan.mcoref.core;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import de.tisan.mcoref.commons.MCoreFProperty;
import de.tisan.mcoref.communication.Communication;
import de.tisan.mcoref.communication.CommunicationManager;
import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.helpers.Logger;
import de.tisan.mcoref.plugins.BukkitJavaPluginLoader;
import de.tisan.mcoref.plugins.commands.BukkitCommand;
import de.tisan.mcoref.proxies.MCoreFProxy;

@Mod(modid = MCoreFProperty.MODID, version = MCoreFProperty.VERSION, name = MCoreFProperty.NAME, canBeDeactivated = false)
public class MCoreF {
	@Instance(value = MCoreFProperty.MODID)
	public static MCoreF instance;
	public static boolean DEBUG_MODE = false;
	@net.minecraftforge.fml.common.SidedProxy(clientSide = MCoreFProperty.CLIENTPROXY, serverSide = MCoreFProperty.SERVERPROXY)
	public static MCoreFProxy proxy;

	private Communication comm;
	private MCoreFEvents events;

	/**
	 * Erstellen von Blocks, Items und Tile Entities + Config.
	 * 
	 * @param event
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		MCoreF.proxy.preInit();
		events = new MCoreFEvents();
		MinecraftForge.EVENT_BUS.register(events);
		Bukkit.initCommandManager();
		if (Bukkit.isClient() && !MCoreF.DEBUG_MODE) {
			BukkitJavaPluginLoader.downloadPlugins(Bukkit.getMinecraftMultiplayerServerListEntries());
		}

		Bukkit.initPluginManager();

	}

	/**
	 * Netzwerksachen und so.
	 * 
	 * @param event
	 */
	@EventHandler
	public void init(FMLInitializationEvent event) {
		MCoreF.proxy.init();
		comm = CommunicationManager.createCommunication(MCoreFProperty.MODID);
		comm.addEvent(new MCoreFCommEvent());
		comm = CommunicationManager.createCommunication(MCoreFProperty.MODID + "1");
		comm.addEvent(new MCoreFCommEvent());
		Bukkit.getPluginManager().initEnable();
	}

	/**
	 * Renderers, Keybindings
	 * 
	 * @param event
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MCoreF.proxy.postInit();
		Bukkit.getPluginManager().initPostEnable();
	}

	/**
	 * Commandregistrierung
	 * 
	 * @param event
	 */
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		for (BukkitCommand c : Bukkit.getCommandManager().getCommands()) {
			Logger.info("Registering server command '" + c.getCommandName() + "' for plugin '" + c.getPlugin().getName() + "'");
			System.out.println(event);
			System.out.println(c);
			event.registerServerCommand(c);
		}
	}

	public Communication getComm() {
		return comm;
	}

}