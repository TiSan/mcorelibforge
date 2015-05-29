package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntity;

public class EntityEvent extends BukkitEvent{
	private BukkitEntity entity;

	public EntityEvent(BukkitEntity entity) {
		this.entity = entity;
	}

	public BukkitEntity getEntity() {
		return entity;
	}

}
