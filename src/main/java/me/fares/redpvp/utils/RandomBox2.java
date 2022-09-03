package me.fares.redpvp.utils;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;


public class RandomBox2 {


    public Map<Player, Integer> tite = new HashMap<>();

    @SuppressWarnings("deprecation")
    public void Run() {


        if (tite.size() > 0) {

            List<Player> players = new ArrayList<>(tite.keySet());


            for (Player all : players) {

                Integer Int = tite.get(all);

                if (Int > 0) {

                    Int = Int - 1;
                    tite.put(all, Int);

                    if (Int == 3) {

                        all.sendTitle("§e▅▃▃", "§7");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }

                    if (Int == 2) {

                        all.sendTitle("§e▃▅▃", "§7");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }

                    if (Int == 1) {

                        all.sendTitle("§e▃▃▅", "§7");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }


                } else {

                    if (tite.containsKey(all) && all.isOnline()) {
                        all.sendTitle("§d✧", "§7");
                        ItemStack random = null;

                        Random r = new Random();

                        int fares = r.nextInt(23);

                        switch (fares) {
                            case 0:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 1:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 2:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 3:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 4:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 5:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 6:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 7:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 8:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 9:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 10:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 11:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;


                            //-----------------------------------

                            case 12:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                break;

                            case 13:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            case 14:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                break;

                            case 15:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            //--------------------------------------

                            case 16:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                break;


                            case 17:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 2);
                                break;


                            case 18:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                break;


                            case 19:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 1);
                                break;

                            //-----------------------------------------


                            case 20:
                                random = new ItemStack(Material.getMaterial(322), 1, (short) 2);
                                break;

                            case 21:
                                random = new ItemStack(Material.EMERALD, 2);
                                break;


                            case 22:
                                random = new ItemStack(Material.REDSTONE, 64);
                                break;


                        }


                        ItemStack random2 = null;

                        Random r2 = new Random();

                        int fares2 = r2.nextInt(23);

                        switch (fares2) {
                            case 0:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 1:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 2:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 3:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 4:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 5:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 6:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 7:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 8:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 9:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 10:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 11:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;


                            //-----------------------------------

                            case 12:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                break;

                            case 13:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            case 14:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                break;

                            case 15:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            //--------------------------------------

                            case 16:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                break;


                            case 17:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 2);
                                break;


                            case 18:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                break;


                            case 19:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 1);
                                break;

                            //-----------------------------------------


                            case 20:
                                random = new ItemStack(Material.getMaterial(322), 1, (short) 2);
                                break;

                            case 21:
                                random = new ItemStack(Material.EMERALD, 2);
                                break;


                            case 22:
                                random = new ItemStack(Material.REDSTONE, 64);
                                break;


                        }


                        ItemStack random3 = null;

                        Random r3 = new Random();

                        int fares3 = r3.nextInt(23);

                        switch (fares3) {
                            case 0:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 1:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 2:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 3:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 4:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 5:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 6:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 7:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 8:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 9:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 10:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 11:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;


                            //-----------------------------------

                            case 12:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                break;

                            case 13:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            case 14:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                break;

                            case 15:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            //--------------------------------------

                            case 16:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                break;


                            case 17:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 2);
                                break;


                            case 18:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                break;


                            case 19:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 1);
                                break;

                            //-----------------------------------------


                            case 20:
                                random = new ItemStack(Material.getMaterial(322), 1, (short) 2);
                                break;

                            case 21:
                                random = new ItemStack(Material.EMERALD, 2);
                                break;


                            case 22:
                                random = new ItemStack(Material.REDSTONE, 64);
                                break;


                        }


                        ItemStack random4 = null;

                        Random r4 = new Random();

                        int fares4 = r4.nextInt(23);

                        switch (fares4) {
                            case 0:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 1:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 2:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 3:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 4:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 5:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 6:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 7:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 2);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                                break;

                            case 8:
                                random = new ItemStack(Material.DIAMOND_HELMET);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 9:
                                random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 10:
                                random = new ItemStack(Material.DIAMOND_LEGGINGS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;

                            case 11:
                                random = new ItemStack(Material.DIAMOND_BOOTS);
                                random.addEnchantment(Enchantment.DURABILITY, 3);
                                random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                                random.addEnchantment(Enchantment.THORNS, 2);
                                break;


                            //-----------------------------------

                            case 12:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                break;

                            case 13:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 4);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            case 14:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                break;

                            case 15:
                                random = new ItemStack(Material.DIAMOND_SWORD);
                                random.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                                random.addEnchantment(Enchantment.KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                                break;

                            //--------------------------------------

                            case 16:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                break;


                            case 17:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 2);
                                break;


                            case 18:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                break;


                            case 19:
                                random = new ItemStack(Material.BOW);
                                random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                                random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 2);
                                random.addEnchantment(Enchantment.ARROW_FIRE, 1);
                                break;

                            //-----------------------------------------


                            case 20:
                                random = new ItemStack(Material.getMaterial(322), 1, (short) 2);
                                break;

                            case 21:
                                random = new ItemStack(Material.EMERALD, 2);
                                break;


                            case 22:
                                random = new ItemStack(Material.REDSTONE, 64);
                                break;


                        }
                        all.getInventory().addItem(random);
                        all.getInventory().addItem(random2);
                        all.getInventory().addItem(random3);
                        all.getInventory().addItem(random4);
                        all.playSound(all.getLocation(), Sound.CHICKEN_EGG_POP, 1.0F, 1.0F);


                        tite.remove(all);

                    } else tite.remove(all);


                }


            }


        }

    }
}

