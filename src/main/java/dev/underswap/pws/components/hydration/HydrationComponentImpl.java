package dev.underswap.pws.components.hydration;

import net.minecraft.nbt.NbtCompound;

public class HydrationComponentImpl implements HydrationComponent {
    private int hydration = 20;
    public HydrationComponentImpl() {
    }

    @Override
    public void readFromNbt(NbtCompound tag) {
        hydration = tag.getInt("Hydration");
    }

    @Override
    public void writeToNbt(NbtCompound tag) {
        tag.putInt("Hydration", hydration);
    }

    @Override
    public int getHydrationData() {
        return hydration;
    }

    @Override
    public void setHydrationData(int value) {
        hydration = value;
    }
}