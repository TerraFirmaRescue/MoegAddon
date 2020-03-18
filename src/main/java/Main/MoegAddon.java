package Main;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid="moegadd", name="MoegAddon", version="0.1")
public class MoegAddon {
	@SidedProxy(clientSide = "Main.ClientProxy", serverSide = "Main.CommonProxy")
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
