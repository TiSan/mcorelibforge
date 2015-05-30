package de.tisan.mcoref.plugins.players;

import java.util.ArrayList;
import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import de.tisan.mcoref.core.MCoreF;
import de.tisan.mcoref.plugins.blocks.BukkitMaterial;
import de.tisan.mcoref.plugins.blocks.BukkitMaterialType;
import de.tisan.mcoref.plugins.item.BukkitItemStack;
import de.tisan.mcoref.plugins.location.Location;
import de.tisan.mcoref.plugins.worlds.BukkitWorld;

public class BukkitPlayer {

	private EntityPlayer player;

	public EntityPlayer getPlayer() {
		return player;
	}

	public BukkitPlayer(EntityPlayer pl) {
		player = pl;

	}

	public String getName() {
		return player.getName();
	}

	/**
	 * still in progress
	 * 
	 * @return
	 */
	public String getDisplayName() {
		return player.getDisplayName().getUnformattedTextForChat();
	}

	@SideOnly(Side.CLIENT)
	public int getItemInUseCount() {
		return player.getItemInUseCount();
	}

	@SideOnly(Side.CLIENT)
	public int getItemInUseDuration() {
		return player.getItemInUseDuration();
	}

	public int getMaxInPortalTime() {
		return player.getMaxInPortalTime();
	}

	@SideOnly(Side.CLIENT)
	public boolean hasReducedDebug() {
		return player.hasReducedDebug();
	}

