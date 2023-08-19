package me.ppgome.bytechat;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIBukkitConfig;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The primary class which is an instance of the plugin.
 * @author  Keelan Delorme
 * @version 1.0
 */
public final class ByteChat extends JavaPlugin {

    @Override
    public void onLoad() { CommandAPI.onLoad(new CommandAPIBukkitConfig(this).silentLogs(true)); }

    @Override
    public void onEnable() {
        // Plugin startup logic
        CommandAPI.onEnable();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        CommandAPI.onDisable();
    }

    public ByteChat getPlugin() { return this; }

}
