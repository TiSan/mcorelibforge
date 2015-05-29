package de.tisan.mcoref.core;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.brewing.PotionBrewEvent;
import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import de.tisan.mcoref.events.core.BukkitEventHandler;
import de.tisan.mcoref.events.core.Priority;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.events.properties.BukkitListener;
import de.tisan.mcoref.events.properties.EntityConstructEvent;
import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.plugins.commands.Command;
import de.tisan.mcoref.plugins.commands.CommandSender;
import de.tisan.mcoref.plugins.entities.BukkitEntity;

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
}
