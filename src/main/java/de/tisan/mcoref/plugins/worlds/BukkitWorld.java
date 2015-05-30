package de.tisan.mcoref.plugins.worlds;

import net.minecraft.world.MinecraftException;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;

public class BukkitWorld {
	private World world;

	public BukkitWorld(World world) {
		this.world = world;
	}

	public net.minecraft.world.World init() {
		return world.init();
	}

	public void initialize(net.minecraft.world.WorldSettings arg0) {
		world.initialize(arg0);
	}

	public net.minecraft.world.biome.WorldChunkManager getWorldChunkManager() {
		return world.getWorldChunkManager();
	}

	public net.minecraft.world.biome.BiomeGenBase getBiomeGenForCoords(net.minecraft.util.BlockPos arg0) {
		return world.getBiomeGenForCoords(arg0);
	}

	public net.minecraft.world.biome.BiomeGenBase getBiomeGenForCoordsBody(net.minecraft.util.BlockPos arg0) {
		return world.getBiomeGenForCoordsBody(arg0);
	}

	public java.util.List getEntitiesWithinAABBExcludingEntity(net.minecraft.entity.Entity arg0, net.minecraft.util.AxisAlignedBB arg1) {
		return world.getEntitiesWithinAABBExcludingEntity(arg0, arg1);
	}

	public boolean canSeeSky(net.minecraft.util.BlockPos arg0) {
		return world.canSeeSky(arg0);
	}

	public boolean canBlockSeeSky(net.minecraft.util.BlockPos arg0) {
		return world.canBlockSeeSky(arg0);
	}

	public int getLight(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.getLight(arg0, arg1);
	}

	public int getLight(net.minecraft.util.BlockPos arg0) {
		return world.getLight(arg0);
	}

	public boolean setBlockState(net.minecraft.util.BlockPos arg0, net.minecraft.block.state.IBlockState arg1, int arg2) {
		return world.setBlockState(arg0, arg1, arg2);
	}

