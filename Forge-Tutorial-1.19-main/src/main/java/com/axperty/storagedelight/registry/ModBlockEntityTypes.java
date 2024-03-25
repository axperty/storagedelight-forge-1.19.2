package com.axperty.storagedelight.registry;

import com.axperty.storagedelight.StorageDelight;
import com.axperty.storagedelight.block.ModBlocks;
import com.axperty.storagedelight.block.entity.DrawerBlockEntity;
import com.axperty.storagedelight.block.entity.GlassCabinetBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntityTypes {
    public static final DeferredRegister<BlockEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StorageDelight.MOD_ID);
    public static final RegistryObject<BlockEntityType<DrawerBlockEntity>> DRAWER = TILES.register("cabinet",
            () -> BlockEntityType.Builder.of(DrawerBlockEntity::new,
                            ModBlocks.OAK_DRAWER.get(),
                            ModBlocks.BIRCH_DRAWER.get(),
                            ModBlocks.SPRUCE_DRAWER.get(),
                            ModBlocks.JUNGLE_DRAWER.get(),
                            ModBlocks.ACACIA_DRAWER.get(),
                            ModBlocks.DARK_OAK_DRAWER.get(),
                            ModBlocks.MANGROVE_DRAWER.get(),
                            ModBlocks.CRIMSON_DRAWER.get(),
                            ModBlocks.WARPED_DRAWER.get())
                    .build(null));

    public static final RegistryObject<BlockEntityType<GlassCabinetBlockEntity>> GLASS_CABINET = TILES.register("glass_cabinet",
            () -> BlockEntityType.Builder.of(GlassCabinetBlockEntity::new,
                            ModBlocks.GLASS_OAK_CABINET.get(),
                            ModBlocks.GLASS_BIRCH_CABINET.get(),
                            ModBlocks.GLASS_SPRUCE_CABINET.get(),
                            ModBlocks.GLASS_JUNGLE_CABINET.get(),
                            ModBlocks.GLASS_ACACIA_CABINET.get(),
                            ModBlocks.GLASS_DARK_OAK_CABINET.get(),
                            ModBlocks.GLASS_MANGROVE_CABINET.get(),
                            ModBlocks.GLASS_CRIMSON_CABINET.get(),
                            ModBlocks.GLASS_WARPED_CABINET.get())
                    .build(null));

}