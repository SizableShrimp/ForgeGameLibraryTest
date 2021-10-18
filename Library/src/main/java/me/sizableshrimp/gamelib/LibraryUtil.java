package me.sizableshrimp.gamelib;

import net.minecraft.resources.ResourceLocation;

public class LibraryUtil {
    public static ResourceLocation join(String namespace, String a, String b) {
        return new ResourceLocation(namespace, a + "_" + b);
    }
}
