package com.red_s2.trampoline.setup;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.red_s2.trampoline.TrampolineMod.MODID;

import com.red_s2.trampoline.Blocks.Trampoline;
import net.minecraft.world.item.BlockItem;

public class Registration {

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }

    public static final BlockBehaviour.Properties TRAMPprops = BlockBehaviour.Properties.of(Material.METAL).jumpFactor(2).strength(2).speedFactor(0.75f);
    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);
    
    //Blöcke
    public static final RegistryObject<Block> WHITE = BLOCKS.register("white", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> RED = BLOCKS.register("red", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> BLUE = BLOCKS.register("blue", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> GREEN = BLOCKS.register("green", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> LIME = BLOCKS.register("lime", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> PURPLE = BLOCKS.register("purple", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> CYAN = BLOCKS.register("cyan", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> BLACK = BLOCKS.register("black", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> YELLOW = BLOCKS.register("yellow", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> ORANGE = BLOCKS.register("orange", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> GRAY = BLOCKS.register("gray", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> LIGHT_GRAY = BLOCKS.register("light_gray", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> LIGHT_BLUE = BLOCKS.register("light_blue", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> BROWN = BLOCKS.register("brown", () -> new Trampoline(TRAMPprops));
    public static final RegistryObject<Block> PINK = BLOCKS.register("pink", () -> new Trampoline(TRAMPprops));

    //ITEMS
    public static final RegistryObject<Item> WHITE_TRAMPOLINE_ITEM = fromBlock(WHITE);
    public static final RegistryObject<Item> RED_TRAMPOLINE_ITEM = fromBlock(RED);
    public static final RegistryObject<Item> BLUE_TRAMPOLINE_ITEM = fromBlock(BLUE);
    public static final RegistryObject<Item> GREEN_TRAMPOLINE_ITEM = fromBlock(GREEN);
    public static final RegistryObject<Item> LIME_TRAMPOLINE_ITEM = fromBlock(LIME);
    public static final RegistryObject<Item> PURPLE_TRAMPOLINE_ITEM = fromBlock(PURPLE);
    public static final RegistryObject<Item> CYAN_TRAMPOLINE_ITEM = fromBlock(CYAN);
    public static final RegistryObject<Item> BLACK_TRAMPOLINE_ITEM = fromBlock(BLACK);
    public static final RegistryObject<Item> YELLOW_TRAMPOLINE_ITEM = fromBlock(YELLOW);
    public static final RegistryObject<Item> LIGHT_GRAY_TRAMPOLINE_ITEM = fromBlock(LIGHT_GRAY);
    public static final RegistryObject<Item> ORANGE_TRAMPOLINE_ITEM = fromBlock(ORANGE);
    public static final RegistryObject<Item> GRAY_TRAMPOLINE_ITEM = fromBlock(GRAY);
    public static final RegistryObject<Item> LIGHT_BLUE_ITEM = fromBlock(LIGHT_BLUE);
    public static final RegistryObject<Item> BROWN_TRAMPOLINE_ITEM = fromBlock(BROWN);
    public static final RegistryObject<Item> PINK_ITEM = fromBlock(PINK);


    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
    }
}
/**/
