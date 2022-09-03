package me.fares.redpvp.shop;

import me.fares.redpvp.RedPvP;
import net.citizensnpcs.api.event.NPCRightClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;


public class Interact implements Listener {

    public Inventory inv;

    @EventHandler
    public void onclick(NPCRightClickEvent e) {
        Player p = e.getClicker();
        if (e.getNPC().getName().equalsIgnoreCase("§aSHOP")) {
            Inventory shop = Bukkit.createInventory(null, 27, "RedStoneShop");

            shop.setItem(10, RedPvP.getInstance().getShopMenu().GoldenAppleMenu());
            shop.setItem(12, RedPvP.getInstance().getShopMenu().AxesMenu());
            shop.setItem(14, RedPvP.getInstance().getShopMenu().ArmorMenu());
            shop.setItem(16, RedPvP.getInstance().getShopMenu().PotionsMenu());

            p.openInventory(shop);
        } else if (e.getNPC().getName().equalsIgnoreCase("§cFire Shop")) {
            Inventory shop = Bukkit.createInventory(null, 54, "RedStoneShop");
            shop.setItem(10, RedPvP.getInstance().getFireMenu().helemt_1());
            shop.setItem(19, RedPvP.getInstance().getFireMenu().chestplate_1());
            shop.setItem(28, RedPvP.getInstance().getFireMenu().leggings_1());
            shop.setItem(37, RedPvP.getInstance().getFireMenu().boots_1());

            shop.setItem(16, RedPvP.getInstance().getFireMenu().sword_1());
            shop.setItem(25, RedPvP.getInstance().getFireMenu().sword_2());
            shop.setItem(34, RedPvP.getInstance().getFireMenu().bow_1());
            shop.setItem(43, RedPvP.getInstance().getFireMenu().axe_1());

            p.openInventory(shop);
        }

    }


    public Inventory XP() {
        inv = Bukkit.createInventory(null, 27, "XP");
        return inv;
    }

    public Inventory GoldenApple(Player p) {

        inv = Bukkit.createInventory(null, 27, "Golden Apple");
        inv.setItem(11, RedPvP.getInstance().getShopMenu().goldeapple_1());
        inv.setItem(13, RedPvP.getInstance().getShopMenu().goldeapple_5());
        inv.setItem(15, RedPvP.getInstance().getShopMenu().goldeapple_10());
        return inv;
    }

    public Inventory PotionsMenu(Player p) {
        inv = Bukkit.createInventory(null, 27, "Potions");
        inv.setItem(11, RedPvP.getInstance().getShopMenu().speed_1());
        inv.setItem(13, RedPvP.getInstance().getShopMenu().fire_1());
        inv.setItem(15, RedPvP.getInstance().getShopMenu().strength_1());
        return inv;
    }

    public Inventory Axes(Player p) {
        inv = Bukkit.createInventory(null, 45, "Axes");
        inv.setItem(18, RedPvP.getInstance().getShopMenu().PoisonAxe());
        inv.setItem(20, RedPvP.getInstance().getShopMenu().WitherAxe());
        inv.setItem(22, RedPvP.getInstance().getShopMenu().OPAxe());
        inv.setItem(24, RedPvP.getInstance().getShopMenu().SlownessAxe());
        inv.setItem(26, RedPvP.getInstance().getShopMenu().BlidnessAxe());
        return inv;
    }

    public Inventory Armorandtools(Player p) {
        inv = Bukkit.createInventory(null, 54, "Armor And Tools");
        inv.setItem(10, RedPvP.getInstance().getShopMenu().helemt_1());
        inv.setItem(19, RedPvP.getInstance().getShopMenu().Chestplate_1());
        inv.setItem(28, RedPvP.getInstance().getShopMenu().Leggings_1());
        inv.setItem(37, RedPvP.getInstance().getShopMenu().Boots_1());


        inv.setItem(16, RedPvP.getInstance().getShopMenu().helemt_2());
        inv.setItem(25, RedPvP.getInstance().getShopMenu().Chestplate_2());
        inv.setItem(34, RedPvP.getInstance().getShopMenu().Leggings_2());
        inv.setItem(43, RedPvP.getInstance().getShopMenu().Boots_2());

        inv.setItem(12, RedPvP.getInstance().getShopMenu().Sword_1());
        inv.setItem(21, RedPvP.getInstance().getShopMenu().Sword_2());
        inv.setItem(30, RedPvP.getInstance().getShopMenu().Sword_3());
        inv.setItem(39, RedPvP.getInstance().getShopMenu().Sword_4());

        inv.setItem(14, RedPvP.getInstance().getShopMenu().Bow_1());
        inv.setItem(23, RedPvP.getInstance().getShopMenu().Bow_2());
        inv.setItem(32, RedPvP.getInstance().getShopMenu().Bow_3());
        inv.setItem(41, RedPvP.getInstance().getShopMenu().Bow_4());
        return inv;
    }
}
