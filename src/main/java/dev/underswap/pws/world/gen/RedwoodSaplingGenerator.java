package dev.underswap.pws.world.gen;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;

import dev.underswap.pws.PwsBlocks;

public class RedwoodSaplingGenerator extends net.minecraft.block.sapling.SaplingGenerator {

    protected RegistryKey<ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return PwsConfigureFeature.REDWOOD_TREE_KEY;
    }

    public boolean generate(StructureWorldAccess world, ChunkGenerator generator, BlockPos pos, BlockState state, net.minecraft.util.math.random.Random random) {
        if (isSaplingSquare(world, pos, 2)) {
            clearSaplings((ServerWorld) world, pos, 2);
            return world.getRegistryManager()
                    .get(RegistryKeys.CONFIGURED_FEATURE)
                    .get(PwsConfigureFeature.REDWOOD_TREE_KEY)
                    .generate(world, generator, random, pos);
        }

        if (isSaplingSquare(world, pos, 3)) {
            clearSaplings((ServerWorld) world, pos, 3);
            return world.getRegistryManager()
                    .get(RegistryKeys.CONFIGURED_FEATURE)
                    .get(PwsConfigureFeature.REDWOOD_TREE_3X3_KEY)
                    .generate(world, generator, random, pos);
        }

        return super.generate((ServerWorld) world, generator, pos, state, random);
    }

    private boolean isSaplingSquare(WorldAccess world, BlockPos pos, int size) {
        Block sapling = PwsBlocks.BLOCKS.get("redwood_sapling");
        for (int x = 0; x < size; x++) {
            for (int z = 0; z < size; z++) {
                if (world.getBlockState(pos.add(x, 0, z)).getBlock() != sapling) {
                    return false;
                }
            }
        }
        return true;
    }

    private void clearSaplings(ServerWorld world, BlockPos pos, int size) {
        for (int x = 0; x < size; x++) {
            for (int z = 0; z < size; z++) {
                world.removeBlock(pos.add(x, 0, z), false);
            }
        }
    }
}