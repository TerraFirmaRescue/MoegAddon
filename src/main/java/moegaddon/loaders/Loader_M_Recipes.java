package moegaddon.loaders;

import static gregapi.data.CS.*;

import gregapi.data.MT;
import gregapi.data.RM;
import gregapi.util.OM;

public class Loader_M_Recipes implements Runnable{
    @Override public void run() {
        RM.Mixer.addRecipe2(T, 16,  144, OM.dust(MT.Nq, U  ), OM.dust(MT.NaNO3, U  ), OM.dust(MT.Niter, 2*U  ));

    }
}
