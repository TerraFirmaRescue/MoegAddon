package moegaddon.fluid;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class MoegaddFluid extends Fluid {

    public MoegaddFluid(String name) {
        super(name);
        this.setUnlocalizedName(name);
        this.setDensity(1000);
        this.setViscosity(1000);
        this.setLuminosity(0);
        this.setTemperature(300);
        FluidRegistry.registerFluid(this);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon() {
        return getStillIcon();
    }

    @SideOnly(Side.CLIENT)
    public IIcon getStillIcon() {
        return BlockMoegaddFluid.stillIcon;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getFlowingIcon() {
        return BlockMoegaddFluid.flowingIcon;
    }
}
