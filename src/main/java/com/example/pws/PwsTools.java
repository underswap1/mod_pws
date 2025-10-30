package com.example.pws;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
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
        Registry.register(Registries.ITEM, new Identifier("pws", "bone_pickaxe"), BONE_PICKAXE);
        Registry.register(Registries.ITEM, new Identifier("pws", "bone_axe"), BONE_AXE);
        Registry.register(Registries.ITEM, new Identifier("pws", "bone_shovel"), BONE_SHOVEL);
        Registry.register(Registries.ITEM, new Identifier("pws", "bone_sword"), BONE_SWORD);
    }
}