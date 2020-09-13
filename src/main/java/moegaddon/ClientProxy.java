package moegaddon;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import moegaddon.render.PlayerModelRenderer;
import net.minecraftforge.client.event.RenderPlayerEvent;

public class ClientProxy extends CommonProxy{
    private final PlayerModelRenderer mPlayerRenderer = new PlayerModelRenderer(mSupporterListSilver, mSupporterListGold);

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
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

    @SubscribeEvent
    public void receiveRenderSpecialsEvent(RenderPlayerEvent.Specials.Pre aEvent) {
        mPlayerRenderer.receiveRenderSpecialsEvent(aEvent);
    }

}

