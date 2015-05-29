package de.tisan.mcoref.plugins.players;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.relauncher.Side;

public class BukkitPlayer {

	private EntityPlayer player;

	public BukkitPlayer(EntityPlayer pl) {
		player = pl;

	}

	public String getName() {
		return player.getName();
	}

	public net.minecraft.util.IChatComponent getDisplayName() {
		return player.getDisplayName();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int getItemInUseCount() {
		return player.getItemInUseCount();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int getItemInUseDuration() {
		return player.getItemInUseDuration();
	}

	public int getMaxInPortalTime() {
		return player.getMaxInPortalTime();
	}

	public void attackTargetEntityWithCurrentItem(net.minecraft.entity.Entity arg0) {
		player.attackTargetEntityWithCurrentItem(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean hasReducedDebug() {
		return player.hasReducedDebug();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.item.ItemStack getItemInUse() {
		return player.getItemInUse();
	}

	public boolean isUsingItem() {
		return player.isUsingItem();
	}

	public void stopUsingItem() {
		player.stopUsingItem();
	}

	public void clearItemInUse() {
		player.clearItemInUse();
	}

	public boolean isBlocking() {
		return player.isBlocking();
	}

	public void onUpdate() {
		player.onUpdate();
	}

	public void playSound(java.lang.String arg0, float arg1, float arg2) {
		player.playSound(arg0, arg1, arg2);
	}

	public int getPortalCooldown() {
		return player.getPortalCooldown();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void handleHealthUpdate(byte arg0) {
		player.handleHealthUpdate(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void preparePlayerToSpawn() {
		player.preparePlayerToSpawn();
	}

	public net.minecraft.entity.item.EntityItem dropPlayerItemWithRandomChoice(net.minecraft.item.ItemStack arg0, boolean arg1) {
		return player.dropPlayerItemWithRandomChoice(arg0, arg1);
	}

	public void joinEntityItemWithWorld(net.minecraft.entity.item.EntityItem arg0) {
		player.joinEntityItemWithWorld(arg0);
	}

	public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		player.readEntityFromNBT(arg0);
	}

	public int getTotalArmorValue() {
		return player.getTotalArmorValue();
	}

	public float getArmorVisibility() {
		return player.getArmorVisibility();
	}

	public void displayVillagerTradeGui(net.minecraft.entity.IMerchant arg0) {
		player.displayVillagerTradeGui(arg0);
	}

	public net.minecraft.item.ItemStack getCurrentEquippedItem() {
		return player.getCurrentEquippedItem();
	}

	public void destroyCurrentEquippedItem() {
		player.destroyCurrentEquippedItem();
	}

	public void onEnchantmentCritical(net.minecraft.entity.Entity arg0) {
		player.onEnchantmentCritical(arg0);
	}

	public boolean isEntityInsideOpaqueBlock() {
		return player.isEntityInsideOpaqueBlock();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public float getBedOrientationInDegrees() {
		return player.getBedOrientationInDegrees();
	}

	public boolean isPlayerFullyAsleep() {
		return player.isPlayerFullyAsleep();
	}

	public void addChatComponentMessage(net.minecraft.util.IChatComponent arg0) {
		player.addChatComponentMessage(arg0);
	}

	public void triggerAchievement(net.minecraft.stats.StatBase arg0) {
		player.triggerAchievement(arg0);
	}

	public void moveEntityWithHeading(float arg0, float arg1) {
		player.moveEntityWithHeading(arg0, arg1);
	}

	public void closeScreen() {
		player.closeScreen();
	}

	public void updateRidden() {
		player.updateRidden();
	}

	public void onLivingUpdate() {
		player.onLivingUpdate();
	}

	public int getScore() {
		return player.getScore();
	}

	public void setScore(int arg0) {
		player.setScore(arg0);
	}

	public void addScore(int arg0) {
		player.addScore(arg0);
	}

	public void onDeath(net.minecraft.util.DamageSource arg0) {
		player.onDeath(arg0);
	}

	public void addToPlayerScore(net.minecraft.entity.Entity arg0, int arg1) {
		player.addToPlayerScore(arg0, arg1);
	}

	public net.minecraft.entity.item.EntityItem dropOneItem(boolean arg0) {
		return player.dropOneItem(arg0);
	}

	public net.minecraft.entity.item.EntityItem func_146097_a(net.minecraft.item.ItemStack arg0, boolean arg1, boolean arg2) {
		return player.func_146097_a(arg0, arg1, arg2);
	}

	@java.lang.Deprecated
	public float func_180471_a(net.minecraft.block.Block arg0) {
		return player.func_180471_a(arg0);
	}

	public float getBreakSpeed(net.minecraft.block.state.IBlockState arg0, net.minecraft.util.BlockPos arg1) {
		return player.getBreakSpeed(arg0, arg1);
	}

	public boolean canHarvestBlock(net.minecraft.block.Block arg0) {
		return player.canHarvestBlock(arg0);
	}

	public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		player.writeEntityToNBT(arg0);
	}

	public boolean attackEntityFrom(net.minecraft.util.DamageSource arg0, float arg1) {
		return player.attackEntityFrom(arg0, arg1);
	}

	public boolean canAttackPlayer(net.minecraft.entity.player.EntityPlayer arg0) {
		return player.canAttackPlayer(arg0);
	}

	public void func_175141_a(net.minecraft.tileentity.TileEntitySign arg0) {
		player.func_175141_a(arg0);
	}

	public void func_146095_a(net.minecraft.command.server.CommandBlockLogic arg0) {
		player.func_146095_a(arg0);
	}

	public void displayGUIChest(net.minecraft.inventory.IInventory arg0) {
		player.displayGUIChest(arg0);
	}

	public void displayGUIHorse(net.minecraft.entity.passive.EntityHorse arg0, net.minecraft.inventory.IInventory arg1) {
		player.displayGUIHorse(arg0, arg1);
	}

	public void displayGui(net.minecraft.world.IInteractionObject arg0) {
		player.displayGui(arg0);
	}

	public void displayGUIBook(net.minecraft.item.ItemStack arg0) {
		player.displayGUIBook(arg0);
	}

	public boolean interactWith(net.minecraft.entity.Entity arg0) {
		return player.interactWith(arg0);
	}

	public double getYOffset() {
		return player.getYOffset();
	}

	public void onCriticalHit(net.minecraft.entity.Entity arg0) {
		player.onCriticalHit(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void respawnPlayer() {
		player.respawnPlayer();
	}

	public void setDead() {
		player.setDead();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean func_175144_cb() {
		return player.func_175144_cb();
	}

	public com.mojang.authlib.GameProfile getGameProfile() {
		return player.getGameProfile();
	}

	public net.minecraft.entity.player.EntityPlayer.EnumStatus func_180469_a(net.minecraft.util.BlockPos arg0) {
		return player.func_180469_a(arg0);
	}

	public void wakeUpPlayer(boolean arg0, boolean arg1, boolean arg2) {
		player.wakeUpPlayer(arg0, arg1, arg2);
	}

	public static net.minecraft.util.BlockPos func_180467_a(net.minecraft.world.World arg0, net.minecraft.util.BlockPos arg1, boolean arg2) {
		return EntityPlayer.func_180467_a(arg0, arg1, arg2);
	}

	public boolean isPlayerSleeping() {
		return player.isPlayerSleeping();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int getSleepTimer() {
		return player.getSleepTimer();
	}

	public net.minecraft.util.BlockPos getBedLocation() {
		return player.getBedLocation();
	}

	public net.minecraft.util.BlockPos getBedLocation(int arg0) {
		return player.getBedLocation(arg0);
	}

	@java.lang.Deprecated
	public boolean isSpawnForced() {
		return player.isSpawnForced();
	}

	public boolean isSpawnForced(int arg0) {
		return player.isSpawnForced(arg0);
	}

	public void setSpawnPoint(net.minecraft.util.BlockPos arg0, boolean arg1) {
		player.setSpawnPoint(arg0, arg1);
	}

	public void addStat(net.minecraft.stats.StatBase arg0, int arg1) {
		player.addStat(arg0, arg1);
	}

	public void func_175145_a(net.minecraft.stats.StatBase arg0) {
		player.func_175145_a(arg0);
	}

	public void jump() {
		player.jump();
	}

	public float getAIMoveSpeed() {
		return player.getAIMoveSpeed();
	}

	public void addMovementStat(double arg0, double arg1, double arg2) {
		player.addMovementStat(arg0, arg1, arg2);
	}

	public void fall(float arg0, float arg1) {
		player.fall(arg0, arg1);
	}

	public void onKillEntity(net.minecraft.entity.EntityLivingBase arg0) {
		player.onKillEntity(arg0);
	}

	public void setInWeb() {
		player.setInWeb();
	}

	public net.minecraft.item.ItemStack getCurrentArmor(int arg0) {
		return player.getCurrentArmor(arg0);
	}

	public void addExperience(int arg0) {
		player.addExperience(arg0);
	}

	public int getXPSeed() {
		return player.getXPSeed();
	}

	public int xpBarCap() {
		return player.xpBarCap();
	}

	public void addExhaustion(float arg0) {
		player.addExhaustion(arg0);
	}

	public net.minecraft.util.FoodStats getFoodStats() {
		return player.getFoodStats();
	}

	public boolean canEat(boolean arg0) {
		return player.canEat(arg0);
	}

	public boolean shouldHeal() {
		return player.shouldHeal();
	}

	public void setItemInUse(net.minecraft.item.ItemStack arg0, int arg1) {
		player.setItemInUse(arg0, arg1);
	}

	public boolean func_175142_cm() {
		return player.func_175142_cm();
	}

	public boolean func_175151_a(net.minecraft.util.BlockPos arg0, net.minecraft.util.EnumFacing arg1, net.minecraft.item.ItemStack arg2) {
		return player.func_175151_a(arg0, arg1, arg2);
	}

	public void clonePlayer(net.minecraft.entity.player.EntityPlayer arg0, boolean arg1) {
		player.clonePlayer(arg0, arg1);
	}

	public void setGameType(net.minecraft.world.WorldSettings.GameType arg0) {
		player.setGameType(arg0);
	}

	public void removeExperienceLevel(int arg0) {
		player.removeExperienceLevel(arg0);
	}

	public void addExperienceLevel(int arg0) {
		player.addExperienceLevel(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean getAlwaysRenderNameTagForRender() {
		return player.getAlwaysRenderNameTagForRender();
	}

	public void sendPlayerAbilities() {
		player.sendPlayerAbilities();
	}

	public net.minecraft.inventory.InventoryEnderChest getInventoryEnderChest() {
		return player.getInventoryEnderChest();
	}

	public net.minecraft.item.ItemStack getEquipmentInSlot(int arg0) {
		return player.getEquipmentInSlot(arg0);
	}

	public void setCurrentItemOrArmor(int arg0, net.minecraft.item.ItemStack arg1) {
		player.setCurrentItemOrArmor(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean isInvisibleToPlayer(net.minecraft.entity.player.EntityPlayer arg0) {
		return player.isInvisibleToPlayer(arg0);
	}

	public net.minecraft.scoreboard.Scoreboard getWorldScoreboard() {
		return player.getWorldScoreboard();
	}

	public void setAbsorptionAmount(float arg0) {
		player.setAbsorptionAmount(arg0);
	}

	public float getAbsorptionAmount() {
		return player.getAbsorptionAmount();
	}

	public boolean sendCommandFeedback() {
		return player.sendCommandFeedback();
	}

	public boolean replaceItemInInventory(int arg0, net.minecraft.item.ItemStack arg1) {
		return player.replaceItemInInventory(arg0, arg1);
	}

	public float getDefaultEyeHeight() {
		return player.getDefaultEyeHeight();
	}

	public java.lang.String getDisplayNameString() {
		return player.getDisplayNameString();
	}

	public void refreshDisplayName() {
		player.refreshDisplayName();
	}

	public net.minecraft.item.ItemStack getHeldItem() {
		return player.getHeldItem();
	}

	public boolean isSpectator() {
		return player.isSpectator();
	}

	public net.minecraft.item.ItemStack[] getInventory() {
		return player.getInventory();
	}

	public boolean isPushedByWater() {
		return player.isPushedByWater();
	}

	public net.minecraft.scoreboard.Team getTeam() {
		return player.getTeam();
	}

	public float getEyeHeight() {
		return player.getEyeHeight();
	}

	public static java.util.UUID getUUID(com.mojang.authlib.GameProfile arg0) {
		return EntityPlayer.getUUID(arg0);
	}

	public static java.util.UUID getOfflineUUID(java.lang.String arg0) {
		return EntityPlayer.getOfflineUUID(arg0);
	}

	public boolean canOpen(net.minecraft.world.LockCode arg0) {
		return player.canOpen(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean func_175148_a(net.minecraft.entity.player.EnumPlayerModelParts arg0) {
		return player.func_175148_a(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void setReducedDebug(boolean arg0) {
		player.setReducedDebug(arg0);
	}

	public void openGui(java.lang.Object arg0, int arg1, net.minecraft.world.World arg2, int arg3, int arg4, int arg5) {
		player.openGui(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void setSpawnChunk(net.minecraft.util.BlockPos arg0, boolean arg1, int arg2) {
		player.setSpawnChunk(arg0, arg1, arg2);
	}

	public void addPrefix(net.minecraft.util.IChatComponent arg0) {
		player.addPrefix(arg0);
	}

	public void addSuffix(net.minecraft.util.IChatComponent arg0) {
		player.addSuffix(arg0);
	}

	public java.util.Collection getPrefixes() {
		return player.getPrefixes();
	}

	public java.util.Collection getSuffixes() {
		return player.getSuffixes();
	}

}
