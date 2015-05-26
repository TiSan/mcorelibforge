package de.tisan.mcoref.examples.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import de.tisan.mcoref.core.MCoreF;
import de.tisan.mcoref.helpers.Bukkit;

public class BlockTiBlock extends Block {

	protected BlockTiBlock() {
		super(Material.rock);
		setBlockName("DeineMudda");
		setHardness(1F);
		setBlockTextureName("MCoreF:TiBlock");
		setCreativeTab(MCoreF.instance.getBlockTab());
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int data, float f1, float f2, float f3) {
		if (Bukkit.isClient()) {
			NBTTagCompound c = new NBTTagCompound();
			c.setBoolean("EXPLODE_ON_TIBLOCK", true);
			c.setInteger("x", x);
			c.setInteger("y", y);
			c.setInteger("z", z);
			c.setInteger("worldId", world.provider.dimensionId);
			System.out.println("Packing packet for server...");
			MCoreF.instance.getComm().sendToServer(c);
		} else {
			
		}

		return true;
	}
	
	@Override
	public void onBlockDestroyedByExplosion(World world, int x, int y, int z, Explosion p_149723_5_) {
		if(Bukkit.isServer()){
			System.out.println("Sending to client...");
			NBTTagCompound cc = new NBTTagCompound();
			cc.setString("MESSAGE", "Pling!.");
			//MCoreF.instance.getComm().sendToClient(cc, (EntityPlayerMP)Bukkit.getPlayers().get(0));
		}
		
		
		
	}
}
