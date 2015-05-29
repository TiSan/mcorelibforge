package de.tisan.mcoref.plugins.entities.effect;

import net.minecraft.entity.effect.EntityLightningBolt;
import de.tisan.mcoref.plugins.entities.BukkitEntity;

public class BukkitEntityLightningBolt extends BukkitEntity{
	private EntityLightningBolt bolt;
	public BukkitEntityLightningBolt(EntityLightningBolt bolt) {
		super(bolt);
		this.bolt = bolt;
	}
	public EntityLightningBolt getBolt() {
		return bolt;
	}
	
}
