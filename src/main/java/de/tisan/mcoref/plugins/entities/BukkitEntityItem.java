package de.tisan.mcoref.plugins.entities;

import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.fml.relauncher.Side;

public class BukkitEntityItem {

	private EntityItem item;

	public BukkitEntityItem(EntityItem item) {
		this.item = item;
	}

	public EntityItem getItem() {
		return item;
	}

	public java.lang.String getName() {
		return item.getName();
	}

	public java.lang.String getOwner() {
		return item.getOwner();
	}

	public void setInfinitePickupDelay() {
		item.setInfinitePickupDelay();
	}

	public void onCollideWithPlayer(net.minecraft.entity.player.EntityPlayer arg0) {
		item.onCollideWithPlayer(arg0);
	}

	public void travelToDimension(int arg0) {
		item.travelToDimension(arg0);
	}

	public boolean canAttackWithItem() {
		return item.canAttackWithItem();
	}

	public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		item.readEntityFromNBT(arg0);
	}

	public void setEntityItemStack(net.minecraft.item.ItemStack arg0) {
		item.setEntityItemStack(arg0);
	}

	public void setAgeToCreativeDespawnTime() {
		item.setAgeToCreativeDespawnTime();
	}

	public void setDefaultPickupDelay() {
		item.setDefaultPickupDelay();
	}

	public boolean handleWaterMovement() {
		return item.handleWaterMovement();
	}

	public boolean attackEntityFrom(net.minecraft.util.DamageSource arg0, float arg1) {
		return item.attackEntityFrom(arg0, arg1);
	}

	public void onUpdate() {
		item.onUpdate();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int func_174872_o() {
		return item.func_174872_o();
	}

	public net.minecraft.item.ItemStack getEntityItem() {
		return item.getEntityItem();
	}

	public void setNoPickupDelay() {
		item.setNoPickupDelay();
	}

	public void setOwner(java.lang.String arg0) {
		item.setOwner(arg0);
	}

	public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		item.writeEntityToNBT(arg0);
	}

	public void func_174873_u() {
		item.func_174873_u();
	}

	public void func_174870_v() {
		item.func_174870_v();
	}

	public boolean func_174874_s() {
		return item.func_174874_s();
	}

	public void setPickupDelay(int arg0) {
		item.setPickupDelay(arg0);
	}

	public void setThrower(java.lang.String arg0) {
		item.setThrower(arg0);
	}

	public java.lang.String getThrower() {
		return item.getThrower();
	}

}
