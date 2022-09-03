package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Stats implements CommandExecutor {
    public boolean onCommand(CommandSender s, Command arg1, String arg2, String[] args) {


        if (s instanceof Player) {

            Player p = (Player) s;


            if (args.length == 1) {

                @SuppressWarnings("deprecation")


                String t = args[0];
                if (RedPvP.getInstance().getKills().isRegistered(t) && RedPvP.getInstance().getDeaths().isRegistered(t)) {

                    if (Bukkit.getPlayer(t) != null) {
                        Player target = Bukkit.getPlayer(t);
                        RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(target);
                        p.sendMessage(RedPvP.PREFIX + "§7§l§m==========§7§l(§a " + t + " §aStats §7§l)§7§l§m==========" + "\n" +
                                RedPvP.PREFIX + "§8⌘ §3§lKills §8» §7" + player.getKills() + "\n" +
                                RedPvP.PREFIX + "§8⌘ §6§lDeaths §8» §7" + player.getDeaths() + "\n" +
                                RedPvP.PREFIX + "§8⌘ §6§lFire §8» §7" + player.getPoints() + "\n" +
                                RedPvP.PREFIX + "§8⌘ §a§lKD §8» §7" + RedPvP.getInstance().getKills().getKD(t));

                        return true;

                    }

                    p.sendMessage(RedPvP.PREFIX + "§7§l§m==========§7§l(§a " + t + " §aStats §7§l)§7§l§m==========" + "\n" +
                            RedPvP.PREFIX + "§8⌘ §3§lKills §8» §7" + RedPvP.getInstance().getKills().getKillRedPvP(t) + "\n" +
                            RedPvP.PREFIX + "§8⌘ §6§lDeaths §8» §7" + RedPvP.getInstance().getDeaths().getDeathRedPvP(t) + "\n" +
                            RedPvP.PREFIX + "§8⌘ §6§lFire §8» §7" + RedPvP.getInstance().getPoints().getPointsRedPvP(t) + "\n" +
                            RedPvP.PREFIX + "§8⌘ §a§lKD §8» §7" + RedPvP.getInstance().getKills().getKD(t));

                    return true;


                } else {
                    p.sendMessage(RedPvP.NOT_FOUND);
                }
            }

            if (args.length == 0) {

                RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
                p.sendMessage(RedPvP.PREFIX + "§7§l§m==========§7§l(§a " + p.getName() + " §aStats §7§l)§7§l§m==========" + "\n" +
                        RedPvP.PREFIX + "§8⌘ §3§lKills §8» §7" + player.getKills() + "\n" +
                        RedPvP.PREFIX + "§8⌘ §6§lDeaths §8» §7" + player.getDeaths() + "\n" +
                        RedPvP.PREFIX + "§8⌘ §6§lFire §8» §7" + player.getPoints() + "\n" +
                        RedPvP.PREFIX + "§8⌘ §a§lKD §8» §7" + RedPvP.getInstance().getKills().getKD(p));

                return true;

            }

            if (args.length >= 2) {
                p.sendMessage(RedPvP.PREFIX + "§c/stats §7| §c/stats [Name]");
            }


        } else {
            s.sendMessage(RedPvP.PREFIX + "§cYou need Player to send this command");
            return true;

        }

        return true;
    }
}
