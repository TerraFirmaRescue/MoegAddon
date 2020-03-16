package creativetabs;

import Main.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElectronicTab extends CreativeTabs{


    public ElectronicTab() {   
		super("ElectronicTab");
	}

	public Item getTabIconItem()
    {
        return Main.ItemLoader.Simpleresistance;
    }
}


