package me.fares.redpvp.shop;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Axes implements Listener {

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

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§cAxes")) {
                p.openInventory(RedPvP.getInstance().getInteract().Axes(p));
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                return;
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§aPOISON AXES")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 16)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought POISON AXES");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 16 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_AXE);
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                    ItemMeta meta = item.getItemMeta();
                    meta.setDisplayName("§7POISON AXES");
                    ArrayList<String> lore = new ArrayList<>(1);
                    lore.add("§7Poison II");
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
                    item.setItemMeta(meta);

                    p.getInventory().addItem(item);
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //----------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§aWITHER AXES")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 20)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought WITHER AXES");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 20 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_AXE);
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                    ItemMeta meta = item.getItemMeta();
                    meta.setDisplayName("§7WITHER AXES");
                    ArrayList<String> lore = new ArrayList<>(1);
                    lore.add("§7Wither II");
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
                    item.setItemMeta(meta);

                    p.getInventory().addItem(item);
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;

                }
            }

            //------------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§aSLOWNESS AXES")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 20)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought SLOWNESS AXES");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 20 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_AXE);
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                    ItemMeta meta = item.getItemMeta();
                    meta.setDisplayName("§7SLOWNESS AXES");
                    ArrayList<String> lore = new ArrayList<>(1);
                    lore.add("§7Slowness II");
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
                    item.setItemMeta(meta);

                    p.getInventory().addItem(item);
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-----------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§a§aBLINDNESS AXES")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 35)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought BLINDNESS AXES");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 35 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_AXE);

                    ItemMeta meta = item.getItemMeta();
                    meta.setDisplayName("§7BLINDNESS AXES");
                    ArrayList<String> lore = new ArrayList<>(1);
                    lore.add("§7Blidness II");
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
                    item.setItemMeta(meta);

                    p.getInventory().addItem(item);
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-----------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§c§cStrength AXES")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 48)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought &cStrength &aAXES");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 48 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_AXE);
                    ItemMeta meta = item.getItemMeta();
                    meta.setDisplayName("§7Strength AXES");
                    ArrayList<String> lore = new ArrayList<>(1);
                    lore.add("§7Strength I");
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
                    item.setItemMeta(meta);

                    p.getInventory().addItem(item);
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }


            //-----------------------------


        } catch (Exception exception) {
        }
    }

}
