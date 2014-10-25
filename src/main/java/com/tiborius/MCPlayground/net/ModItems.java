package com.tiborius.MCPlayground.net;

import com.tiborius.MCPlayground.item.ItemBase;
import com.tiborius.MCPlayground.item.ItemTest;
import com.tiborius.MCPlayground.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {
    public static final ItemBase testItem = new ItemTest();

    public static void init()
    {
        GameRegistry.registerItem(testItem, Reference.ITEM_TEST);
    }
}
