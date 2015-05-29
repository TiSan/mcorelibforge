package de.tisan.mcoref.plugins.commands;

import net.minecraft.command.ICommandSender;

public class CommandSender {
	
	private ICommandSender sender;
	
	public CommandSender(ICommandSender sender){
		this.sender = sender;
	}
	
	public String getName(){
		return sender.getCommandSenderName();
	}

	public ICommandSender getSender() {
		return sender;
	}
	
	
}
