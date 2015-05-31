package de.tisan.mcoref.plugins.entities;

import net.minecraft.entity.item.EntityItem;
import de.tisan.mcoref.plugins.item.BukkitItemStack;

public class BukkitEntityItem extends BukkitEntity {

	private EntityItem item;

	public BukkitEntityItem(EntityItem item) {
		super(item);
		this.item = item;
	}

	public EntityItem getItem() {
		return item;
	}

	@Override
	public String getName() {
		return item.getName();
	}

	public String getOwner() {
		return item.getOwner();
	}

	public void setInfinitePickupDelay() {
		item.setInfinitePickupDelay();
	}

	@Override
	public void travelToDimension(int arg0) {
		item.travelToDimension(arg0);
	}

	@Override
	public boolean canAttackWithItem() {
		return item.canAttackWithItem();
	}

	public void setAgeToCreativeDespawnTime() {
		item.setAgeToCreativeDespawnTime();
	}

	public void setDefaultPickupDelay() {
		item.setDefaultPickupDelay();
	}

	@Override
	public boolean handleWaterMovement() {
		return item.handleWaterMovement();
	}

	@Override
	public void onUpdate() {
		item.onUpdate();
	}

	public BukkitItemStack getEntityItem() {
		return new BukkitItemStack(item.getEntityItem());
	}

	public void setNoPickupDelay() {
		item.setNoPickupDelay();
	}

	public void setOwner(String arg0) {
		item.setOwner(arg0);
	}

	public void setPickupDelay(int arg0) {
		item.setPickupDelay(arg0);
	}

	public void setThrower(String arg0) {
		item.setThrower(arg0);
	}

	public java.lang.String getThrower() {
		return item.getThrower();
	}

}
