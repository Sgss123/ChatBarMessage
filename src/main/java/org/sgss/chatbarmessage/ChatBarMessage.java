package org.sgss.chatbarmessage;

import org.bukkit.plugin.java.JavaPlugin;

public final class ChatBarMessage extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("聊天栏优化插件已加载!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("聊天栏优化插件已卸载!");
    }
}
