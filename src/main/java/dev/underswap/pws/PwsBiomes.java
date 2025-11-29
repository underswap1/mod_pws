package dev.underswap.pws;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.Map;

public class PwsBiomes {
    public static final Logger LOGGER = LoggerFactory.getLogger("PWS");
    public static final Map<String, Biome> BIOMES = new LinkedHashMap<>();

    static {
        BIOMES.put("redwood_forest", createRedwoodForest());
    }

    // Register all biomes in the map
    public static void registerBiomes() {
        LOGGER.info("Registering biomes for " + PwsMod.MOD_ID);
        BIOMES.forEach((id, biome) -> {
            Identifier identifier = new Identifier(PwsMod.MOD_ID, id);
            RegistryKey<Biome> key = RegistryKey.of(RegistryKeys.BIOME, identifier);
        });
    }

    // Biome definition
    private static Biome createRedwoodForest() {
        // Spawn settings
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        spawnSettings.spawn(SpawnGroup.CREATURE,
                new SpawnSettings.SpawnEntry(EntityType.SHEEP, 12, 2, 4));
        spawnSettings.spawn(SpawnGroup.CREATURE,
                new SpawnSettings.SpawnEntry(EntityType.WOLF, 8, 2, 4));

        // Generation settings (trees, ores, etc.)
        GenerationSettings.Builder generationSettings = new GenerationSettings.Builder();

        // Visual effects
        BiomeEffects effects = new BiomeEffects.Builder()
                .skyColor(7972607)
                .fogColor(12638463)
                .waterColor(4159204)
                .waterFogColor(329011)
                .grassColor(6192150)
                .foliageColor(6192150)
                .build();

        return new Biome.Builder()
                .temperature(0.7F)   // rain if >0.15F
                .downfall(0.8F)     // rainfall amount
                .effects(effects)
                .spawnSettings(spawnSettings.build())
                .generationSettings(generationSettings.build())
                .build();
    }
}