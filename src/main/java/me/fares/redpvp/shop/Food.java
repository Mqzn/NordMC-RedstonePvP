package me.fares.redpvp.shop;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;

public class Food implements Listener {


    @EventHandler
    public void onClick(org.bukkit.event.inventory.InventoryClickEvent e) {


        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getCurrentItem().getItemMeta() == null)
                return;
            if (p.getItemInHand().getType() == null)
                return;

            if (e.getInventory().getName().equalsIgnoreCase("Storages") || e.getInventory().getName().equalsIgnoreCase("Tp Mchanic") || e.getInventory().getName().equalsIgnoreCase("Armor And Tools") || e.getInventory().getName().equalsIgnoreCase("RedStoneShop") || e.getInventory().getName().equalsIgnoreCase("Golden Apple") || e.getInventory().getName().equalsIgnoreCase("Potions") || e.getInventory().getName().equalsIgnoreCase("Axes")) {
                e.setCancelled(true);
            }


            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Golden Apple")) {
                p.openInventory(RedPvP.getInstance().getInteract().GoldenApple(p));
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bGolden Apple")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 1)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought 1 §bGolden Apple");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 1 §aEmerald");
                    @SuppressWarnings("deprecation")
                    ItemStack item = new ItemStack(Material.getMaterial(322), 1, (short) 1);
                    p.getInventory().addItem(item);
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //-------------------------------
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bGolden Apple")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 5)) {

                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought 5 §bGolden Apple");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 5 §aEmerald");
                    @SuppressWarnings("deprecation")
                    ItemStack item = new ItemStack(Material.getMaterial(322), 5, (short) 1);
                    p.getInventory().addItem(item);
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //---------------------------------------
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bGolden Apple")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 10)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought 10 §bGolden Apple");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 10 §aEmerald");
                    @SuppressWarnings("deprecation")
                    ItemStack item = new ItemStack(Material.getMaterial(322), 10, (short) 1);
                    p.getInventory().addItem(item);
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //--------------------------------------------------------
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Potions")) {
                p.openInventory(RedPvP.getInstance().getInteract().PotionsMenu(p));
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bSpeed")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 3)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought 1 §bSpeed");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 3 §aEmerald");
                    @SuppressWarnings("deprecation")
                    ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8226);
                    PotionMeta meta = (PotionMeta) potion.getItemMeta();
                    potion.setItemMeta(meta);
                    p.getInventory().addItem(potion);
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //-------------------------------
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bFire Resistance")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 3)) {

                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought 1 §b§bFire Resistance");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 3 §aEmerald");
                    @SuppressWarnings("deprecation")
                    ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8227);
                    PotionMeta meta = (PotionMeta) potion.getItemMeta();
                    potion.setItemMeta(meta);
                    p.getInventory().addItem(potion);
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //---------------------------------------
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bStrength")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 5)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought 1 §b§b§bStrength");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 5 §aEmerald");
                    @SuppressWarnings("deprecation")
                    ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8233);
                    PotionMeta meta = (PotionMeta) potion.getItemMeta();
                    potion.setItemMeta(meta);
                    p.getInventory().addItem(potion);
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
        } catch (Exception exception) {
        }
    }

}
