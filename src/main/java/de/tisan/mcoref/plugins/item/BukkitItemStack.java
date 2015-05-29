package de.tisan.mcoref.plugins.item;

import net.minecraft.item.ItemStack;
import de.tisan.mcoref.plugins.blocks.BukkitMaterial;
import de.tisan.mcoref.plugins.blocks.BukkitMaterialType;

public class BukkitItemStack {

	private ItemStack item;

	/**
	 * Not for you ;)
	 * 
	 * @param item
	 *            Orginal ItemStack
	 */
	public BukkitItemStack(ItemStack item) {
		this.item = item;
		// TODO item.addEnchantment(Enchantment,int)
	}

	/**
	 * Here you can create a ItemStack for you to use
	 * 
	 * @param mat
	 *            the Material
	 */
	public BukkitItemStack(BukkitMaterial mat) {
		if (mat.getMaterialType().equals(BukkitMaterialType.BLOCK)) {
			item = new ItemStack(mat.getMinecraftBlock());
		} else if (mat.getMaterialType().equals(BukkitMaterialType.ITEM)) {
			item = new ItemStack(mat.getMinecraftItem());
		}

	}

	public BukkitItemStack(BukkitMaterial mat, int amount) {
		if (amount > 0) {
			if (mat.getMaterialType().equals(BukkitMaterialType.BLOCK)) {
				item = new ItemStack(mat.getMinecraftBlock(), amount);
			} else if (mat.getMaterialType().equals(BukkitMaterialType.ITEM)) {
				item = new ItemStack(mat.getMinecraftItem(), amount);
			}
		}
		if (mat.getMaterialType().equals(BukkitMaterialType.BLOCK)) {
			item = new ItemStack(mat.getMinecraftBlock());
		} else if (mat.getMaterialType().equals(BukkitMaterialType.ITEM)) {
			item = new ItemStack(mat.getMinecraftItem());
		}
	}

	public int getStackSize() {
		return item.stackSize;
	}

	public boolean canEditBlocks() {
		return item.canEditBlocks();
	}

	public void clearCustomName() {
		item.clearCustomName();
	}

	public String getDisplayName() {
		return item.getDisplayName();
	}

	public BukkitItemStack copy() {
		return new BukkitItemStack(item.copy());
	}

	public ItemStack getStack() {
		return item;
	}

	public void addEnchantment(BukkitEnchantmentType ench, int level) {
		item.addEnchantment(ench.getEnchchantment(), level);
	}
}
