package com.axperty.storagedelight.block;

import com.axperty.storagedelight.StorageDelight;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, StorageDelight.MOD_ID);

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (state) -> state.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }

    // Drawers

    public static final RegistryObject<Block> OAK_DRAWER = BLOCKS.register("oak_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> SPRUCE_DRAWER = BLOCKS.register("spruce_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> BIRCH_DRAWER = BLOCKS.register("birch_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> JUNGLE_DRAWER = BLOCKS.register("jungle_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> ACACIA_DRAWER = BLOCKS.register("acacia_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> DARK_OAK_DRAWER = BLOCKS.register("dark_oak_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> MANGROVE_DRAWER = BLOCKS.register("mangrove_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> CRIMSON_DRAWER = BLOCKS.register("crimson_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> WARPED_DRAWER = BLOCKS.register("warped_drawer",
            () -> new DrawerBlock(Block.Properties.copy(Blocks.BARREL)));

    // Glass Cabinets

    public static final RegistryObject<Block> GLASS_OAK_CABINET = BLOCKS.register("glass_oak_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_SPRUCE_CABINET = BLOCKS.register("glass_spruce_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_BIRCH_CABINET = BLOCKS.register("glass_birch_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_JUNGLE_CABINET = BLOCKS.register("glass_jungle_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_ACACIA_CABINET = BLOCKS.register("glass_acacia_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_DARK_OAK_CABINET = BLOCKS.register("glass_dark_oak_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_MANGROVE_CABINET = BLOCKS.register("glass_mangrove_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_CRIMSON_CABINET = BLOCKS.register("glass_crimson_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));
    public static final RegistryObject<Block> GLASS_WARPED_CABINET = BLOCKS.register("glass_warped_cabinet",
            () -> new GlassCabinetBlock(Block.Properties.copy(Blocks.BARREL)));

}
