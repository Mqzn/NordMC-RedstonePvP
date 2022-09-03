package me.fares.redpvp.listeners;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.EnchantingInventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.material.Dye;

public class OpenEnchanting implements Listener {

    @EventHandler
    public void onClickEvent(InventoryClickEvent event) {
        ItemStack itemclicked = event.getCurrentItem();
        Player p = (Player) event.getWhoClicked();
        if (!(p instanceof Player))
            return;
        if (event.getInventory().getType() == InventoryType.ENCHANTING) {
            if (itemclicked.getType().equals(Material.INK_SACK) && itemclicked.getDurability() == 4) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onInventoryOpen(InventoryOpenEvent e) {
        if (e.getInventory() instanceof EnchantingInventory) {
            EnchantingInventory inv = (EnchantingInventory) e.getInventory();
            Player player = (Player) e.getPlayer();
            Dye d = new Dye();
            d.setColor(DyeColor.BLUE);
            ItemStack i = d.toItemStack();
            i.setAmount(64);
            inv.setItem(1, i);
            player.updateInventory();
        }
    }

    @EventHandler
    public void onInventoryOpen(InventoryCloseEvent e) {
        if (e.getInventory() instanceof EnchantingInventory) {
            EnchantingInventory inv = (EnchantingInventory) e.getInventory();
            Player player = (Player) e.getPlayer();
            inv.setItem(1, null);
            player.updateInventory();
        }
    }

}
