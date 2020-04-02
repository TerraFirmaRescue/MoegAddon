package moegaddon;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import moegaddon.loaders.BlockLoader;
import moegaddon.loaders.ItemLoader;
import moegaddon.loaders.TabLoader;

public class CommonProxy
{

	public void preInit(FMLPreInitializationEvent event)
    {
		TabLoader TabLoader=new TabLoader();
        ItemLoader ItemLoader =new ItemLoader();
        BlockLoader BlockLoader = new BlockLoader();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
