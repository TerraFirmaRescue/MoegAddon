package moegaddon;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import moegaddon.block.BlockBoneMarrow;
import net.minecraft.block.Block;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

@Mod(modid=MoegAddon.MOD_ID, name=MoegAddon.MOD_NAME, version=MoegAddon.VERSION)
public class MoegAddon {
	@SidedProxy(clientSide = "moegaddon.ClientProxy", serverSide = "moegaddon.CommonProxy")
	public static CommonProxy proxy;

	public static final String MOD_ID = "moegadd";
	public static final String MOD_NAME = "MoegAddon";
	public static final String VERSION = "1.04";
	public static Fluid BoneMarrow = new Fluid("BoneMarrow").setDensity(100).setUnlocalizedName("BoneMarrow");
	public static Block BoneMarrowBlock;

	 	@EventHandler
	    public void preInit(FMLPreInitializationEvent event)
	    {
	        proxy.preInit(event);
			FluidRegistry.registerFluid(BoneMarrow);
			BoneMarrowBlock = new BlockBoneMarrow();
	        GameRegistry.registerBlock(BoneMarrowBlock, "Bone Marrow");
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
