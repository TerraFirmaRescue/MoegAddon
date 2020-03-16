package item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import gregapi.data.MT;

public class Flammableice extends Item {{

	this.setUnlocalizedName("FlammableIce");
    this.setCreativeTab(CreativeTabs.tabRedstone);
    GameRegistry.registerItem(this, "FlammableIce");
	}

}
