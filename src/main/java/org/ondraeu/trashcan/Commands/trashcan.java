package org.ondraeu.trashcan.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.ondraeu.trashcan.Util.Util;

public class trashcan implements CommandExecutor {
    public trashcan() {
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player)sender;
        if (command.getName().equalsIgnoreCase("trash")) {
            if (p.hasPermission("tc.command.trash")) {
                Inventory inv = Bukkit.getServer().createInventory(p, 27, "Trash");
                p.openInventory(inv);
            } else {
                p.sendMessage(Util.getString("Trash"));
            }
        }
        return true;
    }
}