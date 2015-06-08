package de.tisan.mcoref.plugins;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

import de.tisan.mcoref.helpers.Bukkit;
import de.tisan.mcoref.helpers.Logger;
import de.tisan.mcoref.plugins.commands.BukkitCommand;

public class BukkitPluginManager {
	private ArrayList<BukkitJavaPlugin> plugins;

	public BukkitPluginManager() {
		plugins = new ArrayList<BukkitJavaPlugin>();
		loadPlugins("plugins/");
	}

	public ArrayList<BukkitJavaPlugin> getPlugins() {
		return plugins;
	}

	public void unloadPlugins() {
		for (BukkitJavaPlugin p : plugins) {
			Logger.info("Disabling plugin '" + p.getName() + "', version " + p.getVersion());
			p.onDisable();
			p.enabled = false;
			Logger.info("Disabled plugin '" + p.getName() + "', version " + p.getVersion());
		}
		plugins.clear();
	}

	private ArrayList<BukkitJavaPlugin> loadPlugins(String pluginFolder) {
		ArrayList<BukkitJavaPlugin> plugins = new ArrayList<BukkitJavaPlugin>();
		File dir = new File(pluginFolder);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		for (File f : dir.listFiles()) {
			if (f.getName().contains(".jar")) {
				ClassLoader loader;
				try {
					loader = URLClassLoader.newInstance(new URL[] { f.toURI().toURL() }, getClass().getClassLoader());
					ArrayList<String> properties = readStringsFromFile(f.getAbsolutePath());
					if ((properties != null) && (properties.size() > 0)) {
						String pluginName = getProperty(properties, "name");
						String version = getProperty(properties, "version");
						String mainClass = getProperty(properties, "main");
						
						if ((pluginName != null) && (version != null) && (mainClass != null)) {
							try {
								
								Class<?> rawClass = Class.forName(mainClass, true, loader);
								Class<? extends BukkitJavaPlugin> runClass = rawClass.asSubclass(BukkitJavaPlugin.class);
								try {
									Constructor<? extends BukkitJavaPlugin> ctor = runClass.getConstructor();
									try {
										Logger.info("Enabling plugin '" + pluginName + "', version " + version);
										BukkitJavaPlugin doRun = ctor.newInstance();
										doRun.commands = getPropertyCommand(doRun, properties, "command");
										doRun.name = pluginName;
										doRun.version = version; 
										doRun.enabled = true;
										doRun.onPreEnable();
										Logger.info("Enabled plugin '" + pluginName + "', version " + version);
										plugins.add(doRun);
									} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
										Logger.error("Die Main-Klasse '" + mainClass + "' konnte nicht erstellt werden. Sind die Versionen kompatibel?");
									}

								} catch (NoSuchMethodException | SecurityException e) {
									Logger.error("Fehler in der Main-Klasse! Die ServerControllerPlugin hat ein unerwartetes Format. Sind die Versionen kompatibel?");
								}

							} catch (ClassNotFoundException e) {
								Logger.error("Fehler in der plugin.ini! Main-Klasse konnte nicht gefunden werden: " + mainClass);
							}

						} else {
							Logger.error("Fehler in der plugin.ini! Nicht alle nötigen Werte wurden angegeben! (name,version,main,commands)");
						}

					} else {
						Logger.error("Plugin.ini wurde in '" + f.getAbsolutePath() + "' nicht gefunden!");
					}
				} catch (MalformedURLException e) {
					Logger.error("Fehler beim Laden der JAR-Datei '" + f.getAbsolutePath() + "'.");
				}

			}

		}
		return plugins;
	}
	
	public void disablePlugins(){
		for(BukkitJavaPlugin plugin : plugins){
			plugin.onDisable();
		}
		plugins.clear();
	}
	public void initEnable(){
		for(BukkitJavaPlugin plugin : plugins){
			plugin.onEnable();
		}
	}
	public void initPostEnable(){
		for(BukkitJavaPlugin plugin : plugins){
			plugin.onPostEnable();
		}
	}
	
	private String getProperty(ArrayList<String> strings, String key) {
		for (String s : strings) {
			if (s.contains("=")) {
				String[] spl = s.split("=", 2);
				if (spl[0].equalsIgnoreCase(key)) {
					return spl[1];
				}
			}
		}
		return null;
	}

	private BukkitCommand[] getPropertyCommand(BukkitJavaPlugin plugin, ArrayList<String> strings, String key) {
		ArrayList<BukkitCommand> tmp = new ArrayList<BukkitCommand>();
		for (String s : strings) {
			if (s.contains("=")) {
				String[] spl = s.split("=", 2);
				if (spl[0].equalsIgnoreCase(key)) {
					String[] spl2 = spl[1].split(",", 2);
					tmp.add(Bukkit.getCommandManager().registerCommand(plugin, spl2[0], spl2[1]));
				}
			}
		}
		return tmp.toArray(new BukkitCommand[tmp.size()]);
	}

	private ArrayList<String> readStringsFromFile(String pathToJar) {
		ArrayList<String> strings = new ArrayList<String>();
		String path = pathToJar;
		String inputFile = "jar:file:/" + path + "!/plugin.ini";
		try {
			URL inputURL = new URL(inputFile);
			URLConnection uc = inputURL.openConnection();
			uc.setUseCaches(false);
			InputStream r = uc.getInputStream();
			Scanner sc = new Scanner(r);
			while (sc.hasNextLine()) {
				strings.add(sc.nextLine());
			}
			sc.close();
			r.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return strings;
	}
}
