package item;

import Main.TabLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ElectronicBase extends Item {

    public ElectronicBase(String name) {
        this.setCreativeTab(TabLoader.ElectronicTab);
        this.setUnlocalizedName("moegaddon." + name);
        this.setTextureName("moegadd:" + name);
        GameRegistry.registerItem(this, name);
    }
}
