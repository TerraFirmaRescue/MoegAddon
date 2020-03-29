package moegaddon.creativetabs;

import moegaddon.loaders.Loader_Simple_Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockTab extends CreativeTabs {

    public BlockTab() {
        super("BlockTab");
    }

    public Item getTabIconItem()
    {
        return Loader_Simple_Items.Simpleresistance;
    }
}
