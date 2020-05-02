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

    public static final PregnantSolutionOsRu PregnantSolutionOsRu   = new PregnantSolutionOsRu("PregnantSolutionOsRu");    //浸出液(富锇钌)
    public static final BLOCK_PregnantSolutionOsRu BLOCK_PregnantSolutionOsRu   = new BLOCK_PregnantSolutionOsRu(PregnantSolutionOsRu,"PregnantSolutionOsRu");    //浸出液(富锇钌)

    public static final AbsorptionLiquidOsRu AbsorptionLiquidOsRu = new AbsorptionLiquidOsRu("AbsorptionLiquidOsRu");   //吸收液(富锇铑)
    public static final BLOCK_AbsorptionLiquidOsRu BLOCK_AbsorptionLiquidOsRu = new BLOCK_AbsorptionLiquidOsRu(AbsorptionLiquidOsRu,"AbsorptionLiquidOsRu");

    public static final AbsorptionLiquidRu AbsorptionLiquidRu     = new AbsorptionLiquidRu("AbsorptionLiquidRu");    //吸收液（富钌）
    public static final BLOCK_PregnantSolutionOsRu BLOCK_AbsorptionLiquidRu     = new BLOCK_PregnantSolutionOsRu(AbsorptionLiquidRu,"AbsorptionLiquidRu");    //吸收液（富钌）

    public static final RutheniumTetroxide RutheniumTetroxide     = new RutheniumTetroxide("RutheniumTetroxide");    //四氧化钌
    public static final BLOCK_RutheniumTetroxide BLOCK_RutheniumTetroxide     = new BLOCK_RutheniumTetroxide(RutheniumTetroxide,"RutheniumTetroxide");    //四氧化钌

    public static final OsmiumTetroxide OsmiumTetroxide        = new OsmiumTetroxide("OsmiumTetroxide");    //四氧化锇
    public static final BLOCK_OsmiumTetroxide BLOCK_OsmiumTetroxide        = new BLOCK_OsmiumTetroxide(OsmiumTetroxide,"OsmiumTetroxide");    //四氧化锇

    public static final ChloroRhodiumAcid ChloroRhodiumAcid      = new ChloroRhodiumAcid("ChloroRhodiumAcid");    //氯铑酸
    public static final BLOCK_ChloroRhodiumAcid BLOCK_ChloroRhodiumAcid      = new BLOCK_ChloroRhodiumAcid(ChloroRhodiumAcid,"ChloroRhodiumAcid");    //氯铑酸

    public static final EvaporatedliquidOs EvaporatedliquidOs = new EvaporatedliquidOs("EvaporatedliquidOs");       //蒸出液(富锇)
    public static final BLOCK_EvaporatedliquidOs BLOCK_EvaporatedliquidOs = new BLOCK_EvaporatedliquidOs(EvaporatedliquidOs,"EvaporatedliquidOs");

    public static final SodiumOsmiumHexachloride SodiumOsmiumHexachloride = new SodiumOsmiumHexachloride("SodiumOsmiumHexachloride");       //六氯合锇酸铵溶液
    public static final BLOCK_SodiumOsmiumHexachloride BLOCK_SodiumOsmiumHexachloride = new BLOCK_SodiumOsmiumHexachloride(SodiumOsmiumHexachloride,"SodiumOsmiumHexachloride");

    //以下为生物电路相关的一些流体
    public static final AmylumSolution AmylumSolution = new AmylumSolution("AmylumSolution");       //淀粉溶液
    public static final BLOCK_AmylumSolution BLOCK_AmylumSolution = new BLOCK_AmylumSolution (AmylumSolution,"AmylumSolution");

    public static final BoneMarrow BoneMarrow = new BoneMarrow("BomeMarrow");      //骨髓血
    public static final BLOCK_BoneMarrow BLOCK_BONE_MARROW = new BLOCK_BoneMarrow(BoneMarrow,"BoneMarrow");

    public static final DifferentiationPromotingProteinNeuron DifferentiationPromotingProteinNeuron = new DifferentiationPromotingProteinNeuron("DifferentiationPromotingProteinNeuron");   //促分化蛋白(神经细胞)
    public static final BLOCK_DifferentiationPromotingProteinNeuron BLOCK_DifferentiationPromotingProteinNeuron = new BLOCK_DifferentiationPromotingProteinNeuron(DifferentiationPromotingProteinNeuron,"DifferentiationPromotingProteinNeuron");

    public static final HexamethyleneDiamine HexamethyleneDiamine = new HexamethyleneDiamine("HexamethyleneDiamine");   //己二胺
    public static final BLOCK_HexamethyleneDiamine BLOCK_HexamethyleneDiamine = new BLOCK_HexamethyleneDiamine(HexamethyleneDiamine,"HexamethyleneDiamine");

    public static final HormoneSolution HormoneSolution = new HormoneSolution("HormoneSolution");   //激素溶液
    public static final BLOCK_HormoneSolution BLOCK_HormoneSolution = new BLOCK_HormoneSolution(HormoneSolution,"HormoneSolution");

    public static final MSC MSC = new MSC("MSC");   //干细胞基液
    public static final BLOCK_MSC BLOCK_MSC = new BLOCK_MSC(MSC,"MSC");

    public static final MSCBasalMedium MSCBasalMedium = new MSCBasalMedium("MSCBasalMedium");   //干细胞基础培养基
    public static final BLOCK_MSCBasalMedium BLOCK_MSCBasalMedium = new BLOCK_MSCBasalMedium(MSCBasalMedium,"MSCBasalMedium");

    public static final MSCSupplement MSCSupplement = new MSCSupplement("MSCSupplement");
    public static final BLOCK_MSCSupplement BLOCK_MSCSupplement = new BLOCK_MSCSupplement(MSCSupplement,"MSCSupplement");

    public static Polyimide Polyimide = new Polyimide("Polyimide");     //聚酰亚胺
    public static BLOCK_Polyimide BLOCK_Polyimide = new BLOCK_Polyimide(Polyimide,"Polyimide");

    public static PyromelliticDianhydride PyromelliticDianhydride = new PyromelliticDianhydride("PyromelliticDianhydride");     //均苯四甲酸二酐
    public static BLOCK_PyromelliticDianhydride BLOCK_PyromelliticDianhydride = new BLOCK_PyromelliticDianhydride(PyromelliticDianhydride,"PyromelliticDianhydride");

    public static SPSS SPSS = new SPSS("SPSS");     //生理盐水
    public static BLOCK_SPSS BLOCK_SPSS = new BLOCK_SPSS(SPSS,"SPSS");

    public static VitaminSolution VitaminSolution = new VitaminSolution("VitaminSolution");     //维生素溶液
    public static BLOCK_VitaminSolution BLOCK_VitaminSolution = new BLOCK_VitaminSolution(VitaminSolution,"VitaminSolution");
}

