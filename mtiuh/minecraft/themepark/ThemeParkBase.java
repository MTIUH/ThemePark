package mtiuh.minecraft.themepark;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid="ThemePark", name="ThemePark", version="0.0.0.0")
@NetworkMod(clientSideRequired=true)
public class ThemeParkBase {

        @Instance(value = "ThemePark")
        public static ThemeParkBase instance;
       
        @SidedProxy(clientSide="mtiuh.minecraft.themepark.client.ClientProxy", serverSide="mtiuh.minecraft.themepark.CommonProxy")
        public static CommonProxy proxy;
       
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
        }
       
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}