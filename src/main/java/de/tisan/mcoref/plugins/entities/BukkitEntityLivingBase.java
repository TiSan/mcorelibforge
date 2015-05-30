package de.tisan.mcoref.plugins.entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.fml.relauncher.Side;

public class BukkitEntityLivingBase {
	private EntityLivingBase living;

	public BukkitEntityLivingBase(EntityLivingBase living) {
		this.living = living;
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

	public net.minecraft.entity.EntityLivingBase getAITarget() {
		return living.getAITarget();
	}

	public void setRevengeTarget(net.minecraft.entity.EntityLivingBase arg0) {
		living.setRevengeTarget(arg0);
	}

	public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		living.writeEntityToNBT(arg0);
	}

	public void onEntityUpdate() {
		living.onEntityUpdate();
	}

	public boolean isChild() {
		return living.isChild();
	}

	public java.util.Random getRNG() {
		return living.getRNG();
	}

	public void setLastAttacker(net.minecraft.entity.Entity arg0) {
		living.setLastAttacker(arg0);
	}

	public int getAge() {
		return living.getAge();
	}

	public int getRevengeTimer() {
		return living.getRevengeTimer();
	}

	public net.minecraft.entity.EntityLivingBase getLastAttacker() {
		return living.getLastAttacker();
	}

	public void fall(float arg0, float arg1) {
		living.fall(arg0, arg1);
	}

	public boolean attackEntityFrom(net.minecraft.util.DamageSource arg0, float arg1) {
		return living.attackEntityFrom(arg0, arg1);
	}

	public void setHealth(float arg0) {
		living.setHealth(arg0);
	}

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

	public boolean isPotionActive(net.minecraft.potion.Potion arg0) {
		return living.isPotionActive(arg0);
	}

	public void knockBack(net.minecraft.entity.Entity arg0, float arg1, double arg2, double arg3) {
		living.knockBack(arg0, arg1, arg2, arg3);
	}

	public final float getHealth() {
		return living.getHealth();
	}

	public void addPotionEffect(net.minecraft.potion.PotionEffect arg0) {
		living.addPotionEffect(arg0);
	}

	public void onDeath(net.minecraft.util.DamageSource arg0) {
		living.onDeath(arg0);
	}

	public boolean isOnLadder() {
		return living.isOnLadder();
	}

	public void setAbsorptionAmount(float arg0) {
		living.setAbsorptionAmount(arg0);
	}

