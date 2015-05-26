package de.tisan.mcoref.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.helpers.Bukkit;

public class BukkitBlock extends Block{

	protected BukkitBlock(Material material) {
		super(material);
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int data, float f1, float f2, float f3) {
		return !Bukkit.getEventManager().callEvent(BukkitBlockInteractByPlayerEvent.class, this, world, x, y, z, player, data);
	}
}
