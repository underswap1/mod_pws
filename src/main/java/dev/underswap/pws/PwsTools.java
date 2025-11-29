package dev.underswap.pws;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

import java.util.LinkedHashMap;
import java.util.Map;

public class PwsTools {

    public static final Map<String, Item> TOOLS = new LinkedHashMap<>();
    static{
        TOOLS.put("bone_pickaxe", new PickaxeItem(ModToolMaterial.BONE, 1, -2.8F, new FabricItemSettings()));
        TOOLS.put("bone_axe", new AxeItem(ModToolMaterial.BONE, 5, -3.0F, new FabricItemSettings()));
        TOOLS.put("bone_shovel", new ShovelItem(ModToolMaterial.BONE, 1.5F, -3.0F, new FabricItemSettings()));
        TOOLS.put("bone_sword", new SwordItem(ModToolMaterial.BONE, 3, -2.4F, new FabricItemSettings()));
        TOOLS.put("flint_axe", new AxeItem(ModToolMaterial.FLINT, 5, -3.0F, new FabricItemSettings()));
        TOOLS.put("flint_pickaxe", new PickaxeItem(ModToolMaterial.FLINT, 1, -2.8F, new FabricItemSettings()));
        TOOLS.put("flint_shovel", new ShovelItem(ModToolMaterial.FLINT, 1.5F, -3.0F, new FabricItemSettings()));
        TOOLS.put("flint_sword", new SwordItem(ModToolMaterial.FLINT, 3, -2.4F, new FabricItemSettings()));
        TOOLS.put("flint_hoe", new HoeItem(ModToolMaterial.FLINT, 1, -3.0F, new FabricItemSettings()));
        TOOLS.put("sandstone_axe", new AxeItem(ModToolMaterial.SANDSTONE, 5, -3.0F, new FabricItemSettings()));
        TOOLS.put("sandstone_pickaxe", new PickaxeItem(ModToolMaterial.SANDSTONE, 1, -2.8F, new FabricItemSettings()));
        TOOLS.put("sandstone_shovel", new ShovelItem(ModToolMaterial.SANDSTONE, 1.5F, -3.0F, new FabricItemSettings()));
        TOOLS.put("sandstone_sword", new SwordItem(ModToolMaterial.SANDSTONE, 3, -2.4F, new FabricItemSettings()));
        TOOLS.put("obsidian_knife", new KnifeItem(ModToolMaterial.OBSIDIAN, 2.0F, -1.5F, new FabricItemSettings()));
    }

    public static void registerTools() {
        PwsMod.LOGGER.info("Registering tools for " + PwsMod.MOD_ID);
        TOOLS.forEach((name, item) -> Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, name), item));
    }
}