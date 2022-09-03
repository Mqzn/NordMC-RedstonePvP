package me.fares.redpvp.fireshop;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class FireShop implements Listener {

    @EventHandler
    public void onClick(org.bukkit.event.inventory.InventoryClickEvent e) {


        Player p = (Player) e.getWhoClicked();
        RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
        try {
            if (e.getCurrentItem().getItemMeta() == null)
                return;
            if (p.getItemInHand().getType() == null)
                return;

            if (e.getInventory().getName().equalsIgnoreCase("Storages") || e.getInventory().getName().equalsIgnoreCase("RedStoneShop") || e.getInventory().getName().equalsIgnoreCase("Armor And Tools") || e.getInventory().getName().equalsIgnoreCase("RedStoneShop") || e.getInventory().getName().equalsIgnoreCase("Golden Apple") || e.getInventory().getName().equalsIgnoreCase("Potions") || e.getInventory().getName().equalsIgnoreCase("Axes")) {
                e.setCancelled(true);
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cDIAMOND HELEMT")) {
                if (player.getPoints() >= 6) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND HELEMT");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §cFire");

                    ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
                    item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);

                    p.getInventory().addItem(item);
                    player.removePoints(6);
                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cDIAMOND CHESTPLATE")) {
                if (player.getPoints() >= 6) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND CHESTPLATE");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §cFire");

                    ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
                    item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);


                    p.getInventory().addItem(item);
                    player.removePoints(6);
                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cDIAMOND LEGGINGS")) {
                if (player.getPoints() >= 6) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND LEGGINGS");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §cFire");

                    ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
                    item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);


                    p.getInventory().addItem(item);
                    player.removePoints(6);
                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cDIAMOND BOOTS")) {
                if (player.getPoints() >= 6) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND BOOTS");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §cFire");

                    ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
                    item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);


                    p.getInventory().addItem(item);
                    player.removePoints(6);
                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            //--------------------------------------------------[Sword]---------------------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cDIAMOND SWORD")) {
                if (player.getPoints() >= 8) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §cDIAMOND SWORD");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 8 §cFire");

                    ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                    item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                    item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);

                    p.getInventory().addItem(item);
                    player.removePoints(8);
                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cDIAMOND SWORD")) {
                    if (player.getPoints() >= 12) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §cDIAMOND SWORD");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 12 §cFire");

                    ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                    item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
                    item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);

                    p.getInventory().addItem(item);
                    player.removePoints(12);
                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //---------------------------------------------------------------[Bow]----------------------------------------------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cBow")) {
                if (player.getPoints() >= 6) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bBow");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §cFire");

                    ItemStack item = new ItemStack(Material.BOW);
                    item.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                    item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 2);


                    p.getInventory().addItem(item);
                    player.removePoints(6);
                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-----------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cOMEGA AXE")) {
                if (player.getPoints() >= 64) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought OMEGA AXE");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 64 §cFire");

                    ItemStack item = new ItemStack(Material.DIAMOND_AXE);
                    item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
                    item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
                    ItemMeta meta = item.getItemMeta();
                    meta.setDisplayName("§7OMEGA AXES");
                    ArrayList<String> lore = new ArrayList<>(1);
                    lore.add("§e  ");
                    lore.add("§7Wither II");
                    lore.add("§7Blidness II");
                    lore.add("§7Slowness II");
                    lore.add("§7Poison II");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
                    meta.addEnchant(Enchantment.DURABILITY, 4, true);
                    item.setItemMeta(meta);


                    p.getInventory().addItem(item);
                    player.removePoints(64);
                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §cFire §a/Store");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cCancel")) {

                p.closeInventory();
            }


            //-----------------------------


        } catch (Exception exception) {
        }
    }
}
