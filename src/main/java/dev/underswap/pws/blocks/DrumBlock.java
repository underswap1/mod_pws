package dev.underswap.pws.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.MapColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class DrumBlock extends Block {
    public DrumBlock() {
        super(FabricBlockSettings.create()
                .mapColor(MapColor.WHITE_GRAY)
                .strength(1.0F)
                .sounds(BlockSoundGroup.BONE)
                .nonOpaque());
    }

    @SuppressWarnings("deprecation")
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient && hit.getSide() == Direction.UP) {
            world.playSound(null, pos, SoundEvents.BLOCK_NOTE_BLOCK_BASEDRUM.value(), SoundCategory.BLOCKS, 1.0F, 1.0F);
        }
        return ActionResult.SUCCESS;
    }}