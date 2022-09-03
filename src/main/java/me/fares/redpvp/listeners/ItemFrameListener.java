package me.fares.redpvp.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class ItemFrameListener implements Listener {
    @EventHandler
    public void onclick(PlayerInteractAtEntityEvent e) {
        Entity ea = e.getRightClicked();
        if(ea.getType() != EntityType.ITEM_FRAME) return;
        Player p = e.getPlayer();
        if (ea instanceof org.bukkit.entity.ItemFrame) {
            e.setCancelled(true);
            org.bukkit.entity.ItemFrame frame = (org.bukkit.entity.ItemFrame)e.getRightClicked();
            if (frame.getItem() != null) {
                ItemStack item;
                ItemMeta meta;
                ArrayList lore;
                if (frame.getItem().getType() == Material.ARROW) {
                    item = new ItemStack(Material.ARROW, 64);
                    meta = item.getItemMeta();
                    lore = new ArrayList(1);
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    p.getInventory().addItem(new ItemStack[]{item});
                    p.playSound(p.getLocation(), Sound.SKELETON_WALK, 1.0F, 1.0F);
                } else if (frame.getItem().getType() == Material.GOLDEN_APPLE) {
                    item = new ItemStack(Material.GOLDEN_APPLE, 64);
                    meta = item.getItemMeta();
                    lore = new ArrayList(1);
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    item.setItemMeta(meta);
                    p.getInventory().addItem(new ItemStack[]{item});
                    p.playSound(p.getLocation(), Sound.SKELETON_WALK, 1.0F, 1.0F);
                } else {
                    item = frame.getItem();
                    meta = item.getItemMeta();
                    lore = new ArrayList(1);
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    if (item.getType() != Material.AIR) {
                        meta.setLore(lore);
                        item.setItemMeta(meta);
                        p.getInventory().addItem(new ItemStack[]{item});
                        p.playSound(p.getLocation(), Sound.SKELETON_WALK, 1.0F, 1.0F);
                    }
                }
            }
        }

    }

    @EventHandler
    public void onBlockBreak(HangingBreakByEntityEvent e) {
        Entity entity = e.getEntity();
        if(entity == null) return;
        if(entity.getType() != EntityType.ITEM_FRAME) return;
        if (e.getRemover() instanceof Player && e.getEntity() instanceof ItemFrame) {
            e.setCancelled(true);
        }

    }

    @EventHandler
    public void FrameEntity(EntityDamageByEntityEvent e) {
        if (e.getEntity() instanceof ItemFrame) {
            if (e.getDamager() instanceof Player && e.getEntity() instanceof ItemFrame && e.getDamager() instanceof ItemFrame) {
                e.setCancelled(true);
            }

            if (e.getDamager() instanceof Projectile && ((Projectile)e.getDamager()).getShooter() instanceof Player) {
                e.getDamager().remove();
                e.setCancelled(true);
            }
        }

    }

    @EventHandler
    public void onEntityInteract(PlayerInteractEntityEvent e) {
        Entity entity = e.getRightClicked();
        if(entity == null) return;
        if(entity.getType() != EntityType.ITEM_FRAME) return;
        Player player = e.getPlayer();
        if(player.getGameMode().equals(GameMode.CREATIVE) && player.isSneaking()) {
            e.setCancelled(false);
        }
    }
    
}
