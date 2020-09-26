package moegaddon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.util.StatCollector;

@Mod(modid=MoegAddon.MOD_ID, name=MoegAddon.MOD_NAME, version=MoegAddon.VERSION, dependencies="required-after:gregapi_post")
public class MoegAddon {
	@SidedProxy(clientSide = "moegaddon.ClientProxy", serverSide = "moegaddon.CommonProxy")
	public static CommonProxy proxy;

	public static final String MOD_ID = "moegadd";
	public static final String MOD_NAME = "MoegAddon";
	public static final String VERSION = "1.12";
	public static final String RES_PATH = "moegadd:textures/";


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

	public static String translate(String s)
	{
		return StatCollector.translateToLocal(s);
	}

}