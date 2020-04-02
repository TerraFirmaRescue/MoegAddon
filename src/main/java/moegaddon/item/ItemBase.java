package moegaddon.item;

import moegaddon.loaders.TabLoader;
import cpw.mods.fml.common.registry.GameRegistry;
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
