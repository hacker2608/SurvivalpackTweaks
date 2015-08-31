package com.hacker2608.SurvivalpackTweaks.client.gui;

import com.hacker2608.SurvivalpackTweaks.handler.configHandler;
import com.hacker2608.SurvivalpackTweaks.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class configGui extends GuiConfig {

    public configGui(GuiScreen screen) {
        super(  screen ,
                new ConfigElement(configHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(configHandler.config.toString())
        );
    }
}
