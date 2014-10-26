package com.tiborius.MCPlayground.net;

import com.tiborius.MCPlayground.block.BlockAlbit;
import com.tiborius.MCPlayground.block.BlockBase;
import com.tiborius.MCPlayground.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {
    public static final BlockBase albitBlock = new BlockAlbit();

    public static void init()
    {
        GameRegistry.registerBlock(albitBlock, Reference.BLOCK_ALBIT).setHardness(5.0f);
    }
}
