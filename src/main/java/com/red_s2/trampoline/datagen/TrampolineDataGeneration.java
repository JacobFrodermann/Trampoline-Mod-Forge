package com.red_s2.trampoline.datagen;

import com.red_s2.trampoline.TrampolineMod;

import com.red_s2.trampoline.datagen.server.ModRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = TrampolineMod.MODID, bus = Bus.MOD)
public class TrampolineDataGeneration {

    @SubscribeEvent
    public  static  void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();

        /*if (event.includeClient()) {

        }*/

        if(event.includeServer()) {
            generator.addProvider(new ModRecipeProvider(generator));
        }
    }
}
