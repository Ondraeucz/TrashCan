package org.ondraeu.trashcan;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.ondraeu.trashcan.Commands.reload;
import org.ondraeu.trashcan.Commands.trashcan;

public final class TrashCan extends JavaPlugin implements Listener {
    private static TrashCan instance;

    public TrashCan() {
    }

    public void onEnable() {
        this.getLogger().info("---------------------------------------");
        this.getLogger().info("TrashCan 1.0-SNAPSHOT version - ENABLE");
        this.getLogger().info("---------------------------------------");
        instance = this;
        this.saveDefaultConfig();

        Bukkit.getServer().getPluginManager().registerEvents(this, this);
        this.getCommand("trashcan").setExecutor(new reload());
        this.getCommand("trash").setExecutor(new trashcan());
    }

    public void onDisable() {
        this.getLogger().info("---------------------------------------");
        this.getLogger().info("TrashCan 1.0-SNAPSHOT version - DISABLE");
        this.getLogger().info("---------------------------------------");
    }

        public static TrashCan getInstance() {
            return instance;
        }
    }

