package de.tisan.mcoref.core;

import de.tisan.mcoref.events.core.BukkitEventHandler;
import de.tisan.mcoref.events.core.Priority;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.events.properties.BukkitListener;

public class MCoreFEvents implements BukkitListener {
	public MCoreFEvents(){
		
	}
	
	@BukkitEventHandler(priority = Priority.HIGH)
	public void onBlockBreak(BukkitBlockInteractByPlayerEvent event){
		
	}
}