	public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		living.readEntityFromNBT(arg0);
	}

	public void removePotionEffectClient(int arg0) {
		living.removePotionEffectClient(arg0);
	}

	public void setCurrentItemOrArmor(int arg0, net.minecraft.item.ItemStack arg1) {
		living.setCurrentItemOrArmor(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean getAlwaysRenderNameTagForRender() {
		return living.getAlwaysRenderNameTagForRender();
	}

	public int getTotalArmorValue() {
		return living.getTotalArmorValue();
	}

	public final int getArrowCountInEntity() {
		return living.getArrowCountInEntity();
	}

	public boolean attackEntityAsMob(net.minecraft.entity.Entity arg0) {
		return living.attackEntityAsMob(arg0);
	}

	public float getAbsorptionAmount() {
		return living.getAbsorptionAmount();
	}

	public void renderBrokenItemStack(net.minecraft.item.ItemStack arg0) {
		living.renderBrokenItemStack(arg0);
	}

	public java.util.Collection getActivePotionEffects() {
		return living.getActivePotionEffects();
	}

	public void moveEntityWithHeading(float arg0, float arg1) {
		living.moveEntityWithHeading(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void performHurtAnimation() {
		living.performHurtAnimation();
	}

	public void curePotionEffects(net.minecraft.item.ItemStack arg0) {
		living.curePotionEffects(arg0);
	}

	public boolean shouldRiderFaceForward(net.minecraft.entity.player.EntityPlayer arg0) {
		return living.shouldRiderFaceForward(arg0);
	}

	public final void setArrowCountInEntity(int arg0) {
		living.setArrowCountInEntity(arg0);
	}

	public net.minecraft.entity.EnumCreatureAttribute getCreatureAttribute() {
		return living.getCreatureAttribute();
	}

	public boolean canBeCollidedWith() {
		return living.canBeCollidedWith();
	}

	public void clearActivePotions() {
		living.clearActivePotions();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void handleHealthUpdate(byte arg0) {
		living.handleHealthUpdate(arg0);
	}

	public void removePotionEffect(int arg0) {
		living.removePotionEffect(arg0);
	}

	public boolean isPotionApplicable(net.minecraft.potion.PotionEffect arg0) {
		return living.isPotionApplicable(arg0);
	}

	public net.minecraft.item.ItemStack getEquipmentInSlot(int arg0) {
		return living.getEquipmentInSlot(arg0);
	}

	public void setRotationYawHead(float arg0) {
		living.setRotationYawHead(arg0);
	}

	public float getRotationYawHead() {
		return living.getRotationYawHead();
	}

	public net.minecraft.potion.PotionEffect getActivePotionEffect(net.minecraft.potion.Potion arg0) {
		return living.getActivePotionEffect(arg0);
	}

	public net.minecraft.entity.ai.attributes.IAttributeInstance getEntityAttribute(net.minecraft.entity.ai.attributes.IAttribute arg0) {
		return living.getEntityAttribute(arg0);
	}

	public void onUpdate() {
		living.onUpdate();
	}

	public void mountEntity(net.minecraft.entity.Entity arg0) {
		living.mountEntity(arg0);
	}

	public void updateRidden() {
		living.updateRidden();
	}

	public net.minecraft.entity.EntityLivingBase func_94060_bK() {
		return living.func_94060_bK();
	}

	public final float getMaxHealth() {
		return living.getMaxHealth();
	}

	public void onLivingUpdate() {
		living.onLivingUpdate();
	}

	public net.minecraft.item.ItemStack getHeldItem() {
		return living.getHeldItem();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void func_180426_a(double arg0, double arg1, double arg2, float arg3, float arg4, int arg5, boolean arg6) {
		living.func_180426_a(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public float getAIMoveSpeed() {
		return living.getAIMoveSpeed();
	}

	public void setAIMoveSpeed(float arg0) {
		living.setAIMoveSpeed(arg0);
	}

	public net.minecraft.util.CombatTracker getCombatTracker() {
		return living.getCombatTracker();
	}

	public void setSprinting(boolean arg0) {
		living.setSprinting(arg0);
	}

	public boolean isPlayerSleeping() {
		return living.isPlayerSleeping();
	}

	public void swingItem() {
		living.swingItem();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.item.ItemStack getCurrentArmor(int arg0) {
		return living.getCurrentArmor(arg0);
	}

	public net.minecraft.entity.ai.attributes.BaseAttributeMap getAttributeMap() {
		return living.getAttributeMap();
	}

	public net.minecraft.item.ItemStack[] getInventory() {
		return living.getInventory();
	}

	public void dismountEntity(net.minecraft.entity.Entity arg0) {
		living.dismountEntity(arg0);
	}

	public boolean isOnTeam(net.minecraft.scoreboard.Team arg0) {
		return living.isOnTeam(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public float getSwingProgress(float arg0) {
		return living.getSwingProgress(arg0);
	}

	public boolean canBePushed() {
		return living.canBePushed();
	}

	public net.minecraft.scoreboard.Team getTeam() {
		return living.getTeam();
	}

	public net.minecraft.util.Vec3 getLookVec() {
		return living.getLookVec();
	}

	public boolean isOnSameTeam(net.minecraft.entity.EntityLivingBase arg0) {
		return living.isOnSameTeam(arg0);
	}

	public void func_152112_bu() {
		living.func_152112_bu();
	}

	public void setJumping(boolean arg0) {
		living.setJumping(arg0);
	}

	public boolean canEntityBeSeen(net.minecraft.entity.Entity arg0) {
		return living.canEntityBeSeen(arg0);
	}

	public boolean isServerWorld() {
		return living.isServerWorld();
	}

	public net.minecraft.util.Vec3 getLook(float arg0) {
		return living.getLook(arg0);
	}

	public void onItemPickup(net.minecraft.entity.Entity arg0, int arg1) {
		living.onItemPickup(arg0, arg1);
	}

	public void func_152111_bt() {
		living.func_152111_bt();
	}

}
