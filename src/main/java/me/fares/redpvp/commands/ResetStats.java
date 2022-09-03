package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ResetStats implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String args2, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;

            if (p.hasPermission("redpvp.reset")) {

                if (args.length == 1) {
                    Player t = Bukkit.getPlayer(args[0]);


                    @SuppressWarnings("deprecation")
                    OfflinePlayer tofline = Bukkit.getOfflinePlayer(args[0]);

                    if (!tofline.isOnline()) {

                        p.sendMessage(RedPvP.PREFIX + "§c" + tofline.getName() + "§a stats have been reset !");
                        p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);


                        RedPvP.getInstance().getKills().setKillRedPvP(tofline, 0);
                        RedPvP.getInstance().getDeaths().setDeathRedPvP(tofline, 0);

                        return true;
                    }

                    if (t.isOnline()) {
                        RedPvP.getInstance().getKills().setKillRedPvP(t, 0);
                        RedPvP.getInstance().getDeaths().setDeathRedPvP(t, 0);

                        p.sendMessage(RedPvP.PREFIX + "§c" + t.getName() + "§a stats have been reset !");
                        t.sendMessage(RedPvP.PREFIX + "§eYour stats have been reset");
                        p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                        return true;

                    }
                }

                if (args.length == 0) {
                    RedPvP.getInstance().getKills().setKillRedPvP(p, 0);
                    RedPvP.getInstance().getDeaths().setDeathRedPvP(p, 0);


                    p.sendMessage(RedPvP.PREFIX + "§eYour stats have been reset");
                    p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);

                    return true;

                }

                if (args.length >= 2) {

                    p.sendMessage(RedPvP.USAGE + "§c /reset [Name] | /reset");
                    return true;
                }

            } else {
                p.sendMessage(RedPvP.NO_PERMS);
            }

        } else {
            sender.sendMessage(RedPvP.PREFIX + "§cYou need a player to do is");
            return true;
        }


        return true;
    }
}
