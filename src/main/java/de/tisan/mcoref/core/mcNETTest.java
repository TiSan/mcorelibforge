package de.tisan.mcoref.core;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import net.minecraft.nbt.NBTException;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.fml.relauncher.SideOnly;
import de.tisan.mcoref.events.properties.BukkitListener;

public class mcNETTest implements BukkitListener {

	public static void main(String[] args) throws InterruptedException, IOException, NBTException {
		for (Method m : AxisAlignedBB.class.getDeclaredMethods()) {
			if (Modifier.toString(m.getModifiers()).startsWith("public")) {
				String methodName = m.getName();

				if ((m.getAnnotations() != null) && (m.getAnnotations().length > 0)) {
					for (Annotation a : m.getAnnotations()) {
						System.out.print("@" + a.annotationType().getName());
						if (a.annotationType() == SideOnly.class) {
							System.out.println("(Side." + ((SideOnly) a).value().toString() + ")");
						}
					}

				}
				System.out.print(Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getName().replace("$", ".") + " " + m.getName() + "(");
				String params = "";
				boolean returning = !m.getReturnType().getName().equalsIgnoreCase("void");
				if (m.getParameterCount() > 0) {
					boolean before = false;
					for (Parameter p : m.getParameters()) {
						System.out.print((before ? ", " : "") + p.getType().getName().replace("$", ".") + " " + p.getName().replace("$", "."));
						params += (before ? ", " : "") + p.getName().replace("$", ".");
						before = true;
					}
				}
				System.out.println("){");
				System.out.println((returning ? "return " : "") + (Modifier.toString(m.getModifiers()).contains("static") ? "AxisAlignedBB." : "aabb.") + methodName + "(" + params + ");\n}\n\n");
			}
		}

	}

}
