package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;

public class LivingEvent extends BukkitEvent {
	private BukkitEntityLivingBase living;

	public LivingEvent(BukkitEntityLivingBase living) {
		this.living = living;
	}

	public BukkitEntityLivingBase getLiving() {
		return living;
	}

}