	@SideOnly(Side.CLIENT)
	public BukkitItemStack getItemInUse() {
		return new BukkitItemStack(player.getItemInUse());
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

	public void playSound(String name, float volume, float pitch) {
		player.playSound(name, volume, pitch);
	}

	public int getPortalCooldown() {
		return player.getPortalCooldown();
	}

	public void dropPlayerItemWithRandomChoice(BukkitItemStack item) {
		player.dropPlayerItemWithRandomChoice(item.getStack(), true);
	}

	public int getTotalArmorValue() {
		return player.getTotalArmorValue();
	}

	public float getArmorVisibility() {
		return player.getArmorVisibility();
	}

	public BukkitItemStack getCurrentEquippedItem() {
		return new BukkitItemStack(player.getCurrentEquippedItem());
	}

	public void destroyCurrentEquippedItem() {
		player.destroyCurrentEquippedItem();
	}

	public boolean isEntityInsideOpaqueBlock() {
		return player.isEntityInsideOpaqueBlock();
	}

	@SideOnly(Side.CLIENT)
	public float getBedOrientationInDegrees() {
		return player.getBedOrientationInDegrees();
	}

	public boolean isPlayerFullyAsleep() {
		return player.isPlayerFullyAsleep();
	}

	public void addChatComponentMessage(String message) {
		player.addChatComponentMessage(new ChatComponentText(message));
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

	public boolean canHarvestBlock(BukkitMaterial mat) {
		if (mat.getMaterialType() == BukkitMaterialType.BLOCK) {
			return player.canHarvestBlock(mat.getMinecraftBlock());
		}
		return false;
	}

	public boolean canAttackPlayer(BukkitPlayer arg0) {
		return player.canAttackPlayer(arg0.getPlayer());
	}

	public double getYOffset() {
		return player.getYOffset();
	}

	public void setDead() {
		player.setDead();
	}

	public void wakeUpPlayer(boolean arg0, boolean arg1, boolean arg2) {
		player.wakeUpPlayer(arg0, arg1, arg2);
	}

	public boolean isPlayerSleeping() {
		return player.isPlayerSleeping();
	}

	@SideOnly(Side.CLIENT)
	public int getSleepTimer() {
		return player.getSleepTimer();
	}

	public Location getBedLocation() {
		return new Location(player.getBedLocation());
	}

	public Location getBedLocation(int arg0) {
		return new Location(player.getBedLocation(arg0));
	}

	public boolean isSpawnForced(int arg0) {
		return player.isSpawnForced(arg0);
	}

	public void setSpawnPoint(Location arg0, boolean arg1) {
		player.setSpawnPoint(arg0.getBlockPos(), arg1);
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

	public void setInWeb() {
		player.setInWeb();
	}

	public BukkitItemStack getCurrentArmor(int arg0) {
		return new BukkitItemStack(player.getCurrentArmor(arg0));
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

	public void setFoodLevel(int lvl) {
		player.getFoodStats().setFoodLevel(lvl);
	}

	public void setFoodSaturationLevel(float lvl) {
		player.getFoodStats().setFoodSaturationLevel(lvl);
	}

	public int getFoodLevel() {
		return player.getFoodStats().getFoodLevel();
	}

	public float getFoodSaturationLevel() {
		return player.getFoodStats().getSaturationLevel();
	}

	public boolean needFood() {
		return player.getFoodStats().needFood();
	}

	public boolean canEat(boolean arg0) {
		return player.canEat(arg0);
	}

	public boolean shouldHeal() {
		return player.shouldHeal();
	}

	public void setItemInUse(BukkitItemStack arg0, int arg1) {
		player.setItemInUse(arg0.getStack(), arg1);
	}

	public void removeExperienceLevel(int arg0) {
		player.removeExperienceLevel(arg0);
	}

	public void addExperienceLevel(int arg0) {
		player.addExperienceLevel(arg0);
	}

	@SideOnly(Side.CLIENT)
	public boolean getAlwaysRenderNameTagForRender() {
		return player.getAlwaysRenderNameTagForRender();
	}

	public void sendPlayerAbilities() {
		player.sendPlayerAbilities();
	}

	/**
	 * Comming soon..
	 * 
	 * @return
	 */
	public net.minecraft.inventory.InventoryEnderChest getInventoryEnderChest() {
		return player.getInventoryEnderChest();
	}

	public BukkitItemStack getEquipmentInSlot(int arg0) {
		return new BukkitItemStack(player.getEquipmentInSlot(arg0));
	}

	public void setCurrentItemOrArmor(int arg0, BukkitItemStack arg1) {
		player.setCurrentItemOrArmor(arg0, arg1.getStack());
	}

	@SideOnly(Side.CLIENT)
	public boolean isInvisibleToPlayer(BukkitPlayer arg0) {
		return player.isInvisibleToPlayer(arg0.getPlayer());
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

	public boolean replaceItemInInventory(int arg0, BukkitItemStack arg1) {
		return player.replaceItemInInventory(arg0, arg1.getStack());
	}

	public float getDefaultEyeHeight() {
		return player.getDefaultEyeHeight();
	}

	public String getDisplayNameString() {
		return player.getDisplayNameString();
	}

	public void refreshDisplayName() {
		player.refreshDisplayName();
	}

	public BukkitItemStack getHeldItem() {
		return new BukkitItemStack(player.getHeldItem());
	}

	public boolean isSpectator() {
		return player.isSpectator();
	}

	public BukkitItemStack[] getInventory() {
		return BukkitItemStack.getArray(player.getInventory());
	}

	public boolean isPushedByWater() {
		return player.isPushedByWater();
	}

	public float getEyeHeight() {
		return player.getEyeHeight();
	}

	public UUID getUUID() {
		return player.getGameProfile().getId();
	}

	public static UUID getOfflineUUID(String arg0) {
		return EntityPlayer.getOfflineUUID(arg0);
	}

	@SideOnly(Side.CLIENT)
	public void setReducedDebug(boolean arg0) {
		player.setReducedDebug(arg0);
	}

	public void openGui(int guiID, BukkitWorld world, int x, int y, int z) {
		player.openGui(MCoreF.instance, guiID, world.getWorld(), x, y, z);
	}

	public void setSpawnChunk(Location arg0, boolean arg1, int arg2) {
		player.setSpawnChunk(arg0.getBlockPos(), arg1, arg2);
	}

	public void addPrefix(String arg0) {
		player.addPrefix(new ChatComponentText(arg0));
	}

	public void addSuffix(String arg0) {
		player.addSuffix(new ChatComponentText(arg0));
	}

	public ArrayList<String> getPrefixes() {
		ArrayList<String> str = new ArrayList<String>();
		for (IChatComponent obj : player.getPrefixes()) {
			if (obj instanceof ChatComponentText) {
				str.add(((ChatComponentText) obj).getChatComponentText_TextValue());
			}
		}
		return str;
	}

	public ArrayList<String> getSuffixes() {
		ArrayList<String> str = new ArrayList<String>();
		for (IChatComponent obj : player.getSuffixes()) {
			if (obj instanceof ChatComponentText) {
				str.add(((ChatComponentText) obj).getChatComponentText_TextValue());
			}
		}
		return str;
	}

}
