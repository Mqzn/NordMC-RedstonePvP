package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Spawn implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if (sender instanceof Player) {


            Player p = (Player) sender;


            if (RedPvP.getInstance().getCombat().CombatTite.containsKey(p)) {
                p.sendMessage(RedPvP.PREFIX + "§cYou are in combat");

            } else {
                RedPvP.getInstance().getWaitSpawn().Timetiteleport.put(p, 5);
                p.sendMessage(RedPvP.PREFIX + "§aYou will teleport to spawn in §c5(s) §aplease don`t move");
            }


        } else {
            sender.sendMessage(RedPvP.PREFIX + "§cYou need Player to send this command");
        }


        return false;
    }
}

