package com.eniallator.letsmodretry;

import com.eniallator.letsmodretry.handler.ConfigurationHandler;
import com.eniallator.letsmodretry.init.ModItems;
import com.eniallator.letsmodretry.proxy.IProxy;
import com.eniallator.letsmodretry.reference.Reference;
import com.eniallator.letsmodretry.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import scala.collection.immutable.Stream;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModRetry {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModRetry instance;

    @SidedProxy(
            clientSide = Reference.MOD_CLIENT_PROXY,
            serverSide = Reference.MOD_SERVER_PROXY
    )
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModItems.init();
        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
