package de.tisan.mcoref.plugins.entities;

import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;
import de.tisan.mcoref.plugins.nbt.BNBTTagCompound;

public abstract class BExtendedProperties implements IExtendedEntityProperties {

	@Override
	public void init(Entity entity, World world) {

	}

	@Override
	public void loadNBTData(NBTTagCompound compound) {
		load(new BNBTTagCompound(compound));
	}

	@Override
	public void saveNBTData(NBTTagCompound compound) {
		save(new BNBTTagCompound(compound));
	}

	public abstract void save(BNBTTagCompound tag);

	public abstract void load(BNBTTagCompound tag);
}
