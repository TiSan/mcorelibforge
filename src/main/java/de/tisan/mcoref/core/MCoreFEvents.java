package de.tisan.mcoref.core;

import net.minecraftforge.event.CommandEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import de.tisan.mcoref.events.core.BukkitEventHandler;
import de.tisan.mcoref.events.core.Priority;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.events.properties.BukkitListener;
import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.plugins.commands.Command;
import de.tisan.mcoref.plugins.commands.CommandSender;

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

}
