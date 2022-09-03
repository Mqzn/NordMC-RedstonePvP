package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class WarpListener implements Listener {
    @EventHandler
    public void onclick(NPCRightClickEvent e) {
        Player p = e.getClicker();
        if (e.getNPC().getName().equalsIgnoreCase("§aWarps")) {
            Inventory shop = Bukkit.createInventory(null, 27, "RedStoneShop");

            shop.setItem(10, RedPvP.getInstance().getWarpMenu().nordMenu());
            shop.setItem(12, RedPvP.getInstance().getWarpMenu().epicMenu());
            shop.setItem(14, RedPvP.getInstance().getWarpMenu().legendMenu());
            shop.setItem(16, RedPvP.getInstance().getWarpMenu().superMenu());

            p.openInventory(shop);
        }
    }
}
