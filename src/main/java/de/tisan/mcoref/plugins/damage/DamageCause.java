package de.tisan.mcoref.plugins.damage;

import java.util.ArrayList;
import java.util.Arrays;

import net.minecraft.util.DamageSource;

public class DamageCause {
	public static DamageCause inFire = new DamageCause(DamageSource.inFire);
	public static DamageCause lightningBolt = new DamageCause(DamageSource.field_180137_b);
	public static DamageCause onFire = new DamageCause(DamageSource.onFire);
	public static DamageCause lava = new DamageCause(DamageSource.lava);
	public static DamageCause inWall = new DamageCause(DamageSource.inWall);
	public static DamageCause drown = new DamageCause(DamageSource.drown);
	public static DamageCause starve = new DamageCause(DamageSource.starve);
	public static DamageCause cactus = new DamageCause(DamageSource.cactus);
	public static DamageCause fall = new DamageCause(DamageSource.fall);
	public static DamageCause outOfWorld = new DamageCause(DamageSource.outOfWorld);
	public static DamageCause generic = new DamageCause(DamageSource.generic);
	public static DamageCause magic = new DamageCause(DamageSource.magic);
	public static DamageCause wither = new DamageCause(DamageSource.wither);
	public static DamageCause anvil = new DamageCause(DamageSource.anvil);
	public static DamageCause fallingBlock = new DamageCause(DamageSource.fallingBlock);
	private static ArrayList<DamageCause> causes = new ArrayList<DamageCause>(Arrays.asList(DamageCause.inFire, DamageCause.lightningBolt, DamageCause.onFire, DamageCause.lava, DamageCause.inWall, DamageCause.drown, DamageCause.starve,
			DamageCause.cactus, DamageCause.fall, DamageCause.outOfWorld, DamageCause.generic, DamageCause.magic, DamageCause.wither, DamageCause.anvil, DamageCause.fallingBlock));
	private DamageSource source;

	private DamageCause(DamageSource source) {
		this.source = source;
	}

	public static DamageCause getCause(DamageSource source) {
		for (DamageCause cause : DamageCause.causes) {
			if (cause.source.equals(source)) {
				return cause;
			}
		}
		return null;
	}

	public static DamageCause causeThrownDamage(net.minecraft.entity.Entity arg0, net.minecraft.entity.Entity arg1) {
		return DamageCause.getCause(DamageSource.causeThrownDamage(arg0, arg1));
	}

	public static DamageCause setExplosionSource(net.minecraft.world.Explosion arg0) {
		return DamageCause.getCause(DamageSource.setExplosionSource(arg0));
	}

	public boolean canHarmInCreative() {
		return source.canHarmInCreative();
	}

	public static DamageCause causeFireballDamage(net.minecraft.entity.projectile.EntityFireball arg0, net.minecraft.entity.Entity arg1) {
		return DamageCause.getCause(DamageSource.causeFireballDamage(arg0, arg1));
	}

	public static DamageCause causePlayerDamage(net.minecraft.entity.player.EntityPlayer arg0) {
		return DamageCause.getCause(DamageSource.causePlayerDamage(arg0));
	}

	public DamageCause setDamageAllowedInCreativeMode() {
		return DamageCause.getCause(source.setDamageAllowedInCreativeMode());
	}

	public boolean isDifficultyScaled() {
		return source.isDifficultyScaled();
	}

	public net.minecraft.util.DamageSource setDifficultyScaled() {
		return source.setDifficultyScaled();
	}

	public static DamageCause causeThornsDamage(net.minecraft.entity.Entity arg0) {
		return DamageCause.getCause(DamageSource.causeThornsDamage(arg0));
	}

	public static DamageCause causeIndirectMagicDamage(net.minecraft.entity.Entity arg0, net.minecraft.entity.Entity arg1) {
		return DamageCause.getCause(DamageSource.causeIndirectMagicDamage(arg0, arg1));
	}

	public net.minecraft.entity.Entity getSourceOfDamage() {
		return source.getSourceOfDamage();
	}

	public net.minecraft.util.DamageSource setDamageIsAbsolute() {
		return source.setDamageIsAbsolute();
	}

	public net.minecraft.util.DamageSource setDamageBypassesArmor() {
		return source.setDamageBypassesArmor();
	}

	public boolean isUnblockable() {
		return source.isUnblockable();
	}

	public boolean isDamageAbsolute() {
		return source.isDamageAbsolute();
	}

	public java.lang.String getDamageType() {
		return source.getDamageType();
	}

	public boolean isProjectile() {
		return source.isProjectile();
	}

	public boolean isExplosion() {
		return source.isExplosion();
	}

	public static DamageCause causeMobDamage(net.minecraft.entity.EntityLivingBase arg0) {
		return DamageCause.getCause(DamageSource.causeMobDamage(arg0));
	}

	public net.minecraft.util.DamageSource setProjectile() {
		return source.setProjectile();
	}

	public boolean isMagicDamage() {
		return source.isMagicDamage();
	}

	public net.minecraft.util.DamageSource setMagicDamage() {
		return source.setMagicDamage();
	}

	public net.minecraft.entity.Entity getEntity() {
		return source.getEntity();
	}

	public net.minecraft.util.DamageSource setFireDamage() {
		return source.setFireDamage();
	}

	public boolean isFireDamage() {
		return source.isFireDamage();
	}

	public boolean func_180136_u() {
		return source.func_180136_u();
	}

	public static DamageCause causeArrowDamage(net.minecraft.entity.projectile.EntityArrow arg0, net.minecraft.entity.Entity arg1) {
		return DamageCause.getCause(DamageSource.causeArrowDamage(arg0, arg1));
	}

	public float getHungerDamage() {
		return source.getHungerDamage();
	}

	public net.minecraft.util.DamageSource setExplosion() {
		return source.setExplosion();
	}

	public net.minecraft.util.IChatComponent getDeathMessage(net.minecraft.entity.EntityLivingBase arg0) {
		return source.getDeathMessage(arg0);
	}

}
