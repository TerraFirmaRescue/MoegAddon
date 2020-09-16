package moegaddon.login;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import moegaddon.MoegAddon;
import moegaddon.config.MoegAddonConfig;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public class LoginHandler {

    @SuppressWarnings("unused")
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event)
    {
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD +  "=================================================" ));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD +  "   " + MoegAddon.translate("text.login.0") + " " + EnumChatFormatting.AQUA + EnumChatFormatting.BOLD + MoegAddonConfig.ModPackVersion));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN +  "    " + MoegAddon.translate("text.login.1")));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BLUE + "    " + MoegAddon.translate("text.login.2")));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.RED + "    " +  MoegAddon.translate("text.login.3")));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.WHITE + "    " + MoegAddon.translate("text.login.4")));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.WHITE + "    " + MoegAddon.translate("text.login.5")));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW + "    " + MoegAddon.translate("text.login.6")));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW + "    " + MoegAddon.translate("text.login.7")));
        event.player.addChatMessage(new ChatComponentText(EnumChatFormatting.BOLD +  "==================================================" ));
    }
}
