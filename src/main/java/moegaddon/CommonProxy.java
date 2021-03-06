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
import java.net.URLConnection;
import java.util.Scanner;

import static gregapi.data.CS.F;
import static moegaddon.MoegAddon.MOD_ID;
import static moegaddon.MoegAddon.MOD_NAME;

public class CommonProxy {
    public static final Logger LOGGER = LogManager.getFormatterLogger(MOD_NAME);
    public static MoegAddonConfig MOD_CONFIG;
    public static String LATEST_MODPACK_VERSION = "DEFAULT";

    public final HashSetNoNulls<String> mModpackVersionList = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListSilver = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListGold = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListMEC1 = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListMEC2 = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListMEC3 = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListMEC4 = new HashSetNoNulls<>();
    public final HashSetNoNulls<String> mSupporterListMEC5 = new HashSetNoNulls<>();

    public CommonProxy() {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
    }

    public void preInit(FMLPreInitializationEvent event) {

        // Init MoegAddon config file. Create it if it's not there
        MOD_CONFIG = new MoegAddonConfig(event.getModConfigurationDirectory(), "MoegAddon", MOD_ID);
        if (!MOD_CONFIG.LoadConfig()) {
            LOGGER.error(String.format("%s could not load its config file. Things are going to be weird!", MOD_ID));
        }

        LOGGER.info("Modpack version URL: " + MOD_CONFIG.modpackVersionURL);
        LOGGER.info("Support List URL: " + MOD_CONFIG.supportListURL);
        LOGGER.info("Golden Support List URL: " + MOD_CONFIG.supportListGoldURL);
        LOGGER.info("MEC1 URL: " + MOD_CONFIG.supportListMEC1URL);
        LOGGER.info("MEC2 URL: " + MOD_CONFIG.supportListMEC2URL);
        LOGGER.info("MEC3 URL: " + MOD_CONFIG.supportListMEC3URL);
        LOGGER.info("MEC4 URL: " + MOD_CONFIG.supportListMEC4URL);
        LOGGER.info("MEC5 URL: " + MOD_CONFIG.supportListMEC5URL);

        // Download latest version string from url
        if (downloadLatestModpackVersionFromMain()) {
            LOGGER.info("TFR_Download_Thread: Succeeded at checking modpack version!");
            LOGGER.info(mModpackVersionList);
            for (String mVersion : mModpackVersionList) {
                if (mVersion.startsWith("tfr")) {
                    LATEST_MODPACK_VERSION = mVersion.substring(4);
                }
            }
            LOGGER.info("Latest Version: " + LATEST_MODPACK_VERSION);
        } else {
            LATEST_MODPACK_VERSION = "NULL";
            LOGGER.warn("TFR_Download_Thread: Failed at checking modpack version!");
        }

        // Init supporterlist stuff

        if (downloadSupporterListSilverFromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded Silver Supporter List!");
            LOGGER.info(mSupporterListSilver);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/supporterlist.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListSilver.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading Silver Supporter List, using interal List!");
            LOGGER.info("Silver: " + mSupporterListSilver);

        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (downloadSupporterListGoldFromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded Gold Supporter List!");
            LOGGER.info(mSupporterListGold);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/supporterlistgold.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListGold.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading Gold Supporter List, using interal List!");
            LOGGER.info("Gold: " + mSupporterListGold);

        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (downloadSupporterListMEC1FromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded MEC1 Supporter List!");
            LOGGER.info(mSupporterListMEC1);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/mec1.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC1.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading MEC1 Supporter List, using interal List!");
            LOGGER.info("MEC1: " + mSupporterListMEC1);

        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (downloadSupporterListMEC2FromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded MEC2 Supporter List!");
            LOGGER.info(mSupporterListMEC2);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/mec2.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC2.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading MEC2 Supporter List, using interal List!");
            LOGGER.info("MEC2: " + mSupporterListMEC2);

        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (downloadSupporterListMEC3FromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded MEC3 Supporter List!");
            LOGGER.info(mSupporterListMEC3);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/mec3.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC3.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading MEC3 Supporter List, using interal List!");
            LOGGER.info("MEC3: " + mSupporterListMEC3);

        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (downloadSupporterListMEC4FromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded MEC4 Supporter List!");
            LOGGER.info(mSupporterListMEC4);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/mec4.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC4.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading MEC4 Supporter List, using interal List!");
            LOGGER.info("MEC4: " + mSupporterListMEC4);

        } catch (Throwable e) {
            e.printStackTrace();
        }

        if (downloadSupporterListMEC5FromMain()) {
            LOGGER.info("TFR_Download_Thread: Downloaded MEC5 Supporter List!");
            LOGGER.info(mSupporterListMEC5);
        } else try {
            Scanner tScanner = new Scanner(Minecraft.getMinecraft().getResourceManager().getResource(new ResourceLocation("moegadd:texts/mec5.txt")).getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC5.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            LOGGER.warn("TFR_Download_Thread: Failed downloading MEC5 Supporter List, using interal List!");
            LOGGER.info("MEC5: " + mSupporterListMEC5);

        } catch (Throwable e) {
            e.printStackTrace();
        }

        // Login message

        if (MOD_CONFIG.ModLoginMessage_Enabled) {
            FMLCommonHandler.instance().bus().register(new LoginHandler());
        }

        // Rest

        TabLoader TabLoader = new TabLoader();
        ItemLoader ItemLoader = new ItemLoader();
        BlockLoader BlockLoader = new BlockLoader();
        FluidLoader FluidLoader = new FluidLoader();
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {

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

    public boolean downloadLatestModpackVersionFromMain() {
        try {
            URL url = new URL(MOD_CONFIG.modpackVersionURL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mModpackVersionList.add(tScanner.nextLine().trim());
            tScanner.close();
            return mModpackVersionList.size() > 0;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean downloadSupporterListSilverFromMain() {
        try {
            URL url = new URL(MOD_CONFIG.supportListURL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mSupporterListSilver.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListSilver.size() > 1;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean downloadSupporterListGoldFromMain() {
        try {
            URL url = new URL(MOD_CONFIG.supportListGoldURL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mSupporterListGold.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListGold.size() > 1;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean downloadSupporterListMEC1FromMain() {
        try {
            URL url = new URL(MOD_CONFIG.supportListMEC1URL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC1.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListMEC1.size() > 1;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean downloadSupporterListMEC2FromMain() {
        try {
            URL url = new URL(MOD_CONFIG.supportListMEC2URL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC2.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListMEC2.size() > 1;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean downloadSupporterListMEC3FromMain() {
        try {
            URL url = new URL(MOD_CONFIG.supportListMEC3URL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC3.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListMEC3.size() > 1;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean downloadSupporterListMEC4FromMain() {
        try {
            URL url = new URL(MOD_CONFIG.supportListMEC4URL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC4.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListMEC4.size() > 1;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean downloadSupporterListMEC5FromMain() {
        try {
            URL url = new URL(MOD_CONFIG.supportListMEC5URL);
            URLConnection urlConnection = url.openConnection();
            urlConnection.setConnectTimeout(5000);
            urlConnection.setReadTimeout(5000);
            Scanner tScanner = new Scanner(urlConnection.getInputStream());
            while (tScanner.hasNextLine()) mSupporterListMEC5.add(tScanner.nextLine().toLowerCase());
            tScanner.close();
            return mSupporterListMEC5.size() > 1;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return false;
    }
}
