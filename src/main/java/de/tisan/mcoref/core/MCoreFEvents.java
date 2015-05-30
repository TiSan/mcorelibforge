package de.tisan.mcoref.core;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.brewing.PotionBrewEvent;
import net.minecraftforge.event.entity.EntityEvent.EnteringChunk;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.PlaySoundAtEntityEvent;
import net.minecraftforge.event.entity.item.ItemExpireEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingJumpEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import de.tisan.mcoref.events.core.BukkitEventHandler;
import de.tisan.mcoref.events.core.Priority;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.events.properties.BukkitListener;
import de.tisan.mcoref.events.properties.EntityConstructEvent;
import de.tisan.mcoref.events.properties.EntityEnteringChunkEvent;
import de.tisan.mcoref.events.properties.EntityPlaySoundEffect;
import de.tisan.mcoref.events.properties.EntityStruckByLightningEvent;
import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.plugins.commands.Command;
import de.tisan.mcoref.plugins.commands.CommandSender;
import de.tisan.mcoref.plugins.entities.BukkitEntity;
import de.tisan.mcoref.plugins.entities.BukkitEntityItem;
import de.tisan.mcoref.plugins.entities.BukkitEntityLivingBase;
import de.tisan.mcoref.plugins.entities.effect.BukkitEntityLightningBolt;
import de.tisan.mcoref.plugins.players.BukkitPlayer;
import de.tisan.mcoref.plugins.worlds.BukkitWorld;

public class MCoreFEvents implements BukkitListener {
	public MCoreFEvents() {

	}

	@BukkitEventHandler(priority = Priority.HIGH)
	public void onBlockBreak(BukkitBlockInteractByPlayerEvent event) {

	}

	@SubscribeEvent
	public void onBlockBreak(BreakEvent ev) {
		System.out.println("Break!:");
		ev.setCanceled(true);
	}

	@SubscribeEvent
	public void onCommandEvent(CommandEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.CommandEvent(new Command(ev.command), new CommandSender(ev.sender), ev.parameters)));
	}

	@SubscribeEvent
	public void onServerChatEvent(ServerChatEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.ServerChatEvent(ev.message, Bukkit.getPlayer(ev.player.getName()))));
	}

	@SubscribeEvent
	public void onPotionBrewEvent(PotionBrewEvent ev) {
		ArrayList<ItemStack> items = new ArrayList<ItemStack>();
		ItemStack i = null;
		int count = 0;
		while ((i = ev.getItem(count)) != null) {
			items.add(i);
			count++;
		}
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.PotionBrewEvent(items.toArray(new ItemStack[items.size()]))));
	}

	@SubscribeEvent
	public void onEntityConstructEvent(EntityConstructing ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new EntityConstructEvent(new BukkitEntity(ev.entity))));
	}

	@SubscribeEvent
	public void onEntityEnteringChunkEvent(EnteringChunk ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new EntityEnteringChunkEvent(new BukkitEntity(ev.entity), ev.newChunkX, ev.newChunkZ, ev.oldChunkX, ev.oldChunkZ)));
	}

	@SubscribeEvent
	public void onEntityJoinWorldEvent(EntityJoinWorldEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.EntityJoinWorldEvent(new BukkitEntity(ev.entity), new BukkitWorld(ev.world))));
	}

	@SubscribeEvent
	public void onEntityStruckByLightningEffect(net.minecraftforge.event.entity.EntityStruckByLightningEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new EntityStruckByLightningEvent(new BukkitEntity(ev.entity), new BukkitEntityLightningBolt(ev.lightning))));
	}

	@SubscribeEvent
	public void onEntityPlaySoundEffect(PlaySoundAtEntityEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new EntityPlaySoundEffect(new BukkitEntity(ev.entity), ev.name, ev.volume, ev.pitch, ev.newVolume, ev.newPitch)));
	}

	@SubscribeEvent
	public void onItemExpireEvent(ItemExpireEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.ItemExpireEvent(new BukkitEntityItem(ev.entityItem), ev.extraLife)));
	}

	@SubscribeEvent
	public void onItemTossEvent(ItemTossEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.ItemTossEvent(new BukkitEntityItem(ev.entityItem), new BukkitPlayer(ev.player))));
	}

	@SubscribeEvent
	public void onLivingJumpEvent(LivingJumpEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.LivingJumpEvent(new BukkitEntityLivingBase(ev.entityLiving))));
	}

	@SubscribeEvent
	public void onLivingUpdateEvent(LivingUpdateEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.LivingUpdateEvent(new BukkitEntityLivingBase(ev.entityLiving))));
	}

	@SubscribeEvent
	public void onEnderTeleportEvent(EnderTeleportEvent ev) {
		ev.setCanceled(Bukkit.getEventManager().callEvent(new de.tisan.mcoref.events.properties.EnderTeleportEvent(new BukkitEntityLivingBase(ev.entityLiving), ev.targetX, ev.targetY, ev.targetZ, ev.attackDamage)));
	}

}
