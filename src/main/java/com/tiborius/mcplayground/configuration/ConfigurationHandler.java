package com.tiborius.mcplayground.configuration;

import com.tiborius.mcplayground.reference.Reference;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static void init(File configFile)
    {
        boolean boolConfigValue = false;
        int intConfigValue = 0;
        Configuration configuration = new Configuration(configFile);
        try {
            // load the configuration file
            configuration.load();

            // read in properties
            boolConfigValue = configuration.get(Configuration.CATEGORY_GENERAL, "boolConfigValue", false, "Boolean test config value (default false)").getBoolean();
            intConfigValue = configuration.get(Reference.BLOCKS_GROUP, "testBlockId", 2001, "Test block id config value (default 2001)").getInt();
        } catch (Exception e) {
            // log exception
        } finally {
            // save the configuration file
            configuration.save();
        }

        System.out.println("Test block id: "+intConfigValue);
    }
}
