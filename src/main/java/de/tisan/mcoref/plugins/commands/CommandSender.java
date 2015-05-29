package de.tisan.mcoref.plugins.commands;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class CommandSender {

	private ICommandSender sender;

	public CommandSender(ICommandSender sender) {
		this.sender = sender;
	}

	public void addChatMessage(IChatComponent p_145747_1_) {
		sender.addChatMessage(p_145747_1_);
	}

	public boolean canCommandSenderUseCommand(int p_70003_1_, String p_70003_2_) {
		return sender.canCommandSenderUseCommand(p_70003_1_, p_70003_2_);
	}

	public World getEntityWorld() {
		return sender.getEntityWorld();
	}

	public String getName() {
		return sender.getName();
	}

	public IChatComponent getDisplayName() {
		return sender.getDisplayName();
	}

	public BlockPos getPosition() {
		return sender.getPosition();
	}

	public Vec3 getPositionVector() {
		return sender.getPositionVector();
	}

	public Entity getCommandSenderEntity() {
		return sender.getCommandSenderEntity();
	}

	public boolean sendCommandFeedback() {
		return sender.sendCommandFeedback();
	}

	public ICommandSender getSender() {
		return sender;
	}
}
