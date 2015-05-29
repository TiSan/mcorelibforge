package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntity;
import de.tisan.mcoref.plugins.worlds.BukkitWorld;

public class EntityJoinWorldEvent extends EntityEvent {
	private BukkitWorld world;
	public EntityJoinWorldEvent(BukkitEntity entity, BukkitWorld world) {
		super(entity);
		this.world = world;
	}
	public BukkitWorld getWorld() {
		return world;
	}

}
