package de.tisan.mcoref.plugins.blocks;

import net.minecraft.block.Block;

public class BukkitBlock extends Block{

	protected BukkitBlock(BukkitMaterial material) {
		super(material.getMinecraftMaterial());
		
	}

}
