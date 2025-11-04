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