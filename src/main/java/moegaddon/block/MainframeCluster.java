package moegaddon.block;

import moegaddon.loaders.TabLoader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class MainframeCluster extends Block{

    public MainframeCluster(String name, String texturePath) {
        super(Material.iron);
        this.setCreativeTab(TabLoader.BlockTab);
        this.setStepSound(soundTypeMetal);
        this.setHarvestLevel("pickaxe", 1);
        this.setBlockName(name);
        this.setBlockTextureName("moegadd:" + texturePath);
        this.setHardness(1.0F);
        this.setResistance(3.0F);
        this.setLightLevel(0.5F);
        GameRegistry.registerBlock(this, name);
    }

    public IIcon[] icons = new IIcon[6];

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        this.icons[0] = reg.registerIcon(this.textureName + "bottom");
        this.icons[1] = reg.registerIcon(this.textureName + "top");
        this.icons[2] = reg.registerIcon(this.textureName + "front");
        this.icons[3] = reg.registerIcon(this.textureName + "left");
        this.icons[4] = reg.registerIcon(this.textureName + "back");
        this.icons[5] = reg.registerIcon(this.textureName + "right");
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

    /*
    @Override
    public int getBlockTextureFromSide(int side)
    {
        if (side == 0)
        {
            return 0;
        }
        else if (side == 1)
        {
            return 1;
        }
        else if (side == 2)
        {
            return 2;
        }
        else if (side == 3)
        {
            return 3;
        }
        else if (side == 4)
        {
            return 4;
        }
        else if (side == 5)
        {
            return 5;
        }
        else
        {
            return 6;
        }
    }
    */
}
