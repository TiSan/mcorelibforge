package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;

public class EntityDamageByFallEvent extends LivingEvent {
	private float distance;
	private float damageMultiplier;

	public EntityDamageByFallEvent(BukkitEntityLivingBase living, float distance, float damageMultiplier) {
		super(living);
		this.distance = distance;
		this.damageMultiplier = damageMultiplier;
	}

	public float getDistance() {
		return distance;
	}

	public float getDamageMultiplier() {
		return damageMultiplier;
	}

}
