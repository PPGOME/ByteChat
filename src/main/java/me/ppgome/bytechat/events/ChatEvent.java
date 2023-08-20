package me.ppgome.bytechat.events;

import io.papermc.paper.event.player.AsyncChatEvent;
import me.ppgome.bytechat.PlayerInteractor;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ChatEvent implements Listener {

    PlayerInteractor interactor;

    @EventHandler
    public void onChat(AsyncChatEvent e) {
        Player p = e.getPlayer();
        interactor = new PlayerInteractor(p);
        String hexcode = interactor.getChatColour();

        for(Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(e.message().color(TextColor.fromHexString(hexcode)));
        }
    }

}
