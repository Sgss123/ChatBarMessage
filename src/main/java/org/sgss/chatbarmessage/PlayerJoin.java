package org.sgss.chatbarmessage;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener {
    @EventHandler
    public void OnJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();
    }
}


