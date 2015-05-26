package de.tisan.mcoref.core;

import de.tisan.mcoref.events.core.BukkitEventHandler;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.events.properties.BukkitBlockInteractEvent;
import de.tisan.mcoref.events.properties.BukkitListener;
import de.tisan.mcoref.helpers.Bukkit;

public class Test implements BukkitListener{

	public static void main(String[] args) throws InterruptedException {
		Test t = new Test();
		Bukkit.getEventManager().registerEvents(t);
		Thread.sleep(20);
		Bukkit.getEventManager().callEvent(BukkitBlockInteractEvent.class);
		
		
	
	}
	
	@BukkitEventHandler
	public void onInteract(BukkitBlockInteractEvent event){
		System.out.println("Pling1 " + event.isCancelled());
		event.setCancelled(false);
	}
	
	@BukkitEventHandler
	public void onInteract2(BukkitBlockInteractEvent event){
		System.out.println("Pling2 " + event.isCancelled());
	}
	@BukkitEventHandler
	public void onInteract(BukkitBlockInteractByPlayerEvent event){
		System.out.println("Pling3 " + event.isCancelled());
	}
}
