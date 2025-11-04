package dev.underswap.pws;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

public class PwsArmor {

    public static final Map<String, Item> ARMOR = new LinkedHashMap<>();
    static {
        //Bone Armor
        ARMOR.put("bone_helmet", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.HELMET, new FabricItemSettings()));
        ARMOR.put("bone_chestplate", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        ARMOR.put("bone_leggings", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        ARMOR.put("bone_boots", new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.BOOTS, new FabricItemSettings()));

        //Straw Armor
        ARMOR.put("straw_helmet", new ArmorItem(ModArmorMaterial.STRAW, ArmorItem.Type.HELMET, new FabricItemSettings()));
        ARMOR.put("straw_chestplate", new ArmorItem(ModArmorMaterial.STRAW, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
        ARMOR.put("straw_leggings", new ArmorItem(ModArmorMaterial.STRAW, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
        ARMOR.put("straw_boots", new ArmorItem(ModArmorMaterial.STRAW, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    }

    // Register armor items
    public static void registerArmor() {
        PwsMod.LOGGER.info("Registering armor for " + PwsMod.MOD_ID);
        ARMOR.forEach((id, item) -> Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, id), item));
    }
}