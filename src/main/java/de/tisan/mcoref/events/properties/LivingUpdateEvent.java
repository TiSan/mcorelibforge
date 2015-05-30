package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;

public class LivingUpdateEvent extends LivingEvent{

	public LivingUpdateEvent(BukkitEntityLivingBase living) {
		super(living);
	}

}
