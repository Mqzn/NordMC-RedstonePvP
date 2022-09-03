package me.fares.redpvp.fireshop;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class FireMenu {

    public ItemStack fire() {
        ItemStack item = new ItemStack(Material.FIREWORK_CHARGE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cFire");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§cFire Shop");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack helemt_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cDIAMOND HELEMT");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack chestplate_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cDIAMOND CHESTPLATE");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack leggings_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cDIAMOND LEGGINGS");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack boots_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cDIAMOND BOOTS");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack sword_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cDIAMOND SWORD");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 8 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack sword_2() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 6);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        item.addUnsafeEnchantment(Enchantment.FIRE_ASPECT, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cDIAMOND SWORD");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 12 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack bow_1() {
        ItemStack item = new ItemStack(Material.BOW);
        item.addUnsafeEnchantment(Enchantment.ARROW_DAMAGE, 5);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        item.addUnsafeEnchantment(Enchantment.ARROW_FIRE, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cBow");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack axe_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        item.addUnsafeEnchantment(Enchantment.DAMAGE_ALL, 5);
        item.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cOMEGA AXE");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§7Wither II");
        lore.add("§7Blidness II");
        lore.add("§7Slowness II");
        lore.add("§7Poison II");
        lore.add("§aCost : 64 Fire");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

}
