package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.entities.BukkitEntity;


public class EntityPlaySoundEffect extends EntityEvent{
	
	private String name;
	private float volume;
	private float pitch;
	private float newVolume;
	private float newPitch;
	
	public EntityPlaySoundEffect(BukkitEntity entity, String name, float volume, float pitch, float newVolume, float newPitch) {
		super(entity);
		this.volume = volume;
		this.pitch = pitch;
		this.newPitch = newPitch;
		this.newVolume = newVolume;
	}

	public String getName() {
		return name;
	}

	public float getVolume() {
		return volume;
	}

	public float getPitch() {
		return pitch;
	}

	public float getNewVolume() {
		return newVolume;
	}

	public float getNewPitch() {
		return newPitch;
	}

}
