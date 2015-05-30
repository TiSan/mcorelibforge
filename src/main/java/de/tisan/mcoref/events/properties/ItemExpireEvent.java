package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntityItem;

public class ItemExpireEvent extends ItemEvent{

	private int extraLife;

	public ItemExpireEvent(BukkitEntityItem item, int extraLife) {
		super(item);
		this.extraLife = extraLife;
	}

	public int getExtraLife() {
		return extraLife;
	}
	
}
