package com.hacker2608.SurvivalpackTweaks.handler;

import com.hacker2608.SurvivalpackTweaks.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class configHandler {

    public static Configuration config;
    public static int value;

    public static void initConfig(File configFile) {
        if(config == null) {
            config = new Configuration(configFile);
        }
    }

    public static void loadConfig() {
        try {
            config.load();
            value = config.getInt("value", Configuration.CATEGORY_GENERAL, 10, 1, 20, "A test value.");
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(config.hasChanged()) {
                config.save();
            }
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e) {
        if(e.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            loadConfig();
        }
    }
}
