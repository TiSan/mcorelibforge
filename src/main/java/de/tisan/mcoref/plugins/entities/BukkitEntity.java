package de.tisan.mcoref.plugins.entities;

import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;

public class BukkitEntity {

	private Entity entity;

	public BukkitEntity(Entity entity) {
		this.entity = entity;
	}

	public Entity getEntity() {
		return entity;
	}

	@Override
	public boolean equals(java.lang.Object arg0) {
		return entity.equals(arg0);
	}

	@Override
	public java.lang.String toString() {
		return entity.toString();
	}

	@Override
	public int hashCode() {
		return entity.hashCode();
	}

	public java.lang.String getName() {
		return entity.getName();
	}

	public net.minecraft.util.IChatComponent getDisplayName() {
		return entity.getDisplayName();
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

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void setAngles(float arg0, float arg1) {
		entity.setAngles(arg0, arg1);
	}

	public void setDead() {
		entity.setDead();
	}

	public net.minecraft.entity.DataWatcher getDataWatcher() {
		return entity.getDataWatcher();
	}

	public boolean isOutsideBorder() {
		return entity.isOutsideBorder();
	}

	public void killCommand() {
		entity.killCommand();
	}

	public final boolean isImmuneToFire() {
		return entity.isImmuneToFire();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.Vec3 getPositionEyes(float arg0) {
		return entity.getPositionEyes(arg0);
	}

	public void writeToNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		entity.writeToNBT(arg0);
	}

	public net.minecraft.entity.item.EntityItem entityDropItem(net.minecraft.item.ItemStack arg0, float arg1) {
		return entity.entityDropItem(arg0, arg1);
	}

	public boolean writeMountToNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		return entity.writeMountToNBT(arg0);
	}

	public void setInPortal() {
		entity.setInPortal();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void setVelocity(double arg0, double arg1, double arg2) {
		entity.setVelocity(arg0, arg1, arg2);
	}

	public net.minecraft.util.Vec3 getLookVec() {
		return entity.getLookVec();
	}

	public net.minecraft.item.ItemStack[] getInventory() {
		return entity.getInventory();
	}

	public void updateRidden() {
		entity.updateRidden();
	}

	public void readFromNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		entity.readFromNBT(arg0);
	}

	public void addToPlayerScore(net.minecraft.entity.Entity arg0, int arg1) {
		entity.addToPlayerScore(arg0, arg1);
	}

	public net.minecraft.util.AxisAlignedBB getCollisionBox(net.minecraft.entity.Entity arg0) {
		return entity.getCollisionBox(arg0);
	}

	public double getYOffset() {
		return entity.getYOffset();
	}

	public void mountEntity(net.minecraft.entity.Entity arg0) {
		entity.mountEntity(arg0);
	}

