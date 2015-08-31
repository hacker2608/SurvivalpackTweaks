package com.hacker2608.SurvivalpackTweaks;

import com.hacker2608.SurvivalpackTweaks.handler.configHandler;
import com.hacker2608.SurvivalpackTweaks.proxy.IProxy;
import com.hacker2608.SurvivalpackTweaks.reference.Reference;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_ID, version = Reference.VERSION)
public class SurvivalpackTweaks {

    @Mod.Instance(Reference.MOD_ID)
    public static SurvivalpackTweaks instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        configHandler.initConfig(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configHandler());
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}
