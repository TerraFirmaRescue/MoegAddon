package moegaddon.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import moegaddon.MoegAddon;
import moegaddon.loaders.TabLoader;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraft.util.IIcon;

public class BlockBoneMarrow extends BlockFluidClassic {



    public BlockBoneMarrow() {
        super(MoegAddon.BoneMarrow, Material.water);
        setCreativeTab(TabLoader.BlockTab);
        setBlockName("Bone Marrow");
    }

    @SideOnly(Side.CLIENT)
    protected IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;

    @Override
    public IIcon getIcon(int side, int meta) {
        return (side == 0 || side == 1)? stillIcon : flowingIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register){
        stillIcon = register.registerIcon("moegadd:fluids/BoneMarrow");
        flowingIcon = register.registerIcon("moegadd:fluids/BoneMarrow");
    }

    @Override
    public boolean canDisplace(IBlockAccess world, int x, int y, int z) {

        if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;

        return super.canDisplace(world, x, y, z);

    }


    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {

        if (world.getBlock(x, y, z).getMaterial().isLiquid()) return false;

        return super.displaceIfPossible(world, x, y, z);

    }
}
