package com.apstamp45.pebbles_mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PebbleItem extends Item {

    public static final String ID = "pebble_item";

    public PebbleItem() {
        maxStackSize = 16;
        setCreativeTab(CreativeTabs.COMBAT);
        setRegistryName(ID);
        setUnlocalizedName(ID);
        ItemRegistry.ITEMS.add(this);
    }
}
