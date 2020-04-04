package moegaddon.loaders;

import moegaddon.item.ItemBase;
import moegaddon.item.*;
import net.minecraft.item.Item;

public class ItemLoader {
    public static final Item SeedCrystalSilicon = new ItemBase("SeedCrystalSilicon"); //硅籽晶
	public static final Item PolycrystallineSilicon = new ItemBase("PolycrystallineSilicon"); //多晶硅
    //简易系列
	public static ItemBase Simpletransistor = new ItemBase( "Simpletransistor"); //简易电阻
    public static final Simpleresistance Simpleresistance=new Simpleresistance();
    public static final SimpleCapacitance SimpleCapacitance = new SimpleCapacitance();
    //初始
	public static ItemBase RawWafer = new ItemBase( "RawWafer"); //待光刻晶元

    //粗制的光刻后晶元
    public static ItemBase Wafer30wm = new ItemBase("Wafer30wm");
    public static ItemBase Wafer20wm = new ItemBase("Wafer20wm");
    public static ItemBase Wafer10wm = new ItemBase("Wafer10wm");

    //Photomasks
    public static ItemBase PhotomaskRaw = new ItemBase("PhotomaskRaw");

    public static ItemBase PhotomaskWork = new ItemBase("PhotomaskWork"); //光学掩膜板
    public static ItemBase PhotomaskCentral = new ItemBase("PhotomaskCentral");

    public static ItemBase PhotomaskControl1 = new ItemBase("PhotomaskControl1");
    public static ItemBase PhotomaskControl2 = new ItemBase("PhotomaskControl2");
    public static ItemBase PhotomaskControl3 = new ItemBase("PhotomaskControl3");
    public static ItemBase PhotomaskControl4 = new ItemBase("PhotomaskControl4");

    public static ItemBase PhotomaskFilm1 = new ItemBase("PhotomaskFilm1");
    public static ItemBase PhotomaskFilm2 = new ItemBase("PhotomaskFilm2");
    public static ItemBase PhotomaskFilm3 = new ItemBase("PhotomaskFilm3");
    public static ItemBase PhotomaskFilm4 = new ItemBase("PhotomaskFilm4");

    //CPU
    public static ItemBase Wafer1wm                   = new ItemBase("Wafer1wm"); //光刻后晶元
    public static ItemBase Wafer200nm                 = new ItemBase("Wafer200nm");
    public static ItemBase Wafer60nm                  = new ItemBase("Wafer60nm");
    public static ItemBase Wafer20nm                  = new ItemBase("Wafer20nm");
    //public static ItemBase SlightlyOxidizedWafer1wm   = new ItemBase("SlightlyOxidizedWafer1wm"); //初步氧化晶元
    //public static ItemBase SlightlyOxidizedWafer200nm = new ItemBase("SlightlyOxidizedWafer200nm");
    //public static ItemBase SlightlyOxidizedWafer60nm  = new ItemBase("SlightlyOxidizedWafer60nm");
    //public static ItemBase SlightlyOxidizedWafer20nm  = new ItemBase("SlightlyOxidizedWafer20nm");
    public static ItemBase CleanedWafer1wm            = new ItemBase("CleanedWafer1wm"); //待掺杂晶元（洁净晶元）
    public static ItemBase CleanedWafer200nm          = new ItemBase("CleanedWafer200nm");
    public static ItemBase CleanedWafer60nm           = new ItemBase("CleanedWafer60nm");
    public static ItemBase CleanedWafer20nm           = new ItemBase("CleanedWafer20nm");
    public static ItemBase MonolayerWafer1wm          = new ItemBase("MonolayerWafer1wm"); //单层晶元
    public static ItemBase MonolayerWafer200nm        = new ItemBase("MonolayerWafer200nm");
    public static ItemBase MonolayerWafer60nm         = new ItemBase("MonolayerWafer60nm");
    public static ItemBase MonolayerWafer20nm         = new ItemBase("MonolayerWafer20nm");
    public static ItemBase MultilayerWafer1wm         = new ItemBase("MultilayerWafer1wm"); //多层晶元
    public static ItemBase MultilayerWafer200nm       = new ItemBase("MultilayerWafer200nm");
    public static ItemBase MultilayerWafer60nm        = new ItemBase("MultilayerWafer60nm");
    public static ItemBase MultilayerWafer20nm        = new ItemBase("MultilayerWafer20nm");
    public static ItemBase IntegratedCircuit256MHz    = new ItemBase("IntegratedCircuit256MHz"); //集成电路
    public static ItemBase IntegratedCircuit512MHz    = new ItemBase("IntegratedCircuit512MHz");
    public static ItemBase IntegratedCircuit1GHz      = new ItemBase("IntegratedCircuit1GHz");
    public static ItemBase IntegratedCircuit2GHz      = new ItemBase("IntegratedCircuit2GHz");

    public static ItemBase CPU_256MHz_2   = new ItemBase("CPU_256MHz_2"); //CPU
    public static ItemBase CPU_256MHz_4   = new ItemBase("CPU_256MHz_4");
    public static ItemBase CPU_256MHz_8   = new ItemBase("CPU_256MHz_8");
    public static ItemBase CPU_256MHz_16  = new ItemBase("CPU_256MHz_16");

