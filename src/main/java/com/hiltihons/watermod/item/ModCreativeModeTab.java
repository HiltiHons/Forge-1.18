package com.hiltihons.watermod.item;
/*20.08.2023
 *Autor:Herbert Fasching
 */

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab WATERMOD = new CreativeModeTab("watermodtab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.CHIB.get());
        }
    };
}
