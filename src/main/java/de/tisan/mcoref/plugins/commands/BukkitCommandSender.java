package de.tisan.mcoref.plugins.commands;

import net.minecraft.command.CommandResultStats.Type;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.Vec3;
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
	public void addChatMessage(IChatComponent p_145747_1_) {
		sender.addChatMessage(p_145747_1_);
	}

	@Override
	public boolean canCommandSenderUseCommand(int p_70003_1_, String p_70003_2_) {
		return sender.canCommandSenderUseCommand(p_70003_1_, p_70003_2_);
	}

	@Override
	public World getEntityWorld() {
		return sender.getEntityWorld();
	}

	// NEW

	@Override
	public String getName() {
		return sender.getName();
	}

	@Override
	public IChatComponent getDisplayName() {
		return sender.getDisplayName();
	}

	@Override
	public BlockPos getPosition() {
		return sender.getPosition();
	}

	@Override
	public Vec3 getPositionVector() {
		return sender.getPositionVector();
	}

	@Override
	public Entity getCommandSenderEntity() {
		return sender.getCommandSenderEntity();
	}

	@Override
	public boolean sendCommandFeedback() {
		return sender.sendCommandFeedback();
	}

	@Override
	public void func_174794_a(Type p_174794_1_, int p_174794_2_) {
		System.out.println("func_174794_a in BukkitCommandSender " + p_174794_1_.func_179637_b() + ";" + p_174794_2_);
	}

}
