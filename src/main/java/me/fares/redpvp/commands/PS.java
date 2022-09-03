package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PS implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] s1) {


        if (sender instanceof Player) {

            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("ps")) {

                p.sendMessage((RedPvP.PREFIX) + "§7━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                p.sendMessage((RedPvP.PREFIX) + " §eNewBie I §f» 0 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §eNewBie III §f» 500 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §eBronze V §f» 600 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §8Silver I §f» 750 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §8Silver III §f» 900 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §8Silver V §f» 1000 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §6Gold I §f» 1250 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §6Gold III §f» 1400 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §6Gold V §f» 1650 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §3Platinum I §f» 1800 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §3Platinum III §f» 2000 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §3Platinum V §f» 2250 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §bDiamond I §f» 2600 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §bDiamond III §f» 2900 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §bDiamond V §f» 3250 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §4Champion I §f» 3650 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §4Champion III §f» 4000 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §4Champion V §f» 4500 §bKills");
                p.sendMessage((RedPvP.PREFIX) + " §f❂ The Master §f» 5000 §bKills");
                p.sendMessage((RedPvP.PREFIX) + "§7━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                p.sendMessage((RedPvP.PREFIX) + " §7Next Ps » " + RedPvP.getInstance().getNextPS().getPs(p));
            }

        } else {
            sender.sendMessage(RedPvP.PREFIX + "§cYou need Player to send this command");
            return true;

        }

        return true;
    }
}
