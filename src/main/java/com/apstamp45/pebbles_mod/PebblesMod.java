package com.apstamp45.pebbles_mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = PebblesMod.MODID, name = PebblesMod.NAME, version = PebblesMod.VERSION)
public class PebblesMod {
    public static final String MODID = "pebbles_mod";
    public static final String NAME = "Pebbles Mod";
    public static final String VERSION = "0.1";

    private static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Block.getBlockFromName("minecraft:cobblestone").setHarvestLevel("shovel", 0);
    }

    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
        event.getRegistry().registerAll(new PebbleItem());
    }
}
