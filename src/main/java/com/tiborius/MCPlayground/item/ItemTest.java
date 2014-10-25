package com.tiborius.MCPlayground.item;

import com.tiborius.MCPlayground.reference.Reference;

public class ItemTest extends ItemBase {

    public ItemTest()
    {
        super();
        this.setUnlocalizedName(Reference.ITEM_TEST);
        this.setMaxStackSize(1);
    }
}
