package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntity;
import de.tisan.mcoref.plugins.entities.effect.BukkitEntityLightningBolt;

public class EntityStruckByLightningEvent extends EntityEvent {
	private BukkitEntityLightningBolt bolt;
	
	public EntityStruckByLightningEvent(BukkitEntity entity, BukkitEntityLightningBolt bolt){
		super(entity);
		this.bolt = bolt;
	}


	public BukkitEntityLightningBolt getBolt() {
		return bolt;
	}
	
	
}
