package de.tisan.mcoref.helpers;

import net.minecraftforge.fml.common.FMLLog;

import org.apache.logging.log4j.Level;

public class Logger {

	public static void log(Level logLevel, Object object) {
		FMLLog.log("MCoreF", logLevel, String.valueOf(object));
	}

	public static void all(Object object) {
		Logger.log(Level.ALL, object);
	}

	public static void debug(Object object) {
		Logger.log(Level.DEBUG, object);
	}

	public static void error(Object object) {
		Logger.log(Level.ERROR, object);
	}

	public static void fatal(Object object) {
		Logger.log(Level.FATAL, object);
	}

	public static void info(Object object) {
		Logger.log(Level.INFO, object);
	}

	public static void off(Object object) {
		Logger.log(Level.OFF, object);
	}

	public static void trace(Object object) {
		Logger.log(Level.TRACE, object);
	}

	public static void warn(Object object) {
		Logger.log(Level.WARN, object);
	}

}
