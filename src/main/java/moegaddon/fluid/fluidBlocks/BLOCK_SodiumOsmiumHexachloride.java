package moegaddon.fluid.fluidBlocks;

        import cpw.mods.fml.common.registry.GameRegistry;
        import cpw.mods.fml.relauncher.Side;
        import cpw.mods.fml.relauncher.SideOnly;
        import moegaddon.loaders.TabLoader;
        import net.minecraft.block.material.Material;
        import net.minecraft.client.renderer.texture.IIconRegister;
        import net.minecraft.util.IIcon;
        import net.minecraft.world.IBlockAccess;
        import net.minecraft.world.World;
        import net.minecraftforge.fluids.BlockFluidClassic;
        import net.minecraftforge.fluids.Fluid;

public class BLOCK_SodiumOsmiumHexachloride extends BlockFluidClassic {

    @SideOnly(Side.CLIENT)
    public static IIcon stillIcon;
    @SideOnly(Side.CLIENT)
    public static IIcon flowingIcon;

    public String fluidBlockName;

    public BLOCK_SodiumOsmiumHexachloride(Fluid fluid, String blockName) {
        super(fluid, Material.water);
        setCreativeTab(TabLoader.BlockTab);
        setBlockName(blockName);
        GameRegistry.registerBlock(this, blockName);
        this.fluidBlockName = blockName;
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return (side == 0 || side == 1) ? stillIcon : flowingIcon;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register) {
        stillIcon = register.registerIcon("moegadd:fluids/" + this.fluidBlockName);
        flowingIcon = register.registerIcon("moegadd:fluids/" + this.fluidBlockName);
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