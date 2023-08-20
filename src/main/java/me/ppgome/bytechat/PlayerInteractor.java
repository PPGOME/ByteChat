package me.ppgome.bytechat;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.logging.Level;

public class PlayerInteractor {

    final static ByteChat plugin = ByteChat.getPlugin();

    public static void setChatColour(Player p, String hexcode) {
        NamespacedKey code = new NamespacedKey(plugin, "chat-hex");
        p.getPersistentDataContainer().set(code, PersistentDataType.STRING, hexcode);
    }

    public static String getChatColour(Player p) {
        NamespacedKey code = new NamespacedKey(plugin, "chat-hex");
        PersistentDataContainer container = p.getPersistentDataContainer();
        if(container.has(code, PersistentDataType.STRING)) {
            return container.get(code, PersistentDataType.STRING);
        }
        else {
            String warning = "Player " + p.getName() + " failed a colour fetch. Setting their colour to WHITE (#ffffff)";
            container.set(code, PersistentDataType.STRING, "#ffffff");
            Bukkit.getServer().getLogger().log(Level.WARNING, warning) ;
        }
        return null;
    }

}
