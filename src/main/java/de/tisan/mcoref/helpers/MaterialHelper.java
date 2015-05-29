package de.tisan.mcoref.helpers;

import net.minecraft.item.Item;
import de.tisan.mcoref.plugins.blocks.BukkitMaterial;
import de.tisan.mcoref.plugins.blocks.BukkitMaterialType;

public class MaterialHelper {
	public static BukkitMaterial getBukkitMaterial(Item item) {
		for (BukkitMaterial mat : BukkitMaterial.values()) {
			if (mat.getMaterialType().equals(BukkitMaterialType.ITEM)) {
				if (mat.getMinecraftItem().equals(item)) {
					return mat;
				}
			}
		}
		return null;
	}
}
