package block;

import loaders.TabLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FlammableiceBlock extends Block{

	public FlammableiceBlock() {
		super(Material.rock);
	    this.setBlockName("Flammableice");
	    this.setHardness(0.5F);
	    this.setStepSound(soundTypeGlass);
	    this.setHarvestLevel("pickaxe", 1);
	    this.setCreativeTab(TabLoader.BlockTab);
	    this.setBlockTextureName("moegadd:flammableiceblock");
	    GameRegistry.registerBlock(this,"Flammableice");
	}


}
