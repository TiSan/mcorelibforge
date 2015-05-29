package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.players.BukkitPlayer;

public class ServerChatEvent extends BukkitEvent{
	private String message;
	private String username;
	private BukkitPlayer player;
	
	public ServerChatEvent(String message, BukkitPlayer player){
		this.message = message;
		this.player = player;
		username = player.getName();
	}

	public String getMessage() {
		return message;
	}

	public String getUsername() {
		return username;
	}

	public BukkitPlayer getPlayer() {
		return player;
	}
	
	
}
