package de.tisan.mcoref.plugins.nbt;

import net.minecraft.nbt.NBTBase;

public class BNBTBase {
	private NBTBase base;

	public BNBTBase(NBTBase base) {
		this.base = base;
	}

	public BNBTBase(BNBTBase base) {
		this.base = base.getBase();
	}

	public BNBTBase() {
	}

	public NBTBase getBase() {
		return base;
	}

	protected void setBase(NBTBase base) {
		this.base = base;
	}

	protected void setBase(BNBTBase base) {
		this.base = base.getBase();
	}
}
