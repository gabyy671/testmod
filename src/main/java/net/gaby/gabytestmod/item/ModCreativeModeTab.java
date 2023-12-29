package net.gaby.gabytestmod.item;

import net.gaby.gabytestmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TEST_TAB = new CreativeModeTab("testtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.BITTERGEM_ORE.get());
        }
    };
}