	public boolean setBlockState(net.minecraft.util.BlockPos arg0, net.minecraft.block.state.IBlockState arg1) {
		return world.setBlockState(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public double getHorizon() {
		return world.getHorizon();
	}

	public net.minecraft.util.BlockPos getHorizon(net.minecraft.util.BlockPos arg0) {
		return world.getHorizon(arg0);
	}

	public boolean destroyBlock(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.destroyBlock(arg0, arg1);
	}

	public int getLightFor(net.minecraft.world.EnumSkyBlock arg0, net.minecraft.util.BlockPos arg1) {
		return world.getLightFor(arg0, arg1);
	}

	public boolean setBlockToAir(net.minecraft.util.BlockPos arg0) {
		return world.setBlockToAir(arg0);
	}

	public boolean isAirBlock(net.minecraft.util.BlockPos arg0) {
		return world.isAirBlock(arg0);
	}

	public boolean isBlockLoaded(net.minecraft.util.BlockPos arg0) {
		return world.isBlockLoaded(arg0);
	}

	public boolean isBlockLoaded(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.isBlockLoaded(arg0, arg1);
	}

	public boolean isAreaLoaded(net.minecraft.util.BlockPos arg0, net.minecraft.util.BlockPos arg1) {
		return world.isAreaLoaded(arg0, arg1);
	}

	public boolean isAreaLoaded(net.minecraft.util.BlockPos arg0, int arg1, boolean arg2) {
		return world.isAreaLoaded(arg0, arg1, arg2);
	}

	public boolean isAreaLoaded(net.minecraft.util.BlockPos arg0, int arg1) {
		return world.isAreaLoaded(arg0, arg1);
	}

	public boolean isAreaLoaded(net.minecraft.world.gen.structure.StructureBoundingBox arg0) {
		return world.isAreaLoaded(arg0);
	}

	public boolean isAreaLoaded(net.minecraft.util.BlockPos arg0, net.minecraft.util.BlockPos arg1, boolean arg2) {
		return world.isAreaLoaded(arg0, arg1, arg2);
	}

	public boolean isAreaLoaded(net.minecraft.world.gen.structure.StructureBoundingBox arg0, boolean arg1) {
		return world.isAreaLoaded(arg0, arg1);
	}

	public void func_175722_b(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1) {
		world.func_175722_b(arg0, arg1);
	}

	public net.minecraft.block.state.IBlockState getBlockState(net.minecraft.util.BlockPos arg0) {
		return world.getBlockState(arg0);
	}

	public void func_175717_a(net.minecraft.util.BlockPos arg0, java.lang.String arg1) {
		world.func_175717_a(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int getCombinedLight(net.minecraft.util.BlockPos arg0, int arg1) {
		return world.getCombinedLight(arg0, arg1);
	}

	public net.minecraft.util.MovingObjectPosition rayTraceBlocks(net.minecraft.util.Vec3 arg0, net.minecraft.util.Vec3 arg1, boolean arg2) {
		return world.rayTraceBlocks(arg0, arg1, arg2);
	}

	public net.minecraft.util.MovingObjectPosition rayTraceBlocks(net.minecraft.util.Vec3 arg0, net.minecraft.util.Vec3 arg1, boolean arg2, boolean arg3, boolean arg4) {
		return world.rayTraceBlocks(arg0, arg1, arg2, arg3, arg4);
	}

	public net.minecraft.util.MovingObjectPosition rayTraceBlocks(net.minecraft.util.Vec3 arg0, net.minecraft.util.Vec3 arg1) {
		return world.rayTraceBlocks(arg0, arg1);
	}

	public void playSoundEffect(double arg0, double arg1, double arg2, java.lang.String arg3, float arg4, float arg5) {
		world.playSoundEffect(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void spawnParticle(net.minecraft.util.EnumParticleTypes arg0, boolean arg1, double arg2, double arg3, double arg4, double arg5, double arg6, double arg7, int... arg8) {
		world.spawnParticle(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
	}

	public void spawnParticle(net.minecraft.util.EnumParticleTypes arg0, double arg1, double arg2, double arg3, double arg4, double arg5, double arg6, int... arg7) {
		world.spawnParticle(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	public boolean isDaytime() {
		return world.isDaytime();
	}

	public void notifyLightSet(net.minecraft.util.BlockPos arg0) {
		world.notifyLightSet(arg0);
	}

	public void playSound(double arg0, double arg1, double arg2, java.lang.String arg3, float arg4, float arg5, boolean arg6) {
		world.playSound(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public void setLightFor(net.minecraft.world.EnumSkyBlock arg0, net.minecraft.util.BlockPos arg1, int arg2) {
		world.setLightFor(arg0, arg1, arg2);
	}

	public void setAllowedSpawnTypes(boolean arg0, boolean arg1) {
		world.setAllowedSpawnTypes(arg0, arg1);
	}

	public float getCurrentMoonPhaseFactor() {
		return world.getCurrentMoonPhaseFactor();
	}

	public void removeWorldAccess(net.minecraft.world.IWorldAccess arg0) {
		world.removeWorldAccess(arg0);
	}

	public void markBlockForUpdate(net.minecraft.util.BlockPos arg0) {
		world.markBlockForUpdate(arg0);
	}

	public float getSunBrightnessFactor(float arg0) {
		return world.getSunBrightnessFactor(arg0);
	}

	public net.minecraft.world.chunk.Chunk getChunkFromBlockCoords(net.minecraft.util.BlockPos arg0) {
		return world.getChunkFromBlockCoords(arg0);
	}

	public float getCurrentMoonPhaseFactorBody() {
		return world.getCurrentMoonPhaseFactorBody();
	}

	public net.minecraft.block.Block getGroundAboveSeaLevel(net.minecraft.util.BlockPos arg0) {
		return world.getGroundAboveSeaLevel(arg0);
	}

	public boolean checkNoEntityCollision(net.minecraft.util.AxisAlignedBB arg0, net.minecraft.entity.Entity arg1) {
		return world.checkNoEntityCollision(arg0, arg1);
	}

	public boolean checkNoEntityCollision(net.minecraft.util.AxisAlignedBB arg0) {
		return world.checkNoEntityCollision(arg0);
	}

	public void calculateInitialSkylight() {
		world.calculateInitialSkylight();
	}

	public void calculateInitialWeatherBody() {
		world.calculateInitialWeatherBody();
	}

	public int getLightFromNeighbors(net.minecraft.util.BlockPos arg0) {
		return world.getLightFromNeighbors(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public float getStarBrightness(float arg0) {
		return world.getStarBrightness(arg0);
	}

	public void notifyBlockOfStateChange(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1) {
		world.notifyBlockOfStateChange(arg0, arg1);
	}

	public boolean isBlockTickPending(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1) {
		return world.isBlockTickPending(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void setInitialSpawnLocation() {
		world.setInitialSpawnLocation();
	}

	public void playSoundAtEntity(net.minecraft.entity.Entity arg0, java.lang.String arg1, float arg2, float arg3) {
		world.playSoundAtEntity(arg0, arg1, arg2, arg3);
	}

	public void removePlayerEntityDangerously(net.minecraft.entity.Entity arg0) {
		world.removePlayerEntityDangerously(arg0);
	}

	public void markAndNotifyBlock(net.minecraft.util.BlockPos arg0, net.minecraft.world.chunk.Chunk arg1, net.minecraft.block.state.IBlockState arg2, net.minecraft.block.state.IBlockState arg3,
			int arg4) {
		world.markAndNotifyBlock(arg0, arg1, arg2, arg3, arg4);
	}

	public java.util.List getCollidingBoundingBoxes(net.minecraft.entity.Entity arg0, net.minecraft.util.AxisAlignedBB arg1) {
		return world.getCollidingBoundingBoxes(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public float getStarBrightnessBody(float arg0) {
		return world.getStarBrightnessBody(arg0);
	}

	public void updateEntityWithOptionalForce(net.minecraft.entity.Entity arg0, boolean arg1) {
		world.updateEntityWithOptionalForce(arg0, arg1);
	}

	public boolean handleMaterialAcceleration(net.minecraft.util.AxisAlignedBB arg0, net.minecraft.block.material.Material arg1, net.minecraft.entity.Entity arg2) {
		return world.handleMaterialAcceleration(arg0, arg1, arg2);
	}

	public net.minecraft.world.chunk.Chunk getChunkFromChunkCoords(int arg0, int arg1) {
		return world.getChunkFromChunkCoords(arg0, arg1);
	}

	public int getChunksLowestHorizon(int arg0, int arg1) {
		return world.getChunksLowestHorizon(arg0, arg1);
	}

	public float getLightBrightness(net.minecraft.util.BlockPos arg0) {
		return world.getLightBrightness(arg0);
	}

	public void playSoundToNearExcept(net.minecraft.entity.player.EntityPlayer arg0, java.lang.String arg1, float arg2, float arg3) {
		world.playSoundToNearExcept(arg0, arg1, arg2, arg3);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public float getSunBrightnessBody(float arg0) {
		return world.getSunBrightnessBody(arg0);
	}

	public float getCelestialAngle(float arg0) {
		return world.getCelestialAngle(arg0);
	}

	public void notifyNeighborsOfStateChange(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1) {
		world.notifyNeighborsOfStateChange(arg0, arg1);
	}

	public void markBlockRangeForRenderUpdate(net.minecraft.util.BlockPos arg0, net.minecraft.util.BlockPos arg1) {
		world.markBlockRangeForRenderUpdate(arg0, arg1);
	}

	public void markBlockRangeForRenderUpdate(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		world.markBlockRangeForRenderUpdate(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public int calculateSkylightSubtracted(float arg0) {
		return world.calculateSkylightSubtracted(arg0);
	}

	public float getCelestialAngleRadians(float arg0) {
		return world.getCelestialAngleRadians(arg0);
	}

	public void notifyNeighborsOfStateExcept(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1, net.minecraft.util.EnumFacing arg2) {
		world.notifyNeighborsOfStateExcept(arg0, arg1, arg2);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public java.lang.String getDebugLoadedEntities() {
		return world.getDebugLoadedEntities();
	}

	public boolean spawnEntityInWorld(net.minecraft.entity.Entity arg0) {
		return world.spawnEntityInWorld(arg0);
	}

	public void markTileEntityForRemoval(net.minecraft.tileentity.TileEntity arg0) {
		world.markTileEntityForRemoval(arg0);
	}

	public static boolean doesBlockHaveSolidTopSurface(net.minecraft.world.IBlockAccess arg0, net.minecraft.util.BlockPos arg1) {
		return World.doesBlockHaveSolidTopSurface(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int getLightFromNeighborsFor(net.minecraft.world.EnumSkyBlock arg0, net.minecraft.util.BlockPos arg1) {
		return world.getLightFromNeighborsFor(arg0, arg1);
	}

	public boolean checkBlockCollision(net.minecraft.util.AxisAlignedBB arg0) {
		return world.checkBlockCollision(arg0);
	}

	public void markBlocksDirtyVertical(int arg0, int arg1, int arg2, int arg3) {
		world.markBlocksDirtyVertical(arg0, arg1, arg2, arg3);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void sendQuittingDisconnectingPacket() {
		world.sendQuittingDisconnectingPacket();
	}

	public net.minecraft.entity.player.EntityPlayer getPlayerEntityByName(java.lang.String arg0) {
		return world.getPlayerEntityByName(arg0);
	}

	public boolean canBlockFreezeBody(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.canBlockFreezeBody(arg0, arg1);
	}

	public net.minecraft.entity.Entity findNearestEntityWithinAABB(java.lang.Class arg0, net.minecraft.util.AxisAlignedBB arg1, net.minecraft.entity.Entity arg2) {
		return world.findNearestEntityWithinAABB(arg0, arg1, arg2);
	}

	public void updateWeatherBody() {
		world.updateWeatherBody();
	}

	public java.util.List getPendingBlockUpdates(net.minecraft.world.chunk.Chunk arg0, boolean arg1) {
		return world.getPendingBlockUpdates(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public java.util.List getLoadedEntityList() {
		return world.getLoadedEntityList();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void joinEntityInSurroundings(net.minecraft.entity.Entity arg0) {
		world.joinEntityInSurroundings(arg0);
	}

	public boolean isBlockModifiable(net.minecraft.entity.player.EntityPlayer arg0, net.minecraft.util.BlockPos arg1) {
		return world.isBlockModifiable(arg0, arg1);
	}

	public long getTotalWorldTime() {
		return world.getTotalWorldTime();
	}

	public java.util.List getEntitiesWithinAABB(java.lang.Class arg0, net.minecraft.util.AxisAlignedBB arg1) {
		return world.getEntitiesWithinAABB(arg0, arg1);
	}

	public net.minecraft.entity.player.EntityPlayer getClosestPlayerToEntity(net.minecraft.entity.Entity arg0, double arg1) {
		return world.getClosestPlayerToEntity(arg0, arg1);
	}

	public void updateAllPlayersSleepingFlag() {
		world.updateAllPlayersSleepingFlag();
	}

	public net.minecraft.entity.player.EntityPlayer getPlayerEntityByUUID(java.util.UUID arg0) {
		return world.getPlayerEntityByUUID(arg0);
	}

	public boolean isMaterialInBB(net.minecraft.util.AxisAlignedBB arg0, net.minecraft.block.material.Material arg1) {
		return world.isMaterialInBB(arg0, arg1);
	}

	public net.minecraft.util.BlockPos func_175672_r(net.minecraft.util.BlockPos arg0) {
		return world.func_175672_r(arg0);
	}

	public void scheduleUpdate(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1, int arg2) {
		world.scheduleUpdate(arg0, arg1, arg2);
	}

	public boolean isAABBInMaterial(net.minecraft.util.AxisAlignedBB arg0, net.minecraft.block.material.Material arg1) {
		return world.isAABBInMaterial(arg0, arg1);
	}

	public void updateEntities() {
		world.updateEntities();
	}

	public void addTileEntities(java.util.Collection arg0) {
		world.addTileEntities(arg0);
	}

	public void func_175654_a(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1, int arg2, int arg3) {
		world.func_175654_a(arg0, arg1, arg2, arg3);
	}

	public boolean addTileEntity(net.minecraft.tileentity.TileEntity arg0) {
		return world.addTileEntity(arg0);
	}

	public void func_180497_b(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1, int arg2, int arg3) {
		world.func_180497_b(arg0, arg1, arg2, arg3);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.Vec3 getFogColor(float arg0) {
		return world.getFogColor(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.Vec3 drawCloudsBody(float arg0) {
		return world.drawCloudsBody(arg0);
	}

	public net.minecraft.util.BlockPos func_175725_q(net.minecraft.util.BlockPos arg0) {
		return world.func_175725_q(arg0);
	}

	public void updateEntity(net.minecraft.entity.Entity arg0) {
		world.updateEntity(arg0);
	}

	public boolean isAnyLiquid(net.minecraft.util.AxisAlignedBB arg0) {
		return world.isAnyLiquid(arg0);
	}

	public boolean func_147470_e(net.minecraft.util.AxisAlignedBB arg0) {
		return world.func_147470_e(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.Vec3 getCloudColour(float arg0) {
		return world.getCloudColour(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int getMoonPhase() {
		return world.getMoonPhase();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.Vec3 getSkyColorBody(net.minecraft.entity.Entity arg0, float arg1) {
		return world.getSkyColorBody(arg0, arg1);
	}

	public void onEntityAdded(net.minecraft.entity.Entity arg0) {
		world.onEntityAdded(arg0);
	}

	public void onEntityRemoved(net.minecraft.entity.Entity arg0) {
		world.onEntityRemoved(arg0);
	}

	public void removeEntity(net.minecraft.entity.Entity arg0) {
		world.removeEntity(arg0);
	}

	public void addWorldAccess(net.minecraft.world.IWorldAccess arg0) {
		world.addWorldAccess(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public float getSunBrightness(float arg0) {
		return world.getSunBrightness(arg0);
	}

	public boolean addWeatherEffect(net.minecraft.entity.Entity arg0) {
		return world.addWeatherEffect(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public net.minecraft.util.Vec3 getSkyColor(net.minecraft.entity.Entity arg0, float arg1) {
		return world.getSkyColor(arg0, arg1);
	}

	public boolean isInsideBorder(net.minecraft.world.border.WorldBorder arg0, net.minecraft.entity.Entity arg1) {
		return world.isInsideBorder(arg0, arg1);
	}

	public java.util.List func_147461_a(net.minecraft.util.AxisAlignedBB arg0) {
		return world.func_147461_a(arg0);
	}

	public boolean func_175662_w(net.minecraft.util.BlockPos arg0) {
		return world.func_175662_w(arg0);
	}

	public boolean func_175665_u(net.minecraft.util.BlockPos arg0) {
		return world.func_175665_u(arg0);
	}

	public boolean func_175670_e(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.func_175670_e(arg0, arg1);
	}

	public net.minecraft.world.Explosion createExplosion(net.minecraft.entity.Entity arg0, double arg1, double arg2, double arg3, float arg4, boolean arg5) {
		return world.createExplosion(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public void setTileEntity(net.minecraft.util.BlockPos arg0, net.minecraft.tileentity.TileEntity arg1) {
		world.setTileEntity(arg0, arg1);
	}

	public float getBlockDensity(net.minecraft.util.Vec3 arg0, net.minecraft.util.AxisAlignedBB arg1) {
		return world.getBlockDensity(arg0, arg1);
	}

	public boolean func_175677_d(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.func_175677_d(arg0, arg1);
	}

	public boolean func_175675_v(net.minecraft.util.BlockPos arg0) {
		return world.func_175675_v(arg0);
	}

	public net.minecraft.world.Explosion newExplosion(net.minecraft.entity.Entity arg0, double arg1, double arg2, double arg3, float arg4, boolean arg5, boolean arg6) {
		return world.newExplosion(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public java.lang.String getProviderName() {
		return world.getProviderName();
	}

	public void removeTileEntity(net.minecraft.util.BlockPos arg0) {
		world.removeTileEntity(arg0);
	}

	public void tick() {
		world.tick();
	}

	public void func_175637_a(net.minecraft.block.Block arg0, net.minecraft.util.BlockPos arg1, java.util.Random arg2) {
		world.func_175637_a(arg0, arg1, arg2);
	}

	public boolean func_175719_a(net.minecraft.entity.player.EntityPlayer arg0, net.minecraft.util.BlockPos arg1, net.minecraft.util.EnumFacing arg2) {
		return world.func_175719_a(arg0, arg1, arg2);
	}

	public net.minecraft.tileentity.TileEntity getTileEntity(net.minecraft.util.BlockPos arg0) {
		return world.getTileEntity(arg0);
	}

	public void func_175646_b(net.minecraft.util.BlockPos arg0, net.minecraft.tileentity.TileEntity arg1) {
		world.func_175646_b(arg0, arg1);
	}

	public int countEntities(net.minecraft.entity.EnumCreatureType arg0, boolean arg1) {
		return world.countEntities(arg0, arg1);
	}

	public int countEntities(java.lang.Class arg0) {
		return world.countEntities(arg0);
	}

	public boolean func_175708_f(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.func_175708_f(arg0, arg1);
	}

	public boolean checkLightFor(net.minecraft.world.EnumSkyBlock arg0, net.minecraft.util.BlockPos arg1) {
		return world.checkLightFor(arg0, arg1);
	}

	public boolean tickUpdates(boolean arg0) {
		return world.tickUpdates(arg0);
	}

	public java.util.List getPlayers(java.lang.Class arg0, com.google.common.base.Predicate arg1) {
		return world.getPlayers(arg0, arg1);
	}

	public java.util.List func_175647_a(java.lang.Class arg0, net.minecraft.util.AxisAlignedBB arg1, com.google.common.base.Predicate arg2) {
		return world.func_175647_a(arg0, arg1, arg2);
	}

	public java.util.List func_175712_a(net.minecraft.world.gen.structure.StructureBoundingBox arg0, boolean arg1) {
		return world.func_175712_a(arg0, arg1);
	}

	public java.util.List func_175644_a(java.lang.Class arg0, com.google.common.base.Predicate arg1) {
		return world.func_175644_a(arg0, arg1);
	}

	public boolean checkLight(net.minecraft.util.BlockPos arg0) {
		return world.checkLight(arg0);
	}

	public java.util.List func_175674_a(net.minecraft.entity.Entity arg0, net.minecraft.util.AxisAlignedBB arg1, com.google.common.base.Predicate arg2) {
		return world.func_175674_a(arg0, arg1, arg2);
	}

	public net.minecraft.entity.Entity getEntityByID(int arg0) {
		return world.getEntityByID(arg0);
	}

	public boolean canSnowAtBody(net.minecraft.util.BlockPos arg0, boolean arg1) {
		return world.canSnowAtBody(arg0, arg1);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public int func_175658_ac() {
		return world.func_175658_ac();
	}

	public net.minecraft.world.storage.MapStorage func_175693_T() {
		return world.func_175693_T();
	}

	public boolean isRaining() {
		return world.isRaining();
	}

	public void setItemData(java.lang.String arg0, net.minecraft.world.WorldSavedData arg1) {
		world.setItemData(arg0, arg1);
	}

	public boolean chunkExists(int arg0, int arg1) {
		return world.chunkExists(arg0, arg1);
	}

	public boolean isSideSolid(net.minecraft.util.BlockPos arg0, net.minecraft.util.EnumFacing arg1, boolean arg2) {
		return world.isSideSolid(arg0, arg1, arg2);
	}

	public boolean isSideSolid(net.minecraft.util.BlockPos arg0, net.minecraft.util.EnumFacing arg1) {
		return world.isSideSolid(arg0, arg1);
	}

	public net.minecraft.util.BlockPos func_180499_a(java.lang.String arg0, net.minecraft.util.BlockPos arg1) {
		return world.func_180499_a(arg0, arg1);
	}

	public net.minecraft.scoreboard.Scoreboard getScoreboard() {
		return world.getScoreboard();
	}

	public boolean func_175727_C(net.minecraft.util.BlockPos arg0) {
		return world.func_175727_C(arg0);
	}

	public int getUniqueDataId(java.lang.String arg0) {
		return world.getUniqueDataId(arg0);
	}

	public net.minecraft.world.border.WorldBorder getWorldBorder() {
		return world.getWorldBorder();
	}

	public net.minecraft.world.WorldSavedData loadItemData(java.lang.Class arg0, java.lang.String arg1) {
		return world.loadItemData(arg0, arg1);
	}

	public java.util.Calendar getCurrentDate() {
		return world.getCurrentDate();
	}

	public boolean func_180502_D(net.minecraft.util.BlockPos arg0) {
		return world.func_180502_D(arg0);
	}

	public void func_175669_a(int arg0, net.minecraft.util.BlockPos arg1, int arg2) {
		world.func_175669_a(arg0, arg1, arg2);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void makeFireworks(double arg0, double arg1, double arg2, double arg3, double arg4, double arg5, net.minecraft.nbt.NBTTagCompound arg6) {
		world.makeFireworks(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
	}

	public net.minecraft.world.EnumDifficulty getDifficulty() {
		return world.getDifficulty();
	}

	public java.util.Random setRandomSeed(int arg0, int arg1, int arg2) {
		return world.setRandomSeed(arg0, arg1, arg2);
	}

	public int getActualHeight() {
		return world.getActualHeight();
	}

	public int getHeight() {
		return world.getHeight();
	}

	public void playAuxSFX(int arg0, net.minecraft.util.BlockPos arg1, int arg2) {
		world.playAuxSFX(arg0, arg1, arg2);
	}

	public void setEntityState(net.minecraft.entity.Entity arg0, byte arg1) {
		world.setEntityState(arg0, arg1);
	}

	public float getRainStrength(float arg0) {
		return world.getRainStrength(arg0);
	}

	public net.minecraft.world.storage.ISaveHandler getSaveHandler() {
		return world.getSaveHandler();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void setRainStrength(float arg0) {
		world.setRainStrength(arg0);
	}

	public boolean isThundering() {
		return world.isThundering();
	}

	public net.minecraft.world.WorldType getWorldType() {
		return world.getWorldType();
	}

	public int getRedstonePower(net.minecraft.util.BlockPos arg0, net.minecraft.util.EnumFacing arg1) {
		return world.getRedstonePower(arg0, arg1);
	}

	public boolean isBlockPowered(net.minecraft.util.BlockPos arg0) {
		return world.isBlockPowered(arg0);
	}

	public net.minecraft.world.GameRules getGameRules() {
		return world.getGameRules();
	}

	public boolean canMineBlockBody(net.minecraft.entity.player.EntityPlayer arg0, net.minecraft.util.BlockPos arg1) {
		return world.canMineBlockBody(arg0, arg1);
	}

	public int func_175687_A(net.minecraft.util.BlockPos arg0) {
		return world.func_175687_A(arg0);
	}

	public void checkSessionLock() {
		try {
			world.checkSessionLock();
		} catch (MinecraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public net.minecraft.entity.player.EntityPlayer getClosestPlayer(double arg0, double arg1, double arg2, double arg3) {
		return world.getClosestPlayer(arg0, arg1, arg2, arg3);
	}

	public void loadEntities(java.util.Collection arg0) {
		world.loadEntities(arg0);
	}

	public boolean func_175709_b(net.minecraft.util.BlockPos arg0, net.minecraft.util.EnumFacing arg1) {
		return world.func_175709_b(arg0, arg1);
	}

	public boolean func_175636_b(double arg0, double arg1, double arg2, double arg3) {
		return world.func_175636_b(arg0, arg1, arg2, arg3);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void func_82738_a(long arg0) {
		world.func_82738_a(arg0);
	}

	public void unloadEntities(java.util.Collection arg0) {
		world.unloadEntities(arg0);
	}

	public long getSeed() {
		return world.getSeed();
	}

	public long getWorldTime() {
		return world.getWorldTime();
	}

	public void setWorldTime(long arg0) {
		world.setWorldTime(arg0);
	}

	public net.minecraft.util.BlockPos getSpawnPoint() {
		return world.getSpawnPoint();
	}

	public void setSpawnLocation(net.minecraft.util.BlockPos arg0) {
		world.setSpawnLocation(arg0);
	}

	public boolean canBlockBePlaced(net.minecraft.block.Block arg0, net.minecraft.util.BlockPos arg1, boolean arg2, net.minecraft.util.EnumFacing arg3, net.minecraft.entity.Entity arg4,
			net.minecraft.item.ItemStack arg5) {
		return world.canBlockBePlaced(arg0, arg1, arg2, arg3, arg4, arg5);
	}

	public net.minecraft.world.chunk.IChunkProvider getChunkProvider() {
		return world.getChunkProvider();
	}

	public net.minecraft.world.storage.WorldInfo getWorldInfo() {
		return world.getWorldInfo();
	}

	public int getStrongPower(net.minecraft.util.BlockPos arg0) {
		return world.getStrongPower(arg0);
	}

	public int getStrongPower(net.minecraft.util.BlockPos arg0, net.minecraft.util.EnumFacing arg1) {
		return world.getStrongPower(arg0, arg1);
	}

	public void addBlockEvent(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1, int arg2, int arg3) {
		world.addBlockEvent(arg0, arg1, arg2, arg3);
	}

	public void setLastLightningBolt(int arg0) {
		world.setLastLightningBolt(arg0);
	}

	public boolean isFindingSpawnPoint() {
		return world.isFindingSpawnPoint();
	}

	public void updateComparatorOutputLevel(net.minecraft.util.BlockPos arg0, net.minecraft.block.Block arg1) {
		world.updateComparatorOutputLevel(arg0, arg1);
	}

	public float getWeightedThunderStrength(float arg0) {
		return world.getWeightedThunderStrength(arg0);
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public boolean extendedLevelsInChunkCache() {
		return world.extendedLevelsInChunkCache();
	}

	public com.google.common.collect.ImmutableSetMultimap getPersistentChunks() {
		return world.getPersistentChunks();
	}

	public void setSkylightSubtracted(int arg0) {
		world.setSkylightSubtracted(arg0);
	}

	public int getBlockLightOpacity(net.minecraft.util.BlockPos arg0) {
		return world.getBlockLightOpacity(arg0);
	}

	public void sendBlockBreakProgress(int arg0, net.minecraft.util.BlockPos arg1, int arg2) {
		world.sendBlockBreakProgress(arg0, arg1, arg2);
	}

	public net.minecraft.crash.CrashReportCategory addWorldInfoToCrashReport(net.minecraft.crash.CrashReport arg0) {
		return world.addWorldInfoToCrashReport(arg0);
	}

	public net.minecraft.village.VillageCollection getVillageCollection() {
		return world.getVillageCollection();
	}

	public void playAuxSFXAtEntity(net.minecraft.entity.player.EntityPlayer arg0, int arg1, net.minecraft.util.BlockPos arg2, int arg3) {
		world.playAuxSFXAtEntity(arg0, arg1, arg2, arg3);
	}

	public net.minecraft.world.storage.MapStorage getPerWorldStorage() {
		return world.getPerWorldStorage();
	}

	public int getSkylightSubtracted() {
		return world.getSkylightSubtracted();
	}

	@net.minecraftforge.fml.relauncher.SideOnly(Side.CLIENT)
	public void setThunderStrength(float arg0) {
		world.setThunderStrength(arg0);
	}

	public net.minecraft.world.DifficultyInstance getDifficultyForLocation(net.minecraft.util.BlockPos arg0) {
		return world.getDifficultyForLocation(arg0);
	}

	public World getWorld() {
		return world;
	}

}
