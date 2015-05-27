package de.tisan.mcoref.plugins.commands;

import java.util.ArrayList;

import de.tisan.mcoref.plugins.BukkitJavaPlugin;

public class BukkitCommandManager {
	private ArrayList<BukkitCommand> commands;
	
	public void registerCommand(BukkitJavaPlugin plugin, String command, String description){
		commands.add(new BukkitCommand(plugin, command, description));
	}
	
}
