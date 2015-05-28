package de.tisan.mcoref.events.properties;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import de.tisan.mcoref.plugins.blocks.BukkitBlock;

public class BukkitBlockInteractByPlayerEvent extends BukkitBlockInteractEvent {
	private EntityPlayer player;
	private int x, y, z, meta;
	private World world;

	public BukkitBlockInteractByPlayerEvent(BukkitBlock b, World world, int x, int y, int z, EntityPlayer player, int meta) {
		super(b);
		this.player = player;
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.meta = meta;
	}

	public EntityPlayer getPlayer() {
		return player;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getZ() {
		return z;
	}

	public int getMeta() {
		return meta;
	}

	public World getWorld() {
		return world;
	}

}
