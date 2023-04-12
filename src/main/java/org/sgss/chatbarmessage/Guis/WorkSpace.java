package org.sgss.chatbarmessage.Guis;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;

public class WorkSpace implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Inventory inventory = Bukkit.createInventory(null, InventoryType.WORKBENCH, "§e工作台");
        return false;
    }
}
