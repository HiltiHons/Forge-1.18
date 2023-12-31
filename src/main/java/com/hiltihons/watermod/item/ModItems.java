package com.hiltihons.watermod.item;
/*19.08.2023
 *Autor:Herbert Fasching
 */

import com.hiltihons.watermod.WaterMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WaterMod.MOD_ID);

    public static final RegistryObject<Item> CHIB = ITEMS.register("chip",
    () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WATERMOD)));

    public static final RegistryObject<Item> RAW_CHIP = ITEMS.register("raw_chip",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WATERMOD)));
    public static final RegistryObject<Item> STRAIGHT_PIPE = ITEMS.register("straight_pipe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WATERMOD)));
    public static final RegistryObject<Item> TEE_PIPE = ITEMS.register("tee_pipe",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WATERMOD)));
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }


}
