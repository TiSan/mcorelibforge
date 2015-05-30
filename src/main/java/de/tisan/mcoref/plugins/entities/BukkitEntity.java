package de.tisan.mcoref.plugins.entities;

import java.util.UUID;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import de.tisan.mcoref.plugins.item.BukkitItemStack;
import de.tisan.mcoref.plugins.location.BukkitAxisAlignedBB;
import de.tisan.mcoref.plugins.location.Location;
import de.tisan.mcoref.plugins.nbt.BNBTTagCompound;
import de.tisan.mcoref.plugins.players.BukkitPlayer;
import de.tisan.mcoref.plugins.worlds.BukkitWorld;

public class BukkitEntity {

	private Entity entity;

	public BukkitEntity(Entity item) {
		entity = item;
	}

	public Entity getEntity() {
		return entity;
	}

	@Override
	public boolean equals(Object arg0) {
		return entity.equals(arg0);
	}

	@Override
	public String toString() {
		return entity.toString();
	}

	@Override
	public int hashCode() {
		return entity.hashCode();
	}

	public String getName() {
		return entity.getName();
	}

	public String getDisplayName() {
		return ((ChatComponentText) entity.getDisplayName()).getChatComponentText_TextValue();
	}

	public int getMaxInPortalTime() {
		return entity.getMaxInPortalTime();
	}

	public boolean isOffsetPositionInLiquid(double arg0, double arg1, double arg2) {
		return entity.isOffsetPositionInLiquid(arg0, arg1, arg2);
	}

	public boolean doesEntityNotTriggerPressurePlate() {
		return entity.doesEntityNotTriggerPressurePlate();
	}

	public void onEntityUpdate() {
		entity.onEntityUpdate();
	}

	public void onUpdate() {
		entity.onUpdate();
	}

	public void moveEntity(double arg0, double arg1, double arg2) {
		entity.moveEntity(arg0, arg1, arg2);
	}

	public void setFire(int arg0) {
		entity.setFire(arg0);
	}

	public void extinguish() {
		entity.extinguish();
	}

	public void setEntityId(int arg0) {
		entity.setEntityId(arg0);
	}

	public int getEntityId() {
		return entity.getEntityId();
	}

	public void setPosition(double arg0, double arg1, double arg2) {
		entity.setPosition(arg0, arg1, arg2);
	}

	@SideOnly(Side.CLIENT)
	public void setAngles(float arg0, float arg1) {
		entity.setAngles(arg0, arg1);
	}

	public void setDead() {
		entity.setDead();
	}

	public boolean isOutsideBorder() {
		return entity.isOutsideBorder();
	}

	public final boolean isImmuneToFire() {
		return entity.isImmuneToFire();
	}

	public void entityDropItem(BukkitItemStack arg0, float arg1) {
		entity.entityDropItem(arg0.getStack(), arg1);
	}

	public void setInPortal() {
		entity.setInPortal();
	}

	@SideOnly(Side.CLIENT)
	public void setVelocity(double arg0, double arg1, double arg2) {
		entity.setVelocity(arg0, arg1, arg2);
	}

	public BukkitItemStack[] getInventory() {
		return BukkitItemStack.getArray(entity.getInventory());
	}

	public void updateRidden() {
		entity.updateRidden();
	}

	public double getYOffset() {
		return entity.getYOffset();
	}

	public void mountEntity(BukkitEntity arg0) {
		entity.mountEntity(arg0.getEntity());
	}

	public boolean isEntityAlive() {
		return entity.isEntityAlive();
	}

	public boolean interactFirst(BukkitPlayer arg0) {
		return entity.interactFirst(arg0.getPlayer());
	}

	public boolean canBePushed() {
		return entity.canBePushed();
	}

	public BukkitAxisAlignedBB getBoundingBox() {
		return new BukkitAxisAlignedBB(entity.getBoundingBox());
	}

	public void moveFlying(float arg0, float arg1, float arg2) {
		entity.moveFlying(arg0, arg1, arg2);
	}

	public boolean isSlient() {
		return entity.isSlient();
	}

	public double getDistance(double arg0, double arg1, double arg2) {
		return entity.getDistance(arg0, arg1, arg2);
	}

	public void setWorld(BukkitWorld arg0) {
		entity.setWorld(arg0.getWorld());
	}

	public boolean isInLava() {
		return entity.isInLava();
	}

	public void addVelocity(double arg0, double arg1, double arg2) {
		entity.addVelocity(arg0, arg1, arg2);
	}

	public float getBrightness(float arg0) {
		return entity.getBrightness(arg0);
	}

	public boolean isWet() {
		return entity.isWet();
	}

	public void playSound(String arg0, float arg1, float arg2) {
		entity.playSound(arg0, arg1, arg2);
	}

	public void fall(float arg0, float arg1) {
		entity.fall(arg0, arg1);
	}

