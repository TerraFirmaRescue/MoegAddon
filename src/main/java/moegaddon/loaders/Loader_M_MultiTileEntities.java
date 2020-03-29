package moegaddon.loaders;

import static gregapi.data.CS.*;

import gregapi.block.multitileentity.MultiTileEntityBlock;
import gregapi.block.multitileentity.MultiTileEntityRegistry;
import gregapi.data.*;
import gregapi.oredict.OreDictMaterial;
import gregapi.util.UT;
import gregtech.loaders.b.Loader_MultiTileEntities;
import moegaddon.entities.tileentity.MultiTileEntityLargeLaserCutter;
import net.minecraft.tileentity.TileEntity;

public class Loader_M_MultiTileEntities extends Loader_MultiTileEntities {

    private static void multiblocks(MultiTileEntityRegistry aRegistry, MultiTileEntityBlock aMetal, MultiTileEntityBlock aMetalChips, MultiTileEntityBlock aMetalWires, MultiTileEntityBlock aMachine, MultiTileEntityBlock aWooden, MultiTileEntityBlock aBush, MultiTileEntityBlock aStone, MultiTileEntityBlock aWool, MultiTileEntityBlock aTNT, MultiTileEntityBlock aHive, MultiTileEntityBlock aUtilMetal, MultiTileEntityBlock aUtilStone, MultiTileEntityBlock aUtilWood, MultiTileEntityBlock aUtilWool, OreDictMaterial aMat, Class<? extends TileEntity> aClass) {

        aMat = MT.Steel;       aRegistry.add("Large Laser Cutter" , "Multiblock Machines", 17123, 17101, MultiTileEntityLargeLaserCutter.class         , aMat.mToolQuality, 16, aMachine   , UT.NBT.make(NBT_MATERIAL, aMat, NBT_HARDNESS,   6.0F, NBT_RESISTANCE,   6.0F, NBT_COLOR, UT.Code.getRGBInt(aMat.fRGBaSolid), NBT_TEXTURE, "largelasercutter"       , NBT_INPUT,  128, NBT_INPUT_MIN,  64, NBT_INPUT_MAX,     2048, NBT_EFFICIENCY,  5000, NBT_ENERGY_ACCEPTED, TD.Energy.LU, NBT_RECIPEMAP, RM.Cutter , NBT_INV_SIDE_AUTO_OUT, SIDE_BOTTOM, NBT_TANK_SIDE_AUTO_OUT, SIDE_BOTTOM, NBT_CHEAP_OVERCLOCKING, T, NBT_PARALLEL,  4, NBT_PARALLEL_DURATION, T                          ), "CMC", "RCR"       , 'M', aRegistry.getItem(18105), 'R', IL.Processor_Crystal_Emerald, 'C', OD_CIRCUITS[6]);

    }
}
