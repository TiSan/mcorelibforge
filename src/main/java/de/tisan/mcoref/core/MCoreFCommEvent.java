package de.tisan.mcoref.core;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import de.tisan.mcoref.communication.CommunicationEvent;

public class MCoreFCommEvent implements CommunicationEvent {

	@Override
	public void onServerToClientMessageReceived(NBTTagCompound tag) {
		System.out.println("Client poked " + tag.getString("MESSAGE"));
	}

	@Override
	public void onClientToServerMessageReceived(NBTTagCompound tag) {
		if (tag.hasKey("EXPLODE_ON_TIBLOCK")) {
			int x = tag.getInteger("x");
			int y = tag.getInteger("y");
			int z = tag.getInteger("z");
			int worldId = tag.getInteger("worldId");
			World w = DimensionManager.getWorld(worldId);
			w.createExplosion(null, x, y, z, 1F, true);
		}
	}

}
