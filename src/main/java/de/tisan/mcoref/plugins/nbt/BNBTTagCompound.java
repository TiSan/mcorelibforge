package de.tisan.mcoref.plugins.nbt;

import java.util.Set;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;

public class BNBTTagCompound extends BNBTBase {
	private NBTTagCompound tag;

	public BNBTTagCompound(NBTTagCompound tag) {
		super(tag);
		this.tag = tag;
	}

	public BNBTTagCompound() {
		tag = new NBTTagCompound();
		setBase(tag);
	}

	@Override
	public boolean equals(Object obj) {
		return tag.equals(obj);
	}

	@Override
	public String toString() {
		return tag.toString();
	}

	@Override
	public int hashCode() {
		return tag.hashCode();
	}

	public boolean getBoolean(String arg0) {
		return tag.getBoolean(arg0);
	}

	public byte getByte(String arg0) {
		return tag.getByte(arg0);
	}

	public short getShort(String arg0) {
		return tag.getShort(arg0);
	}

	public long getLong(String arg0) {
		return tag.getLong(arg0);
	}

	public float getFloat(String arg0) {
		return tag.getFloat(arg0);
	}

	public double getDouble(String arg0) {
		return tag.getDouble(arg0);
	}

	public NBTTagCompound getTag() {
		return tag;
	}

	public byte getId() {
		return tag.getId();
	}

	public void merge(BNBTTagCompound arg0) {
		tag.merge(arg0.getTag());
	}

	public BNBTBase copy() {
		return new BNBTBase(tag.copy());
	}

	public void setBoolean(String arg0, boolean arg1) {
		tag.setBoolean(arg0, arg1);
	}

	public void setByte(String arg0, byte arg1) {
		tag.setByte(arg0, arg1);
	}

	public void setDouble(String arg0, double arg1) {
		tag.setDouble(arg0, arg1);
	}

	public void setFloat(String arg0, float arg1) {
		tag.setFloat(arg0, arg1);
	}

	public void setLong(String arg0, long arg1) {
		tag.setLong(arg0, arg1);
	}

	public void setShort(String arg0, short arg1) {
		tag.setShort(arg0, arg1);
	}

	public int getInteger(String arg0) {
		return tag.getInteger(arg0);
	}

	public String getString(String arg0) {
		return tag.getString(arg0);
	}

	public Set getKeySet() {
		return tag.getKeySet();
	}

	public void setTag(String arg0, NBTBase arg1) {
		tag.setTag(arg0, arg1);
	}

	public void setInteger(String arg0, int arg1) {
		tag.setInteger(arg0, arg1);
	}

	public void setString(String arg0, String arg1) {
		tag.setString(arg0, arg1);
	}

	public void setByteArray(String arg0, byte[] arg1) {
		tag.setByteArray(arg0, arg1);
	}

	public void setIntArray(String arg0, int[] arg1) {
		tag.setIntArray(arg0, arg1);
	}

	public NBTBase getTag(String arg0) {
		return tag.getTag(arg0);
	}

	public byte getTagType(String arg0) {
		return tag.getTagType(arg0);
	}

	public boolean hasKey(String arg0) {
		return tag.hasKey(arg0);
	}

	public boolean hasKey(String arg0, int arg1) {
		return tag.hasKey(arg0, arg1);
	}

	public byte[] getByteArray(String arg0) {
		return tag.getByteArray(arg0);
	}

	public int[] getIntArray(String arg0) {
		return tag.getIntArray(arg0);
	}

	public BNBTTagCompound getCompoundTag(String arg0) {
		return new BNBTTagCompound(tag.getCompoundTag(arg0));
	}

	public BNBTTagList getTagList(String arg0, int arg1) {
		return new BNBTTagList(tag.getTagList(arg0, arg1));
	}

	public void removeTag(String arg0) {
		tag.removeTag(arg0);
	}

	public boolean hasNoTags() {
		return tag.hasNoTags();
	}

}
