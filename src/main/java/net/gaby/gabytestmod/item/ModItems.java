package net.gaby.gabytestmod.item;

import net.gaby.gabytestmod.TestMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> RIOT = ITEMS.register("riot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> DUSKBLADE = ITEMS.register("duskblade",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> RAW_BITTERGEM = ITEMS.register("raw_bittergem",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static final RegistryObject<Item> BITTERGEM_INGOT = ITEMS.register("bittergem_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TEST_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
