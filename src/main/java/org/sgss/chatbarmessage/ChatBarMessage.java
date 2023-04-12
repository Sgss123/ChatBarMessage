package org.sgss.chatbarmessage;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ChatBarMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("[ChatBarMessage] §aPlugin has been loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("[ChatBarMessage] §aPlugin has been unloaded!");
    }
}
