package com.hacker2608.SurvivalpackTweaks.utility;

import com.hacker2608.SurvivalpackTweaks.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class logger {

    private static void log(Level level, Object obj) {
        FMLLog.log(Reference.MOD_ID, level, String.valueOf(obj));
    }

    public static void debug(Object obj) {
        log(Level.DEBUG, obj);
    }

    public static void fatal(Object obj) {
        log(Level.FATAL ,obj);
    }

    public static void error(Object obj) {
        log(Level. ERROR,obj);
    }

    public static void warn(Object obj) {
        log(Level.WARN ,obj);
    }

    public static void info(Object obj) {
        log(Level.INFO ,obj);
    }
}
