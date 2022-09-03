package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kit implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command arg1, String arg2, String[] args) {

        if (s instanceof Player) {
            Player p = (Player) s;
            RedPvP.getInstance().getDefaultKit().DefaultKit(p);
            p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
        }

        return false;
    }

}
