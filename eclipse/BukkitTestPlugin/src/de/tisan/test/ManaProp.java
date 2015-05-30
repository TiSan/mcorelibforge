package de.tisan.test;

import de.tisan.mcoref.plugins.entities.BExtendedProperties;
import de.tisan.mcoref.plugins.nbt.BNBTTagCompound;

public class ManaProp extends BExtendedProperties {

	public int mana;

	public ManaProp() {
		mana = 10;
	}

	@Override
	public void save(BNBTTagCompound tag) {
		System.out.println("save");
		tag.setInteger("mana", mana);
	}

	@Override
	public void load(BNBTTagCompound tag) {
		System.out.println("load");
		mana = tag.getInteger("mana");
	}

}
