package moegaddon.item;

import moegaddon.loaders.Loader_M_CreativeTabs;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ElectronicBase extends Item {

    public ElectronicBase(String name) {
        super();
        this.setCreativeTab(Loader_M_CreativeTabs.ElectronicTab);
        this.setUnlocalizedName(name);
        this.setTextureName("moegadd:" + name);
        GameRegistry.registerItem(this, name);
    }

}
