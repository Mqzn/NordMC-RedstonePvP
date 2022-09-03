package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Trash implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] s1) {


        if (sender instanceof Player) {

            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("trash")) {
                Inventory trash = Bukkit.createInventory(null, 45, "Trash");
                p.openInventory(trash);
            }

        } else {
            sender.sendMessage(RedPvP.PREFIX + "§cYou need Player to send this command");
            return true;

        }

        return true;
    }
}