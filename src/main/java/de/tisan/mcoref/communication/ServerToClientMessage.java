package de.tisan.mcoref.communication;

import io.netty.buffer.ByteBuf;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public class ServerToClientMessage implements IMessage {
	private NBTTagCompound tag;

	public ServerToClientMessage() {

	}

	public ServerToClientMessage(NBTTagCompound tag) {
		this.tag = tag;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		tag = ByteBufUtils.readTag(buf);
	}

	@Override
	public void toBytes(ByteBuf buf) {
		ByteBufUtils.writeTag(buf, tag);
	}

	public NBTTagCompound getTag() {
		return tag;
	}

}
