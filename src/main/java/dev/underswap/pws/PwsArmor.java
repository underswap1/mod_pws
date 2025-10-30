package dev.underswap.pws;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class PwsArmor {
    // Declare armor items
    public static final Item BONE_HELMET = new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.HELMET, new FabricItemSettings());
    public static final Item BONE_CHESTPLATE = new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings());
    public static final Item BONE_LEGGINGS = new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.LEGGINGS, new FabricItemSettings());
    public static final Item BONE_BOOTS = new ArmorItem(ModArmorMaterial.BONE, ArmorItem.Type.BOOTS, new FabricItemSettings());

    // Register armor items
    public static void registerArmor() {
        PwsMod.LOGGER.info("Registering armor for " + PwsMod.MOD_ID);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_helmet"), BONE_HELMET);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_chestplate"), BONE_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_leggings"), BONE_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, "bone_boots"), BONE_BOOTS);
    }
}