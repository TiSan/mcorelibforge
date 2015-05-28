package de.tisan.mcoref.core;

import java.io.IOException;

import net.minecraft.nbt.NBTException;
import de.tisan.mcoref.events.properties.BukkitListener;
import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.helpers.ServerListEntry;

public class Test implements BukkitListener {

	public static void main(String[] args) throws InterruptedException, IOException, NBTException {
		
		for(ServerListEntry ss : Bukkit.getMinecraftMultiplayerServerListEntries()){
			System.out.println(ss.getIp());
		}
	}

}
