package de.tisan.mcoref.plugins.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;

public class BukkitCommandSender implements ICommandSender {
	public static BukkitCommandSender convert(ICommandSender sender) {
		BukkitCommandSender newSender = new BukkitCommandSender(sender);

		return newSender;
	}

	private ICommandSender sender;

	private BukkitCommandSender(ICommandSender sender) {
		this.sender = sender;

	}

	@Override
	public String getCommandSenderName() {
		return sender.getCommandSenderName();
	}

	@Override
	public IChatComponent func_145748_c_() {
		return sender.func_145748_c_();
	}

	@Override
	public void addChatMessage(IChatComponent p_145747_1_) {
		sender.addChatMessage(p_145747_1_);
	}

	@Override
	public boolean canCommandSenderUseCommand(int p_70003_1_, String p_70003_2_) {
		return sender.canCommandSenderUseCommand(p_70003_1_, p_70003_2_);
	}

	@Override
	public ChunkCoordinates getPlayerCoordinates() {
		return sender.getPlayerCoordinates();
	}

	@Override
	public World getEntityWorld() {
		return sender.getEntityWorld();
	}

}
