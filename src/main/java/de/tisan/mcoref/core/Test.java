package de.tisan.mcoref.core;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.cookie.Cookie;




import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;




import com.lukasdietrich.lambdatra.Lambdatra;
import com.lukasdietrich.lambdatra.reaction.http.WrappedRequest;
import com.lukasdietrich.lambdatra.session.SessionStore;




import net.minecraft.nbt.NBTException;
import net.minecraft.util.DamageSource;
import net.minecraftforge.fml.relauncher.SideOnly;
import de.tisan.mcoref.events.properties.BukkitListener;
import de.tisan.mcoref.helpers.Bukkit;

public class Test implements BukkitListener {

	public static void main(String[] args) throws InterruptedException,
			IOException, NBTException {

		// for(ServerListEntry ss :
		// Bukkit.getMinecraftMultiplayerServerListEntries()){
		// System.out.println(ss.getIp());
		// }
		//

		// Test.printMethods(DamageSource.class, "source");
		Lambdatra.create(80, server -> {

			
			server.on("/path/with/:parameters", (req, res) -> {

				res.write(String.format("Parameter was %s",
						req.getParam("parameters").get()));
				
			});
			server.on("/*", (req, res) -> {
				System.out.println(req.getCookie("ctime"));
				res.write("Requested page: " + req.getPath() + "\n");
				for(WrappedRequest<Map<String, String>>.Query q : req.getQueries()){
					res.write("\nQuery '" + q.getQueryName() + "' : values: ");
					for(String value : q.getValues()){
						res.write("'" + value + "', ");
					}
					
				}
				res.write("\nParams: " + req.getParam("params").orElse("none"));
			});
		});
	}

	public static void printMethods(Class cla, String variableName) {
		for (Method m : cla.getDeclaredMethods()) {
			if (Modifier.toString(m.getModifiers()).startsWith("public")) {
				String methodName = m.getName();

				if ((m.getAnnotations() != null)
						&& (m.getAnnotations().length > 0)) {
					for (Annotation a : m.getAnnotations()) {
						System.out.print("@" + a.annotationType().getName());
						if (a.annotationType() == SideOnly.class) {
							System.out.println("(Side."
									+ ((SideOnly) a).value().toString() + ")");
						}
					}

				}
				System.out.print(Modifier.toString(m.getModifiers()) + " "
						+ m.getReturnType().getSimpleName().replace("$", ".")
						+ " " + m.getName() + "(");
				String params = "";
				boolean returning = !m.getReturnType().getName()
						.equalsIgnoreCase("void");
				if (m.getParameterCount() > 0) {
					boolean before = false;
					for (Parameter p : m.getParameters()) {
						System.out.print((before ? ", " : "")
								+ p.getType().getName().replace("$", ".") + " "
								+ p.getName().replace("$", "."));
						params += (before ? ", " : "")
								+ p.getName().replace("$", ".");
						before = true;
					}
				}
				System.out.println("){");
				System.out.println((returning ? "return " : "")
						+ (Modifier.toString(m.getModifiers()).contains(
								"static") ? cla.getSimpleName() + "."
								: variableName + ".") + methodName + "("
						+ params + ");\n}\n\n");
			}
		}

	}

}
