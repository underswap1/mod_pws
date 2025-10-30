package com.example.pws.components.hydration;

import com.example.pws.PwsComponents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

public class HydrationTicker implements ServerTickEvents.EndTick {
    @Override
    public void onEndTick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            HydrationComponent hydration = PwsComponents.HYDRATION.get(player);

            // Decrease hydration by 1 each tick, clamp to 0
            int current = hydration.getHydrationData();
            hydration.setHydrationData(Math.max(0, current - 1));
        }
    }
}