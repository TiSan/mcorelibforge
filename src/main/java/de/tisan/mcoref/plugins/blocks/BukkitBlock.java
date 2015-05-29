package de.tisan.mcoref.plugins.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class BukkitBlock extends Block{

	public BukkitBlock(BukkitMaterial material) {
		super(material.getMinecraftMaterial());
		
	}
	
	
	
	public void register(){
		GameRegistry.registerBlock(this, getUnlocalizedName());
	}
}
