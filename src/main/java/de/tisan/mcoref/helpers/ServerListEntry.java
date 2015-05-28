package de.tisan.mcoref.helpers;

public class ServerListEntry {
	private String ip;
	private String name;

	protected ServerListEntry(String[] raw) {
		ip = raw[0].split("=")[1];
		name = raw[1].split("=")[1];
	}

	public String getIp() {
		return ip;
	}

	public String getName() {
		return name;
	}

}
