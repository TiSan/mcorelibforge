package de.tisan.mcoref.examples.proxies;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;

public class MCoreFServerProxy extends MCoreFProxy {

	@Override
	public void preInit() {

	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}

	@Override
	public EntityPlayer getClientPlayer() {
		return null;
	}

	@Override
	public void registerRenderers() {

	}

	@Override
	public EntityPlayer getPacketPlayer(final INetHandler inh) {
		if (inh instanceof NetHandlerPlayServer) {
			return ((NetHandlerPlayServer) inh).playerEntity;
		}
		return null;
	}
}
