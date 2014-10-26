package com.tiborius.MCPlayground.client.creativetab;

import com.tiborius.MCPlayground.net.ModItems;
import com.tiborius.MCPlayground.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabMCP {

    public static final CreativeTabs MCPG_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase()) {
        @Override
        public Item getTabIconItem() {
            return ModItems.testItem;
        }
    };
}