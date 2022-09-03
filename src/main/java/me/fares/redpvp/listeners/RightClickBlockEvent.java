package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class RightClickBlockEvent implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Action action = e.getAction();
        Player p = e.getPlayer();
        Block block = e.getClickedBlock();

        //-----------------------------------------------[Spawn]---------------------------------------

        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block.getType().equals(Material.REDSTONE_BLOCK)) {
                e.setCancelled(true);
                if (RedPvP.getInstance().getSystem().checkslots(p, 0)) {
                    if (RedPvP.getInstance().getSystem().item(p, Material.REDSTONE, 1)) {
                        p.updateInventory();
                        p.setLevel(p.getLevel() + 1);
                        p.playSound(p.getLocation(), Sound.LEVEL_UP, 1.0F, 1.0F);
                        return;
                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cSorry but you need 1 redstone to transfer.");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
                    }
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don't have aviliable slots");
                }

            } else if (block.getType().equals(Material.GOLD_BLOCK)) {
                e.setCancelled(true);
                if (RedPvP.getInstance().getSystem().checkslots(p, 0)) {
                    if (RedPvP.getInstance().getSystem().item(p, Material.REDSTONE, 64)) {
                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 1));
                        p.updateInventory();
                        p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1.0F, 1.0F);
                        return;
                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cSorry but you need 64 redstone to transfer.");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
                    }
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don't have aviliable slots");
                }
            } else if (block.getType().equals(Material.EMERALD_BLOCK)) {
                e.setCancelled(true);
                if (RedPvP.getInstance().getSystem().checkslots(p, 0)) {

                    if (RedPvP.getInstance().getSystem().item(p, Material.GOLD_INGOT, 2)) {
                        p.getInventory().addItem(new ItemStack(Material.EMERALD));
                        p.updateInventory();
                        p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1.0F, 1.0F);
                        return;
                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cSorry but you need 2 §6Gold §cto transfer.");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
                    }

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don't have aviliable slots");
                }

            } else if (block.getType().equals(Material.NOTE_BLOCK)) {
                e.setCancelled(true);
                if (RedPvP.getInstance().getCoolDown_randomBox().checkTime(p)) {
                    if (RedPvP.getInstance().getSystem().checkslots(p, 1)) {
                        if (RedPvP.getInstance().getSystem().item(p, Material.GOLD_INGOT, 5)) {

                            p.updateInventory();
                            p.playSound(p.getLocation(), Sound.CHEST_OPEN, 1.0F, 1.0F);
                            RedPvP.getInstance().getRandomBox1().tite.put(p, 4);
                            RedPvP.getInstance().getCoolDown_randomBox().setTime(p, 4);
                            return;
                        } else {
                            p.sendMessage(RedPvP.PREFIX + "§cSorry but you need 5 §6Gold §cto buy RandomBox.");
                            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
                        }
                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cYou don't have aviliable slots");
                    }

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cPlease wait Randombox end.");
                }


                //-----------------------------------------------[Dropparty]---------------------------------------

            } else if (block.getType().equals(Material.BEACON)) {
                e.setCancelled(true);
                if (p.hasPermission("redpvp.dropparty")) {
                    if ((RedPvP.getInstance()).getDroppartycooldown().getAllowKit(block)) {
                        Integer players = Bukkit.getOnlinePlayers().size();
                        if (players >= 12) {

                            RedPvP.getInstance().getDropPart1().tite.put(block, 28);
                            RedPvP.getInstance().getDropParty2().tite.put(block, 28);
                            (RedPvP.getInstance()).getDroppartycooldown().setKit(block);


                        } else {
                            p.sendMessage(RedPvP.PREFIX + " §cyou need §a12 §cplayers §aonline §cto start the dropparty");
                        }

                    } else {
                        long current = System.currentTimeMillis();
                        long release = (RedPvP.getInstance()).getDroppartycooldown().getKitTime(block);
                        long millis = release - current;
                        p.sendMessage(RedPvP.PREFIX + (RedPvP.getInstance()).getDroppartycooldown().getRemainingTime(millis));
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
                    }

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou Need §bSuper §cRank or higher");
                }


            } else if (block.getType().equals(Material.ENDER_PORTAL_FRAME)) {
                e.setCancelled(true);
                if (p.hasPermission("redpvp.unbreaking")) {

                    if (p.getItemInHand().getType() == Material.DIAMOND_SWORD || p.getItemInHand().getType() == Material.BOW || p.getItemInHand().getType() == Material.DIAMOND_HELMET || p.getItemInHand().getType() == Material.DIAMOND_CHESTPLATE || p.getItemInHand().getType() == Material.DIAMOND_CHESTPLATE || p.getItemInHand().getType() == Material.DIAMOND_LEGGINGS || p.getItemInHand().getType() == Material.DIAMOND_BOOTS) {

                        p.getItemInHand().addEnchantment(Enchantment.DURABILITY, 3);
                        p.sendMessage(RedPvP.PREFIX + "§aUnbreaking has been added for your item");


                    }
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou Need §aLegend §cRank To Use It");
                }

            } else if (block.getType().equals(Material.ENDER_PORTAL_FRAME)) {
                e.setCancelled(true);
                if (p.hasPermission("elite.redpvp.unbreaking")) {
                    if (p.getItemInHand().getType() == Material.DIAMOND_SWORD || p.getItemInHand().getType() == Material.BOW || p.getItemInHand().getType() == Material.DIAMOND_HELMET || p.getItemInHand().getType() == Material.DIAMOND_CHESTPLATE || p.getItemInHand().getType() == Material.DIAMOND_CHESTPLATE || p.getItemInHand().getType() == Material.DIAMOND_LEGGINGS || p.getItemInHand().getType() == Material.DIAMOND_BOOTS) {

                        p.getItemInHand().addEnchantment(Enchantment.DURABILITY, 3);
                        p.sendMessage(RedPvP.PREFIX + "§aUnbreaking has been added for your item");

                    }
                } else {
                    p.sendMessage(RedPvP.NO_PERMS);
                }


                //--------------
            } else if (block.getType().equals(Material.JUKEBOX)) {
                e.setCancelled(true);
                Inventory shop = Bukkit.createInventory(null, 9, "Tp Mchanic");

                shop.setItem(2, Yes());
                shop.setItem(6, No());

                p.openInventory(shop);

            } else if (block.getType().equals(Material.HOPPER)) {
                e.setCancelled(true);
                Inventory inv = Bukkit.createInventory(null, 54, "§cTrash");
                p.openInventory(inv);

            }

        }
    }


    public ItemStack Yes() {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(Material.WOOL, 1, DyeColor.GREEN.getData());
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aConfirm");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§c are you sure ?");
        lore.add("§a If you click on the");
        lore.add("§a item, it will tp to");
        lore.add("§a a random location  ");
        lore.add("§e  ");
        lore.add("§aCost : 1 Gold");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack No() {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(Material.WOOL, 1, DyeColor.RED.getData());
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cCancel");
        item.setItemMeta(meta);
        return item;
    }
}
