package moegaddon;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import gregapi.util.UT;
import gregtech.tileentity.misc.MultiTileEntityCertificate;
import moegaddon.code.HashSetNoNulls;
import moegaddon.config.MoegAddonConfig;
import moegaddon.loaders.BlockLoader;
import moegaddon.loaders.FluidLoader;
import moegaddon.loaders.ItemLoader;
import moegaddon.loaders.TabLoader;
import moegaddon.login.LoginHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.net.URL;
import java.util.Scanner;

import static gregapi.data.CS.F;
import static moegaddon.MoegAddon.MOD_ID;
import static moegaddon.MoegAddon.MOD_NAME;

public class CommonProxy
{
    public String SILVER_URL = "https://raw.githubusercontent.com/TerraFirmaRescue/TerraFirma-Rescue-Modpack/master/supporterlist.txt";
    public String GOLD_URL = "https://raw.githubusercontent.com/TerraFirmaRescue/TerraFirma-Rescue-Modpack/master/supporterlistgold.txt";

    public final HashSetNoNulls<String> mSupporterListSilver = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListGold = new HashSetNoNulls<>();

    public static final Logger LOGGER = LogManager.getFormatterLogger(MOD_NAME);
    public static MoegAddonConfig MoegAddonConfig;

    public CommonProxy() {
        MinecraftForge.EVENT_BUS         .register(this);
        FMLCommonHandler.instance().bus().register(this);
    }

	public void preInit(FMLPreInitializationEvent event) {

        // Init MoegAddon config file. Create it if it's not there
        MoegAddonConfig = new MoegAddonConfig(event.getModConfigurationDirectory(), "MoegAddon", MOD_ID);
        if (!MoegAddonConfig.LoadConfig()) {
            LOGGER.error(String.format("%s could not load its config file. Things are going to be weird!", MOD_ID));
        }

        if (downloadSupporterListSilverFromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded Silver Supporter List!");
            LOGGER.info(mSupporterListSilver);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/supporterlist.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListSilver.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading Silver Supporter List, using interal List!");
            LOGGER.info("Silver: " + mSupporterListSilver);

        } catch(Throwable e) {e.printStackTrace();}

        if (downloadSupporterListGoldFromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded Gold Supporter List!");
            LOGGER.info(mSupporterListGold);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/supporterlistgold.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListGold.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading Gold Supporter List, using interal List!");
            LOGGER.info("Gold: " + mSupporterListGold);

        } catch(Throwable e) {e.printStackTrace();}

        if (MoegAddonConfig.ModLoginMessage_Enabled)
        {
            FMLCommonHandler.instance().bus().register(new LoginHandler());
        }

        TabLoader TabLoader=new TabLoader();
        ItemLoader ItemLoader =new ItemLoader();
        BlockLoader BlockLoader = new BlockLoader();
        FluidLoader FluidLoader = new FluidLoader();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }

    private static final HashSetNoNulls<String> CHECKED_PLAYERS = new HashSetNoNulls<>();

    @SubscribeEvent
    public void onPlayerInteraction(PlayerInteractEvent aEvent) {
        if (aEvent.entityPlayer == null || aEvent.entityPlayer.worldObj == null || aEvent.action == null || aEvent.world.provider == null)
            return;
        String aName = aEvent.entityPlayer.getCommandSenderName(), aNameLowercase = aName.toLowerCase();
        if (Loader.isModLoaded("gregapi_post")) {
            if (!aEvent.world.isRemote && CHECKED_PLAYERS.add(aName)) {
                if (mSupporterListSilver.contains(aEvent.entityPlayer.getUniqueID().toString()) || mSupporterListGold.contains(aEvent.entityPlayer.getUniqueID().toString()) || mSupporterListSilver.contains(aNameLowercase) || mSupporterListGold.contains(aNameLowercase)) {
                    if (!MultiTileEntityCertificate.ALREADY_RECEIVED.contains(aNameLowercase)) {
                        if (UT.Inventories.addStackToPlayerInventoryOrDrop(aEvent.entityPlayer, MultiTileEntityCertificate.getCertificate(1, aName), F)) {
                            MultiTileEntityCertificate.ALREADY_RECEIVED.add(aNameLowercase);
                            UT.Entities.sendchat(aEvent.entityPlayer, MoegAddon.translate("chat.tfr.1") + aName + MoegAddon.translate("chat.tfr.2"));
                        }
                    }
                }
            }
        }
    }

    public boolean downloadSupporterListSilverFromMain() {
        try {
            Scanner tScanner = new Scanner(new URL(SILVER_URL).openStream());
            while (tScanner.hasNextLine()) mSupporterListSilver.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListSilver.size() > 1;
        } catch(Throwable e) {e.printStackTrace();}
        return false;
    }

    public boolean downloadSupporterListGoldFromMain() {
        try {
            Scanner tScanner = new Scanner(new URL(GOLD_URL).openStream());
            while (tScanner.hasNextLine()) mSupporterListGold.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListGold.size() > 1;
        } catch(Throwable e) {e.printStackTrace();}
        return false;
    }
}
