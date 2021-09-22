package com.apstamp45.pebbles_mod;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PebblesMod.MODID, name = PebblesMod.NAME, version = PebblesMod.VERSION)
public class PebblesMod {
    public static final String MODID = "test_mod";
    public static final String NAME = "Test Mod";
    public static final String VERSION = "0.1 SHAPSHOT";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Block block = Block.getBlockFromName("minecraft:cobblestone");
        block.setHarvestLevel("shovel", 0);
    }
}
