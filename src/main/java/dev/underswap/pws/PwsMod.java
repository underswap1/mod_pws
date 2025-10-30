package dev.underswap.pws;

import net.fabricmc.api.ModInitializer;
import dev.underswap.pws.components.hydration.HydrationTicker;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;

public class PwsMod implements ModInitializer {
    public static final String MOD_ID = "pws";

    @Override
    public void onInitialize() {
        System.out.println("If you read this, your a nerd!");
        PwsTools.registerTools();
        PwsArmor.registerArmor();
        PwsBlocks.registerBlocks();
        ServerTickEvents.END_SERVER_TICK.register(new HydrationTicker());
        PwsItemGroups.PWS_GROUP.getDisplayName();
    }
}