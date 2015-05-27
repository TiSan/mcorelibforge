package de.tisan.mcoref.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import de.tisan.mcoref.commons.MCoreFProperty;
import de.tisan.mcoref.communication.Communication;
import de.tisan.mcoref.communication.CommunicationManager;
import de.tisan.mcoref.examples.blocks.FirstModBlocks;
import de.tisan.mcoref.examples.crafting.CraftingManager;
import de.tisan.mcoref.examples.items.FirstModItems;
import de.tisan.mcoref.examples.proxies.MCoreFProxy;
import de.tisan.mcoref.helpers.Bukkit;

@Mod(modid = MCoreFProperty.MODID, version = MCoreFProperty.VERSION, name = MCoreFProperty.NAME, canBeDeactivated = false)
public class MCoreF {
	@Instance(value = MCoreFProperty.MODID)
	public static MCoreF instance;

	@SidedProxy(clientSide = MCoreFProperty.CLIENTPROXY, serverSide = MCoreFProperty.SERVERPROXY)
	public static MCoreFProxy proxy;
	private CreativeTabs blockTab = new CreativeTabs("CruelTab") {

		@Override
		public Item getTabIconItem() {
			return Item.getItemFromBlock(FirstModBlocks.get().getBlockTiBlock());
		}
	};

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
		FirstModBlocks.get().preInit();
		FirstModItems.get().preInit();
		events = new MCoreFEvents();

		Bukkit.initCommandManager();
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
		CraftingManager.load();
		comm = CommunicationManager.createCommunication(MCoreFProperty.MODID);
		comm.addEvent(new MCoreFCommEvent());
		comm = CommunicationManager.createCommunication(MCoreFProperty.MODID + "1");
		comm.addEvent(new MCoreFCommEvent());
		
	}

	/**
	 * Renderers, Keybindings
	 * 
	 * @param event
	 */
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		MCoreF.proxy.postInit();
		
	}

	/**
	 * Commandregistrierung
	 * 
	 * @param event
	 */
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {

	}

	public CreativeTabs getBlockTab() {
		return blockTab;
	}

	public Communication getComm() {
		return comm;
	}

}