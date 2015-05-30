package de.tisan.test;

import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.plugins.BukkitJavaPlugin;
import de.tisan.mcoref.plugins.commands.BukkitCommand;
import de.tisan.mcoref.plugins.commands.BukkitCommandSender;
import de.tisan.mcoref.plugins.players.BukkitPlayer;

public class TestPlugin extends BukkitJavaPlugin {

	@Override
	public void onEnable() {
		System.out.println("Plugin enabled!");
//		Bukkit.getEventManager().registerEvents(new TestPluginListener());

	}

	@Override
	public void onDisable() {
	}

	@Override
	public void onCommand(BukkitCommandSender sender, BukkitCommand command, String[] args) {
//		for (BukkitPlayer pl : Bukkit.getPlayers()) {
//			Bukkit.broadcastMessage("Player " + pl.getName());
//		}
		BukkitPlayer p = Bukkit.getPlayer(sender.getName());
		ManaProp mana = (ManaProp) p.getExtendedProperties("Test");
		System.out.println("Mana = " + mana.mana);
	}

	@Override
	public void onPreEnable() {
		Bukkit.getEventManager().registerEvents(new TestPluginListener());

	}

	@Override
	public void onPostEnable() {
		// TODO Auto-generated method stub

	}

}