	public boolean isInWater() {
		return entity.isInWater();
	}

	public double getDistanceSq(Location arg0) {
		return entity.getDistanceSq(arg0.getBlockPos());
	}

	public double getDistanceSq(double arg0, double arg1, double arg2) {
		return entity.getDistanceSq(arg0, arg1, arg2);
	}

	public void updateRiderPosition() {
		entity.updateRiderPosition();
	}

	public void setLocationAndAngles(double arg0, double arg1, double arg2, float arg3, float arg4) {
		entity.setLocationAndAngles(arg0, arg1, arg2, arg3, arg4);
	}

	public float getCollisionBorderSize() {
		return entity.getCollisionBorderSize();
	}

	@SideOnly(Side.CLIENT)
	public void handleHealthUpdate(byte arg0) {
		entity.handleHealthUpdate(arg0);
	}

	public int getTeleportDirection() {
		return entity.getTeleportDirection();
	}

	@SideOnly(Side.CLIENT)
	public boolean isInRangeToRenderDist(double arg0) {
		return entity.isInRangeToRenderDist(arg0);
	}

	public void onCollideWithPlayer(BukkitPlayer arg0) {
		entity.onCollideWithPlayer(arg0.getPlayer());
	}

	public void moveToBlockPosAndAngles(Location arg0, float arg1, float arg2) {
		entity.moveToBlockPosAndAngles(arg0.getBlockPos(), arg1, arg2);
	}

	public float getDistanceToEntity(net.minecraft.entity.Entity arg0) {
		return entity.getDistanceToEntity(arg0);
	}

	public double getMountedYOffset() {
		return entity.getMountedYOffset();
	}

	public int getPortalCooldown() {
		return entity.getPortalCooldown();
	}

	public void setRotationYawHead(float arg0) {
		entity.setRotationYawHead(arg0);
	}

	@SideOnly(Side.CLIENT)
	public void performHurtAnimation() {
		entity.performHurtAnimation();
	}

	public boolean getAlwaysRenderNameTag() {
		return entity.getAlwaysRenderNameTag();
	}

	public void setPositionAndUpdate(double arg0, double arg1, double arg2) {
		entity.setPositionAndUpdate(arg0, arg1, arg2);
	}

	public void copyLocationAndAnglesFrom(BukkitEntity arg0) {
		entity.copyLocationAndAnglesFrom(arg0.getEntity());
	}

	public boolean handleWaterMovement() {
		return entity.handleWaterMovement();
	}

	public double getDistanceSqToEntity(BukkitEntity arg0) {
		return entity.getDistanceSqToEntity(arg0.getEntity());
	}

	@SideOnly(Side.CLIENT)
	public boolean getAlwaysRenderNameTagForRender() {
		return entity.getAlwaysRenderNameTagForRender();
	}

	public void travelToDimension(int arg0) {
		entity.travelToDimension(arg0);
	}

	public BukkitAxisAlignedBB getEntityBoundingBox() {
		return new BukkitAxisAlignedBB(entity.getEntityBoundingBox());
	}

	public void setEntityBoundingBox(BukkitAxisAlignedBB arg0) {
		entity.setEntityBoundingBox(arg0.getAxisAlignedBB());
	}

	public boolean replaceItemInInventory(int arg0, BukkitItemStack arg1) {
		return entity.replaceItemInInventory(arg0, arg1.getStack());
	}

	@SideOnly(Side.CLIENT)
	public boolean isInvisibleToPlayer(BukkitPlayer arg0) {
		return entity.isInvisibleToPlayer(arg0.getPlayer());
	}

	public boolean canAttackWithItem() {
		return entity.canAttackWithItem();
	}

	public void applyEntityCollision(BukkitEntity arg0) {
		entity.applyEntityCollision(arg0.getEntity());
	}

	public double getDistanceSqToCenter(Location arg0) {
		return entity.getDistanceSqToCenter(arg0.getBlockPos());
	}

	public void setAlwaysRenderNameTag(boolean arg0) {
		entity.setAlwaysRenderNameTag(arg0);
	}

	public boolean canCommandSenderUseCommand(int arg0, String arg1) {
		return entity.canCommandSenderUseCommand(arg0, arg1);
	}

	public void setCurrentItemOrArmor(int arg0, net.minecraft.item.ItemStack arg1) {
		entity.setCurrentItemOrArmor(arg0, arg1);
	}

