package de.tisan.test;

import de.tisan.mcoref.events.core.BukkitEventHandler;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.events.properties.BukkitListener;
import de.tisan.mcoref.events.properties.EntityConstructEvent;
import de.tisan.mcoref.plugins.entities.BukkitEntity;

public class TestPluginListener implements BukkitListener {

	@BukkitEventHandler
	public void onBling(BukkitBlockInteractByPlayerEvent event) {

	}

	@BukkitEventHandler
	public void onEntityContruct(EntityConstructEvent event) {
		BukkitEntity ent = event.getEntity();
		ent.registerExtendedProperties("Test", new ManaProp());
		System.out.println("Hi Construct");
	}
}