	public net.minecraft.util.Vec3 getLook(float arg0) {
		return entity.getLook(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.MovingObjectPosition rayTrace(double arg0, float arg1) {
		return entity.rayTrace(arg0, arg1);
	}

	public boolean isEntityAlive() {
		return entity.isEntityAlive();
	}

	public boolean interactFirst(net.minecraft.entity.player.EntityPlayer arg0) {
		return entity.interactFirst(arg0);
	}

	public boolean canBePushed() {
		return entity.canBePushed();
	}

	public net.minecraft.entity.item.EntityItem dropItem(net.minecraft.item.Item arg0, int arg1) {
		return entity.dropItem(arg0, arg1);
	}

	public void onChunkLoad() {
		entity.onChunkLoad();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void func_180426_a(double arg0, double arg1, double arg2, float arg3, float arg4, int arg5, boolean arg6) {
		entity.func_180426_a(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public net.minecraft.util.AxisAlignedBB getBoundingBox() {
		return entity.getBoundingBox();
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

	public void setWorld(net.minecraft.world.World arg0) {
		entity.setWorld(arg0);
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

	public boolean attackEntityFrom(net.minecraft.util.DamageSource arg0, float arg1) {
		return entity.attackEntityFrom(arg0, arg1);
	}

	public boolean isWet() {
		return entity.isWet();
	}

	public void func_174830_Y() {
		entity.func_174830_Y();
	}

	public void playSound(java.lang.String arg0, float arg1, float arg2) {
		entity.playSound(arg0, arg1, arg2);
	}

	public void fall(float arg0, float arg1) {
		entity.fall(arg0, arg1);
	}

	public boolean isInWater() {
		return entity.isInWater();
	}

	public void func_174810_b(boolean arg0) {
		entity.func_174810_b(arg0);
	}

	public double getDistanceSq(net.minecraft.util.BlockPos arg0) {
		return entity.getDistanceSq(arg0);
	}

	public double getDistanceSq(double arg0, double arg1, double arg2) {
		return entity.getDistanceSq(arg0, arg1, arg2);
	}

	public void updateRiderPosition() {
		entity.updateRiderPosition();
	}

	public boolean isInsideOfMaterial(net.minecraft.block.material.Material arg0) {
		return entity.isInsideOfMaterial(arg0);
	}

	public void setLocationAndAngles(double arg0, double arg1, double arg2, float arg3, float arg4) {
		entity.setLocationAndAngles(arg0, arg1, arg2, arg3, arg4);
	}

	public float getCollisionBorderSize() {
		return entity.getCollisionBorderSize();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void handleHealthUpdate(byte arg0) {
		entity.handleHealthUpdate(arg0);
	}

	public int getTeleportDirection() {
		return entity.getTeleportDirection();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean isInRangeToRenderDist(double arg0) {
		return entity.isInRangeToRenderDist(arg0);
	}

	public net.minecraft.entity.item.EntityItem dropItemWithOffset(net.minecraft.item.Item arg0, int arg1, float arg2) {
		return entity.dropItemWithOffset(arg0, arg1, arg2);
	}

	public void onCollideWithPlayer(net.minecraft.entity.player.EntityPlayer arg0) {
		entity.onCollideWithPlayer(arg0);
	}

	public void moveToBlockPosAndAngles(net.minecraft.util.BlockPos arg0, float arg1, float arg2) {
		entity.moveToBlockPosAndAngles(arg0, arg1, arg2);
	}

	public boolean writeToNBTOptional(net.minecraft.nbt.NBTTagCompound arg0) {
		return entity.writeToNBTOptional(arg0);
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

	public void onStruckByLightning(net.minecraft.entity.effect.EntityLightningBolt arg0) {
		entity.onStruckByLightning(arg0);
	}

	public void setRotationYawHead(float arg0) {
		entity.setRotationYawHead(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void performHurtAnimation() {
		entity.performHurtAnimation();
	}

	public float getExplosionResistance(net.minecraft.world.Explosion arg0, net.minecraft.world.World arg1, net.minecraft.util.BlockPos arg2, net.minecraft.block.state.IBlockState arg3) {
		return entity.getExplosionResistance(arg0, arg1, arg2, arg3);
	}

	public void addEntityCrashInfo(net.minecraft.crash.CrashReportCategory arg0) {
		entity.addEntityCrashInfo(arg0);
	}

	public boolean getAlwaysRenderNameTag() {
		return entity.getAlwaysRenderNameTag();
	}

	public void setPositionAndUpdate(double arg0, double arg1, double arg2) {
		entity.setPositionAndUpdate(arg0, arg1, arg2);
	}

	public void copyLocationAndAnglesFrom(net.minecraft.entity.Entity arg0) {
		entity.copyLocationAndAnglesFrom(arg0);
	}

	public boolean handleWaterMovement() {
		return entity.handleWaterMovement();
	}

	public double getDistanceSqToEntity(net.minecraft.entity.Entity arg0) {
		return entity.getDistanceSqToEntity(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean getAlwaysRenderNameTagForRender() {
		return entity.getAlwaysRenderNameTagForRender();
	}

	public void travelToDimension(int arg0) {
		entity.travelToDimension(arg0);
	}

	public net.minecraft.util.AxisAlignedBB getEntityBoundingBox() {
		return entity.getEntityBoundingBox();
	}

	public void setEntityBoundingBox(net.minecraft.util.AxisAlignedBB arg0) {
		entity.setEntityBoundingBox(arg0);
	}

	public boolean replaceItemInInventory(int arg0, net.minecraft.item.ItemStack arg1) {
		return entity.replaceItemInInventory(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean isInvisibleToPlayer(net.minecraft.entity.player.EntityPlayer arg0) {
		return entity.isInvisibleToPlayer(arg0);
	}

	public boolean canAttackWithItem() {
		return entity.canAttackWithItem();
	}

	public void applyEntityCollision(net.minecraft.entity.Entity arg0) {
		entity.applyEntityCollision(arg0);
	}

	public double getDistanceSqToCenter(net.minecraft.util.BlockPos arg0) {
		return entity.getDistanceSqToCenter(arg0);
	}

	public void setAlwaysRenderNameTag(boolean arg0) {
		entity.setAlwaysRenderNameTag(arg0);
	}

	public boolean canCommandSenderUseCommand(int arg0, java.lang.String arg1) {
		return entity.canCommandSenderUseCommand(arg0, arg1);
	}

	public void setCurrentItemOrArmor(int arg0, net.minecraft.item.ItemStack arg1) {
		entity.setCurrentItemOrArmor(arg0, arg1);
	}

	public net.minecraft.util.Vec3 getPositionVector() {
		return entity.getPositionVector();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int getBrightnessForRender(float arg0) {
		return entity.getBrightnessForRender(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
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

	public net.minecraft.entity.Entity getCommandSenderEntity() {
		return entity.getCommandSenderEntity();
	}

	public boolean sendCommandFeedback() {
		return entity.sendCommandFeedback();
	}

	public boolean shouldRenderInPass(int arg0) {
		return entity.shouldRenderInPass(arg0);
	}

	public java.lang.String registerExtendedProperties(java.lang.String arg0, net.minecraftforge.common.IExtendedEntityProperties arg1) {
		return entity.registerExtendedProperties(arg0, arg1);
	}

	public net.minecraftforge.common.IExtendedEntityProperties getExtendedProperties(java.lang.String arg0) {
		return entity.getExtendedProperties(arg0);
	}

	public boolean shouldDismountInWater(net.minecraft.entity.Entity arg0) {
		return entity.shouldDismountInWater(arg0);
	}

	public int getMaxFallHeight() {
		return entity.getMaxFallHeight();
	}

	public boolean isBurning() {
		return entity.isBurning();
	}

	public void func_145781_i(int arg0) {
		entity.func_145781_i(arg0);
	}

	public boolean isRiding() {
		return entity.isRiding();
	}

	public boolean isInvisible() {
		return entity.isInvisible();
	}

	public net.minecraft.util.EnumFacing func_174811_aO() {
		return entity.func_174811_aO();
	}

	public boolean isPushedByWater() {
		return entity.isPushedByWater();
	}

	public boolean func_174827_a(net.minecraft.entity.player.EntityPlayerMP arg0) {
		return entity.func_174827_a(arg0);
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

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean canRenderOnFire() {
		return entity.canRenderOnFire();
	}

	public void func_180432_n(net.minecraft.entity.Entity arg0) {
		entity.func_180432_n(arg0);
	}

	public java.lang.String getCustomNameTag() {
		return entity.getCustomNameTag();
	}

	public void onKillEntity(net.minecraft.entity.EntityLivingBase arg0) {
		entity.onKillEntity(arg0);
	}

	public boolean isSprinting() {
		return entity.isSprinting();
	}

	public void setInWeb() {
		entity.setInWeb();
	}

	public boolean func_180431_b(net.minecraft.util.DamageSource arg0) {
		return entity.func_180431_b(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean isEating() {
		return entity.isEating();
	}

	public void setAir(int arg0) {
		entity.setAir(arg0);
	}

	public void setSneaking(boolean arg0) {
		entity.setSneaking(arg0);
	}

	public boolean func_174816_a(net.minecraft.world.Explosion arg0, net.minecraft.world.World arg1, net.minecraft.util.BlockPos arg2, net.minecraft.block.state.IBlockState arg3, float arg4) {
		return entity.func_174816_a(arg0, arg1, arg2, arg3, arg4);
	}

	public java.util.UUID getUniqueID() {
		return entity.getUniqueID();
	}

	public boolean isEntityEqual(net.minecraft.entity.Entity arg0) {
		return entity.isEntityEqual(arg0);
	}

	public void setEating(boolean arg0) {
		entity.setEating(arg0);
	}

	public net.minecraft.entity.Entity[] getParts() {
		return entity.getParts();
	}

	public boolean isSneaking() {
		return entity.isSneaking();
	}

	public boolean hitByEntity(net.minecraft.entity.Entity arg0) {
		return entity.hitByEntity(arg0);
	}

	public void setCustomNameTag(java.lang.String arg0) {
		entity.setCustomNameTag(arg0);
	}

	public boolean hasCustomName() {
		return entity.hasCustomName();
	}

	public void setOutsideBorder(boolean arg0) {
		entity.setOutsideBorder(arg0);
	}

	public net.minecraft.command.CommandResultStats func_174807_aT() {
		return entity.func_174807_aT();
	}

	public net.minecraft.util.BlockPos getPosition() {
		return entity.getPosition();
	}

	public boolean func_180427_aV() {
		return entity.func_180427_aV();
	}

	public void func_174794_a(net.minecraft.command.CommandResultStats.Type arg0, int arg1) {
		entity.func_174794_a(arg0, arg1);
	}

	public net.minecraft.nbt.NBTTagCompound getEntityData() {
		return entity.getEntityData();
	}

	public void addChatMessage(net.minecraft.util.IChatComponent arg0) {
		entity.addChatMessage(arg0);
	}

	public net.minecraft.world.World getEntityWorld() {
		return entity.getEntityWorld();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void func_174834_g(net.minecraft.nbt.NBTTagCompound arg0) {
		entity.func_174834_g(arg0);
	}

	public void func_174817_o(net.minecraft.entity.Entity arg0) {
		entity.func_174817_o(arg0);
	}

	public net.minecraft.nbt.NBTTagCompound func_174819_aU() {
		return entity.func_174819_aU();
	}

	public boolean isCreatureType(net.minecraft.entity.EnumCreatureType arg0, boolean arg1) {
		return entity.isCreatureType(arg0, arg1);
	}

	public final void resetEntityId() {
		entity.resetEntityId();
	}

	public boolean canRiderInteract() {
		return entity.canRiderInteract();
	}

	public boolean shouldRiderSit() {
		return entity.shouldRiderSit();
	}

	public boolean func_174825_a(net.minecraft.entity.player.EntityPlayer arg0, net.minecraft.util.Vec3 arg1) {
		return entity.func_174825_a(arg0, arg1);
	}

	public java.util.UUID getPersistentID() {
		return entity.getPersistentID();
	}

	public net.minecraft.item.ItemStack getPickedResult(net.minecraft.util.MovingObjectPosition arg0) {
		return entity.getPickedResult(arg0);
	}

	public float getEyeHeight() {
		return entity.getEyeHeight();
	}

}
