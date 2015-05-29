package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntity;

public class EntityEnteringChunkEvent extends EntityEvent {
	public int newChunkX;
	public int newChunkZ;
	public int oldChunkX;
	public int oldChunkZ;

	public EntityEnteringChunkEvent(BukkitEntity entity, int newChunkX, int newChunkZ, int oldChunkX, int oldChunkZ) {
		super(entity);
		this.newChunkX = newChunkX;
		this.newChunkZ = newChunkZ;
		this.oldChunkX = oldChunkX;
		this.oldChunkZ = oldChunkZ;
	}

	public int getNewChunkX() {
		return newChunkX;
	}

	public int getNewChunkZ() {
		return newChunkZ;
	}

	public int getOldChunkX() {
		return oldChunkX;
	}

	public int getOldChunkZ() {
		return oldChunkZ;
	}

}
