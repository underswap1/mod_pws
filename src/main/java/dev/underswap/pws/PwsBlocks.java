package dev.underswap.pws;

import dev.underswap.pws.blocks.DrumBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class PwsBlocks {
    public static final Item DRUM_BLOCK = registerBlockItem(
            "drum_block",
            new DrumBlock(
                    FabricBlockSettings.create()
                            .mapColor(MapColor.WHITE_GRAY)
                            .strength(1.0F)
                            .sounds(BlockSoundGroup.BONE)
                            .nonOpaque()
            ),
            new FabricItemSettings()
    );

    public static final Item TOUGH_STONE = registerBlockItem(
            "tough_stone",
            new Block(
                    FabricBlockSettings.create()
                            .strength(2.0F, 6.0F)
                            .requiresTool()
                            .mapColor(MapColor.STONE_GRAY)
                            .sounds(BlockSoundGroup.STONE)
            ),
            new FabricItemSettings()
    );

    public static final Item TOUGH_DIRT = registerBlockItem(
            "though_dirt",
            new Block(
                    FabricBlockSettings.create()
                            .strength(1.5F)
                            .mapColor(MapColor.DIRT_BROWN)
                            .sounds(BlockSoundGroup.GRAVEL)
            ),
            new FabricItemSettings()
    );

    public static void registerBlocks() {
        PwsMod.LOGGER.info("Registering blocks for " + PwsMod.MOD_ID);
    }

    private static Block registerBlock(String id, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(PwsMod.MOD_ID, id), block);
    }

    private static Item registerBlockItem(String id, Block block, FabricItemSettings settings) {
        registerBlock(id, block);
        return Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, id), new BlockItem(block, settings));
    }
}