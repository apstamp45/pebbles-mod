package com.apstamp45.pebbles_mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PebbleItem extends Item {

    public PebbleItem() {
        setUnlocalizedName("pebble");
        setRegistryName("pebble");
        maxStackSize = 16;
        setCreativeTab(CreativeTabs.COMBAT);
        ItemRegistry.ITEMS.add(this);
    }
}