    public static ItemBase CPU_512MHz_2   = new ItemBase("CPU_512MHz_2");
    public static ItemBase CPU_512MHz_4   = new ItemBase("CPU_512MHz_4");
    public static ItemBase CPU_512MHz_8   = new ItemBase("CPU_512MHz_8");
    public static ItemBase CPU_512MHz_16  = new ItemBase("CPU_512MHz_16");

    public static ItemBase CPU_1GHz_2     = new ItemBase("CPU_1GHz_2");
    public static ItemBase CPU_1GHz_4     = new ItemBase("CPU_1GHz_4");
    public static ItemBase CPU_1GHz_8     = new ItemBase("CPU_1GHz_8");
    public static ItemBase CPU_1GHz_16    = new ItemBase("CPU_1GHz_16");

    public static ItemBase CPU_2GHz_2     = new ItemBase("CPU_2GHz_2");
    public static ItemBase CPU_2GHz_4     = new ItemBase("CPU_2GHz_4");
    public static ItemBase CPU_2GHz_8     = new ItemBase("CPU_2GHz_8");
    public static ItemBase CPU_2GHz_16    = new ItemBase("CPU_2GHz_16");

    //RAM
    public static ItemBase CCL            = new ItemBase("CCL"); //覆铜板 Copper Clad Laminate
    public static ItemBase MemoryCell128M = new ItemBase("MemoryCell128M");
    public static ItemBase MemoryCell256M = new ItemBase("MemoryCell256M");
    public static ItemBase MemoryCell512M = new ItemBase("MemoryCell512M");
    public static ItemBase MemoryCell1G   = new ItemBase("MemoryCell1G");

    public static ItemBase RAM_128M_2     = new ItemBase( "RAM_128M_2"); //RAM
    public static ItemBase RAM_128M_4     = new ItemBase( "RAM_128M_4");
    public static ItemBase RAM_128M_8     = new ItemBase( "RAM_128M_8");
    public static ItemBase RAM_128M_16    = new ItemBase("RAM_128M_16");

    public static ItemBase RAM_256M_2     = new ItemBase("RAM_256M_2");
    public static ItemBase RAM_256M_4     = new ItemBase("RAM_256M_4");
    public static ItemBase RAM_256M_8     = new ItemBase("RAM_256M_8");
    public static ItemBase RAM_256M_16    = new ItemBase("RAM_256M_16");

    public static ItemBase RAM_512M_2     = new ItemBase("RAM_512M_2");
    public static ItemBase RAM_512M_4     = new ItemBase("RAM_512M_4");
    public static ItemBase RAM_512M_8     = new ItemBase("RAM_512M_8");
    public static ItemBase RAM_512M_16    = new ItemBase("RAM_512M_16");

    public static ItemBase RAM_1G_2       = new ItemBase("RAM_1G_2");
    public static ItemBase RAM_1G_4       = new ItemBase("RAM_1G_4");
    public static ItemBase RAM_1G_8       = new ItemBase("RAM_1G_8");
    public static ItemBase RAM_1G_16      = new ItemBase("RAM_1G_16");

    //Mainboard
    public static ItemBase SMDResistor     = new ItemBase("SMDResistor"); //贴片元件
    public static ItemBase PatchCapacitor  = new ItemBase("PatchCapacitor");
    public static ItemBase PatchDiode      = new ItemBase("PatchDiode");
    public static ItemBase PatchTransistor = new ItemBase("PatchTransistor");

    public static ItemBase EpoxyPlate                      = new ItemBase("EpoxyPlate"); //电路基板 处理器主板
    public static ItemBase EpoxyCircuitBoard               = new ItemBase("EpoxyCircuitBoard");
    public static ItemBase FabricStrengthenedCircuitBoard  = new ItemBase("FabricStrengthenedCircuitBoard");
    public static ItemBase BioCircuitBoard                 = new ItemBase("BioCircuitBoard");
    public static ItemBase BasicProcessorMainboard         = new ItemBase("BasicProcessorMainboard");
    public static ItemBase IntermediateProcessorMainboard  = new ItemBase("IntermediateProcessorMainboard");
    public static ItemBase AdvancedProcessorMainboard      = new ItemBase("AdvancedProcessorMainboard");

    //Mainframes
    public static ItemBase Mainframe1  = new ItemBase("Mainframe1");
    public static ItemBase Mainframe2  = new ItemBase("Mainframe2");
    public static ItemBase Mainframe3  = new ItemBase("Mainframe3");
    public static ItemBase Mainframe4  = new ItemBase("Mainframe4");
    public static ItemBase Mainframe5  = new ItemBase("Mainframe5");
    public static ItemBase Mainframe6  = new ItemBase("Mainframe6");
    public static ItemBase Mainframe7  = new ItemBase("Mainframe7");

    public static ItemBase StarPlatinum = new ItemBase("StarPlatinum");
    public static ItemBase CrushedPlatinumOre = new ItemBase("CrushedPlatinumOre");


    //Ores

}
