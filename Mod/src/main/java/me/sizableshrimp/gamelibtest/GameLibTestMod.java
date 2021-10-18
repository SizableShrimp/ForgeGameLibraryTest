package me.sizableshrimp.gamelibtest;

import me.sizableshrimp.gamelib.LibraryUtil;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(GameLibTestMod.MOD_ID)
public class GameLibTestMod {
    public static final String MOD_ID = "gamelibtest";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public GameLibTestMod() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Joined: {}", LibraryUtil.join("minecraft", "thing", "other"));
    }
}
