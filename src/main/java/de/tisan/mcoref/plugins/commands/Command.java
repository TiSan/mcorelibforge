package de.tisan.mcoref.plugins.commands;

import java.util.List;

import net.minecraft.command.ICommand;

public class Command {
	private ICommand command;
	public Command(ICommand command){
		this.command = command;
	}
	public int compareTo(Object arg0) {
		return command.compareTo(arg0);
	}

	public String getCommandName() {
		return command.getCommandName();
	}

	public String getCommandUsage(CommandSender p_71518_1_) {
		return command.getCommandUsage(p_71518_1_.getSender());
	}

	public List getCommandAliases() {
		return command.getCommandAliases();
	}

	public boolean canCommandSenderUseCommand(CommandSender p_71519_1_) {
		return command.canCommandSenderUseCommand(p_71519_1_.getSender());
	}

	public List addTabCompletionOptions(CommandSender p_71516_1_, String[] p_71516_2_) {
		return command.addTabCompletionOptions(p_71516_1_.getSender(), p_71516_2_);
	}

	public boolean isUsernameIndex(String[] p_82358_1_, int p_82358_2_) {
		return command.isUsernameIndex(p_82358_1_, p_82358_2_);
	}

}
