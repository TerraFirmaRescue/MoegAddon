package moegaddon.creativetabs;

import moegaddon.loaders.Loader_Simple_Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElectronicTab extends CreativeTabs{


    public ElectronicTab() {   
		super("ElectronicTab");
	}

	public Item getTabIconItem()
    {
        return Loader_Simple_Items.Mainframe7;
    }
}


