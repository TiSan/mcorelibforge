package de.tisan.test;

import java.util.Arrays;

import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.plugins.BukkitJavaPlugin;
import de.tisan.mcoref.plugins.commands.BukkitCommand;
import de.tisan.mcoref.plugins.commands.BukkitCommandSender;

public class TestPlugin extends BukkitJavaPlugin{

	@Override
	public void onEnable() {
		System.out.println("Plugin enabled!");
		Bukkit.getEventManager().registerEvents(new TestPluginListener());
	}

	@Override
	public void onDisable() {
		
	}

	@Override
	public void onCommand(BukkitCommandSender sender, BukkitCommand command, String[] args) {
		System.out.println("Hey! " + command.getName() + " ; " + Arrays.toString(args));
	}

	
}
