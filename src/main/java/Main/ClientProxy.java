package Main;

import block.FlammableiceBlock;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import item.Flammableice;

public class ClientProxy  extends CommonProxy{

	@Override
    public void preInit(FMLPreInitializationEvent event)
    {
		//Flammableice Flammableice = new Flammableice();
		FlammableiceBlock Flammableice1 = new FlammableiceBlock();
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        super.init(event);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }
}
