package moegaddon.block;

import moegaddon.loaders.TabLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreBase extends Block {

    public OreBase(String aName, int aHarvestLevel, String aTool) {
        super(Material.rock);
        this.setBlockName(aName);
        this.setHardness(3.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel(aTool, aHarvestLevel);
        this.setCreativeTab(TabLoader.BlockTab);
        this.setBlockTextureName("moegadd:" + aName);
        GameRegistry.registerBlock(this, aName);
    }

}
