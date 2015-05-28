package de.tisan.mcoref.proxies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;

public abstract class MCoreFProxy {
	public abstract void preInit();

	public abstract void init();

	public abstract void postInit();

	public abstract EntityPlayer getClientPlayer();

	public abstract void registerRenderers();

	public abstract EntityPlayer getPacketPlayer(INetHandler iNetHandler);
}
