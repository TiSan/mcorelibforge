package de.tisan.mcoref.plugins.nbt;

import net.minecraft.nbt.NBTTagList;

public class BNBTTagList extends BNBTBase {
	private NBTTagList list;

	public BNBTTagList(NBTTagList list) {
		this.list = list;
	}

	public BNBTTagList() {
		list = new NBTTagList();
		setBase(list);
	}

	public NBTTagList getTagList() {
		return list;
	}

	public BNBTBase get(int arg0) {
		return new BNBTBase(list.get(arg0));
	}

	@Override
	public boolean equals(Object arg0) {
		return list.equals(arg0);
	}

	@Override
	public String toString() {
		return list.toString();
	}

	@Override
	public int hashCode() {
		return list.hashCode();
	}

	public float getFloat(int arg0) {
		return list.getFloat(arg0);
	}

	public double getDouble(int arg0) {
		return list.getDouble(arg0);
	}

	public byte getId() {
		return list.getId();
	}

	public BNBTBase copy() {
		return new BNBTBase(list.copy());
	}

	public void set(int arg0, BNBTBase arg1) {
		list.set(arg0, arg1.getBase());
	}

	public void appendTag(BNBTBase arg0) {
		list.appendTag(arg0.getBase());
	}

	public BNBTBase removeTag(int arg0) {
		return new BNBTBase(list.removeTag(arg0));
	}

	public boolean hasNoTags() {
		return list.hasNoTags();
	}

	public BNBTTagCompound getCompoundTagAt(int arg0) {
		return new BNBTTagCompound(list.getCompoundTagAt(arg0));
	}

	public int[] getIntArray(int arg0) {
		return list.getIntArray(arg0);
	}

	public String getStringTagAt(int arg0) {
		return list.getStringTagAt(arg0);
	}

	public int tagCount() {
		return list.tagCount();
	}

	public int getTagType() {
		return list.getTagType();
	}

}
