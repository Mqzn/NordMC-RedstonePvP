package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetSpawn implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (sender instanceof Player) {


            Player p = (Player) sender;

            if (p.hasPermission("skypvp.sp")) {

                RedPvP.getInstance().setWarp(p.getLocation(), "Spawn");

                p.sendMessage(RedPvP.PREFIX + "§aSpawn has been set");
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);

            } else {
                p.sendMessage(RedPvP.NO_PERMS);
            }

        } else {
            sender.sendMessage(RedPvP.PREFIX + "§cYou need Player to send this command");
        }

        return true;


    }

}
	
 
