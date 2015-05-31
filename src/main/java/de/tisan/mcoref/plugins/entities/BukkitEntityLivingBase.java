package de.tisan.mcoref.plugins.entities;

import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import de.tisan.mcoref.plugins.item.BukkitItemStack;
import de.tisan.mcoref.plugins.players.BukkitPlayer;

public class BukkitEntityLivingBase extends BukkitEntity {
	private EntityLivingBase living;

	public BukkitEntityLivingBase(EntityLivingBase living) {
		super(living);
		this.living = living;
	}

	public EntityLivingBase getEntityLivingBase() {
		return living;
	}

	public int getLastAttackerTime() {
		return living.getLastAttackerTime();
	}

	public boolean canBreatheUnderwater() {
		return living.canBreatheUnderwater();
	}

	public void killCommand() {
		living.killCommand();
	}

	public BukkitEntityLivingBase getAITarget() {
		return new BukkitEntityLivingBase(living.getAITarget());
	}

	public void setRevengeTarget(BukkitEntityLivingBase arg0) {
		living.setRevengeTarget(arg0.getEntityLivingBase());
	}

	@Override
	public void onEntityUpdate() {
		living.onEntityUpdate();
	}

	public boolean isChild() {
		return living.isChild();
	}

	public Random getRNG() {
		return living.getRNG();
	}

	public void setLastAttacker(BukkitEntity arg0) {
		living.setLastAttacker(arg0.getEntity());
	}

	public int getAge() {
		return living.getAge();
	}

	public int getRevengeTimer() {
		return living.getRevengeTimer();
	}

	public BukkitEntityLivingBase getLastAttacker() {
		return new BukkitEntityLivingBase(living.getLastAttacker());
	}

	@Override
	public void fall(float arg0, float arg1) {
		living.fall(arg0, arg1);
	}

	public void setHealth(float arg0) {
		living.setHealth(arg0);
	}

	@Override
	public boolean isEntityAlive() {
		return living.isEntityAlive();
	}

	public void heal(float arg0) {
		living.heal(arg0);
	}

	public boolean isEntityUndead() {
		return living.isEntityUndead();
	}

	public boolean isPotionActive(int arg0) {
		return living.isPotionActive(arg0);
	}

	public final float getHealth() {
		return living.getHealth();
	}

	public boolean isOnLadder() {
		return living.isOnLadder();
	}

	public void setAbsorptionAmount(float arg0) {
		living.setAbsorptionAmount(arg0);
	}

	public void removePotionEffectClient(int arg0) {
		living.removePotionEffectClient(arg0);
	}

	public int getTotalArmorValue() {
		return living.getTotalArmorValue();
	}

	public final int getArrowCountInEntity() {
		return living.getArrowCountInEntity();
	}

	public boolean attackEntityAsMob(BukkitEntity arg0) {
		return living.attackEntityAsMob(arg0.getEntity());
	}

	public float getAbsorptionAmount() {
		return living.getAbsorptionAmount();
	}

	public void renderBrokenItemStack(BukkitItemStack arg0) {
		living.renderBrokenItemStack(arg0.getStack());
	}

	public void moveEntityWithHeading(float arg0, float arg1) {
		living.moveEntityWithHeading(arg0, arg1);
	}

	public void curePotionEffects(BukkitItemStack arg0) {
		living.curePotionEffects(arg0.getStack());
	}

	public boolean shouldRiderFaceForward(BukkitPlayer arg0) {
		return living.shouldRiderFaceForward(arg0.getPlayer());
	}

	public final void setArrowCountInEntity(int arg0) {
		living.setArrowCountInEntity(arg0);
	}

	public void clearActivePotions() {
		living.clearActivePotions();
	}

	public void removePotionEffect(int arg0) {
		living.removePotionEffect(arg0);
	}

	public BukkitItemStack getEquipmentInSlot(int arg0) {
		return new BukkitItemStack(living.getEquipmentInSlot(arg0));
	}

	@Override
	public void setRotationYawHead(float arg0) {
		living.setRotationYawHead(arg0);
	}

	@Override
	public void onUpdate() {
		living.onUpdate();
	}

	@Override
	public void mountEntity(BukkitEntity arg0) {
		living.mountEntity(arg0.getEntity());
	}

	@Override
	public void updateRidden() {
		living.updateRidden();
	}

	public final float getMaxHealth() {
		return living.getMaxHealth();
	}

	public void onLivingUpdate() {
		living.onLivingUpdate();
	}

	public BukkitItemStack getHeldItem() {
		return new BukkitItemStack(living.getHeldItem());
	}

	public float getAIMoveSpeed() {
		return living.getAIMoveSpeed();
	}

	public void setAIMoveSpeed(float arg0) {
		living.setAIMoveSpeed(arg0);
	}

	@Override
	public void setSprinting(boolean arg0) {
		living.setSprinting(arg0);
	}

	public boolean isPlayerSleeping() {
		return living.isPlayerSleeping();
	}

	public void swingItem() {
		living.swingItem();
	}

	@SideOnly(Side.CLIENT)
	public BukkitItemStack getCurrentArmor(int arg0) {
		return new BukkitItemStack(living.getCurrentArmor(arg0));

	}

	@Override
	public BukkitItemStack[] getInventory() {
		return BukkitItemStack.getArray(living.getInventory());
	}

	@SideOnly(Side.CLIENT)
	public float getSwingProgress(float arg0) {
		return living.getSwingProgress(arg0);
	}

	@Override
	public boolean canBePushed() {
		return living.canBePushed();
	}

	public void setJumping(boolean arg0) {
		living.setJumping(arg0);
	}

	public boolean canEntityBeSeen(BukkitEntity arg0) {
		return living.canEntityBeSeen(arg0.getEntity());
	}

	public boolean isServerWorld() {
		return living.isServerWorld();
	}

}
