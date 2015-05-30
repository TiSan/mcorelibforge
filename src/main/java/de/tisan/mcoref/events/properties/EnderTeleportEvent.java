package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;

public class EnderTeleportEvent extends LivingEvent {
	private double targetX;
	private double targetY;
	private double targetZ;
	private float attackDamage;

	public EnderTeleportEvent(BukkitEntityLivingBase living, double targetX, double targetY, double targetZ, float attackDamage) {
		super(living);
		this.targetX = targetX;
        this.targetY = targetY;
        this.targetZ = targetZ;
        this.attackDamage = attackDamage;
	}

	public double getTargetX() {
		return targetX;
	}

	public double getTargetY() {
		return targetY;
	}

	public double getTargetZ() {
		return targetZ;
	}

	public float getAttackDamage() {
		return attackDamage;
	}

}
