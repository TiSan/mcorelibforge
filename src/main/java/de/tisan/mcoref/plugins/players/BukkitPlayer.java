package de.tisan.mcoref.plugins.players;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;

public class BukkitPlayer {

	private EntityPlayer player;

	public BukkitPlayer(EntityPlayer pl) {
		player = pl;

	}

	public String getName() {
		return player.getCommandSenderName();
	}

	public java.lang.String getDisplayName() {
		return player.getDisplayName();
	}

	public net.minecraft.entity.item.EntityItem dropPlayerItemWithRandomChoice(net.minecraft.item.ItemStack arg0, boolean arg1) {
		return player.dropPlayerItemWithRandomChoice(arg0, arg1);
	}

	public int getMaxInPortalTime() {
		return player.getMaxInPortalTime();
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public int getItemInUseDuration() {
		return player.getItemInUseDuration();
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public int getItemInUseCount() {
		return player.getItemInUseCount();
	}

	public int getPortalCooldown() {
		return player.getPortalCooldown();
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public void handleHealthUpdate(byte arg0) {
		player.handleHealthUpdate(arg0);
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public void preparePlayerToSpawn() {
		player.preparePlayerToSpawn();
	}

	public void attackTargetEntityWithCurrentItem(net.minecraft.entity.Entity arg0) {
		player.attackTargetEntityWithCurrentItem(arg0);
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

	public void onLivingUpdate() {
		player.onLivingUpdate();
	}

	public boolean isBlocking() {
		return player.isBlocking();
	}

	public void clearItemInUse() {
		player.clearItemInUse();
	}

	public void onUpdate() {
		player.onUpdate();
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.item.ItemStack getItemInUse() {
		return player.getItemInUse();
	}

	public void updateRidden() {
		player.updateRidden();
	}

	public boolean isUsingItem() {
		return player.isUsingItem();
	}

	public void stopUsingItem() {
		player.stopUsingItem();
	}

	public void playSound(java.lang.String arg0, float arg1, float arg2) {
		player.playSound(arg0, arg1, arg2);
	}

	public void closeScreen() {
		player.closeScreen();
	}

	public void mountEntity(net.minecraft.entity.Entity arg0) {
		player.mountEntity(arg0);
	}

	public float getEyeHeight() {
		return player.getEyeHeight();
	}

	public boolean attackEntityFrom(net.minecraft.util.DamageSource arg0, float arg1) {
		return player.attackEntityFrom(arg0, arg1);
	}

	public void displayGUIChest(net.minecraft.inventory.IInventory arg0) {
		player.displayGUIChest(arg0);
	}

	public net.minecraft.entity.item.EntityItem func_146097_a(net.minecraft.item.ItemStack arg0, boolean arg1, boolean arg2) {
		return player.func_146097_a(arg0, arg1, arg2);
	}

	public void writeEntityToNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		player.writeEntityToNBT(arg0);
	}

	public net.minecraft.entity.item.EntityItem dropOneItem(boolean arg0) {
		return player.dropOneItem(arg0);
	}

	public void addToPlayerScore(net.minecraft.entity.Entity arg0, int arg1) {
		player.addToPlayerScore(arg0, arg1);
	}

	public void displayGUIAnvil(int arg0, int arg1, int arg2) {
		player.displayGUIAnvil(arg0, arg1, arg2);
	}

	@java.lang.Deprecated
	public float getBreakSpeed(net.minecraft.block.Block arg0, boolean arg1, int arg2) {
		return player.getBreakSpeed(arg0, arg1, arg2);
	}

	public float getBreakSpeed(net.minecraft.block.Block arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
		return player.getBreakSpeed(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void displayGUIHorse(net.minecraft.entity.passive.EntityHorse arg0, net.minecraft.inventory.IInventory arg1) {
		player.displayGUIHorse(arg0, arg1);
	}

	public boolean canHarvestBlock(net.minecraft.block.Block arg0) {
		return player.canHarvestBlock(arg0);
	}

	public void func_146093_a(net.minecraft.tileentity.TileEntityHopper arg0) {
		player.func_146093_a(arg0);
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean getAlwaysRenderNameTagForRender() {
		return player.getAlwaysRenderNameTagForRender();
	}

	public void addChatComponentMessage(net.minecraft.util.IChatComponent arg0) {
		player.addChatComponentMessage(arg0);
	}

	public boolean isCurrentToolAdventureModeExempt(int arg0, int arg1, int arg2) {
		return player.isCurrentToolAdventureModeExempt(arg0, arg1, arg2);
	}

	public void onEnchantmentCritical(net.minecraft.entity.Entity arg0) {
		player.onEnchantmentCritical(arg0);
	}

	public void displayGUIWorkbench(int arg0, int arg1, int arg2) {
		player.displayGUIWorkbench(arg0, arg1, arg2);
	}

	public float getDefaultEyeHeight() {
		return player.getDefaultEyeHeight();
	}

	public void triggerAchievement(net.minecraft.stats.StatBase arg0) {
		player.triggerAchievement(arg0);
	}

	public net.minecraft.inventory.InventoryEnderChest getInventoryEnderChest() {
		return player.getInventoryEnderChest();
	}

	public void refreshDisplayName() {
		player.refreshDisplayName();
	}

	public ItemStack[] getLastActiveItems() {
		return player.getLastActiveItems();
	}

	public net.minecraft.item.ItemStack getEquipmentInSlot(int arg0) {
		return player.getEquipmentInSlot(arg0);
	}

	public float getAbsorptionAmount() {
		return player.getAbsorptionAmount();
	}

	public static net.minecraft.util.ChunkCoordinates verifyRespawnCoordinates(net.minecraft.world.World arg0, net.minecraft.util.ChunkCoordinates arg1, boolean arg2) {
		return EntityPlayer.verifyRespawnCoordinates(arg0, arg1, arg2);
	}

	public void setAbsorptionAmount(float arg0) {
		player.setAbsorptionAmount(arg0);
	}

	public void displayGUIHopperMinecart(net.minecraft.entity.item.EntityMinecartHopper arg0) {
		player.displayGUIHopperMinecart(arg0);
	}

	public net.minecraft.item.ItemStack getCurrentEquippedItem() {
		return player.getCurrentEquippedItem();
	}

	public void readEntityFromNBT(net.minecraft.nbt.NBTTagCompound arg0) {
		player.readEntityFromNBT(arg0);
	}

	public boolean isEntityInsideOpaqueBlock() {
		return player.isEntityInsideOpaqueBlock();
	}

	public void addExperienceLevel(int arg0) {
		player.addExperienceLevel(arg0);
	}

	public void sendPlayerAbilities() {
		player.sendPlayerAbilities();
	}

	public void destroyCurrentEquippedItem() {
		player.destroyCurrentEquippedItem();
	}

	public net.minecraft.scoreboard.Scoreboard getWorldScoreboard() {
		return player.getWorldScoreboard();
	}

	public void setCurrentItemOrArmor(int arg0, net.minecraft.item.ItemStack arg1) {
		player.setCurrentItemOrArmor(arg0, arg1);
	}

	public java.lang.String getCommandSenderName() {
		return player.getCommandSenderName();
	}

	public float getArmorVisibility() {
		return player.getArmorVisibility();
	}

	public void displayGUIEnchantment(int arg0, int arg1, int arg2, java.lang.String arg3) {
		player.displayGUIEnchantment(arg0, arg1, arg2, arg3);
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public float getBedOrientationInDegrees() {
		return player.getBedOrientationInDegrees();
	}

	public int getTotalArmorValue() {
		return player.getTotalArmorValue();
	}

	public void moveEntityWithHeading(float arg0, float arg1) {
		player.moveEntityWithHeading(arg0, arg1);
	}

	@java.lang.Deprecated
	public float getCurrentPlayerStrVsBlock(net.minecraft.block.Block arg0, boolean arg1) {
		return player.getCurrentPlayerStrVsBlock(arg0, arg1);
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean isInvisibleToPlayer(net.minecraft.entity.player.EntityPlayer arg0) {
		return player.isInvisibleToPlayer(arg0);
	}

	public void joinEntityItemWithWorld(net.minecraft.entity.item.EntityItem arg0) {
		player.joinEntityItemWithWorld(arg0);
	}

	public void displayGUIMerchant(net.minecraft.entity.IMerchant arg0, java.lang.String arg1) {
		player.displayGUIMerchant(arg0, arg1);
	}

	public boolean isPlayerFullyAsleep() {
		return player.isPlayerFullyAsleep();
	}

	public void func_146104_a(net.minecraft.tileentity.TileEntityBeacon arg0) {
		player.func_146104_a(arg0);
	}

	public void func_146098_a(net.minecraft.tileentity.TileEntityBrewingStand arg0) {
		player.func_146098_a(arg0);
	}

	public void onCriticalHit(net.minecraft.entity.Entity arg0) {
		player.onCriticalHit(arg0);
	}

	public net.minecraft.entity.player.EntityPlayer.EnumStatus sleepInBedAt(int arg0, int arg1, int arg2) {
		return player.sleepInBedAt(arg0, arg1, arg2);
	}

	public com.mojang.authlib.GameProfile getGameProfile() {
		return player.getGameProfile();
	}

	public void displayGUIBook(net.minecraft.item.ItemStack arg0) {
		player.displayGUIBook(arg0);
	}

	public boolean interactWith(net.minecraft.entity.Entity arg0) {
		return player.interactWith(arg0);
	}

	public void wakeUpPlayer(boolean arg0, boolean arg1, boolean arg2) {
		player.wakeUpPlayer(arg0, arg1, arg2);
	}

	public void func_146101_a(net.minecraft.tileentity.TileEntityFurnace arg0) {
		player.func_146101_a(arg0);
	}

	public boolean isPlayerSleeping() {
		return player.isPlayerSleeping();
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public int getSleepTimer() {
		return player.getSleepTimer();
	}

	public void func_146100_a(net.minecraft.tileentity.TileEntity arg0) {
		player.func_146100_a(arg0);
	}

	public void func_146095_a(net.minecraft.command.server.CommandBlockLogic arg0) {
		player.func_146095_a(arg0);
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public void respawnPlayer() {
		player.respawnPlayer();
	}

	public void setDead() {
		player.setDead();
	}

	public void func_146102_a(net.minecraft.tileentity.TileEntityDispenser arg0) {
		player.func_146102_a(arg0);
	}

	public double getYOffset() {
		return player.getYOffset();
	}

	public boolean canAttackPlayer(net.minecraft.entity.player.EntityPlayer arg0) {
		return player.canAttackPlayer(arg0);
	}

	public net.minecraft.util.ChunkCoordinates getBedLocation(int arg0) {
		return player.getBedLocation(arg0);
	}

	@java.lang.Deprecated
	public net.minecraft.util.ChunkCoordinates getBedLocation() {
		return player.getBedLocation();
	}

	public void setSpawnChunk(net.minecraft.util.ChunkCoordinates arg0, boolean arg1, int arg2) {
		player.setSpawnChunk(arg0, arg1, arg2);
	}

	public void setSpawnChunk(net.minecraft.util.ChunkCoordinates arg0, boolean arg1) {
		player.setSpawnChunk(arg0, arg1);
	}

	public int xpBarCap() {
		return player.xpBarCap();
	}

	public void setItemInUse(net.minecraft.item.ItemStack arg0, int arg1) {
		player.setItemInUse(arg0, arg1);
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.IIcon getItemIcon(net.minecraft.item.ItemStack arg0, int arg1) {
		return player.getItemIcon(arg0, arg1);
	}

	public net.minecraft.item.ItemStack getCurrentArmor(int arg0) {
		return player.getCurrentArmor(arg0);
	}

	public net.minecraft.util.FoodStats getFoodStats() {
		return player.getFoodStats();
	}

	public float getAIMoveSpeed() {
		return player.getAIMoveSpeed();
	}

	public void addMovementStat(double arg0, double arg1, double arg2) {
		player.addMovementStat(arg0, arg1, arg2);
	}

	public void addExhaustion(float arg0) {
		player.addExhaustion(arg0);
	}

	public boolean canEat(boolean arg0) {
		return player.canEat(arg0);
	}

	@java.lang.Deprecated
	public boolean isSpawnForced() {
		return player.isSpawnForced();
	}

	public boolean isSpawnForced(int arg0) {
		return player.isSpawnForced(arg0);
	}

	public void jump() {
		player.jump();
	}

	public void onKillEntity(net.minecraft.entity.EntityLivingBase arg0) {
		player.onKillEntity(arg0);
	}

	public boolean shouldHeal() {
		return player.shouldHeal();
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean getHideCape() {
		return player.getHideCape();
	}

	public void setInWeb() {
		player.setInWeb();
	}

	public boolean canPlayerEdit(int arg0, int arg1, int arg2, int arg3, net.minecraft.item.ItemStack arg4) {
		return player.canPlayerEdit(arg0, arg1, arg2, arg3, arg4);
	}

	public void addExperience(int arg0) {
		player.addExperience(arg0);
	}

	public void addStat(net.minecraft.stats.StatBase arg0, int arg1) {
		player.addStat(arg0, arg1);
	}

	public boolean isPushedByWater() {
		return player.isPushedByWater();
	}

	public static java.util.UUID func_146094_a(com.mojang.authlib.GameProfile arg0) {
		return EntityPlayer.func_146094_a(arg0);
	}

	public net.minecraft.item.ItemStack getHeldItem() {
		return player.getHeldItem();
	}

	public net.minecraft.world.World getEntityWorld() {
		return player.getEntityWorld();
	}

	public void clonePlayer(net.minecraft.entity.player.EntityPlayer arg0, boolean arg1) {
		player.clonePlayer(arg0, arg1);
	}

	public net.minecraft.util.IChatComponent func_145748_c_() {
		return player.func_145748_c_();
	}

	public void openGui(java.lang.Object arg0, int arg1, net.minecraft.world.World arg2, int arg3, int arg4, int arg5) {
		player.openGui(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void setGameType(net.minecraft.world.WorldSettings.GameType arg0) {
		player.setGameType(arg0);
	}

	public net.minecraft.scoreboard.Team getTeam() {
		return player.getTeam();
	}

	@cpw.mods.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.Vec3 getPosition(float arg0) {
		return player.getPosition(arg0);
	}

}
