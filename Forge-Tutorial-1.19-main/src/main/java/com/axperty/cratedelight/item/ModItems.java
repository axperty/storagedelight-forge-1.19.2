package com.axperty.cratedelight.item;

import com.axperty.cratedelight.CrateDelight;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CrateDelight.MOD_ID);

//    public static final RegistryObject<Item> APPLE_CRATE = ITEMS.register("apple_crate",
//            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
