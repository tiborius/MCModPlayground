package com.tiborius.MCPlayground;

import com.tiborius.MCPlayground.handler.ConfigurationHandler;
import com.tiborius.MCPlayground.handler.KeyInputEventHandler;
import com.tiborius.MCPlayground.net.ModBlocks;
import com.tiborius.MCPlayground.net.ModItems;
import com.tiborius.MCPlayground.net.Recipes;
import com.tiborius.MCPlayground.proxy.IProxy;
import com.tiborius.MCPlayground.reference.Reference;
import com.tiborius.MCPlayground.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.ArrayList;

/**
 * Created by tibi on 2014.10.25.
 *
 */
@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class MCPlayground {

    @Mod.Instance(Reference.MOD_ID)
    public static MCPlayground instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        proxy.registerKeyBindings();
        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre Initialization completed.");
    }

    @Mod.EventHandler()
    public void init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        LogHelper.info("Initialization completed.");
    }

    @Mod.EventHandler()
    public void postInit(FMLPostInitializationEvent event)
    {
        for(String oreName : OreDictionary.getOreNames())
        {
            LogHelper.info(oreName);
            ArrayList<ItemStack> itemStackList = OreDictionary.getOres(oreName);
            for(ItemStack itemStack : itemStackList) {
                LogHelper.info("- " + itemStack.getDisplayName());
            }
        }

        LogHelper.info("Post Initialization completed.");
    }

}
