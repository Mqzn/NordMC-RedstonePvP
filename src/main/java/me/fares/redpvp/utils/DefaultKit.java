package me.fares.redpvp.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class DefaultKit {

    public void DefaultKit(Player p) {
        p.getInventory().addItem(Sword());
        p.getInventory().addItem(Bow());
        p.getInventory().addItem(GoldenApple());
        p.getInventory().addItem(Arrow());
        p.getInventory().addItem(Helmet());
        p.getInventory().addItem(Chestplate());
        p.getInventory().addItem(Leggings());
        p.getInventory().addItem(Boots());

    }


    public ItemStack Helmet() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Chestplate() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Leggings() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Boots() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Sword() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack GoldenApple() {
        ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Bow() {
        ItemStack item = new ItemStack(Material.BOW);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Arrow() {
        ItemStack item = new ItemStack(Material.ARROW, 64);
        ItemMeta meta = item.getItemMeta();
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§c§lLOCKED");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

}
