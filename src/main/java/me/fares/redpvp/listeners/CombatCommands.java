package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CombatCommands implements Listener {
    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent e) {
        Player p = e.getPlayer();
        if (RedPvP.getInstance().getCombat().CombatTite.containsKey(p) && blockedCMD(e.getMessage())) {
            if (p.hasPermission("redpvp.owner")) {
                e.setCancelled(false);
            } else {
                e.setCancelled(true);
                p.sendMessage("§cYou are in combat");
            }
        }
    }

    public boolean blockedCMD(String cmd) {
        return !(!cmd.startsWith("hub") && !cmd.startsWith("heal") && !cmd.startsWith("vanish") && !cmd.startsWith("spawn") && !cmd.startsWith("lobby") &&
                !cmd.startsWith("v") && !cmd.startsWith("trash") && !cmd.startsWith("gamemode") && !cmd.startsWith("/v") && !cmd.startsWith("/trash") && !cmd.startsWith("/supervanish") &&
                !cmd.startsWith("/vanish") && !cmd.startsWith("/gamemode") && !cmd.startsWith("/spec") && !cmd.startsWith("/tp") && !cmd.startsWith("/heal"));
    }

}
