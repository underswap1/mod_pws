package com.example.pws.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;

public class ToughStoneBlock extends Block {
    public ToughStoneBlock() {
        super(FabricBlockSettings.create()
                .strength(2.0F, 6.0F)
                .requiresTool()
                .mapColor(MapColor.STONE_GRAY)
                .sounds(BlockSoundGroup.STONE));
    }
}