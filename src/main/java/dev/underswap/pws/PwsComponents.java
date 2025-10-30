package dev.underswap.pws;

import dev.underswap.pws.components.hydration.HydrationComponent;
import dev.underswap.pws.components.hydration.HydrationComponentImpl;
import dev.onyxstudios.cca.api.v3.component.ComponentKey;
import dev.onyxstudios.cca.api.v3.component.ComponentRegistryV3;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentFactoryRegistry;
import dev.onyxstudios.cca.api.v3.entity.EntityComponentInitializer;
import dev.onyxstudios.cca.api.v3.entity.RespawnCopyStrategy;
import net.minecraft.util.Identifier;

public class PwsComponents implements EntityComponentInitializer {
    public static final ComponentKey<HydrationComponent> HYDRATION =
            ComponentRegistryV3.INSTANCE.getOrCreate(
                    new Identifier("pws", "hydration"),
                    HydrationComponent.class
            );

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(
                HYDRATION,
                player -> new HydrationComponentImpl(),
                RespawnCopyStrategy.ALWAYS_COPY
        );
    }
}