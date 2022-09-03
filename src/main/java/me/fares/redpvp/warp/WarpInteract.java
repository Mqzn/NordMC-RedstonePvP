package me.fares.redpvp.warp;

import me.fares.redpvp.RedPvP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class WarpInteract implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getCurrentItem().getItemMeta() == null)
                return;
            if (p.getItemInHand().getType() == null)
                return;

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Nord+ Rank Warp")) {
                e.setCancelled(true);
                p.closeInventory();
                if (p.hasPermission("warp.nord+")) {
                    p.teleport(RedPvP.getInstance().getWarp("nord+"));
                } else {
                    p.sendMessage(RedPvP.NO_PERMS);
                }
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Epic Rank Warp")) {
                e.setCancelled(true);
                p.closeInventory();
                if (p.hasPermission("warp.epic")) {
                    p.teleport(RedPvP.getInstance().getWarp("epic"));
                } else {
                    p.sendMessage(RedPvP.NO_PERMS);
                }
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Legend Rank Warp")) {
                e.setCancelled(true);
                p.closeInventory();
                if (p.hasPermission("warp.legend")) {
                    p.teleport(RedPvP.getInstance().getWarp("legend"));
                } else {
                    p.sendMessage(RedPvP.NO_PERMS);
                }
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Super Rank Warp")) {
                e.setCancelled(true);
                p.closeInventory();
                if (p.hasPermission("warp.super")) {
                    p.teleport(RedPvP.getInstance().getWarp("super"));
                } else {
                    p.sendMessage(RedPvP.NO_PERMS);
                }
            }
        } catch (Exception exception) {
        }
    }
}
