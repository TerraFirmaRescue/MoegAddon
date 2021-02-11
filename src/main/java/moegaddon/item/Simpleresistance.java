package moegaddon.item;


import cpw.mods.fml.common.registry.GameRegistry;
import moegaddon.loaders.TabLoader;
import net.minecraft.item.Item;

public class Simpleresistance extends Item {
    {
        this.setUnlocalizedName("Simpleresistance");
        this.setCreativeTab(TabLoader.ElectronicTab);
        this.setTextureName("moegadd:SimpleResistance");
        GameRegistry.registerItem(this, "Simpleresistance");
    }

}
