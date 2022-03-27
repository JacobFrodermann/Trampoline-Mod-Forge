package com.red_s2.trampoline.datagen.server;

import com.red_s2.trampoline.TrampolineMod;
import com.red_s2.trampoline.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
    ItemLike[] Tramps = {
            Registration.WHITE_TRAMPOLINE_ITEM.get(),
            Registration.RED_TRAMPOLINE_ITEM.get(),
            Registration.BLUE_TRAMPOLINE_ITEM.get(),
            Registration.GREEN_TRAMPOLINE_ITEM.get(),
            Registration.LIME_TRAMPOLINE_ITEM.get(),
            Registration.PURPLE_TRAMPOLINE_ITEM.get(),
            Registration.CYAN_TRAMPOLINE_ITEM.get(),
            Registration.BLACK_TRAMPOLINE_ITEM.get(),
            Registration.YELLOW_TRAMPOLINE_ITEM.get(),
            Registration.ORANGE_TRAMPOLINE_ITEM.get(),
            Registration.GRAY_TRAMPOLINE_ITEM.get(),
            Registration.LIGHT_GRAY_TRAMPOLINE_ITEM.get(),
            Registration.BROWN_TRAMPOLINE_ITEM.get(),
            Registration.PURPLE_TRAMPOLINE_ITEM.get()},
    Colors = {
            Blocks.WHITE_WOOL.asItem(),
            Blocks.RED_WOOL.asItem(),
            Blocks.BLUE_WOOL.asItem(),
            Blocks.GREEN_WOOL.asItem(),
            Blocks.LIME_WOOL.asItem(),
            Blocks.PURPLE_WOOL.asItem(),
            Blocks.CYAN_WOOL.asItem(),
            Blocks.BLACK_WOOL.asItem(),
            Blocks.YELLOW_WOOL.asItem(),
            Blocks.ORANGE_WOOL.asItem(),
            Blocks.GRAY_WOOL.asItem(),
            Blocks.LIGHT_GRAY_WOOL.asItem(),
            Blocks.LIGHT_BLUE_WOOL.asItem(),
            Blocks.BROWN_WOOL.asItem(),
            Blocks.PINK_WOOL};

    public ModRecipeProvider(DataGenerator gen) {
        super(gen);
    }
    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer){
        for (int i=0;i>Colors.length;i++) {
            System.out.println(Tramps[i].toString() + "Registered xDxD");
            ShapedRecipeBuilder.shaped(Tramps[i])
                    .define('w', Colors[i])
                    .define('s', Tags.Items.STRING)
                    .define('c', Blocks.BLACK_CARPET)
                    .define('b', Blocks.IRON_BARS.asItem())
                    .pattern("w w")
                    .pattern("scs")
                    .pattern("b b")
                    .save(consumer, new ResourceLocation((Tramps[i].asItem().getRegistryName().getPath() + "crafting")));
        }
    }
}
