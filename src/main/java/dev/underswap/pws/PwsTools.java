package dev.underswap.pws;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class PwsTools {

    // Bone Tools
    public static final Item BONE_PICKAXE = new PickaxeItem(ModToolMaterial.BONE, 1, -2.8F,
            new FabricItemSettings());
    public static final Item BONE_AXE = new AxeItem(ModToolMaterial.BONE, 5, -3.0F,
            new FabricItemSettings());
    public static final Item BONE_SHOVEL = new ShovelItem(ModToolMaterial.BONE, 1.5F, -3.0F,
            new FabricItemSettings());
    public static final Item BONE_SWORD = new SwordItem(ModToolMaterial.BONE, 3, -2.4F,
            new FabricItemSettings());

    public static void registerTools() {
        PwsMod.LOGGER.info("Registering tools for " + PwsMod.MOD_ID);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_pickaxe"), BONE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_axe"), BONE_AXE);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_shovel"), BONE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_sword"), BONE_SWORD);
    }
}