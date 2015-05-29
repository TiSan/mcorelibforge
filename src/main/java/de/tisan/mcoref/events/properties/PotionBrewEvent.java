package de.tisan.mcoref.events.properties;

import net.minecraft.item.ItemStack;
import de.tisan.mcoref.plugins.item.BukkitItemStack;

public class PotionBrewEvent extends BukkitEvent {
	private BukkitItemStack[] stacks;

	public PotionBrewEvent(ItemStack[] stacks) {
		this.stacks = new BukkitItemStack[stacks.length];
		int j = 0;
		for (ItemStack i : stacks) {
			this.stacks[j] = new BukkitItemStack(stacks[j]);
			j++;
		}

	}

	public BukkitItemStack[] getStacks() {
		return stacks;
	}

}
