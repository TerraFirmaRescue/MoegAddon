package moegaddon.item;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBase extends Fluid{
    public static final ResourceLocation still = new ResourceLocation("moegadd:" + "fluid");
          public FluidBase (String name)
        {
            super(name);
            this.setUnlocalizedName(name);
            this.setDensity(1000);
            this.setViscosity(1000);
            this.setLuminosity(0);
            this.setTemperature(300);
        }
    }
    /*
    我不知道怎么改了
    咕了
     */
