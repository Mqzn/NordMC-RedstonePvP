package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Top implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String arg2, String[] args) {


        if (s instanceof Player) {

            Player p = (Player) s;


            if (args.length == 0) {

                RedPvP.getInstance().getKills().getTopPlayers(p);
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                return true;

            }
            if (args.length >= 1) {

                p.sendMessage(RedPvP.PREFIX + "§c/Top");
                return true;

            }


        } else {
            s.sendMessage(RedPvP.PREFIX + "§cYou need a player to do it");
            return true;
        }


        return false;
    }
}

