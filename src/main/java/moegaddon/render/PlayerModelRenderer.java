package moegaddon.render;

import java.util.Collection;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;

import static moegaddon.MoegAddon.RES_PATH;

public class PlayerModelRenderer extends RenderPlayer {
    private final ResourceLocation[] mResources = new ResourceLocation[] {new ResourceLocation(RES_PATH + "model/Dev.png"), new ResourceLocation(RES_PATH + "model/Silver.png"), new ResourceLocation(RES_PATH + "model/Gold.png"), new ResourceLocation(RES_PATH + "model/MECSup1.png"), new ResourceLocation(RES_PATH + "model/MECSup2.png"), new ResourceLocation(RES_PATH + "model/MECSup3.png"), new ResourceLocation(RES_PATH + "model/MECSup4.png"), new ResourceLocation(RES_PATH + "model/MECSup5.png")};
    private final Collection<String> mSupporterListSilver, mSupporterListGold, mSupporterListMEC1, mSupporterListMEC2, mSupporterListMEC3, mSupporterListMEC4, mSupporterListMEC5;

    public PlayerModelRenderer(Collection<String> aSupporterListSilver, Collection<String> aSupporterListGold, Collection<String> aSupporterListMEC1, Collection<String> aSupporterListMEC2, Collection<String> aSupporterListMEC3, Collection<String> aSupporterListMEC4, Collection<String> aSupporterListMEC5) {
        mSupporterListSilver = aSupporterListSilver;
        mSupporterListGold = aSupporterListGold;
        mSupporterListMEC1 = aSupporterListMEC1;
        mSupporterListMEC2 = aSupporterListMEC2;
        mSupporterListMEC3 = aSupporterListMEC3;
        mSupporterListMEC4 = aSupporterListMEC4;
        mSupporterListMEC5 = aSupporterListMEC5;
        setRenderManager(RenderManager.instance);
    }

    private ResourceLocation getResource(String aPlayer) {
        aPlayer = aPlayer.toLowerCase();
        if (aPlayer.equalsIgnoreCase("Yuesha_Kev14"))   return mResources[0];
        if (aPlayer.equalsIgnoreCase("YueSha"))   return mResources[0];
        if (aPlayer.equalsIgnoreCase("Evanvenir"))   	return mResources[0];
        if (aPlayer.equalsIgnoreCase("Evan"))   	return mResources[0];
        if (aPlayer.equalsIgnoreCase("duck_egg"))     return mResources[0];
        if (aPlayer.equalsIgnoreCase("dashuaibia"))       return mResources[0];
        if (aPlayer.equalsIgnoreCase("HDHDHD_"))     return mResources[0];
        if (aPlayer.equalsIgnoreCase("lei_yu"))     return mResources[0];
        if (aPlayer.equalsIgnoreCase("Draculea"))     return mResources[0];
        if (aPlayer.equalsIgnoreCase("Lazy_ou"))     return mResources[0];
        if (mSupporterListGold.contains(aPlayer))       return mResources[2];
        if (mSupporterListSilver.contains(aPlayer))     return mResources[1];
        if (mSupporterListMEC1.contains(aPlayer))     return mResources[3];
        if (mSupporterListMEC2.contains(aPlayer))     return mResources[4];
        if (mSupporterListMEC3.contains(aPlayer))     return mResources[5];
        if (mSupporterListMEC4.contains(aPlayer))     return mResources[6];
        if (mSupporterListMEC5.contains(aPlayer))     return mResources[7];
        return null;
    }

    public void receiveRenderSpecialsEvent(RenderPlayerEvent.Specials.Pre aEvent) {
        AbstractClientPlayer aPlayer = (AbstractClientPlayer)aEvent.entityPlayer;
        float aPartialTicks = aEvent.partialRenderTick;

        if (aPlayer.isInvisible() || aPlayer.getActivePotionEffect(Potion.invisibility) != null) return;

        try {
            ResourceLocation tResource = getResource(aPlayer.getCommandSenderName());
            if (tResource == null) tResource = getResource(aPlayer.getUniqueID().toString());

            if (tResource != null && !aPlayer.getHideCape()) {
                bindTexture(tResource);
                GL11.glPushMatrix();
                GL11.glTranslatef(0.0F, 0.0F, 0.125F);
                double d0 = aPlayer.field_71091_bM + (aPlayer.field_71094_bP - aPlayer.field_71091_bM) * aPartialTicks - (aPlayer.prevPosX + (aPlayer.posX - aPlayer.prevPosX) * aPartialTicks);
                double d1 = aPlayer.field_71096_bN + (aPlayer.field_71095_bQ - aPlayer.field_71096_bN) * aPartialTicks - (aPlayer.prevPosY + (aPlayer.posY - aPlayer.prevPosY) * aPartialTicks);
                double d2 = aPlayer.field_71097_bO + (aPlayer.field_71085_bR - aPlayer.field_71097_bO) * aPartialTicks - (aPlayer.prevPosZ + (aPlayer.posZ - aPlayer.prevPosZ) * aPartialTicks);
                float f6 = aPlayer.prevRenderYawOffset + (aPlayer.renderYawOffset - aPlayer.prevRenderYawOffset) * aPartialTicks;
                double d3 = MathHelper.sin(f6 * (float)Math.PI / 180.0F);
                double d4 = (-MathHelper.cos(f6 * (float)Math.PI / 180.0F));
                float f7 = (float)d1 * 10.0F;
                float f8 = (float)(d0 * d3 + d2 * d4) * 100.0F;
                float f9 = (float)(d0 * d4 - d2 * d3) * 100.0F;
                if (f7 < -6.0F) f7 = -6.0F;
                if (f7 > 32.0F) f7 = 32.0F;
                if (f8 <  0.0F) f8 =  0.0F;
                float f10 = aPlayer.prevCameraYaw + (aPlayer.cameraYaw - aPlayer.prevCameraYaw) * aPartialTicks;
                f7 += MathHelper.sin((aPlayer.prevDistanceWalkedModified + (aPlayer.distanceWalkedModified - aPlayer.prevDistanceWalkedModified) * aPartialTicks) * 6.0F) * 32.0F * f10;
                if (aPlayer.isSneaking()) {
                    f7 += 25.0F;
                }
                GL11.glRotatef(6.0F + f8 / 2.0F + f7, 1.0F, 0.0F, 0.0F);
                GL11.glRotatef(f9 / 2.0F, 0.0F, 0.0F, 1.0F);
                GL11.glRotatef(-f9 / 2.0F, 0.0F, 1.0F, 0.0F);
                GL11.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
                ((ModelBiped)mainModel).renderCloak(0.0625F);
                GL11.glPopMatrix();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
