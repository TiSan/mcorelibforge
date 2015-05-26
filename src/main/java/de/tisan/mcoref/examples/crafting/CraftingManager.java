package de.tisan.mcoref.examples.crafting;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import de.tisan.mcoref.examples.blocks.FirstModBlocks;
import de.tisan.mcoref.examples.items.FirstModItems;

public class CraftingManager {

	public static void load() {
		GameRegistry.addShapedRecipe(new ItemStack(FirstModBlocks.get().getBlockTiBlock(), 1), " e ", "h h", "   ", Character.valueOf('e'), FirstModItems.get().getEichel(), Character.valueOf('h'), FirstModItems.get().getHoden());
	}
}
