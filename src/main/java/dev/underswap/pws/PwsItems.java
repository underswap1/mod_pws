package dev.underswap.pws;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.LinkedHashMap;
import java.util.Map;

public class PwsItems {

    public static final Map<String, Item> ITEMS = new LinkedHashMap<>();
    static {
        ITEMS.put("straw", new Item(new FabricItemSettings()));
    }

    // Register items
    public static void registerItems() {
        PwsMod.LOGGER.info("Registering armor for " + PwsMod.MOD_ID);
        ITEMS.forEach((name, item) -> Registry.register(Registries.ITEM, new Identifier(PwsMod.MOD_ID, name), item));
    }
}