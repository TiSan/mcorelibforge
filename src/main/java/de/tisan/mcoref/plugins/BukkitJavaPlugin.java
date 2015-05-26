package de.tisan.mcoref.plugins;

import de.tisan.mcoref.plugins.commands.BukkitCommand;

public abstract class BukkitJavaPlugin {
	boolean enabled = true;
	BukkitCommand[] commands;
	String name;
	String version;

	public abstract void onEnable();

	public abstract void onDisable();

	public boolean isEnabled() {
		return enabled;
	}

	public BukkitCommand[] getCommands() {
		return commands;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

}
