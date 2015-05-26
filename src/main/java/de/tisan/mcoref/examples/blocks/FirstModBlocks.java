package de.tisan.mcoref.examples.blocks;

import cpw.mods.fml.common.registry.GameRegistry;

public class FirstModBlocks {
	private static FirstModBlocks instance;
	private BlockTiBlock blockTiBlock;

	public static FirstModBlocks get() {
		return (FirstModBlocks.instance == null ? (FirstModBlocks.instance = new FirstModBlocks()) : FirstModBlocks.instance);
	}

	public void preInit() {
		blockTiBlock = new BlockTiBlock();
		GameRegistry.registerBlock(blockTiBlock, blockTiBlock.getUnlocalizedName());

	}

	public BlockTiBlock getBlockTiBlock() {
		return blockTiBlock;
	}

	private FirstModBlocks() {

	}
}
