package de.tisan.mcoref.communication;

import java.util.ArrayList;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

public class Communication {

	private SimpleNetworkWrapper channel;
	private String name;
	private ArrayList<CommunicationEvent> events;

	protected Communication(String name) {
		this.name = name;
		events = new ArrayList<CommunicationEvent>();
		channel = NetworkRegistry.INSTANCE.newSimpleChannel("BUKKITCHAN:" + name);
		// if (Bukkit.isServer()) {
		ClientToServerHandler handler = new ClientToServerHandler();
		handler.setCommInstance(this);
		channel.registerMessage(handler, ClientToServerMessage.class, 0, Side.SERVER);

		// } else {
		ServerToClientHandler handler2 = new ServerToClientHandler();
		handler2.setCommInstance(this);
		channel.registerMessage(handler2, ServerToClientMessage.class, 1, Side.CLIENT);
		// }

	}

	public void addEvent(CommunicationEvent event) {
		events.add(event);
	}

	public void sendToServer(NBTTagCompound tag) {
		System.out.println("Sending...");
		channel.sendToServer(new ClientToServerMessage(tag));
		System.out.println("Packet sent!");
	}

	public void sendToClient(NBTTagCompound tag, EntityPlayerMP player) {
		channel.sendTo(new ServerToClientMessage(tag), player);
	}

	public void sendToAllClients(NBTTagCompound tag) {
		channel.sendToAll(new ServerToClientMessage(tag));
	}

	protected void pushServerEvent(NBTTagCompound tag) {
		for (CommunicationEvent e : events) {
			e.onClientToServerMessageReceived(tag);
		}
	}

	protected void pushClientEvent(NBTTagCompound tag) {
		for (CommunicationEvent e : events) {
			e.onServerToClientMessageReceived(tag);
		}
	}

	public String getName() {
		return name;
	}

}
