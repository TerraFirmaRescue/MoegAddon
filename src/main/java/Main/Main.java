package Main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import item.Flammableice;

@Mod(modid="moegadd", version="1")
public class Main {
	@SidedProxy(clientSide = "Main.ClientProxy", 
    serverSide = "Main.CommonProxy")
    public static CommonProxy proxy;
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
