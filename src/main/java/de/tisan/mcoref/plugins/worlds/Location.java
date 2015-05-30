package de.tisan.mcoref.plugins.worlds;

import java.util.Iterator;

import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;

import com.google.common.collect.AbstractIterator;

public class Location {

	private BlockPos pos;

	public Location(BlockPos pos) {
		this.pos = pos;
	}

	public Location(int x, int y, int z) {
		pos = new BlockPos(x, y, z);
	}

	public BlockPos getBlockPos() {
		return pos;
	}

	public Location add(int x, int y, int z) {
		pos.add(x, y, z);
		return this;
	}

	public Location add(double x, double y, double z) {
		pos.add(x, y, z);
		return this;
	}

	public Location multiply(int factor) {
		pos.multiply(factor);
		return this;
	}

	public Location offsetUp() {
		pos.offsetUp();
		return this;
	}

	public Location offsetUp(int num) {
		pos.offsetUp(num);
		return this;
	}

	public Location offsetDown() {
		pos.offsetDown();
		return this;
	}

	public Location offsetDown(int num) {
		pos.offsetDown(num);
		return this;
	}

	public Location offsetNorth() {
		return this.offsetNorth(1);
	}

	public Location offsetNorth(int n) {
		return this.offset(EnumFacing.NORTH, n);
	}

	public Location offsetSouth() {
		return this.offsetSouth(1);
	}

	public Location offsetSouth(int n) {
		return this.offset(EnumFacing.SOUTH, n);
	}

	public Location offsetWest() {
		return this.offsetWest(1);
	}

	public Location offsetWest(int n) {
		return this.offset(EnumFacing.WEST, n);
	}

	public Location offsetEast() {
		return this.offsetEast(1);
	}

	public Location offsetEast(int n) {
		return this.offset(EnumFacing.EAST, n);
	}

	private Location offset(EnumFacing facing) {
		return this.offset(facing, 1);
	}

	public Location offset(EnumFacing facing, int n) {
		return new Location(new BlockPos(pos.getX() + (facing.getFrontOffsetX() * n), pos.getY() + (facing.getFrontOffsetY() * n), pos.getZ() + (facing.getFrontOffsetZ() * n)));
	}

	public static Iterable getAllInBox(Location from, Location to) {
		final Location blockpos2 = new Location(Math.min(from.getX(), to.getX()), Math.min(from.getY(), to.getY()), Math.min(from.getZ(), to.getZ()));
		final Location blockpos3 = new Location(Math.max(from.getX(), to.getX()), Math.max(from.getY(), to.getY()), Math.max(from.getZ(), to.getZ()));
		return new Iterable() {
			@Override
			public Iterator iterator() {
				return new AbstractIterator() {
					private Location lastReturned = null;

					protected Location computeNext0() {
						if (lastReturned == null) {
							lastReturned = blockpos2;
							return lastReturned;
						} else if (lastReturned.equals(blockpos3)) {
							return (Location) endOfData();
						} else {
							int i = lastReturned.getX();
							int j = lastReturned.getY();
							int k = lastReturned.getZ();

							if (i < blockpos3.getX()) {
								++i;
							} else if (j < blockpos3.getY()) {
								i = blockpos2.getX();
								++j;
							} else if (k < blockpos3.getZ()) {
								i = blockpos2.getX();
								j = blockpos2.getY();
								++k;
							}

							lastReturned = new Location(i, j, k);
							return lastReturned;
						}
					}

					@Override
					protected Object computeNext() {
						return computeNext0();
					}
				};
			}
		};
	}

	public int getX() {
		return pos.getX();
	}

	public int getY() {
		return pos.getY();
	}

	public int getZ() {
		return pos.getZ();
	}
}
