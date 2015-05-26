package de.tisan.mcoref.examples.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import de.tisan.mcoref.core.MCoreF;

public class ItemEichel extends Item {
	public ItemEichel() {
		super();
		setUnlocalizedName("Eichel");
		setTextureName("MCoreF:TiBlock");
		setCreativeTab(MCoreF.instance.getBlockTab());
	}

	@Override
	public ItemStack onItemRightClick(ItemStack item, World world, EntityPlayer player) {
		//Bukkit.broadcastMessage("�bRight clicked with the " + getUnlocalizedName());
		return item;
	}
}
