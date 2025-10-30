package dev.underswap.pws;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import java.util.List;

public class PwsItemGroups {
    public static final ItemGroup PWS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier("pws", "pws_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pws_group"))
                    .icon(() -> new ItemStack(PwsTools.BONE_PICKAXE))
                    .entries((context, entries) -> entries.addAll(List.of(
                            new ItemStack(PwsTools.BONE_PICKAXE),
                            new ItemStack(PwsTools.BONE_AXE),
                            new ItemStack(PwsTools.BONE_SHOVEL),
                            new ItemStack(PwsTools.BONE_SWORD),
                            new ItemStack(PwsArmor.BONE_BOOTS),
                            new ItemStack(PwsArmor.BONE_HELMET),
                            new ItemStack(PwsArmor.BONE_CHESTPLATE),
                            new ItemStack(PwsArmor.BONE_LEGGINGS),
                            new ItemStack(PwsBlocks.DRUM_BLOCK),
                            new ItemStack(PwsBlocks.TOUGH_DIRT),
                            new ItemStack(PwsBlocks.TOUGH_STONE)
                    )))
                    .build()
    );
}