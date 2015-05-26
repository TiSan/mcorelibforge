package de.tisan.test;

import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.plugins.BukkitJavaPlugin;

public class TestPlugin extends BukkitJavaPlugin{

	@Override
	public void onEnable() {
		System.out.println("Plugin enabled!");
		Bukkit.getEventManager().registerEvents(new TestPluginListener());
	}

	@Override
	public void onDisable() {
		
	}

	
}
