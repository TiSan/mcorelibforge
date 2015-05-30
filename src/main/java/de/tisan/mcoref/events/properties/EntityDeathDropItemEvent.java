package de.tisan.mcoref.events.properties;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.item.EntityItem;
import de.tisan.mcoref.plugins.damage.DamageCause;
import de.tisan.mcoref.plugins.entities.BukkitEntityItem;
import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;

public class EntityDeathDropItemEvent extends EntityDeathEvent {
	 private List<BukkitEntityItem> drops;
	 private int lootingLevel;
	 private boolean recentlyHit;
	
	
	public EntityDeathDropItemEvent(BukkitEntityLivingBase living, DamageCause cause, List<EntityItem> drops, int lootingLevel, boolean recentlyHit) {
		super(living, cause);
		this.lootingLevel = lootingLevel;
		this.recentlyHit = recentlyHit;
		this.drops = new ArrayList<BukkitEntityItem>();
		for(EntityItem d : drops){
			this.drops.add(new BukkitEntityItem(d));
		}
	}


	public List<BukkitEntityItem> getDrops() {
		return drops;
	}


	public int getLootingLevel() {
		return lootingLevel;
	}


	public boolean isRecentlyHit() {
		return recentlyHit;
	}

}
