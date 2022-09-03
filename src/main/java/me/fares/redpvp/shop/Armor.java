package me.fares.redpvp.shop;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class Armor implements Listener {

    @EventHandler
    public void onClick(org.bukkit.event.inventory.InventoryClickEvent e) {


        Player p = (Player) e.getWhoClicked();
        RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
        try {
            if (e.getCurrentItem().getItemMeta() == null)
                return;
            if (p.getItemInHand().getType() == null)
                return;

            if (e.getInventory().getName().equalsIgnoreCase("Storages") || e.getInventory().getName().equalsIgnoreCase("Tp Mchanic") || e.getInventory().getName().equalsIgnoreCase("Armor And Tools") || e.getInventory().getName().equalsIgnoreCase("RedStoneShop") || e.getInventory().getName().equalsIgnoreCase("Golden Apple") || e.getInventory().getName().equalsIgnoreCase("Potions") || e.getInventory().getName().equalsIgnoreCase("Axes")) {
                e.setCancelled(true);
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aArmor §7And §aTools")) {
                p.openInventory(RedPvP.getInstance().getInteract().Armorandtools(p));
                p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                return;
            }

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bDIAMOND HELEMT")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 6)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND HELEMT");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                    p.getInventory().addItem(item);

                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bDIAMOND HELEMT")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 8)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND HELEMT");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 8 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    item.addEnchantment(Enchantment.DURABILITY, 3);

                    p.getInventory().addItem(item);

                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bDIAMOND CHESTPLATE")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 6)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND CHESTPLATE");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                    p.getInventory().addItem(item);

                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bDIAMOND CHESTPLATE")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 8)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND CHESTPLATE");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 8 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    item.addEnchantment(Enchantment.DURABILITY, 3);

                    p.getInventory().addItem(item);

                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bDIAMOND LEGGINGS")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 6)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND LEGGINGS");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                    p.getInventory().addItem(item);

                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bDIAMOND LEGGINGS")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 8)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND LEGGINGS");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 8 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    item.addEnchantment(Enchantment.DURABILITY, 3);

                    p.getInventory().addItem(item);

                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bDIAMOND BOOTS")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 6)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND BOOTS");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);

                    p.getInventory().addItem(item);

                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bDIAMOND BOOTS")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 8)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND BOOTS");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 8 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
                    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
                    item.addEnchantment(Enchantment.DURABILITY, 3);

                    p.getInventory().addItem(item);

                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            //--------------------------------------------------[Sword]---------------------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bDIAMOND SOWRD")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 4)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND SWORD");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 4 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);

                    p.getInventory().addItem(item);
                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bDIAMOND SOWRD")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 6)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND SWORD");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                    item.addEnchantment(Enchantment.FIRE_ASPECT, 2);


                    p.getInventory().addItem(item);

                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§b§bDIAMOND SOWRD")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 8)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND SWORD");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 8 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                    item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                    item.addEnchantment(Enchantment.KNOCKBACK, 2);

                    p.getInventory().addItem(item);

                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }
            //-------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§b§b§bDIAMOND SOWRD")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 10)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bDIAMOND SWORD");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 10 §aEmerald");

                    ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
                    item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                    item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                    item.addEnchantment(Enchantment.KNOCKBACK, 2);
                    item.addEnchantment(Enchantment.DURABILITY, 2);

                    p.getInventory().addItem(item);

                    
                    return;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
                    p.closeInventory();
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    return;
                }
            }

            //---------------------------------------------------------------[Bow]----------------------------------------------------------------

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bBow")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 4)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bBow");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 4 §aEmerald");

                    ItemStack item = new ItemStack(Material.BOW);
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);

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

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§bBow")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 6)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bBow");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 6 §aEmerald");

                    ItemStack item = new ItemStack(Material.BOW);
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                    item.addEnchantment(Enchantment.ARROW_FIRE, 1);


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

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§bBow")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 8)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bBow");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 8 §aEmerald");

                    ItemStack item = new ItemStack(Material.BOW);
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                    item.addEnchantment(Enchantment.ARROW_FIRE, 1);
                    item.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);


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

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§b§b§b§bBow")) {
                if (RedPvP.getInstance().getSystem().item(p, Material.EMERALD, 10)) {
                    p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
                    p.sendMessage(RedPvP.PREFIX + "§aSecessfully bought §bBow");
                    p.sendMessage(RedPvP.PREFIX + "§7 - 10 §aEmerald");

                    ItemStack item = new ItemStack(Material.BOW);
                    item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                    item.addEnchantment(Enchantment.ARROW_FIRE, 1);
                    item.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                    item.addEnchantment(Enchantment.DURABILITY, 3);

                    p.getInventory().addItem(item);

                    
                    return;
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don`t have enough §aEmerald");
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
