package com.tiborius.MCPlayground.handler;

import com.tiborius.MCPlayground.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration configuration;
    public static boolean boolConfigValue = false;
    public static int intConfigValue = 0;

    public static void init(File configFile) {
        if (configuration == null) {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID)) {
            // resync configs
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        // read in properties
        boolConfigValue = configuration.get(Configuration.CATEGORY_GENERAL, "boolConfigValue", false, "Boolean test config value (default false)").getBoolean();
        intConfigValue = configuration.get(Reference.BLOCKS_GROUP, "testBlockId", 2001, "Test block id config value (default 2001)").getInt();

        // save the configuration file
        if (configuration.hasChanged()) {
            configuration.save();
        }

        System.out.println("Test block id: "+intConfigValue);
    }
}
