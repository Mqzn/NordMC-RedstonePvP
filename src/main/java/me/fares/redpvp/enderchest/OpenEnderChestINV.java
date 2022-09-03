package me.fares.redpvp.enderchest;

import me.fares.redpvp.RedPvP;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class OpenEnderChestINV implements Listener {


    void loadInventory1(Inventory inv, Player p) {

        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration1(p);

        for (int i = 0; i < inv.getSize(); i++) {

            if (config.contains(p.getName() + ".EnderChest1." + i))
                inv.setItem(i, config.getItemStack(p.getName() + ".EnderChest1." + i));
        }
    }

    void loadInventory2(Inventory inv, Player p) {

        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration2(p);

        for (int i = 0; i < inv.getSize(); i++) {

            if (config.contains(p.getName() + ".EnderChest2." + i))
                inv.setItem(i, config.getItemStack(p.getName() + ".EnderChest2." + i));
        }
    }

    void loadInventory3(Inventory inv, Player p) {

        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration3(p);

        for (int i = 0; i < inv.getSize(); i++) {

            if (config.contains(p.getName() + ".EnderChest3." + i))
                inv.setItem(i, config.getItemStack(p.getName() + ".EnderChest3." + i));
        }
    }

    void loadInventory4(Inventory inv, Player p) {

        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration4(p);

        for (int i = 0; i < inv.getSize(); i++) {

            if (config.contains(p.getName() + ".EnderChest4." + i))
                inv.setItem(i, config.getItemStack(p.getName() + ".EnderChest4." + i));
        }
    }

    void loadInventory5(Inventory inv, Player p) {

        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration5(p);

        for (int i = 0; i < inv.getSize(); i++) {

            if (config.contains(p.getName() + ".EnderChest5." + i))
                inv.setItem(i, config.getItemStack(p.getName() + ".EnderChest5." + i));
        }
    }

    void loadInventory6(Inventory inv, Player p) {

        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration6(p);

        for (int i = 0; i < inv.getSize(); i++) {

            if (config.contains(p.getName() + ".EnderChest6." + i))
                inv.setItem(i, config.getItemStack(p.getName() + ".EnderChest6." + i));
        }
    }


    @EventHandler
    public void onClick(org.bukkit.event.inventory.InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        try {
            if (e.getCurrentItem().getItemMeta() == null)
                return;
            if (p.getItemInHand().getType() == null)
                return;

            if (e.getInventory().getName().equalsIgnoreCase("Storages")) {
                e.setCancelled(true);


                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§7EnderChest 1")) {
                    Inventory inv = Bukkit.createInventory(null, 54, "EnderChest 1");
                    loadInventory1(inv, p);
                    p.openInventory(inv);
                    p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1.0F, 5.0F);
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aEnderChest 2")) {

                    if (p.hasPermission("redstonepvp.EnderChest2")) {
                        Inventory inv = Bukkit.createInventory(null, 54, "EnderChest 2");
                        loadInventory2(inv, p);
                        p.openInventory(inv);
                        p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1.0F, 5.0F);

                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cYou need §6Super §crank to open this EnderChest.");
                        p.closeInventory();
                    }
                }
                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§aEnderChest 3")) {
                    if (p.hasPermission("redstonepvp.EnderChest3")) {
                        Inventory inv = Bukkit.createInventory(null, 54, "EnderChest 3");
                        loadInventory3(inv, p);
                        p.openInventory(inv);
                        p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1.0F, 5.0F);

                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cYou need §bSuper §crank to open this EnderChest.");
                        p.closeInventory();
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bEnderChest 4")) {
                    if (p.hasPermission("redstonepvp.EnderChest4")) {
                        Inventory inv = Bukkit.createInventory(null, 54, "EnderChest 4");
                        loadInventory4(inv, p);
                        p.openInventory(inv);
                        p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1.0F, 5.0F);

                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cYou need §aLegend §crank to open this EnderChest.");
                        p.closeInventory();
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§bEnderChest 5")) {
                    if (p.hasPermission("redstonepvp.EnderChest5")) {
                        Inventory inv = Bukkit.createInventory(null, 54, "EnderChest 5");
                        loadInventory5(inv, p);
                        p.openInventory(inv);
                        p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1.0F, 5.0F);

                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cYou need §dEpic §crank to open this EnderChest.");
                        p.closeInventory();
                    }
                }

                if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6EnderChest 6")) {
                    if (p.hasPermission("redstonepvp.EnderChest6")) {
                        Inventory inv = Bukkit.createInventory(null, 54, "EnderChest 6");
                        loadInventory6(inv, p);
                        p.openInventory(inv);
                        p.playSound(p.getLocation(), Sound.WOOD_CLICK, 1.0F, 5.0F);

                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cYou need §2Nord§6+ §crank to open this storage.");
                        p.closeInventory();
                    }
                }

            }

        } catch (Exception ignored) { }
    }

}
