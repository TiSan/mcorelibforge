package de.tisan.mcoref.examples.proxies;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;

public class MCoreFClientProxy extends MCoreFProxy {
	@Override
	public void preInit() {
		registerKeybinds();
	}

	private void registerKeybinds() {

	}

	@Override
	public void init() {

	}

	@Override
	public void postInit() {

	}

	@Override
	public EntityPlayer getClientPlayer() {
		return Minecraft.getMinecraft().thePlayer;
	}

	@Override
	public void registerRenderers() {

	}

	@Override
	public EntityPlayer getPacketPlayer(final INetHandler inh) {
		if (inh instanceof NetHandlerPlayServer) {
			return ((NetHandlerPlayServer) inh).playerEntity;
		}
		return Minecraft.getMinecraft().thePlayer;
	}
}
