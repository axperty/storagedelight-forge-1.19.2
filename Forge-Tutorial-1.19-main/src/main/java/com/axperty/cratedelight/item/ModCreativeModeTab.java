package com.axperty.cratedelight.item;

import com.axperty.cratedelight.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab CREATIVE_MODE_TAB = new CreativeModeTab("creativetab") {
      @Override
      public ItemStack makeIcon() {
          return new ItemStack(ModBlocks.APPLE_CRATE.get());
      }
    };
}
