package de.tisan.mcoref.helpers;

import java.io.File;
import java.io.IOException;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompressedStreamTools;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * This Class is only for the Client
 * 
 * @author mcNETDev
 *
 */
@SideOnly(Side.CLIENT)
public class ServerListHelper {

	/**
	 * Only for the Client Add a Server list Entry in the client Multiplayer
	 * menu
	 * 
	 * @param ip
	 *            The server IP and port
	 * @param name
	 *            The Name of the Entry
	 * @param first
	 *            set this to the first entry
	 * @return
	 */
	@SideOnly(Side.CLIENT)
	public static boolean addServerListEntry(String ip, String name, boolean first) {
		try {

			File f = new File(Minecraft.getMinecraft().mcDataDir.getAbsolutePath() + "\\servers.dat");
			NBTTagCompound nbttagcompound = CompressedStreamTools.read(f);
			if (nbttagcompound == null) {
				nbttagcompound = new NBTTagCompound();
				if (!nbttagcompound.hasKey("servers")) {
					NBTTagList newList = new NBTTagList();
					NBTTagCompound tagMY = new NBTTagCompound();
					tagMY.setString("ip", ip);
					tagMY.setString("name", name);
					newList.appendTag(tagMY);
					nbttagcompound.setTag("servers", newList);
					CompressedStreamTools.write(nbttagcompound, f);
				}
			}

			NBTTagList nbttaglist = nbttagcompound.getTagList("servers", 10);
			NBTTagList newList = new NBTTagList();

			NBTTagCompound tag = nbttaglist.getCompoundTagAt(0);
			if (first) {
				if (!tag.getString("ip").equalsIgnoreCase(ip)) {
					NBTTagCompound tagMY = new NBTTagCompound();
					tagMY.setString("ip", ip);
					tagMY.setString("name", name);
					newList.appendTag(tagMY);
				}
			}
			for (int i = 0; i < nbttaglist.tagCount(); ++i) {
				newList.appendTag(nbttaglist.getCompoundTagAt(i));
			}
			if (!first) {
				NBTTagCompound tagMY = new NBTTagCompound();
				tagMY.setString("ip", ip);
				tagMY.setString("name", name);
				newList.appendTag(tagMY);
			}
			NBTTagCompound finalTagCompound = new NBTTagCompound();
			finalTagCompound.setTag("servers", newList);
			CompressedStreamTools.write(finalTagCompound, f);
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}

