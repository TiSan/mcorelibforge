package de.tisan.mcoref.communication;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.Side;

public class ServerToClientHandler implements IMessageHandler<ServerToClientMessage, IMessage> {

	private Communication comm;

	public ServerToClientHandler() {

	}

	protected void setCommInstance(Communication comm) {
		this.comm = comm;
	}

	@Override
	public IMessage onMessage(ServerToClientMessage message, MessageContext ctx) {
		if (ctx.side.equals(Side.CLIENT)) {
			comm.pushClientEvent(message.getTag());
		}
		return null;
	}

}
