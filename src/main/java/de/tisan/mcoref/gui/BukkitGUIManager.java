package de.tisan.mcoref.gui;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import de.tisan.mcoref.plugins.location.Location;
import de.tisan.mcoref.plugins.players.BukkitPlayer;
import de.tisan.mcoref.plugins.worlds.BukkitWorld;

public class BukkitGUIManager {

	private static BukkitGUIManager instance;
	private ArrayList<GuiHandler> handler;

	public static BukkitGUIManager get() {
		return (BukkitGUIManager.instance != null ? BukkitGUIManager.instance : (BukkitGUIManager.instance = new BukkitGUIManager()));
	}

	public BukkitGUIManager() {
		handler = new ArrayList<>();
		register();
	}

	private void register() {
		IGuiHandler gui = new IGuiHandler() {

			@Override
			public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
				for (GuiHandler handl : handler) {
					Object obj;
					if ((obj = handl.getServerGUI(ID, new BukkitPlayer(player), new BukkitWorld(world), new Location(x, y, z))) != null) {
						return obj;
					}
				}
				return null;
			}

			@Override
			public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
				for (GuiHandler handl : handler) {
					Object obj;
					if ((obj = handl.getClientGUI(ID, new BukkitPlayer(player), new BukkitWorld(world), new Location(x, y, z))) != null) {
						return obj;
					}
				}
				return null;
			}
		};
	}

	public void addGuiElement(GuiHandler handler) {
		this.handler.add(handler);
	}
}
