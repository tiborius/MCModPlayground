package com.tiborius.MCPlayground.block;

import com.tiborius.MCPlayground.client.creativetab.CreativeTabMCP;
import com.tiborius.MCPlayground.reference.Reference;
import cpw.mods.fml.common.Mod;

/**
 * Created by tibi on 2014.10.25..
 */
public class BlockAlbit extends BlockBase
{
    public BlockAlbit()
    {
        super();
        this.setBlockName(Reference.BLOCK_ALBIT);
        this.setBlockTextureName(Reference.BLOCK_ALBIT);
        //this.setBlockBounds(0.1f, 0.1f, 0.1f, 0.9f, 0.9f, 0.9f);
    }
}
