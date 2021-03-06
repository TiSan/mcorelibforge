package de.tisan.mcoref.events.core;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

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
					System.out.println("Annotation is pResent");
					if ((m.getParameterTypes() != null) && (m.getParameterTypes().length > 0)) {
						System.out.println("Has parameter");
						if (hasType(m.getParameterTypes()[0], BukkitEvent.class)) {
							System.out.println("Register event");
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
	public boolean callEvent(BukkitEvent attr) {
		boolean cancel = false;
		if (attr != null) {
			for (LiWiMeCom m : getMethodsByClass(attr.getClass())) {
				System.out.println("Invoke");
				try {
					m.getMethod().invoke(m.getListener(), attr);
					cancel = attr.isCancelled();
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
		return cancel;
	}

	private ArrayList<LiWiMeCom> getMethodsByClass(Class cla) {
		ArrayList<LiWiMeCom> com = new ArrayList<LiWiMeCom>();
		for (LiWiMeCom m : methods) {
			System.out.println("is " + m.getMethod().getParameterTypes()[0].getName() + " == " + cla.getName());
			if (isType(m.getMethod().getParameterTypes()[0], cla)) {
				System.out.println("Yes it is.");
				com.add(m);
			} else {
				System.out.println("No it is not.");
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
