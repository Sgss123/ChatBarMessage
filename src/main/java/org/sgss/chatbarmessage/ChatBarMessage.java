package org.sgss.chatbarmessage;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatBarMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Plugin has been loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Plugin has been unloaded!");
    }
}
