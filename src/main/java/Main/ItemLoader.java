package Main;

import item.ElectronicBase;
import net.minecraft.item.Item;

public class ItemLoader {
	public static final item.Simpleresistance Simpleresistance=new item.Simpleresistance();
	public static final item.SimpleCapacitance SIMPLE_CAPACITANCE = new item.SimpleCapacitance();
    public static final Item SeedCrystalSilicon = new ElectronicBase("SeedCrystalSilicon"); //硅籽晶
	public static final Item PolycrystallineSilicon = new ElectronicBase("PolycrystallineSilicon"); //多晶硅
    //简易系列
	public static ElectronicBase Simpletransistor = new ElectronicBase( "Simpletransistor"); //简易电阻
    //初始
	public static ElectronicBase RawWafer = new ElectronicBase( "RawWafer"); //待光刻晶元

    //粗制的光刻后晶元
    public static ElectronicBase Wafer30wm = new ElectronicBase("Wafer30wm");
    public static ElectronicBase Wafer20wm = new ElectronicBase("Wafer20wm");
    public static ElectronicBase Wafer10wm = new ElectronicBase("Wafer10wm");

    //Photomasks
    public static ElectronicBase PhotomaskRaw = new ElectronicBase("PhotomaskRaw");

    public static ElectronicBase PhotomaskWork = new ElectronicBase("PhotomaskWork"); //光学掩膜板
    public static ElectronicBase PhotomaskCentral = new ElectronicBase("PhotomaskCentral");

    public static ElectronicBase PhotomaskControl1 = new ElectronicBase("PhotomaskControl1");
    public static ElectronicBase PhotomaskControl2 = new ElectronicBase("PhotomaskControl2");
    public static ElectronicBase PhotomaskControl3 = new ElectronicBase("PhotomaskControl3");
    public static ElectronicBase PhotomaskControl4 = new ElectronicBase("PhotomaskControl4");

    public static ElectronicBase PhotomaskFilm1 = new ElectronicBase("PhotomaskFilm1");
    public static ElectronicBase PhotomaskFilm2 = new ElectronicBase("PhotomaskFilm2");
    public static ElectronicBase PhotomaskFilm3 = new ElectronicBase("PhotomaskFilm3");
    public static ElectronicBase PhotomaskFilm4 = new ElectronicBase("PhotomaskFilm4");

    //CPU
    public static ElectronicBase Wafer1wm                   = new ElectronicBase("Wafer1wm"); //光刻后晶元
    public static ElectronicBase Wafer200nm                 = new ElectronicBase("Wafer200nm");
    public static ElectronicBase Wafer60nm                  = new ElectronicBase("Wafer60nm");
    public static ElectronicBase Wafer20nm                  = new ElectronicBase("Wafer20nm");
    //public static ElectronicBase SlightlyOxidizedWafer1wm   = new ElectronicBase("SlightlyOxidizedWafer1wm"); //初步氧化晶元
    //public static ElectronicBase SlightlyOxidizedWafer200nm = new ElectronicBase("SlightlyOxidizedWafer200nm");
    //public static ElectronicBase SlightlyOxidizedWafer60nm  = new ElectronicBase("SlightlyOxidizedWafer60nm");
    //public static ElectronicBase SlightlyOxidizedWafer20nm  = new ElectronicBase("SlightlyOxidizedWafer20nm");
    public static ElectronicBase CleanedWafer1wm            = new ElectronicBase("CleanedWafer1wm"); //待掺杂晶元（洁净晶元）
    public static ElectronicBase CleanedWafer200nm          = new ElectronicBase("CleanedWafer200nm");
    public static ElectronicBase CleanedWafer60nm           = new ElectronicBase("CleanedWafer60nm");
    public static ElectronicBase CleanedWafer20nm           = new ElectronicBase("CleanedWafer20nm");
    public static ElectronicBase MonolayerWafer1wm          = new ElectronicBase("MonolayerWafer1wm"); //单层晶元
    public static ElectronicBase MonolayerWafer200nm        = new ElectronicBase("MonolayerWafer200nm");
    public static ElectronicBase MonolayerWafer60nm         = new ElectronicBase("MonolayerWafer60nm");
    public static ElectronicBase MonolayerWafer20nm         = new ElectronicBase("MonolayerWafer20nm");
    public static ElectronicBase MultilayerWafer1wm         = new ElectronicBase("MultilayerWafer1wm"); //多层晶元
    public static ElectronicBase MultilayerWafer200nm       = new ElectronicBase("MultilayerWafer200nm");
    public static ElectronicBase MultilayerWafer60nm        = new ElectronicBase("MultilayerWafer60nm");
    public static ElectronicBase MultilayerWafer20nm        = new ElectronicBase("MultilayerWafer20nm");
    public static ElectronicBase IntegratedCircuit256MHz    = new ElectronicBase("IntegratedCircuit256MHz"); //集成电路
    public static ElectronicBase IntegratedCircuit512MHz    = new ElectronicBase("IntegratedCircuit512MHz");
    public static ElectronicBase IntegratedCircuit1GHz      = new ElectronicBase("IntegratedCircuit1GHz");
    public static ElectronicBase IntegratedCircuit2GHz      = new ElectronicBase("IntegratedCircuit2GHz");

    public static ElectronicBase CPU_256MHz_2   = new ElectronicBase("CPU_256MHz_2"); //CPU
    public static ElectronicBase CPU_256MHz_4   = new ElectronicBase("CPU_256MHz_4");
    public static ElectronicBase CPU_256MHz_8   = new ElectronicBase("CPU_256MHz_8");
    public static ElectronicBase CPU_256MHz_16  = new ElectronicBase("CPU_256MHz_16");

