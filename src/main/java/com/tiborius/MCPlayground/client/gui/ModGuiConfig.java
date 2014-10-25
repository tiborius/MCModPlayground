package com.tiborius.MCPlayground.client.gui;

import com.tiborius.MCPlayground.handler.ConfigurationHandler;
import com.tiborius.MCPlayground.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class ModGuiConfig extends GuiConfig
{
    /**
     * GuiConfig constructor that will use ConfigChangedEvent when editing is concluded. This constructor passes null for configID.
     * If configID is not defined, the events will be posted if the parent gui is null or if the parent gui is not an instance of GuiConfig.
     *
     * @param parentScreen           the parent GuiScreen object
     */
    public ModGuiConfig(GuiScreen parentScreen)
    {
        super(parentScreen,
                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
    }
}
