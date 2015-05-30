package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.damage.DamageCause;
import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;

public class EntityDeathEvent extends LivingEvent {

	private DamageCause cause;

	public EntityDeathEvent(BukkitEntityLivingBase living, DamageCause cause) {
		super(living);
		this.cause = cause;
	}

	public DamageCause getCause() {
		return cause;
	}

}
