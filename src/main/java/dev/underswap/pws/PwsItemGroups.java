package dev.underswap.pws;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PwsItemGroups {
    public static final ItemGroup PWS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(PwsMod.MOD_ID, "pws_group"),
            FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.pws_group"))
                    .icon(() -> new ItemStack(PwsTools.TOOLS.get("bone_pickaxe")))
                    .entries((context, entries) -> {
                        PwsTools.TOOLS.values().forEach(item -> entries.add(new ItemStack(item)));
                        PwsArmor.ARMOR.values().forEach(item -> entries.add(new ItemStack(item)));
                        PwsItems.ITEMS.values().forEach(item -> entries.add(new ItemStack(item)));
                        PwsBlocks.BLOCKS.values().forEach(item -> entries.add(new ItemStack(item)));
                    })
                    .build()
    );
}