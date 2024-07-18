package org.ondraeu.trashcan.Commands;

import org.bukkit.entity.Player;
import org.ondraeu.trashcan.TrashCan;
import org.ondraeu.trashcan.Util.Util;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class reload implements CommandExecutor {
    public reload() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if (sender.hasPermission("tc.admin.reload") && args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            TrashCan.getInstance().reloadConfig();
            sender.sendMessage(Util.getString("Reload"));
            }

        return true;
    }

}




