package moegaddon.fluid.fluids;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import moegaddon.fluid.fluidBlocks.BLOCK_MSCBasalMedium;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class MSCBasalMedium extends Fluid {
    public MSCBasalMedium(String name) {
        super(name);
        this.setUnlocalizedName(name);
        this.setDensity(1000);
        this.setViscosity(1000);
        this.setLuminosity(0);
        this.setTemperature(300);
        FluidRegistry.registerFluid(this);
    }

    @SideOnly(Side.CLIENT)

    public IIcon getStillIcon() {
        return BLOCK_MSCBasalMedium.stillIcon;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getFlowingIcon() {
        return BLOCK_MSCBasalMedium.flowingIcon;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon() {
        return getStillIcon();
    }
}
