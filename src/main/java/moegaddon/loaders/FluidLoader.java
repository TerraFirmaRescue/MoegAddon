package moegaddon.loaders;

import moegaddon.fluid.BlockMoegaddFluid;
import moegaddon.fluid.MoegaddFluid;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraftforge.fluids.Fluid;
import moegaddon.fluid.fluidBlocks.*;
import moegaddon.fluid.fluids.*;

public class FluidLoader {
    public static final SolutionRichPtPa SolutionRichPtPa       = new SolutionRichPtPa("SolutionRichPtPa");    //富铂钯溶液
    public static final BLOCK_SolutionRichPtPa BLOCK_SolutionRichPtPa       = new BLOCK_SolutionRichPtPa(SolutionRichPtPa,"SolutionRichPtPa");    //富铂钯溶液

    public static final SolutionRichPa SolutionRichPa         = new SolutionRichPa("SolutionRichPa");    //富钯溶液
    public static final BLOCK_SolutionRichPa BLOCK_SolutionRichPa         = new BLOCK_SolutionRichPa(SolutionRichPa,"SolutionRichPa");    //富钯溶液

    public static final MoltenSodiumBisulfate MoltenSodiumBisulfate  = new MoltenSodiumBisulfate("MoltenSodiumBisulfate");    //熔融硫酸氢钠
    public static final BLOCK_MoltenSodiumBisulfate BLOCK_MoltenSodiumBisulfate  = new BLOCK_MoltenSodiumBisulfate(MoltenSodiumBisulfate,"MoltenSodiumBisulfate");    //熔融硫酸氢钠

    public static final RhodiumSulfideSolution RhodiumSulfideSolution = new RhodiumSulfideSolution("RhodiumSulfideSolution");    //硫化铑溶液
    public static final BLOCK_RhodiumSulfideSolution BLOCK_RhodiumSulfideSolution = new BLOCK_RhodiumSulfideSolution(RhodiumSulfideSolution,"RhodiumSulfideSolution");    //硫化铑溶液

    public static final PregnantSolutionOsRu PregnantSolutionOsRu   = new PregnantSolutionOsRu("PregnantSolutionOsRu");    //吸收液(富锇钌)
    public static final BLOCK_PregnantSolutionOsRu BLOCK_PregnantSolutionOsRu   = new BLOCK_PregnantSolutionOsRu(PregnantSolutionOsRu,"PregnantSolutionOsRu");    //吸收液(富锇钌)

    public static final AbsorptionLiquidRu AbsorptionLiquidRu     = new AbsorptionLiquidRu("AbsorptionLiquidRu");    //吸收液（富钌）
    public static final BLOCK_PregnantSolutionOsRu BLOCK_AbsorptionLiquidRu     = new BLOCK_PregnantSolutionOsRu(AbsorptionLiquidRu,"AbsorptionLiquidRu");    //吸收液（富钌）

    public static final RutheniumTetroxide RutheniumTetroxide     = new RutheniumTetroxide("RutheniumTetroxide");    //四氧化钌
    public static final BLOCK_RutheniumTetroxide BLOCK_RutheniumTetroxide     = new BLOCK_RutheniumTetroxide(RutheniumTetroxide,"RutheniumTetroxide");    //四氧化钌

    public static final OsmiumTetroxide OsmiumTetroxide        = new OsmiumTetroxide("OsmiumTetroxide");    //四氧化锇
    public static final BLOCK_OsmiumTetroxide BLOCK_OsmiumTetroxide        = new BLOCK_OsmiumTetroxide(OsmiumTetroxide,"OsmiumTetroxide");    //四氧化锇

    public static final ChloroRhodiumAcid ChloroRhodiumAcid      = new ChloroRhodiumAcid("ChloroRhodiumAcid");    //氯钌酸
    public static final BLOCK_ChloroRhodiumAcid BLOCK_ChloroRhodiumAcid      = new BLOCK_ChloroRhodiumAcid(ChloroRhodiumAcid,"ChloroRhodiumAcid");    //氯钌酸

}

