package me.fares.redpvp.listeners;

import org.bukkit.Material;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class CancelledEvent implements Listener {

    @EventHandler
    public void onFood(FoodLevelChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onWeather(WeatherChangeEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onFall(EntityDamageEvent e) {
        if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
            e.setCancelled(true);
        }

    }

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("redpvp.owner")) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
            p.sendMessage("§6Nord§eMc §8┃ §F§cyou can't place blocks!");
        }

    }

    @EventHandler
    public void onDestroy(BlockBreakEvent e) {
        Player p = e.getPlayer();
        if (p.hasPermission("redpvp.owner")) {
            e.setCancelled(false);
        } else {
            e.setCancelled(true);
            p.sendMessage("§6Nord§eMc §8┃ §F§cyou can't break blocks!");
        }

    }

    @EventHandler
    public void onBulletHit(ProjectileHitEvent e) {
        if (e.getEntity() instanceof Arrow) {
            Arrow arrow = (Arrow) e.getEntity();
            arrow.remove();
        }

    }

    @EventHandler
    public void onDrop(PlayerDropItemEvent e) {
        Item drop = e.getItemDrop();
        ItemStack g = drop.getItemStack();
        if (g.hasItemMeta()) {
            ItemMeta gm = g.getItemMeta();
            if (gm.hasLore()) {
                List<String> lore = gm.getLore();
                if (!lore.isEmpty()) {
                    e.setCancelled(lore.contains("§c§lLOCKED"));
                }
            }
        }

    }

    @EventHandler
    public void onRightClick(PlayerInteractEntityEvent e) {
        Entity b = e.getRightClicked();
        if (b.getType() == EntityType.ITEM_FRAME) {
            ItemFrame bb = (ItemFrame) e.getRightClicked();
            e.setCancelled(bb.getItem().getType() != Material.AIR);
        }

    }

    @EventHandler
    public void onclick(PlayerInteractAtEntityEvent e) {
        Entity ea = e.getRightClicked();
        if (ea instanceof ArmorStand) {
            e.setCancelled(true);
        }

    }

    @EventHandler
    public void onDeath(PlayerDeathEvent e) {
        Player p = e.getEntity();
        e.setDeathMessage(null);
        p.spigot().respawn();
        e.getDrops().clear();
    }

    @EventHandler
    public void onCraft(CraftItemEvent e) {
        e.setCancelled(true);
    }

    @EventHandler
    public void onEnchanment(EnchantItemEvent e) {
        ItemStack item = e.getItem();
        Player p = e.getEnchanter();
        if (item.hasItemMeta() && item.getItemMeta().hasLore() && item.getItemMeta().getLore().contains("§c§lLOCKED")) {
            item.setItemMeta(null);
            p.sendMessage("§6Nord§eMc §8┃ §F§cLocked §awas remove from your item.");
        }

    }
}
