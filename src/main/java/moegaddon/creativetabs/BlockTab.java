package moegaddon.creativetabs;

import moegaddon.loaders.ItemLoader;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockTab extends CreativeTabs {

    public BlockTab() {
        super("BlockTab");
    }

    public Item getTabIconItem()
    {
        return ItemLoader.Simpleresistance;
    }
}
