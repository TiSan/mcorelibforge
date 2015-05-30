package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntityItem;

public class ItemEvent extends BukkitEvent{
	private BukkitEntityItem item;
	
	public ItemEvent(BukkitEntityItem item){
		this.item = item;
	}

	public BukkitEntityItem getItem() {
		return item;
	}
	
}
