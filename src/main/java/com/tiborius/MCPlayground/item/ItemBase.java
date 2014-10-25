package com.tiborius.MCPlayground.item;

import com.tiborius.MCPlayground.reference.Reference;
import com.tiborius.MCPlayground.utility.LogHelper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ItemBase extends Item{
    public ItemBase()
    {
        super();

    }

    private String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".")+1);
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s:%s", Reference.MOD_ID.toLowerCase(), getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        String iconName = this.getUnwrappedUnlocalizedName(this.getUnlocalizedName());
        LogHelper.info("icon name:" + iconName);
        itemIcon = iconRegister.registerIcon(iconName);
    }
}
