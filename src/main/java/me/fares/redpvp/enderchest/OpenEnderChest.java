package me.fares.redpvp.enderchest;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class OpenEnderChest implements Listener {


    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Action action = e.getAction();
        Player p = e.getPlayer();
        Block block = e.getClickedBlock();

        //-----------------------------------------------[Spawn]---------------------------------------

        if (!action.equals(Action.RIGHT_CLICK_BLOCK)) {
            return;
        }
        if (block.getType().equals(Material.ENDER_CHEST)) {
            e.setCancelled(true);
            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1.0F, 1.0F);
            Inventory inv = Bukkit.createInventory(null, 9, "Storages");
            inv.setItem(0, Storage1(p));
            inv.setItem(1, Storage2(p));
            inv.setItem(2, Storage3(p));
            inv.setItem(3, Storage4(p));
            inv.setItem(4, Storage5(p));
            inv.setItem(5, Storage6(p));
            p.openInventory(inv);
        }
    }


    public ItemStack Storage1(Player p) {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§7EnderChest 1");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Storage2(Player p) {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aEnderChest 2");
        ArrayList<String> lore = new ArrayList<>(1);
        if (p.hasPermission("redstonepvp.EnderChest2")) {
            lore.add("§aYou have this storage");
        } else {
            lore.add("§cBuy a §aSuper §crank to unlock it");
            lore.add("§c/Store");
            lore.add("§c/Discord");
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Storage3(Player p) {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aEnderChest 3");
        ArrayList<String> lore = new ArrayList<>(1);
        if (p.hasPermission("redstonepvp.EnderChest3")) {
            lore.add("§aYou have this storage");
        } else {
            lore.add("§cBuy a §aSuper §crank to unlock it");
            lore.add("§c/Store");
            lore.add("§c/Discord");
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Storage4(Player p) {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bEnderChest 4");
        ArrayList<String> lore = new ArrayList<>(1);
        if (p.hasPermission("redstonepvp.EnderChest4")) {
            lore.add("§aYou have this EnderChest");
        } else {
            lore.add("§cBuy a §bLegend §crank to unlock it");
            lore.add("§c/Store");
            lore.add("§c/Discord");
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Storage5(Player p) {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bEnderChest 5");
        ArrayList<String> lore = new ArrayList<>(1);
        if (p.hasPermission("redstonepvp.EnderChest5")) {
            lore.add("§aYou have this storage");
        } else {
            lore.add("§cBuy a §dEpic §crank to unlock it");
            lore.add("§c/Store");
            lore.add("§c/Discord");
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Storage6(Player p) {
        ItemStack item = new ItemStack(Material.ENDER_CHEST);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6EnderChest 6");
        ArrayList<String> lore = new ArrayList<>(1);
        if (p.hasPermission("redstonepvp.EnderChest6")) {
            lore.add("§aYou have this storage");
        } else {
            lore.add("§cBuy a §2Nord§6+ §crank to unlock it");
            lore.add("§c/Store");
        }
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }


}
