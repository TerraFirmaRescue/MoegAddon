package moegaddon.item;

import cpw.mods.fml.common.registry.GameRegistry;
import moegaddon.loaders.TabLoader;
import net.minecraft.item.Item;

public class SimpleCapacitance extends Item {
    public SimpleCapacitance() {
        this.setUnlocalizedName("SimpleCapacitance");
        this.setCreativeTab(TabLoader.ElectronicTab);
        this.setTextureName("moegadd:SimpleCapacitance");
        GameRegistry.registerItem(this, "SimpleCapacitance");
    }
}