	@SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float arg0) {
		return entity.getBrightnessForRender(arg0);
	}

	@SideOnly(Side.CLIENT)
	public boolean isInRangeToRender3d(double arg0, double arg1, double arg2) {
		return entity.isInRangeToRender3d(arg0, arg1, arg2);
	}

	public void setPositionAndRotation(double arg0, double arg1, double arg2, float arg3, float arg4) {
		entity.setPositionAndRotation(arg0, arg1, arg2, arg3, arg4);
	}

	public boolean canBeCollidedWith() {
		return entity.canBeCollidedWith();
	}

	public boolean isEntityInsideOpaqueBlock() {
		return entity.isEntityInsideOpaqueBlock();
	}

	public float getRotationYawHead() {
		return entity.getRotationYawHead();
	}

	public BukkitEntity getCommandSenderEntity() {
		return new BukkitEntity(entity.getCommandSenderEntity());
	}

	public boolean sendCommandFeedback() {
		return entity.sendCommandFeedback();
	}

	public boolean shouldRenderInPass(int arg0) {
		return entity.shouldRenderInPass(arg0);
	}

	public String registerExtendedProperties(String name, BExtendedProperties prop) {
		return entity.registerExtendedProperties(name, prop);
	}

	public BExtendedProperties getExtendedProperties(String name) {
		if (entity.getExtendedProperties(name) instanceof BExtendedProperties) {
			BExtendedProperties prop = (BExtendedProperties) entity.getExtendedProperties(name);
			return prop;
		}
		return null;
	}

	public boolean shouldDismountInWater(BukkitEntity arg0) {
		return entity.shouldDismountInWater(arg0.getEntity());
	}

	public int getMaxFallHeight() {
		return entity.getMaxFallHeight();
	}

	public boolean isBurning() {
		return entity.isBurning();
	}

	public boolean isRiding() {
		return entity.isRiding();
	}

	public boolean isInvisible() {
		return entity.isInvisible();
	}

	public boolean isPushedByWater() {
		return entity.isPushedByWater();
	}

	public void setSprinting(boolean arg0) {
		entity.setSprinting(arg0);
	}

	public void setInvisible(boolean arg0) {
		entity.setInvisible(arg0);
	}

	public int getAir() {
		return entity.getAir();
	}

	@SideOnly(Side.CLIENT)
	public boolean canRenderOnFire() {
		return entity.canRenderOnFire();
	}

	public String getCustomNameTag() {
		return entity.getCustomNameTag();
	}

	public boolean isSprinting() {
		return entity.isSprinting();
	}

	public void setInWeb() {
		entity.setInWeb();
	}

	@SideOnly(Side.CLIENT)
	public boolean isEating() {
		return entity.isEating();
	}

	public void setAir(int arg0) {
		entity.setAir(arg0);
	}

	public void setSneaking(boolean arg0) {
		entity.setSneaking(arg0);
	}

	public UUID getUniqueID() {
		return entity.getUniqueID();
	}

	public boolean isEntityEqual(BukkitEntity arg0) {
		return entity.isEntityEqual(arg0.getEntity());
	}

	public void setEating(boolean arg0) {
		entity.setEating(arg0);
	}

	public BukkitEntity[] getParts() {
		return BukkitEntity.getArray(entity.getParts());
	}

	public static BukkitEntity[] getArray(Entity[] ent) {
		BukkitEntity[] array = new BukkitEntity[ent.length];
		for (int i = 0; i < ent.length; i++) {
			array[i] = new BukkitEntity(ent[i]);
		}
		return array;
	}

	public boolean isSneaking() {
		return entity.isSneaking();
	}

	public boolean hitByEntity(BukkitEntity arg0) {
		return entity.hitByEntity(arg0.getEntity());
	}

	public void setCustomNameTag(String arg0) {
		entity.setCustomNameTag(arg0);
	}

	public boolean hasCustomName() {
		return entity.hasCustomName();
	}

	public void setOutsideBorder(boolean arg0) {
		entity.setOutsideBorder(arg0);
	}

	public Location getPosition() {
		return new Location(entity.getPosition());
	}

	public BNBTTagCompound getEntityData() {
		return new BNBTTagCompound(entity.getEntityData());
	}

	public void addChatMessage(String arg0) {
		entity.addChatMessage(new ChatComponentText(arg0));
	}

	public BukkitWorld getEntityWorld() {
		return new BukkitWorld(entity.getEntityWorld());
	}

	public boolean canRiderInteract() {
		return entity.canRiderInteract();
	}

	public boolean shouldRiderSit() {
		return entity.shouldRiderSit();
	}

	public UUID getPersistentID() {
		return entity.getPersistentID();
	}

	public float getEyeHeight() {
		return entity.getEyeHeight();
	}

	public BukkitPlayer castToPlayer() {
		if (entity instanceof EntityPlayer) {
			return new BukkitPlayer((EntityPlayer) entity);
		}
		return null;
	}

	public BukkitEntityLivingBase castToLivingBase() {
		if (entity instanceof EntityLivingBase) {
			return new BukkitEntityLivingBase((EntityLivingBase) entity);
		}
		return null;
	}

	public BukkitEntityItem castToItem() {
		if (entity instanceof EntityItem) {
			return new BukkitEntityItem((EntityItem) entity);
		}
		return null;
	}
}
