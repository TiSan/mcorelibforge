package de.tisan.mcoref.plugins.blocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import cpw.mods.fml.common.registry.GameRegistry;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.helpers.Bukkit;

public class BukkitBlock extends Block{

	public BukkitBlock(BukkitMaterial material) {
		super(material.getMinecraftMaterial());
		
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int data, float f1, float f2, float f3) {
		return !Bukkit.getEventManager().callEvent(BukkitBlockInteractByPlayerEvent.class, this, world, x, y, z, player, data);
	}
	
	public void register(){
		GameRegistry.registerBlock(this, getUnlocalizedName());
	}
}
