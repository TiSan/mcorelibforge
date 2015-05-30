package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntityItem;
import de.tisan.mcoref.plugins.players.BukkitPlayer;

public class ItemTossEvent extends ItemEvent{

	private BukkitPlayer player;

	public ItemTossEvent(BukkitEntityItem item, BukkitPlayer player) {
		super(item);
		this.player = player;
	}

	public BukkitPlayer getPlayer() {
		return player;
	}

}
