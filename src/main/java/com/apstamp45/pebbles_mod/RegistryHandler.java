package com.apstamp45.pebbles_mod;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemRegistry.ITEMS.toArray(new Item[0]));
    }
    @SubscribeEvent
    public static void registerRenders(ModelRegistryEvent event) {
        for (Item item : ItemRegistry.ITEMS) {
            ModelLoader.setCustomModelResourceLocation(item, 0,
                                                       new ModelResourceLocation(item.getRegistryName(),
                                                                         "inventory"));
        }
    }
}
