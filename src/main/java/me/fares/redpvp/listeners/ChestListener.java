package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class ChestListener implements Listener {

    @EventHandler
    public void onChest(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if (e.getBlock().getType().equals(Material.CHEST)) {
            if (p.hasPermission("redpvp.owner")) {
                e.setCancelled(false);
            } else {
                e.setCancelled(true);
                p.sendMessage(RedPvP.PREFIX + "You can't ya wr3 ;-;");
            }
        }
    }
}
