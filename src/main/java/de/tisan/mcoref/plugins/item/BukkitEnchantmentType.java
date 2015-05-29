package de.tisan.mcoref.plugins.item;

import net.minecraft.enchantment.Enchantment;

public enum BukkitEnchantmentType {
	fireAspect(Enchantment.fireAspect), looting(Enchantment.looting), efficiency(Enchantment.efficiency), silkTouch(Enchantment.silkTouch), unbreaking(Enchantment.unbreaking), fortune(
			Enchantment.fortune), power(Enchantment.power), punch(Enchantment.punch), flame(Enchantment.flame), infinity(Enchantment.infinity), luckOfTheSea(Enchantment.luckOfTheSea), lure(
			Enchantment.lure), protection(Enchantment.field_180310_c), fire_protection(Enchantment.fireProtection), feather_falling(Enchantment.field_180309_e), blast_protection(
			Enchantment.blastProtection), projectile_protection(Enchantment.field_180308_g), respiration(Enchantment.field_180317_h), aqua_affinity(Enchantment.aquaAffinity), thorns(
			Enchantment.thorns), depth_strider(Enchantment.field_180316_k), sharpness(Enchantment.field_180314_l), smite(Enchantment.field_180315_m), bane_of_arthropods(Enchantment.field_180312_n), knockback(
			Enchantment.field_180313_o);
	private Enchantment ench;

	private BukkitEnchantmentType(Enchantment ench) {
		this.ench = ench;
	}

	public Enchantment getEnchchantment() {
		return ench;
	}

}
