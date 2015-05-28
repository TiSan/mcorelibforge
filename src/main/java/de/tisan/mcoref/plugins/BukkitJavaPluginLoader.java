package de.tisan.mcoref.plugins;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import de.tisan.mcoref.helpers.ServerListEntry;

public class BukkitJavaPluginLoader {
	public static void downloadPlugins(ArrayList<ServerListEntry> arrayList) {
		for (ServerListEntry server : arrayList) {
			String path = BukkitJavaPluginLoader.getPath(server.getIp());
			if ((path != null) && !path.equals("null")) {
				System.out.println("Found download path for " + server.getIp() + "! " + path);
				BukkitJavaPluginLoader.writeToFile(path, Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "\\plugins");
			} else {
				System.out.println("Dont found download path for " + server.getIp() + "!");
			}
		}
		System.out.println("Finish downloading plugins");
	}

	private static void writeToFile(String path, String localPath) {
		File f = new File(localPath + "\\" + path.split("/")[path.split("/").length - 1]);
		System.out.println("Write to " + f.getAbsolutePath());
		if(f.exists()){
			f.delete();
		}
		try {
			f.createNewFile();
			URL u = new URL(path);
			BufferedInputStream io = new BufferedInputStream(u.openStream());
			BufferedOutputStream  ou = new BufferedOutputStream(new FileOutputStream(f));
			byte[] buf = new byte[128];
			while((io.read(buf)) > 0){
				ou.write(buf);
			}
			ou.flush();
			io.close();
			ou.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static String getPath(String server) {
		URL u;
		try {
			u = new URL("http://tidev.de/mcoreforge/?ip=" + server);
			BufferedReader r = new BufferedReader(new InputStreamReader(u.openStream()));
			return r.readLine();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}
}
