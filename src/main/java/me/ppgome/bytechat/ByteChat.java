package me.ppgome.bytechat;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIBukkitConfig;
import me.ppgome.bytechat.commands.ChatColourModifier;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 * The primary class which is an instance of the plugin.
 * @author  Keelan Delorme
 * @version 1.0
 */
public final class ByteChat extends JavaPlugin {

    private static ByteChat plugin;

    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIBukkitConfig(this).silentLogs(true));
        ChatColourModifier.ChatColourCommand();
    }

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        CommandAPI.onEnable();

        Bukkit.getServer().getLogger().log(Level.ALL, "Plugin successfully loaded!");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        CommandAPI.onDisable();
    }

    /**
     * A method for getting an instance of the plugin.
     * @return instance of the plugin
     */
    public static ByteChat getPlugin() { return plugin; }

}
