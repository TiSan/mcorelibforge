package de.tisan.mcoref.events.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import de.tisan.mcoref.blocks.BukkitBlock;
import de.tisan.mcoref.events.properties.BukkitBlockInteractByPlayerEvent;
import de.tisan.mcoref.events.properties.BukkitBlockInteractEvent;
import de.tisan.mcoref.events.properties.BukkitEvent;
import de.tisan.mcoref.events.properties.BukkitListener;

public class BukkitEventManager {
	private ArrayList<LiWiMeCom> methods;

	public BukkitEventManager() {
		methods = new ArrayList<LiWiMeCom>();

	}

	public void registerEvents(BukkitListener obj) {
		if (obj != null) {
			for (Method m : obj.getClass().getDeclaredMethods()) {
				if (m.isAnnotationPresent(BukkitEventHandler.class)) {
					if ((m.getParameterTypes() != null) && (m.getParameterTypes().length > 0)) {
						if (hasType(m.getParameterTypes()[0], BukkitEvent.class)) {
							methods.add(new LiWiMeCom(obj, m));
						}
					}
				}
			}
		}
	}

	/**
	 * Ruft ein gewisses Event auf. Gibt zur�ck, ob das Event gecancelled werden
	 * soll oder nicht.
	 * 
	 * @param cla
	 * @param attr
	 * @return
	 */
	public boolean callEvent(Class<? extends BukkitEvent> cla, Object... attr) {
		boolean cancel = false;
		if (cla != null) {
			if (cla == BukkitBlockInteractEvent.class) {
				for (LiWiMeCom m : getMethodsByClass(cla)) {
					try {
						System.out.println(cla.getName());
						if ((cla == BukkitBlockInteractByPlayerEvent.class) && (attr.length > 6)) {
							BukkitBlockInteractByPlayerEvent event = new BukkitBlockInteractByPlayerEvent((BukkitBlock) attr[0], (World) attr[1], (Integer) attr[2], (Integer) attr[3], (Integer) attr[4], (EntityPlayer) attr[5],
									(Integer) attr[6]);
							m.getMethod().invoke(m.getListener(), event);
							cancel = event.isCancelled();
						} else if ((cla == BukkitBlockInteractEvent.class) && (attr.length > 0)) {
							BukkitBlockInteractEvent event = new BukkitBlockInteractEvent((BukkitBlock) attr[0]);
							m.getMethod().invoke(m.getListener(), event);
							cancel = event.isCancelled();
						}

						if (cancel) {
							System.out.println("Event cancelled!");
							break;
						}
					} catch (IllegalAccessException e) {
					} catch (IllegalArgumentException e) {
					} catch (InvocationTargetException e) {
					}
				}
			}
		}
		return cancel;
	}

	private ArrayList<LiWiMeCom> getMethodsByClass(Class cla) {
		ArrayList<LiWiMeCom> com = new ArrayList<LiWiMeCom>();
		for (LiWiMeCom m : methods) {
			if (isType(m.getMethod().getParameterTypes()[0], cla)) {
				com.add(m);
			}
		}
		return com;
	}

	private boolean hasType(Class param, Class type) {
		Class superClass = param;
		while (superClass != null) {
			if (superClass.equals(type)) {
				return true;
			}
			superClass = superClass.getSuperclass();
		}
		return false;
	}

	private boolean isType(Class param, Class type) {
		return param == type;
	}

	class LiWiMeCom {
		private BukkitListener listener;
		private Method method;

		private LiWiMeCom(BukkitListener listener, Method method) {
			this.listener = listener;
			this.method = method;
		}

		public BukkitListener getListener() {
			return listener;
		}

		public Method getMethod() {
			return method;
		}

	}
}
