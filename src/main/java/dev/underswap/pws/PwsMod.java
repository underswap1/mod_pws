package dev.underswap.pws;

import dev.underswap.pws.world.gen.PwsConfigureFeature;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PwsMod implements ModInitializer {
    public static final String MOD_ID = "pws";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("If you read this, your a nerd!");
        PwsTools.registerTools();
        PwsArmor.registerArmor();
        PwsBlocks.registerBlocks();
        PwsItems.registerItems();
        PwsBiomes.registerBiomes();
        PwsConfigureFeature.registerConfiguredFeatures();
        //noinspection ResultOfMethodCallIgnored
        PwsItemGroups.PWS_GROUP.getDisplayName();
    }
}