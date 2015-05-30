package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.damage.DamageCause;
import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;

public class EntityAttackEvent extends LivingEvent{

	private DamageCause cause;
	private float amount;

	public EntityAttackEvent(BukkitEntityLivingBase living, DamageCause cause, float amount) {
		super(living);
		this.cause = cause;
		this.amount = amount;
	}

	public DamageCause getCause() {
		return cause;
	}

	public float getAmount() {
		return amount;
	}

}
