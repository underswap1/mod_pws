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
    }

    public static void registerTools() {
        PwsMod.LOGGER.info("Registering tools for " + PwsMod.MOD_ID);
        TOOLS.forEach((name, item) -> Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, name), item));
    }
}