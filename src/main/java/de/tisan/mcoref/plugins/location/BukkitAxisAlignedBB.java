package de.tisan.mcoref.plugins.location;

import net.minecraft.util.AxisAlignedBB;

public class BukkitAxisAlignedBB {

	private AxisAlignedBB aabb;

	public BukkitAxisAlignedBB(AxisAlignedBB aabb) {
		this.aabb = aabb;
	}

	public BukkitAxisAlignedBB(Location loc1, Location loc2) {
		aabb = new AxisAlignedBB(loc1.getBlockPos(), loc2.getBlockPos());
	}

	public AxisAlignedBB getAxisAlignedBB() {
		return aabb;
	}

	public BukkitAxisAlignedBB offset(double arg0, double arg1, double arg2) {
		return new BukkitAxisAlignedBB(aabb.offset(arg0, arg1, arg2));
	}

	@Override
	public String toString() {
		return aabb.toString();
	}

	public BukkitAxisAlignedBB expand(double arg0, double arg1, double arg2) {
		return new BukkitAxisAlignedBB(aabb.expand(arg0, arg1, arg2));
	}

	public double getAverageEdgeLength() {
		return aabb.getAverageEdgeLength();
	}

	public BukkitAxisAlignedBB addCoord(double arg0, double arg1, double arg2) {
		return new BukkitAxisAlignedBB(aabb.addCoord(arg0, arg1, arg2));
	}

	public BukkitAxisAlignedBB union(BukkitAxisAlignedBB arg0) {
		return new BukkitAxisAlignedBB(aabb.union(arg0.getAxisAlignedBB()));
	}

	public static BukkitAxisAlignedBB fromBounds(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5) {
		return new BukkitAxisAlignedBB(AxisAlignedBB.fromBounds(arg0, arg1, arg2, arg3, arg4, arg5));
	}

	public double calculateXOffset(BukkitAxisAlignedBB arg0, double arg1) {
		return aabb.calculateXOffset(arg0.getAxisAlignedBB(), arg1);
	}

	public double calculateYOffset(BukkitAxisAlignedBB arg0, double arg1) {
		return aabb.calculateYOffset(arg0.getAxisAlignedBB(), arg1);
	}

	public double calculateZOffset(BukkitAxisAlignedBB arg0, double arg1) {
		return aabb.calculateZOffset(arg0.getAxisAlignedBB(), arg1);
	}

	public boolean intersectsWith(BukkitAxisAlignedBB arg0) {
		return aabb.intersectsWith(arg0.getAxisAlignedBB());
	}

	public BukkitAxisAlignedBB contract(double arg0, double arg1, double arg2) {
		return new BukkitAxisAlignedBB(aabb.contract(arg0, arg1, arg2));
	}
}
