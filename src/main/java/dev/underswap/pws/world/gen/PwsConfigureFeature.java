package dev.underswap.pws.world.gen;

import dev.underswap.pws.PwsMod;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class PwsConfigureFeature {

    // Registry keys for your features (pointing to JSON definitions)
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_TREE_KEY =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PwsMod.MOD_ID, "redwood_tree"));

    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_TREE_3X3_KEY =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(PwsMod.MOD_ID, "redwood_tree_3x3"));

    // If you want to register programmatically instead of JSON, you’d add methods here.
    // With JSON world gen, you don’t need to do anything in this method.
    public static void registerConfiguredFeatures() {
        // Example if you wanted to register manually:
        // Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, REDWOOD_TREE_KEY.getValue(), configuredFeatureInstance);
    }
}