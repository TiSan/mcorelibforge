package de.tisan.mcoref.plugins.commands;

import java.util.ArrayList;

import de.tisan.mcoref.plugins.BukkitJavaPlugin;

public class BukkitCommandManager {
	private ArrayList<BukkitCommand> commands;

	public BukkitCommandManager() {
		commands = new ArrayList<BukkitCommand>();
	}

	public BukkitCommand registerCommand(BukkitJavaPlugin plugin, String command, String description) {
		BukkitCommand c = new BukkitCommand(plugin, command, description);
		commands.add(c);
		return c;
	}

	public ArrayList<BukkitCommand> getCommands() {
		return commands;
	}

}
