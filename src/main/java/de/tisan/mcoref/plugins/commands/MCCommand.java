package de.tisan.mcoref.plugins.commands;

import java.util.List;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.BlockPos;
import de.tisan.mcoref.plugins.BukkitJavaPlugin;

public class MCCommand implements ICommand {
	private String name;
	private String description;
	private String commandUsage;
	private BukkitJavaPlugin plugin;

	public MCCommand(BukkitJavaPlugin plugin, String name, String description) {
		this.plugin = plugin;
		this.name = name;
		this.description = description;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCommandName() {
		return name;
	}

	@Override
	public String getCommandUsage(ICommandSender p_71518_1_) {
		return commandUsage;
	}

	@Override
	public List getCommandAliases() {
		return null;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {
		plugin.onCommand(BukkitCommandSender.convert(sender), (BukkitCommand) this, args);
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender p_71519_1_) {
		return true;
	}

	@Override
	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
		return false;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCommandUsage() {
		return commandUsage;
	}

	public BukkitJavaPlugin getPlugin() {
		return plugin;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args, BlockPos pos) {
		return null;
	}

}
