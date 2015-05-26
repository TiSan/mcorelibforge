package de.tisan.mcoref.examples.items;

import cpw.mods.fml.common.registry.GameRegistry;

public class FirstModItems {
	private static FirstModItems instance;
	private ItemHoden hoden;
	private ItemEichel eichel;

	public static FirstModItems get() {
		return (FirstModItems.instance == null ? (FirstModItems.instance = new FirstModItems()) : FirstModItems.instance);
	}

	private FirstModItems() {
	}

	public void preInit() {
		hoden = new ItemHoden();
		GameRegistry.registerItem(hoden, hoden.getUnlocalizedName());
		eichel = new ItemEichel();
		GameRegistry.registerItem(eichel, eichel.getUnlocalizedName());
	}

	public ItemHoden getHoden() {
		return hoden;
	}

	public ItemEichel getEichel() {
		return eichel;
	}

}
