package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Setlocation implements CommandExecutor {

    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {


        if (s instanceof Player) {

            Player p = (Player) s;

            if (p.hasPermission("redpvp.location")) {
                if (args.length == 0) {
                    p.sendMessage(RedPvP.PREFIX + "§c/set NameLocation ");
                    return true;

                }
                if (args.length == 1) {
                    String name = args[0];
                    RedPvP.getInstance().setWarp(p.getLocation().getBlock().getLocation(), name);
                    p.sendMessage(RedPvP.PREFIX + "§b The location §3" + name + " §bhas been save.");
                    return true;
                }


                if (args.length >= 2) {

                    p.sendMessage(RedPvP.PREFIX + "§c/set NameLocation ");
                    return true;

                }

            } else {
                p.sendMessage(RedPvP.NO_PERMS);
            }
        } else {

            s.sendMessage(RedPvP.PREFIX + "§cYou need a player to do it");
            return true;
        }


        return true;


    }

}
	
 
