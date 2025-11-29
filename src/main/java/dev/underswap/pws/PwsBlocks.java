package dev.underswap.pws;

import dev.underswap.pws.blocks.DrumBlock;
import dev.underswap.pws.world.gen.RedwoodSaplingGenerator;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class PwsBlocks {

    public static final Map<String, Block> BLOCKS = new LinkedHashMap<>();
    public static final Map<String, Item> BLOCK_ITEMS = new LinkedHashMap<>();

    static {
        addBlock("drum_block", new DrumBlock(FabricBlockSettings.create()
                .mapColor(MapColor.WHITE_GRAY)
                .strength(1.0F)
                .sounds(BlockSoundGroup.BONE)
                .nonOpaque()));
        addBlock("tough_stone", new Block(FabricBlockSettings.create()
                .strength(2.0F, 6.0F)
                .requiresTool()
                .mapColor(MapColor.STONE_GRAY)
                .sounds(BlockSoundGroup.STONE)));
        addBlock("tough_dirt", new Block(FabricBlockSettings.create()
                .strength(1.5F)
                .mapColor(MapColor.DIRT_BROWN)
                .sounds(BlockSoundGroup.GRAVEL)));

        // Redwood set
        addBlock("redwood_log", new PillarBlock(FabricBlockSettings.create()
                .mapColor(MapColor.TERRACOTTA_PURPLE)
                .strength(2.0F)
                .sounds(BlockSoundGroup.WOOD)));
        addBlock("redwood_wood", new PillarBlock(FabricBlockSettings.create()
                .mapColor(MapColor.TERRACOTTA_PURPLE)
                .strength(2.0F)
                .sounds(BlockSoundGroup.WOOD)));
        addBlock("stripped_redwood_log", new PillarBlock(FabricBlockSettings.create()
                .mapColor(MapColor.TERRACOTTA_PURPLE)
                .strength(2.0F)
                .sounds(BlockSoundGroup.WOOD)));
        addBlock("stripped_redwood_wood", new PillarBlock(FabricBlockSettings.create()
                .mapColor(MapColor.TERRACOTTA_PURPLE)
                .strength(2.0F)
                .sounds(BlockSoundGroup.WOOD)));

        addBlock("redwood_planks", new Block(FabricBlockSettings.create()
                .mapColor(MapColor.TERRACOTTA_PURPLE)
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.WOOD)));

        addBlock("redwood_leaves", new LeavesBlock(FabricBlockSettings.create()
                .mapColor(MapColor.GREEN)
                .strength(0.2F)
                .nonOpaque()
                .sounds(BlockSoundGroup.GRASS)));

        addBlock("redwood_sapling",
                new SaplingBlock(
                        new RedwoodSaplingGenerator(),
                        FabricBlockSettings.create()
                                .mapColor(MapColor.DARK_GREEN)
                                .strength(0.0F)
                                .sounds(BlockSoundGroup.GRASS)
                                .noCollision()
                                .ticksRandomly()));

        addBlock("redwood_stairs", new StairsBlock(BLOCKS.get("redwood_planks").getDefaultState(), FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks"))));
        addBlock("redwood_slab", new SlabBlock(FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks"))));
        addBlock("redwood_fence", new FenceBlock(FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks"))));
        addBlock("redwood_fence_gate", new FenceGateBlock(FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks")), PwsTypes.REDWOOD_WOOD));
        addBlock("redwood_door", new DoorBlock(FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks")).nonOpaque(), PwsTypes.REDWOOD_SET));
        addBlock("redwood_trapdoor", new TrapdoorBlock(FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks")).nonOpaque(), PwsTypes.REDWOOD_SET));
        addBlock("redwood_button", new ButtonBlock(FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks")).noCollision(), BlockSetType.OAK, 30, true));
        addBlock("redwood_pressure_plate", new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                FabricBlockSettings.copyOf(BLOCKS.get("redwood_planks")), BlockSetType.OAK));
    }

    private static void addBlock(String id, Block block) {
        BLOCKS.put(id, block);
        BLOCK_ITEMS.put(id, new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        PwsMod.LOGGER.info("Registering blocks for " + PwsMod.MOD_ID);
        BLOCKS.forEach((id, block) -> Registry.register(Registries.BLOCK, new Identifier(PwsMod.MOD_ID, id), block));
        BLOCK_ITEMS.forEach((id, item) -> Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, id), item));
    }
}