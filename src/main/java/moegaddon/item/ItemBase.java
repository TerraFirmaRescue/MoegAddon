package moegaddon.item;

import cpw.mods.fml.common.registry.GameRegistry;
import moegaddon.loaders.TabLoader;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name) {
        super();
        this.setCreativeTab(TabLoader.ElectronicTab);
        this.setUnlocalizedName(name);
        this.setTextureName("moegadd:" + name);
        GameRegistry.registerItem(this, name);
    }

}
