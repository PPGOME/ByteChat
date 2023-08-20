package me.ppgome.bytechat.commands;

import dev.jorel.commandapi.CommandAPICommand;
import dev.jorel.commandapi.arguments.StringArgument;
import dev.jorel.commandapi.arguments.TextArgument;
import me.ppgome.bytechat.PlayerInteractor;
import org.bukkit.entity.Player;

public class ChatColourModifier {

    private static PlayerInteractor interactor;

    public static void ChatColourCommand() {
        new CommandAPICommand("chatcolour")
                .withArguments(new StringArgument("hex-code"))
                .withAliases("chatcolor")
                .withPermission("bytechat.chatcolour")
                .executes(((sender, args) -> {
                    interactor = new PlayerInteractor((Player) sender);
                }))
                .register();
    }

}
