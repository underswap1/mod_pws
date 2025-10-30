package dev.underswap.pws.components.hydration;

import dev.onyxstudios.cca.api.v3.component.ComponentV3;
import net.minecraft.nbt.NbtCompound;

public interface HydrationComponent extends ComponentV3 {
    void readFromNbt(NbtCompound tag);
    void writeToNbt(NbtCompound tag);
    int getHydrationData();
    void setHydrationData(int value);

}