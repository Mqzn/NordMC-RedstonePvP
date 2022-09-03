package me.fares.redpvp.shop;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;

import java.util.ArrayList;

public class ShopMenu {


    public ItemStack glass() {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(Material.getMaterial(160), 1, (short) 15);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§7");
        item.setItemMeta(meta);
        return item;
    }

    //------------------------------------------[Golden Apple]------------------------------------------------------------
    public ItemStack GoldenAppleMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZGFiNmRhZjQ0MDg1MzJkN2NmODc0NzBhYTNmNWQ2MDY4MGZhYjYyZDhhYTcwOGM3ZmQ2YjBjNGRkNmMzZGEwIn19fQ=="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Golden Apple");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack goldeapple_1() {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(Material.getMaterial(322), 1, (short) 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bGolden Apple");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 1 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack goldeapple_5() {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(Material.getMaterial(322), 5, (short) 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§bGolden Apple");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 5 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack goldeapple_10() {
        @SuppressWarnings("deprecation")
        ItemStack item = new ItemStack(Material.getMaterial(322), 10, (short) 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§bGolden Apple");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 10 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    //------------------------------------------[pot ions]------------------------------------------------------------
    public ItemStack PotionsMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzgyY2RiYzZkNDUwNDZjYTA1OGNlMTUzZDkwYmRlNTZmYjgyZDJkMmI1MTA0YTEyNWUzMzEyMmVmYmEwOTFkYSJ9fX0="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Potions");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack speed_1() {
        @SuppressWarnings("deprecation")
        ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8226);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        meta.setDisplayName("§bSpeed");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 3 Emerald");
        meta.setLore(lore);
        potion.setItemMeta(meta);
        return potion;
    }

    public ItemStack fire_1() {
        @SuppressWarnings("deprecation")
        ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8227);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        meta.setDisplayName("§b§bFire Resistance");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 3 Emerald");
        meta.setLore(lore);
        potion.setItemMeta(meta);
        return potion;
    }

    public ItemStack strength_1() {
        @SuppressWarnings("deprecation")
        ItemStack potion = new ItemStack(Material.POTION, 1, (short) 8233);
        PotionMeta meta = (PotionMeta) potion.getItemMeta();
        meta.setDisplayName("§b§b§bStrength");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 5 Emerald");
        meta.setLore(lore);
        potion.setItemMeta(meta);
        return potion;
    }

    //------------------------------------------[Axes]------------------------------------------------------------

    public ItemStack AxesMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTk0YTVlOGZlYWY5NTlhNzI3ZDZmMDdmODM4MmRjMzkyODBlNDY2YzRkODgzMGViMGFiYzM4YzQ2NGJmZDdiYyJ9fX0="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§cAxes");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack PoisonAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§aPOISON AXES");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§7Poison II");
        lore.add("§e  ");
        lore.add("§aCost : 16 Emerald");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack WitherAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§aWITHER AXES");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§7Wither II");
        lore.add("§e  ");
        lore.add("§aCost : 20 Emerald");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack SlownessAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§aSLOWNESS AXES");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§7Slowness II");
        lore.add("§e  ");
        lore.add("§aCost : 20 Emerald");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack BlidnessAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§a§aBLINDNESS AXES");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§7Blidness II");
        lore.add("§e  ");
        lore.add("§aCost : 35 Emerald");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack OPAxe() {
        ItemStack item = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§c§cStrength AXES");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§7Strength I");
        lore.add("§e  ");
        lore.add("§aCost : 48 Emerald");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
        item.setItemMeta(meta);
        return item;
    }

    //------------------------------------------[Shop]------------------------------------------------------------

    public ItemStack ArmorMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTk3MTFlYmZmODZhMzM1YzVhMWI0ZmNkNTE1NGUzOTFiZWY0MzBiMGNmMWIyYmY4MzAxMzM1ZWMwZjI1ZjUwNCJ9fX0="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§aArmor §7And §aTools");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack helemt_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§bDIAMOND HELEMT");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack helemt_2() {
        ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        item.addEnchantment(Enchantment.DURABILITY, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§bDIAMOND HELEMT");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 8 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Chestplate_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§bDIAMOND CHESTPLATE");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Chestplate_2() {
        ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        item.addEnchantment(Enchantment.DURABILITY, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§bDIAMOND CHESTPLATE");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 8 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }


    public ItemStack Leggings_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§bDIAMOND LEGGINGS");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Leggings_2() {
        ItemStack item = new ItemStack(Material.DIAMOND_LEGGINGS);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        item.addEnchantment(Enchantment.DURABILITY, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§bDIAMOND LEGGINGS");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 8 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Boots_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§bDIAMOND BOOTS");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Boots_2() {
        ItemStack item = new ItemStack(Material.DIAMOND_BOOTS);
        item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 4);
        item.addEnchantment(Enchantment.DURABILITY, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§bDIAMOND BOOTS");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 8 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    //-------------------------------

    public ItemStack Sword_1() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§bDIAMOND SOWRD");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 4 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Sword_2() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§bDIAMOND SOWRD");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Sword_3() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        item.addEnchantment(Enchantment.KNOCKBACK, 2);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§b§bDIAMOND SOWRD");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 8 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Sword_4() {
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
        item.addEnchantment(Enchantment.DAMAGE_ALL, 4);
        item.addEnchantment(Enchantment.FIRE_ASPECT, 2);
        item.addEnchantment(Enchantment.KNOCKBACK, 2);
        item.addEnchantment(Enchantment.DURABILITY, 3);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§b§b§bDIAMOND SOWRD");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 10 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    //-------------------------------------------------[Bow]---------------------------------------------

    public ItemStack Bow_1() {
        ItemStack item = new ItemStack(Material.BOW);
        item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§bBow");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 4 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Bow_2() {
        ItemStack item = new ItemStack(Material.BOW);
        item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
        item.addEnchantment(Enchantment.ARROW_FIRE, 1);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§bBow");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 6 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Bow_3() {
        ItemStack item = new ItemStack(Material.BOW);
        item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
        item.addEnchantment(Enchantment.ARROW_FIRE, 1);
        item.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§bBow");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 8 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack Bow_4() {
        ItemStack item = new ItemStack(Material.BOW);
        item.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
        item.addEnchantment(Enchantment.ARROW_FIRE, 1);
        item.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
        item.addEnchantment(Enchantment.DURABILITY, 3);

        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§b§b§b§bBow");
        ArrayList<String> lore = new ArrayList<>(1);
        lore.add("§e  ");
        lore.add("§aCost : 10 Emerald");
        meta.setLore(lore);
        item.setItemMeta(meta);
        return item;
    }

    //=-=-=--=--=-==-==-=-=-=-=-=-=-=-=-=-=-==-=[EMERALD SHOP]-=-=-=-=-=-=-==-
}
