package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.commands.Command;
import de.tisan.mcoref.plugins.commands.CommandSender;

public class CommandEvent extends BukkitEvent {
	private String[] args;
	private Command command;
	private CommandSender sender;

	public CommandEvent(Command command, CommandSender sender, String[] args) {
		this.command = command;
		this.sender = sender;
		this.args = args;
	}

	public String[] getArgs() {
		return args;
	}

	public Command getCommand() {
		return command;
	}

	public CommandSender getSender() {
		return sender;
	}

}
