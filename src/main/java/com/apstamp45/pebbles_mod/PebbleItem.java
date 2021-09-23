package com.apstamp45.pebbles_mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PebbleItem extends Item {

    public PebbleItem() {
        maxStackSize = 16;
        setCreativeTab(CreativeTabs.COMBAT);
        setRegistryName(PebblesMod.MODID, "pebble");
        ItemRegistry.ITEMS.add(this);
    }
}