    public static ElectronicBase CPU_512MHz_2   = new ElectronicBase("CPU_512MHz_2");
    public static ElectronicBase CPU_512MHz_4   = new ElectronicBase("CPU_512MHz_4");
    public static ElectronicBase CPU_512MHz_8   = new ElectronicBase("CPU_512MHz_8");
    public static ElectronicBase CPU_512MHz_16  = new ElectronicBase("CPU_512MHz_16");

    public static ElectronicBase CPU_1GHz_2     = new ElectronicBase("CPU_1GHz_2");
    public static ElectronicBase CPU_1GHz_4     = new ElectronicBase("CPU_1GHz_4");
    public static ElectronicBase CPU_1GHz_8     = new ElectronicBase("CPU_1GHz_8");
    public static ElectronicBase CPU_1GHz_16    = new ElectronicBase("CPU_1GHz_16");

    public static ElectronicBase CPU_2GHz_2     = new ElectronicBase("CPU_2GHz_2");
    public static ElectronicBase CPU_2GHz_4     = new ElectronicBase("CPU_2GHz_4");
    public static ElectronicBase CPU_2GHz_8     = new ElectronicBase("CPU_2GHz_8");
    public static ElectronicBase CPU_2GHz_16    = new ElectronicBase("CPU_2GHz_16");

    //RAM
    public static ElectronicBase CCL            = new ElectronicBase("CCL"); //覆铜板 Copper Clad Laminate
    public static ElectronicBase MemoryCell128M = new ElectronicBase("MemoryCell128M");
    public static ElectronicBase MemoryCell256M = new ElectronicBase("MemoryCell256M");
    public static ElectronicBase MemoryCell512M = new ElectronicBase("MemoryCell512M");
    public static ElectronicBase MemoryCell1G   = new ElectronicBase("MemoryCell1G");

    public static ElectronicBase RAM_128M_2     = new ElectronicBase( "RAM_128M_2"); //RAM
    public static ElectronicBase RAM_128M_4     = new ElectronicBase( "RAM_128M_4");
    public static ElectronicBase RAM_128M_8     = new ElectronicBase( "RAM_128M_8");
    public static ElectronicBase RAM_128M_16    = new ElectronicBase("RAM_128M_16");

    public static ElectronicBase RAM_256M_2     = new ElectronicBase("RAM_256M_2");
    public static ElectronicBase RAM_256M_4     = new ElectronicBase("RAM_256M_4");
    public static ElectronicBase RAM_256M_8     = new ElectronicBase("RAM_256M_8");
    public static ElectronicBase RAM_256M_16    = new ElectronicBase("RAM_256M_16");

    public static ElectronicBase RAM_512M_2     = new ElectronicBase("RAM_512M_2");
    public static ElectronicBase RAM_512M_4     = new ElectronicBase("RAM_512M_4");
    public static ElectronicBase RAM_512M_8     = new ElectronicBase("RAM_512M_8");
    public static ElectronicBase RAM_512M_16    = new ElectronicBase("RAM_512M_16");

    public static ElectronicBase RAM_1G_2       = new ElectronicBase("RAM_1G_2");
    public static ElectronicBase RAM_1G_4       = new ElectronicBase("RAM_1G_4");
    public static ElectronicBase RAM_1G_8       = new ElectronicBase("RAM_1G_8");
    public static ElectronicBase RAM_1G_16      = new ElectronicBase("RAM_1G_16");

    //Mainboard
    public static ElectronicBase SMDResistor     = new ElectronicBase("SMDResistor"); //贴片元件
    public static ElectronicBase PatchCapacitor  = new ElectronicBase("PatchCapacitor");
    public static ElectronicBase PatchDiode      = new ElectronicBase("PatchDiode");
    public static ElectronicBase PatchTransistor = new ElectronicBase("PatchTransistor");

    public static ElectronicBase EpoxyPlate                      = new ElectronicBase("EpoxyPlate"); //电路基板 处理器主板
    public static ElectronicBase EpoxyCircuitBoard               = new ElectronicBase("EpoxyCircuitBoard");
    public static ElectronicBase FabricStrengthenedCircuitBoard  = new ElectronicBase("FabricStrengthenedCircuitBoard");
    public static ElectronicBase BioCircuitBoard                 = new ElectronicBase("BioCircuitBoard");
    public static ElectronicBase BasicProcessorMainboard         = new ElectronicBase("BasicProcessorMainboard");
    public static ElectronicBase IntermediateProcessorMainboard  = new ElectronicBase("IntermediateProcessorMainboard");
    public static ElectronicBase AdvancedProcessorMainboard      = new ElectronicBase("AdvancedProcessorMainboard");

    //Mainframes
    public static ElectronicBase Mainframe1  = new ElectronicBase("Mainframe1");
    public static ElectronicBase Mainframe2  = new ElectronicBase("Mainframe2");
    public static ElectronicBase Mainframe3  = new ElectronicBase("Mainframe3");
    public static ElectronicBase Mainframe4  = new ElectronicBase("Mainframe4");
    public static ElectronicBase Mainframe5  = new ElectronicBase("Mainframe5");
    public static ElectronicBase Mainframe6  = new ElectronicBase("Mainframe6");
    public static ElectronicBase Mainframe7  = new ElectronicBase("Mainframe7");

    public static ElectronicBase StarPlatinum = new ElectronicBase("StarPlatinum");
    public static ElectronicBase CrushedPlatinumOre = new ElectronicBase("CrushedPlatinumOre");

}
