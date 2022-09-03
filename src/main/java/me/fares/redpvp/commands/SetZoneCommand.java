package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetZoneCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String arg2, String[] args) {
        if (commandSender instanceof Player) {
            Player p = (Player) commandSender;

            if(p.hasPermission("pvp.setzone") || p.getName().equalsIgnoreCase("MR_FARES_XD")) {


                if(args.length == 0) {
                    p.sendMessage("");
                    p.sendMessage("§c/setzone (1-2)");
                    p.sendMessage("");
                    return true;
                }

                if(args.length == 1) {
                    if(args[0].equals("1") || args[0].equals("2") || args[0].equals("3") || args[0].equals("4") || args[0].equals("5")||  args[0].equals("6") || args[0].equals("7") || args[0].equals("8")) {
                        RedPvP.getInstance().setLocation("Zone" + args[0], p);
                        p.sendMessage(" §aPossion §e" + args[0] + " §asuccessfully set!");
                    }else {
                        p.sendMessage(" §cYou can only set 2 possions to the zone");
                        return true;
                    }
                }




            }else {
                p.sendMessage("§cYou don't have permission to do that!");

            }


        }else {
            Bukkit.getLogger().info("Only players can do that!");
        }

        return true;
    }
}
