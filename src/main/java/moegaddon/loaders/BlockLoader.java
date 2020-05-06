package moegaddon.loaders;

import moegaddon.block.*;

public class BlockLoader {

    //巨型机相关
    public static final MainframeCluster MAINFRAME_CLUSTER_1 = new MainframeCluster("MainframeCluster1", "MainframeCluster1/");
    public static final MainframeCluster MAINFRAME_CLUSTER_2 = new MainframeCluster("MainframeCluster2", "MainframeCluster2/");
    public static final MainframeCluster MAINFRAME_CLUSTER_3 = new MainframeCluster("MainframeCluster3", "MainframeCluster3/");
    public static final MainframeCluster MAINFRAME_CLUSTER_4 = new MainframeCluster("MainframeCluster4", "MainframeCluster4/");
    public static final MainframeCluster MAINFRAME_CLUSTER_5 = new MainframeCluster("MainframeCluster5", "MainframeCluster5/");
    public static final MainframeCluster MAINFRAME_CLUSTER_6 = new MainframeCluster("MainframeCluster6", "MainframeCluster6/");
    public static final MainframeCluster MAINFRAME_CLUSTER_7 = new MainframeCluster("MainframeCluster7", "MainframeCluster7/");

    //矿物相关
    public static final FlammableiceBlock FlammableiceBlock = new FlammableiceBlock();
    public static final OreBase PlacerPlatinumOre = new OreBase("PlacerPlatinumOre", 2, "shovel"); //砂铂矿
    public static final OreBase BraggiteOre       = new OreBase("BraggiteOre", 2, "pickaxe"); //硫镍钯铂矿
    public static final OreBase AtokiteOre           = new OreBase("AtokiteOre", 2, "pickaxe"); //锡铅钯铂矿
    public static final OreBase MasloviteOre         = new OreBase("MasloviteOre", 2, "pickaxe"); //碲铋铂钯矿
    public static final OreBase OsmiridiumOre     = new OreBase("OsmiridiumOre", 2, "pickaxe"); //锇铱矿

}
