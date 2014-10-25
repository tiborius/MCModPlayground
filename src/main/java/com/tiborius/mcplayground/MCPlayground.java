package com.tiborius.mcplayground;

import com.tiborius.mcplayground.configuration.ConfigurationHandler;
import com.tiborius.mcplayground.proxy.IProxy;
import com.tiborius.mcplayground.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by tibi on 2014.10.25..
 */
@Mod(modid = Reference.MOD_ID, name=Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MCPlayground {

    @Mod.Instance(Reference.MOD_ID)
    public static MCPlayground instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler()
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
    }

    @Mod.EventHandler()
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler()
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
