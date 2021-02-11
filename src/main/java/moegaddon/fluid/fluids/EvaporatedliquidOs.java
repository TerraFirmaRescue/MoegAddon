package moegaddon.fluid.fluids;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import moegaddon.fluid.fluidBlocks.BLOCK_EvaporatedliquidOs;
import net.minecraft.util.IIcon;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class EvaporatedliquidOs extends Fluid {
    public EvaporatedliquidOs(String name) {
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
        return BLOCK_EvaporatedliquidOs.stillIcon;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getFlowingIcon() {
        return BLOCK_EvaporatedliquidOs.flowingIcon;
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon() {
        return getStillIcon();
    }
}
