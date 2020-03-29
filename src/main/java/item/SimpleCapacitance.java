package item;

import loaders.Loader_M_CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class SimpleCapacitance extends  Item
{
    public SimpleCapacitance(){
        this.setUnlocalizedName("SimpleCapacitance");
        this.setCreativeTab(Loader_M_CreativeTabs.ElectronicTab);
        this.setTextureName("moegadd:SimpleCapacitance");
        GameRegistry.registerItem(this, "SimpleCapacitance");
}
}
