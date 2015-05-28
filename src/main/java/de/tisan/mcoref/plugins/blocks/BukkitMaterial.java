package de.tisan.mcoref.plugins.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public enum BukkitMaterial {

	AIR(Blocks.air), STONE(Blocks.stone), GRASS(Blocks.grass), DIRT(Blocks.dirt), COBBLESTONE(Blocks.cobblestone), PLANKS(Blocks.planks), SAPLING(Blocks.sapling), BEDROCK(Blocks.bedrock), FLOWING_WATER(Blocks.flowing_water), WATER(
			Blocks.water), FLOWING_LAVA(Blocks.flowing_lava), LAVA(Blocks.lava), SAND(Blocks.sand), GRAVEL(Blocks.gravel), GOLD_ORE(Blocks.gold_ore), IRON_ORE(Blocks.iron_ore), COAL_ORE(Blocks.coal_ore), LOG(Blocks.log), LOG2(Blocks.log2), LEAVES(
			Blocks.leaves), LEAVES2(Blocks.leaves2), SPONGE(Blocks.sponge), GLASS(Blocks.glass), LAPIS_ORE(Blocks.lapis_ore), LAPIS_BLOCK(Blocks.lapis_block), DISPENSER(Blocks.dispenser), SANDSTONE(Blocks.sandstone), NOTEBLOCK(
			Blocks.noteblock), BED_BLOCK(Blocks.bed), GOLDEN_RAIL(Blocks.golden_rail), DETECTOR_RAIL(Blocks.detector_rail), STICKY_PISTON(Blocks.sticky_piston), WEB(Blocks.web), TALLGRASS(Blocks.tallgrass), DEADBUSH(Blocks.deadbush), PISTON(
			Blocks.piston), PISTON_HEAD(Blocks.piston_head), WOOL(Blocks.wool), PISTON_EXTENSION(Blocks.piston_extension), YELLOW_FLOWER(Blocks.yellow_flower), RED_FLOWER(Blocks.red_flower), BROWN_MUSHROOM(Blocks.brown_mushroom), RED_MUSHROOM(
			Blocks.red_mushroom), GOLD_BLOCK(Blocks.gold_block), IRON_BLOCK(Blocks.iron_block), DOUBLE_STONE_SLAB(Blocks.double_stone_slab), STONE_SLAB(Blocks.stone_slab), BRICK_BLOCK(Blocks.brick_block), TNT(Blocks.tnt), BOOKSHELF(
			Blocks.bookshelf), MOSSY_COBBLESTONE(Blocks.mossy_cobblestone), OBSIDIAN(Blocks.obsidian), TORCH(Blocks.torch), FIRE(Blocks.fire), MOB_SPAWNER(Blocks.mob_spawner), OAK_STAIRS(Blocks.oak_stairs), CHEST(Blocks.chest), REDSTONE_WIRE(
			Blocks.redstone_wire), DIAMOND_ORE(Blocks.diamond_ore), DIAMOND_BLOCK(Blocks.diamond_block), CRAFTING_TABLE(Blocks.crafting_table), WHEAT_BLOCK(Blocks.wheat), FARMLAND(Blocks.farmland), FURNACE(Blocks.furnace), LIT_FURNACE(
			Blocks.lit_furnace), STANDING_SIGN(Blocks.standing_sign), WOODEN_DOOR_BLOCK(Blocks.wooden_door), LADDER(Blocks.ladder), RAIL(Blocks.rail), STONE_STAIRS(Blocks.stone_stairs), WALL_SIGN(Blocks.wall_sign), LEVER(Blocks.lever), STONE_PRESSURE_PLATE(
			Blocks.stone_pressure_plate), IRON_DOOR_BLOCK(Blocks.iron_door), WOODEN_PRESSURE_PLATE(Blocks.wooden_pressure_plate), REDSTONE_ORE(Blocks.redstone_ore), LIT_REDSTONE_ORE(Blocks.lit_redstone_ore), UNLIT_REDSTONE_TORCH(
			Blocks.unlit_redstone_torch), REDSTONE_TORCH(Blocks.redstone_torch), STONE_BUTTON(Blocks.stone_button), SNOW_LAYER(Blocks.snow_layer), ICE(Blocks.ice), SNOW(Blocks.snow), CACTUS(Blocks.cactus), CLAY(Blocks.clay), REEDS_BLOCK(
			Blocks.reeds), JUKEBOX(Blocks.jukebox), FENCE(Blocks.fence), PUMPKIN(Blocks.pumpkin), NETHERRACK(Blocks.netherrack), SOUL_SAND(Blocks.soul_sand), GLOWSTONE(Blocks.glowstone), PORTAL(Blocks.portal), LIT_PUMPKIN(
			Blocks.lit_pumpkin), CAKE_BLOCK(Blocks.cake), UNPOWERED_REPEATER(Blocks.unpowered_repeater), POWERED_REPEATER(Blocks.powered_repeater), TRAPDOOR(Blocks.trapdoor), MONSTER_EGG(Blocks.monster_egg), STONEBRICK(Blocks.stonebrick), BROWN_MUSHROOM_BLOCK(
			Blocks.brown_mushroom_block), RED_MUSHROOM_BLOCK(Blocks.red_mushroom_block), IRON_BARS(Blocks.iron_bars), GLASS_PANE(Blocks.glass_pane), MELON_BLOCK(Blocks.melon_block), PUMPKIN_STEM(Blocks.pumpkin_stem), MELON_STEM(
			Blocks.melon_stem), VINE(Blocks.vine), FENCE_GATE(Blocks.fence_gate), BRICK_STAIRS(Blocks.brick_stairs), STONE_BRICK_STAIRS(Blocks.stone_brick_stairs), MYCELIUM(Blocks.mycelium), WATERLILY(Blocks.waterlily), NETHER_BRICK(
			Blocks.nether_brick), NETHER_BRICK_FENCE(Blocks.nether_brick_fence), NETHER_BRICK_STAIRS(Blocks.nether_brick_stairs), NETHER_WART_BLOCK(Blocks.nether_wart), ENCHANTING_TABLE(Blocks.enchanting_table), BREWING_STAND_BLOCK(
			Blocks.brewing_stand), CAULDRON_BLOCK(Blocks.cauldron), END_PORTAL(Blocks.end_portal), END_PORTAL_FRAME(Blocks.end_portal_frame), END_STONE(Blocks.end_stone), DRAGON_EGG(Blocks.dragon_egg), REDSTONE_LAMP(Blocks.redstone_lamp), LIT_REDSTONE_LAMP(
			Blocks.lit_redstone_lamp), DOUBLE_WOODEN_SLAB(Blocks.double_wooden_slab), WOODEN_SLAB(Blocks.wooden_slab), COCOA(Blocks.cocoa), SANDSTONE_STAIRS(Blocks.sandstone_stairs), EMERALD_ORE(Blocks.emerald_ore), ENDER_CHEST(
			Blocks.ender_chest), TRIPWIRE_HOOK(Blocks.tripwire_hook), TRIPWIRE(Blocks.tripwire), EMERALD_BLOCK(Blocks.emerald_block), SPRUCE_STAIRS(Blocks.spruce_stairs), BIRCH_STAIRS(Blocks.birch_stairs), JUNGLE_STAIRS(
			Blocks.jungle_stairs), COMMAND_BLOCK(Blocks.command_block), BEACON(Blocks.beacon), COBBLESTONE_WALL(Blocks.cobblestone_wall), FLOWER_POT(Blocks.flower_pot), CARROTS(Blocks.carrots), POTATOES(Blocks.potatoes), WOODEN_BUTTON(
			Blocks.wooden_button), SKULL(Blocks.skull), ANVIL(Blocks.anvil), TRAPPED_CHEST(Blocks.trapped_chest), LIGHT_WEIGHTED_PRESSURE_PLATE(Blocks.light_weighted_pressure_plate), HEAVY_WEIGHTED_PRESSURE_PLATE(
			Blocks.heavy_weighted_pressure_plate), UNPOWERED_COMPARATOR(Blocks.unpowered_comparator), POWERED_COMPARATOR(Blocks.powered_comparator), DAYLIGHT_DETECTOR(Blocks.daylight_detector), REDSTONE_BLOCK(Blocks.redstone_block), QUARTZ_ORE(
			Blocks.quartz_ore), HOPPER(Blocks.hopper), QUARTZ_BLOCK(Blocks.quartz_block), QUARTZ_STAIRS(Blocks.quartz_stairs), ACTIVATOR_RAIL(Blocks.activator_rail), DROPPER(Blocks.dropper), STAINED_HARDENED_CLAY(
			Blocks.stained_hardened_clay), HAY_BLOCK(Blocks.hay_block), CARPET(Blocks.carpet), HARDENED_CLAY(Blocks.hardened_clay), COAL_BLOCK(Blocks.coal_block), PACKED_ICE(Blocks.packed_ice), ACACIA_STAIRS(Blocks.acacia_stairs), DARK_OAK_STAIRS(
			Blocks.dark_oak_stairs), DOUBLE_PLANT(Blocks.double_plant), STAINED_GLASS(Blocks.stained_glass), STAINED_GLASS_PANE(Blocks.stained_glass_pane), IRON_SHOVEL(Items.iron_shovel), IRON_PICKAXE(Items.iron_pickaxe), IRON_AXE(
			Items.iron_axe), FLINT_AND_STEEL(Items.flint_and_steel), APPLE(Items.apple), BOW(Items.bow), ARROW(Items.arrow), COAL(Items.coal), DIAMOND(Items.diamond), IRON_INGOT(Items.iron_ingot), GOLD_INGOT(Items.gold_ingot), IRON_SWORD(
			Items.iron_sword), WOODEN_SWORD(Items.wooden_sword), WOODEN_SHOVEL(Items.wooden_shovel), WOODEN_PICKAXE(Items.wooden_pickaxe), WOODEN_AXE(Items.wooden_axe), STONE_SWORD(Items.stone_sword), STONE_SHOVEL(Items.stone_shovel), STONE_PICKAXE(
			Items.stone_pickaxe), STONE_AXE(Items.stone_axe), DIAMOND_SWORD(Items.diamond_sword), DIAMOND_SHOVEL(Items.diamond_shovel), DIAMOND_PICKAXE(Items.diamond_pickaxe), DIAMOND_AXE(Items.diamond_axe), STICK(Items.stick), BOWL(
			Items.bowl), MUSHROOM_STEW(Items.mushroom_stew), GOLDEN_SWORD(Items.golden_sword), GOLDEN_SHOVEL(Items.golden_shovel), GOLDEN_PICKAXE(Items.golden_pickaxe), GOLDEN_AXE(Items.golden_axe), STRING(Items.string), FEATHER(
			Items.feather), GUNPOWDER(Items.gunpowder), WOODEN_HOE(Items.wooden_hoe), STONE_HOE(Items.stone_hoe), IRON_HOE(Items.iron_hoe), DIAMOND_HOE(Items.diamond_hoe), GOLDEN_HOE(Items.golden_hoe), WHEAT_SEEDS(Items.wheat_seeds), WHEAT(
			Items.wheat), BREAD(Items.bread), LEATHER_HELMET(Items.leather_helmet), LEATHER_CHESTPLATE(Items.leather_chestplate), LEATHER_LEGGINGS(Items.leather_leggings), LEATHER_BOOTS(Items.leather_boots), CHAINMAIL_HELMET(
			Items.chainmail_helmet), CHAINMAIL_CHESTPLATE(Items.chainmail_chestplate), CHAINMAIL_LEGGINGS(Items.chainmail_leggings), CHAINMAIL_BOOTS(Items.chainmail_boots), IRON_HELMET(Items.iron_helmet), IRON_CHESTPLATE(
			Items.iron_chestplate), IRON_LEGGINGS(Items.iron_leggings), IRON_BOOTS(Items.iron_boots), DIAMOND_HELMET(Items.diamond_helmet), DIAMOND_CHESTPLATE(Items.diamond_chestplate), DIAMOND_LEGGINGS(Items.diamond_leggings), DIAMOND_BOOTS(
			Items.diamond_boots), GOLDEN_HELMET(Items.golden_helmet), GOLDEN_CHESTPLATE(Items.golden_chestplate), GOLDEN_LEGGINGS(Items.golden_leggings), GOLDEN_BOOTS(Items.golden_boots), FLINT(Items.flint), PORKCHOP(Items.porkchop), COOKED_PORKCHOP(
			Items.cooked_porkchop), PAINTING(Items.painting), GOLDEN_APPLE(Items.golden_apple), SIGN(Items.sign), WOODEN_DOOR(Items.wooden_door), BUCKET(Items.bucket), WATER_BUCKET(Items.water_bucket), LAVA_BUCKET(Items.lava_bucket), MINECART(
			Items.minecart), SADDLE(Items.saddle), IRON_DOOR(Items.iron_door), REDSTONE(Items.redstone), SNOWBALL(Items.snowball), BOAT(Items.boat), LEATHER(Items.leather), MILK_BUCKET(Items.milk_bucket), BRICK(Items.brick), CLAY_BALL(
			Items.clay_ball), REEDS(Items.reeds), PAPER(Items.paper), BOOK(Items.book), SLIME_BALL(Items.slime_ball), CHEST_MINECART(Items.chest_minecart), FURNACE_MINECART(Items.furnace_minecart), EGG(Items.egg), COMPASS(Items.compass), FISHING_ROD(
			Items.fishing_rod), CLOCK(Items.clock), GLOWSTONE_DUST(Items.glowstone_dust), FISH(Items.fish), COOKED_FISHED(Items.cooked_fished), DYE(Items.dye), BONE(Items.bone), SUGAR(Items.sugar), CAKE(Items.cake), BED(Items.bed), REPEATER(
			Items.repeater), COOKIE(Items.cookie), FILLED_MAP(Items.filled_map), SHEARS(Items.shears), MELON(Items.melon), PUMPKIN_SEEDS(Items.pumpkin_seeds), MELON_SEEDS(Items.melon_seeds), BEEF(Items.beef), COOKED_BEEF(Items.cooked_beef), CHICKEN(
			Items.chicken), COOKED_CHICKEN(Items.cooked_chicken), ROTTEN_FLESH(Items.rotten_flesh), ENDER_PEARL(Items.ender_pearl), BLAZE_ROD(Items.blaze_rod), GHAST_TEAR(Items.ghast_tear), GOLD_NUGGET(Items.gold_nugget), NETHER_WART(
			Items.nether_wart), POTIONITEM(Items.potionitem), GLASS_BOTTLE(Items.glass_bottle), SPIDER_EYE(Items.spider_eye), FERMENTED_SPIDER_EYE(Items.fermented_spider_eye), BLAZE_POWDER(Items.blaze_powder), MAGMA_CREAM(Items.magma_cream), BREWING_STAND(
			Items.brewing_stand), CAULDRON(Items.cauldron), ENDER_EYE(Items.ender_eye), SPECKLED_MELON(Items.speckled_melon), SPAWN_EGG(Items.spawn_egg), EXPERIENCE_BOTTLE(Items.experience_bottle), FIRE_CHARGE(Items.fire_charge), WRITABLE_BOOK(
			Items.writable_book), WRITTEN_BOOK(Items.written_book), EMERALD(Items.emerald), ITEM_FRAME(Items.item_frame), FLOWER_POT_ITEM(Items.flower_pot), CARROT(Items.carrot), POTATO(Items.potato), BAKED_POTATO(Items.baked_potato), POISONOUS_POTATO(
			Items.poisonous_potato), MAP(Items.map), GOLDEN_CARROT(Items.golden_carrot), SKULL_ITEM(Items.skull), CARROT_ON_A_STICK(Items.carrot_on_a_stick), NETHER_STAR(Items.nether_star), PUMPKIN_PIE(Items.pumpkin_pie), FIREWORKS(
			Items.fireworks), FIREWORK_CHARGE(Items.firework_charge), ENCHANTED_BOOK(Items.enchanted_book), COMPARATOR(Items.comparator), NETHERBRICK(Items.netherbrick), QUARTZ(Items.quartz), TNT_MINECART(Items.tnt_minecart), HOPPER_MINECART(
			Items.hopper_minecart), IRON_HORSE_ARMOR(Items.iron_horse_armor), GOLDEN_HORSE_ARMOR(Items.golden_horse_armor), DIAMOND_HORSE_ARMOR(Items.diamond_horse_armor), LEAD(Items.lead), NAME_TAG(Items.name_tag), COMMAND_BLOCK_MINECART(
			Items.command_block_minecart), RECORD_13(Items.record_13), RECORD_CAT(Items.record_cat), RECORD_BLOCKS(Items.record_blocks), RECORD_CHIRP(Items.record_chirp), RECORD_FAR(Items.record_far), RECORD_MALL(Items.record_mall), RECORD_MELLOHI(
			Items.record_mellohi), RECORD_STAL(Items.record_stal), RECORD_STRAD(Items.record_strad), RECORD_WARD(Items.record_ward), RECORD_11(Items.record_11), RECORD_WAIT(Items.record_wait);

	private BukkitMaterialType materialType;
	private Block block;
	private Item item;

	private BukkitMaterial(Block block) {
		materialType = BukkitMaterialType.BLOCK;
		this.block = block;
	}

	private BukkitMaterial(Item item) {
		materialType = BukkitMaterialType.ITEM;
		this.item = item;
	}

	public Block getMinecraftBlock() {
		return block;
	}

	public Item getMinecraftItem() {
		return item;
	}

	public Material getMinecraftMaterial() {
		return (block != null ? block.getMaterial() : null);
	}
}
