package com.axperty.cratedelight.block;

import com.axperty.cratedelight.CrateDelight;
import com.axperty.cratedelight.item.ModCreativeModeTab;
import com.axperty.cratedelight.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CrateDelight.MOD_ID);

    public static final RegistryObject<Block> APPLE_CRATE = registerBlock("apple_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)), ModCreativeModeTab.CREATIVE_MODE_TAB);

    public static final RegistryObject<Block> BERRY_CRATE = registerBlock("berry_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)), ModCreativeModeTab.CREATIVE_MODE_TAB);

    public static final RegistryObject<Block> GLOWBERRY_CRATE = registerBlock("glowberry_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)), ModCreativeModeTab.CREATIVE_MODE_TAB);

    public static final RegistryObject<Block> EGG_CRATE = registerBlock("egg_crate",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(2.0f, 3.0f).sound(SoundType.WOOD)), ModCreativeModeTab.CREATIVE_MODE_TAB);

    public static final RegistryObject<Block> COCOABEANS_BAG = registerBlock("cocoabeans_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)), ModCreativeModeTab.CREATIVE_MODE_TAB);

    public static final RegistryObject<Block> SUGAR_BAG = registerBlock("sugar_bag",
            () -> new Block(BlockBehaviour.Properties.of(Material.WOOL)
                    .strength(.8f, .8f).sound(SoundType.WOOL)), ModCreativeModeTab.CREATIVE_MODE_TAB);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
