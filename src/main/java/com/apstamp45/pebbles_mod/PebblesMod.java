package com.apstamp45.pebbles_mod;

import net.minecraft.block.Block;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

/**
 * This mod adds a throwable pebble
 * to the game.
 */
@Mod(modid = PebblesMod.MODID, name = PebblesMod.NAME, version = PebblesMod.VERSION)
public class PebblesMod {

    /**
     * The mod's ID.
     */
    public static final String MODID = "pebbles_mod";

    /**
     * The mod's name.
     */
    public static final String NAME = "Pebbles Mod";

    /**
     * The mod's version.
     */
    public static final String VERSION = "0.2";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Block.getBlockFromName("minecraft:cobblestone").setHarvestLevel("shovel", 0);
    }
}
