package item;

import loaders.TabLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class SimpleCapacitance extends  Item
{
    public SimpleCapacitance(){
        this.setUnlocalizedName("SimpleCapacitance");
        this.setCreativeTab(TabLoader.ElectronicTab);
        this.setTextureName("moegadd:SimpleCapacitance");
        GameRegistry.registerItem(this, "SimpleCapacitance");
}
}
