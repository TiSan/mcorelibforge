package de.tisan.mcoref.events.properties;

import de.tisan.mcoref.plugins.blocks.BukkitBlock;

public class BukkitBlockInteractEvent extends BukkitEvent{
	private BukkitBlock block;
	
	public BukkitBlockInteractEvent(BukkitBlock b){
		block = b;
	}

	public BukkitBlock getBlock() {
		return block;
	}
	
	
}
