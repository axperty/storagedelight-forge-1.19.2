package com.axperty.cratedelight.item;

import com.axperty.cratedelight.StorageDelight;
import com.axperty.cratedelight.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.item.FuelBlockItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, StorageDelight.MOD_ID);

    // Helper methods
    public static Item.Properties basicItem() {
        return new Item.Properties().tab(StorageDelight.CREATIVE_TAB);
    }

    // Drawers

    public static final RegistryObject<Item> OAK_DRAWER = ITEMS.register("oak_drawer",
            () -> new FuelBlockItem(ModBlocks.OAK_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> SPRUCE_DRAWER = ITEMS.register("spruce_drawer",
            () -> new FuelBlockItem(ModBlocks.SPRUCE_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> BIRCH_DRAWER = ITEMS.register("birch_drawer",
            () -> new FuelBlockItem(ModBlocks.BIRCH_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> JUNGLE_DRAWER = ITEMS.register("jungle_drawer",
            () -> new FuelBlockItem(ModBlocks.JUNGLE_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> ACACIA_DRAWER = ITEMS.register("acacia_drawer",
            () -> new FuelBlockItem(ModBlocks.ACACIA_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> DARK_OAK_DRAWER = ITEMS.register("dark_oak_drawer",
            () -> new FuelBlockItem(ModBlocks.DARK_OAK_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> MANGROVE_DRAWER = ITEMS.register("mangrove_drawer",
            () -> new FuelBlockItem(ModBlocks.MANGROVE_DRAWER.get(), basicItem(), 300));
    public static final RegistryObject<Item> CRIMSON_DRAWER = ITEMS.register("crimson_drawer",
            () -> new BlockItem(ModBlocks.CRIMSON_DRAWER.get(), basicItem()));
    public static final RegistryObject<Item> WARPED_DRAWER = ITEMS.register("warped_drawer",
            () -> new BlockItem(ModBlocks.WARPED_DRAWER.get(), basicItem()));

    // Glass Cabinets

    public static final RegistryObject<Item> GLASS_OAK_CABINET = ITEMS.register("glass_oak_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_OAK_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_SPRUCE_CABINET = ITEMS.register("glass_spruce_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_SPRUCE_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_BIRCH_CABINET = ITEMS.register("glass_birch_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_BIRCH_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_JUNGLE_CABINET = ITEMS.register("glass_jungle_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_JUNGLE_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_ACACIA_CABINET = ITEMS.register("glass_acacia_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_ACACIA_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_DARK_OAK_CABINET = ITEMS.register("glass_dark_oak_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_DARK_OAK_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_MANGROVE_CABINET = ITEMS.register("glass_mangrove_cabinet",
            () -> new FuelBlockItem(ModBlocks.GLASS_MANGROVE_CABINET.get(), basicItem(), 300));
    public static final RegistryObject<Item> GLASS_CRIMSON_CABINET = ITEMS.register("glass_crimson_cabinet",
            () -> new BlockItem(ModBlocks.GLASS_CRIMSON_CABINET.get(), basicItem()));
    public static final RegistryObject<Item> GLASS_WARPED_CABINET = ITEMS.register("glass_warped_cabinet",
            () -> new BlockItem(ModBlocks.GLASS_WARPED_CABINET.get(), basicItem()));


}
