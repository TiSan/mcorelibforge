package de.tisan.test;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.plugins.BukkitJavaPlugin;
import de.tisan.mcoref.plugins.commands.BukkitCommand;
import de.tisan.mcoref.plugins.commands.BukkitCommandSender;
import de.tisan.mcoref.plugins.players.BukkitPlayer;

public class TestPlugin extends BukkitJavaPlugin {

	@Override
	@SideOnly(value = Side.CLIENT)
	public void onEnable() {
		System.out.println("Plugin enabled!");
		Bukkit.getEventManager().registerEvents(new TestPluginListener());

	}

	@Override
	public void onDisable() {

	}

	@Override
	public void onCommand(BukkitCommandSender sender, BukkitCommand command, String[] args) {
		for (BukkitPlayer pl : Bukkit.getPlayers()) {
			Bukkit.broadcastMessage("Player " + pl.getName());
		}
	}

	@Override
	public void onPreEnable() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPostEnable() {
		// TODO Auto-generated method stub

	}

}
