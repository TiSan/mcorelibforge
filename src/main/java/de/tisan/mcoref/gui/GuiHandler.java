package de.tisan.mcoref.gui;

import de.tisan.mcoref.plugins.location.Location;
import de.tisan.mcoref.plugins.players.BukkitPlayer;
import de.tisan.mcoref.plugins.worlds.BukkitWorld;

public abstract class GuiHandler {

	public abstract Object getServerGUI(int ID, BukkitPlayer bukkitPlayer, BukkitWorld bukkitWorld, Location location);

	public abstract Object getClientGUI(int ID, BukkitPlayer bukkitPlayer, BukkitWorld bukkitWorld, Location location);

}
