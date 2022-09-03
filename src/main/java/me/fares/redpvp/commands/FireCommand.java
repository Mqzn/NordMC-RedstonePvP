package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FireCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender.hasPermission("fire.use")) {
            if (args.length == 0) {
                sender.sendMessage("fire");
                return true;
            } else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("add")) {
                    sender.sendMessage("§c/fire add <player> <amount>");
                } else if (args[0].equalsIgnoreCase("remove")) {
                    sender.sendMessage("§c/fire remove <player> <amount>");
                }
            } else if (args.length == 2) {
                @SuppressWarnings("deprecation")
                Player p = Bukkit.getServer().getPlayer(args[1]);
                if (p != null || p.hasPlayedBefore()) {
                    sender.sendMessage("§c/fire add " + p.getPlayer() + " <amount>");
                }
            } else if (args.length == 3) {
                @SuppressWarnings("deprecation")
                Player t = Bukkit.getServer().getPlayer(args[1]);
                RedPvPPlayer p = RedPvP.getInstance().getredpvpplayer().get(t);
                int amount = Integer.parseInt(args[2]);
                if (args[0].equalsIgnoreCase("add")) {
                    p.addPoints(amount);
                    
                    return true;
                } else {
                    sender.sendMessage(RedPvP.NO_PERMS);
                }
            }
        }
        return false;
    }
}
