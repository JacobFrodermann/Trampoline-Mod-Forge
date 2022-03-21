package com.red_s2.trampoline.setup;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;


public class ModSetup {

    public static final String TAB_NAME = "Trampolines";

    public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
        @Override
        public ItemStack makeIcon() { return new ItemStack(Items.SLIME_BLOCK);}
    };

    static public void init(FMLCommonSetupEvent event) {
        
    }
}
