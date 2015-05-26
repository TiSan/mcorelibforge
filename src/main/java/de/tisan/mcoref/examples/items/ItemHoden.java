package de.tisan.mcoref.examples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import de.tisan.mcoref.core.MCoreF;

public class ItemHoden extends Item {
	public ItemHoden() {
		super();
		setUnlocalizedName("Hoden");
		setTextureName("MCoreF:TiBlock");
		setCreativeTab(MCoreF.instance.getBlockTab());
	}

	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		//Bukkit.broadcastMessage("�eRight clicked with the " + getUnlocalizedName());
		return item;
	}
}
