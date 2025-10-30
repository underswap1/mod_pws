package dev.underswap.pws.blocks;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class ToughDirtBlock extends Block {
    public ToughDirtBlock() {
        super(FabricBlockSettings.create()
                .strength(1.5F)
                .mapColor(MapColor.DIRT_BROWN)
                .sounds(BlockSoundGroup.GRAVEL));
    }
}