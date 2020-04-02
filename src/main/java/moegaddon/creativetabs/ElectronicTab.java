package moegaddon.creativetabs;

import moegaddon.loaders.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ElectronicTab extends CreativeTabs{


    public ElectronicTab() {   
		super("ElectronicTab");
	}

	public Item getTabIconItem()
    {
        return ItemLoader.Mainframe7;
    }
}


