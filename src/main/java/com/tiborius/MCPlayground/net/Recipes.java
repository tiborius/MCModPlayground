package com.tiborius.MCPlayground.net;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by tibi on 2014.10.26..
 */
public class Recipes {
    public static void init()
    {
        /* vanilla shaped and shapeless recipes
        GameRegistry.addRecipe(new ItemStack(ModItems.testItem),
                "i  ",
                " r ",
                "  i",
                'i', new ItemStack(Items.iron_ingot),
                'r', new ItemStack(Items.carrot));

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.albitBlock),
                new ItemStack(Blocks.cobblestone),
                new ItemStack(Blocks.gravel));
                */

        // ore dictionary shaped and shapeless recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ModItems.testItem),
                "i  ",
                " r ",
                "  i",
                'i', "ingotIron",
                'r', "stickWood"));

        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.albitBlock),
                new ItemStack(Blocks.cobblestone),
                new ItemStack(Items.bone)));

    }
}
