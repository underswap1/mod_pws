package dev.underswap.pws;

import net.minecraft.block.BlockSetType;
import net.minecraft.util.Identifier;
import net.minecraft.block.WoodType;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;

public class PwsTypes {
    // Custom BlockSetType for redwood
    public static final BlockSetType REDWOOD_SET =
            BlockSetTypeBuilder.copyOf(BlockSetType.OAK).build(new Identifier("pws", "redwood"));

    // Custom WoodType for redwood, linked to the BlockSetType
    public static final WoodType REDWOOD_WOOD =
            WoodTypeBuilder.copyOf(WoodType.OAK).build(new Identifier("pws", "redwood"), REDWOOD_SET);
}