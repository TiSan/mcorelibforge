package de.tisan.test;

import java.util.Arrays;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.helpers.ServerListEntry;
import de.tisan.mcoref.plugins.BukkitJavaPlugin;
import de.tisan.mcoref.plugins.commands.BukkitCommand;
import de.tisan.mcoref.plugins.commands.BukkitCommandSender;

public class TestPlugin extends BukkitJavaPlugin{

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
		System.out.println("Hey! " + command.getName() + " ; " + Arrays.toString(args));
		Bukkit.broadcastMessage("Ich bin " + Bukkit.isServer());
		for(ServerListEntry ss : Bukkit.getMinecraftMultiplayerServerListEntries()){
			Bukkit.broadcastMessage(ss.getIp());
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
