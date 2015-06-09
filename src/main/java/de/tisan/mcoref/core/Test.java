package de.tisan.mcoref.core;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import net.minecraft.nbt.NBTException;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.lukasdietrich.lambdatra.Lambdatra;
import com.lukasdietrich.lambdatra.reaction.http.WrappedRequest.Query;

import de.tisan.mcoref.events.properties.BukkitListener;

public class Test implements BukkitListener {

	public static void main(String[] args) throws InterruptedException, IOException, NBTException {

		// for(ServerListEntry ss :
		// Bukkit.getMinecraftMultiplayerServerListEntries()){
		// System.out.println(ss.getIp());
		// }
		//

		// Test.printMethods(DamageSource.class, "source");
		Lambdatra.create(80, server -> {

			server.on("/path/with/:parameters", (req, res) -> {

				res.write(String.format("Parameter was %s", req.getParam("parameters").get()));

			});
			server.on("/*", (req, res) -> {
				res.write("Hello world!\n");
				for (Query q : req.getQueries()) {
					if (q.getQueryName().equalsIgnoreCase("name")) {
						res.write("Dein Name ist " + q.getValues().get(0));
					}
				}
			});
		});
	}

	public static void printMethods(Class cla, String variableName) {
		for (Method m : cla.getDeclaredMethods()) {
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
				System.out.print(Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getSimpleName().replace("$", ".") + " " + m.getName() + "(");
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
				System.out.println((returning ? "return " : "") + (Modifier.toString(m.getModifiers()).contains("static") ? cla.getSimpleName() + "." : variableName + ".") + methodName + "(" + params
						+ ");\n}\n\n");
			}
		}

	}

}
