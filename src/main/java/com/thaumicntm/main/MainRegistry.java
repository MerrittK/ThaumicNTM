package com.thaumicntm.main;

import com.hbm.util.CompatExternal;
import com.thaumicntm.inventory.FluidPatchListener;
import com.thaumicntm.inventory.mats.ThaumMats;
import com.thaumicntm.inventory.mats.ThaumOreDict;
import com.thaumicntm.inventory.recipes.ThaumInfusionRecipes;
import com.thaumicntm.research.ThaumResearchRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.thaumicntm.items.ThaumNTMItems;
import com.thaumicntm.inventory.recipes.RecipePatchListner;

@Mod(
    modid = Tags.MODID,
    version = Tags.VERSION,
    name = Tags.MODNAME,
    acceptedMinecraftVersions = "[1.7.10]",
    dependencies = "required-after:hbm;" +
        "required-after:Thaumcraft" )
//add a semicolon to any mod you add
public class MainRegistry {

    private static Logger LOG = LogManager.getLogger(Tags.MODID);

    @SidedProxy(clientSide= Tags.CLIENTSIDE, serverSide=Tags.SERVERSIDE)
    public static CommonProxy proxy;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items,
    // etc, and register them with the GameRegistry."
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        
        ThaumMats.MAT_THAUMIUM.getUnlocalizedName();
        ThaumNTMItems.mainRegistry();
        ThaumOreDict.registerResources();
        CompatExternal.registerRecipeRegisterListener(new RecipePatchListner());
		CompatExternal.registerFluidRegisterListener(new FluidPatchListener());

	}

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes."
    public void init(FMLInitializationEvent event) {
        proxy.init(event);

    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this."
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
		ThaumInfusionRecipes.registerRecipes();
		ThaumResearchRegistry.initResearchRegistry();
    }

    @Mod.EventHandler
    public void serverAboutToStart(FMLServerAboutToStartEvent event) {
        proxy.serverAboutToStart(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }

    @Mod.EventHandler
    public void serverStarted(FMLServerStartedEvent event) {
        proxy.serverStarted(event);
    }

    @Mod.EventHandler
    public void serverStopping(FMLServerStoppingEvent event) {
        proxy.serverStopping(event);
    }

    @Mod.EventHandler
    public void serverStopped(FMLServerStoppedEvent event) {
        proxy.serverStopped(event);
    }

    public static void debug(String message) {
        LOG.debug(message);
    }

    public static void info(String message) {
        LOG.info(message);
    }

    public static void warn(String message) {
        LOG.warn(message);
    }

    public static void error(String message) {
        LOG.error(message);
    }
}
