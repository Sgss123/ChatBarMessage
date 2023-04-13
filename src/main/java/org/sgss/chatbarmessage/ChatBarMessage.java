package org.sgss.chatbarmessage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.sgss.chatbarmessage.Events.PlayerChat;
import org.sgss.chatbarmessage.Events.PlayerJoin;
import org.sgss.chatbarmessage.Events.PlayerQuit;

public final class ChatBarMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getConsoleSender().sendMessage("[ChatBarMessage] " + ChatColor.GREEN + "Plugin has been loaded!");
        getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
        getServer().getPluginManager().registerEvents(new PlayerChat(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getConsoleSender().sendMessage("[ChatBarMessage] " + ChatColor.GREEN + "Plugin has been unloaded!");
    }
}
