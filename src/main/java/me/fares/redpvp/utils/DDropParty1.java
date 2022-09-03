package me.fares.redpvp.utils;

import net.minecraft.server.v1_8_R3.MinecraftServer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;


public class DDropParty1 {
    public Map<Block, Integer> tite = new HashMap<>();

    @SuppressWarnings("deprecation")
    public void Run() {


        if (tite.size() <= 0) {
            return;
        }

        List<Block> blocks = new ArrayList<>(tite.keySet());


        for (Block all : blocks) {

            Integer number = tite.get(all);

            if (number > 0) {

                number = number - 1;
                tite.put(all, number);


                ItemStack random = null;

                Random r = new Random();

                int fares = r.nextInt(23);

                switch (fares) {
                    case 0:
                        random = new ItemStack(Material.DIAMOND_HELMET);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                        break;

                    case 1:
                        random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                        break;

                    case 2:
                        random = new ItemStack(Material.DIAMOND_LEGGINGS);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                        break;

                    case 3:
                        random = new ItemStack(Material.DIAMOND_BOOTS);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
                        break;

                    case 4:
                        random = new ItemStack(Material.DIAMOND_HELMET);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                        break;

                    case 5:
                        random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                        break;

                    case 6:
                        random = new ItemStack(Material.DIAMOND_LEGGINGS);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                        break;

                    case 7:
                        random = new ItemStack(Material.DIAMOND_BOOTS);
                        random.addEnchantment(Enchantment.DURABILITY, 1);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                        break;

                    case 8:
                        random = new ItemStack(Material.DIAMOND_HELMET);
                        random.addEnchantment(Enchantment.DURABILITY, 3);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                        random.addEnchantment(Enchantment.THORNS, 1);
                        break;

                    case 9:
                        random = new ItemStack(Material.DIAMOND_CHESTPLATE);
                        random.addEnchantment(Enchantment.DURABILITY, 3);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                        random.addEnchantment(Enchantment.THORNS, 1);
                        break;

                    case 10:
                        random = new ItemStack(Material.DIAMOND_LEGGINGS);
                        random.addEnchantment(Enchantment.DURABILITY, 3);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                        random.addEnchantment(Enchantment.THORNS, 1);
                        break;

                    case 11:
                        random = new ItemStack(Material.DIAMOND_BOOTS);
                        random.addEnchantment(Enchantment.DURABILITY, 3);
                        random.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
                        random.addEnchantment(Enchantment.THORNS, 1);
                        break;


                    //-----------------------------------

                    case 12:
                        random = new ItemStack(Material.DIAMOND_SWORD);
                        random.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                        break;

                    case 13:
                        random = new ItemStack(Material.DIAMOND_SWORD);
                        random.addEnchantment(Enchantment.DAMAGE_ALL, 1);
                        random.addEnchantment(Enchantment.FIRE_ASPECT, 2);
                        break;

                    case 14:
                        random = new ItemStack(Material.DIAMOND_SWORD);
                        random.addEnchantment(Enchantment.DAMAGE_ALL, 3);
                        random.addEnchantment(Enchantment.KNOCKBACK, 1);
                        break;

                    case 15:
                        random = new ItemStack(Material.DIAMOND_SWORD);
                        random.addEnchantment(Enchantment.DAMAGE_ALL, 2);
                        random.addEnchantment(Enchantment.KNOCKBACK, 1);
                        random.addEnchantment(Enchantment.FIRE_ASPECT, 1);
                        break;

                    //--------------------------------------

                    case 16:
                        random = new ItemStack(Material.BOW);
                        random.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
                        break;


                    case 17:
                        random = new ItemStack(Material.BOW);
                        random.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
                        random.addEnchantment(Enchantment.ARROW_FIRE, 1);
                        break;


                    case 18:
                        random = new ItemStack(Material.BOW);
                        random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                        random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
                        break;


                    case 19:
                        random = new ItemStack(Material.BOW);
                        random.addEnchantment(Enchantment.ARROW_DAMAGE, 3);
                        random.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
                        random.addEnchantment(Enchantment.ARROW_FIRE, 1);
                        break;

                    //-----------------------------------------


                    case 20:
                        random = new ItemStack(Material.getMaterial(322), 1, (short) 1);
                        break;


                    case 21:
                        random = new ItemStack(Material.EMERALD);
                        break;


                    case 22:
                        random = new ItemStack(Material.REDSTONE, 32);
                        break;


                }

                ItemStack items = new ItemStack(random);


                if (number == 26) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }

                    });
                } else if (number == 25) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(0, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }

                    });
                } else if (number == 24) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(0, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 23) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 22) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, 0), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LARGE_BLAST, 1.0F, 1.0F);
                        }

                    });
                } else if (number == 21) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 20) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(0, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 19) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 18) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, 0), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 17) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 16) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(0, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 15) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 14) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, 0), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 13) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 12) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(0, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 11) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 1) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, 0), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 9) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 8) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(0, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LARGE_BLAST, 1.0F, 1.0F);
                        }

                        all.getLocation().add(0, 1, 0).getBlock().setType(Material.AIR);


                    });
                } else if (number == 7) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 6) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, 0), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 5) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(-1, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LARGE_BLAST, 1.0F, 1.0F);
                        }

                    });
                } else if (number == 4) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(0, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 3) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, -1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 2) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, 0), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_LAUNCH, 1.0F, 1.0F);
                        }
                    });
                } else if (number == 1) {
                    MinecraftServer.getServer().postToMainThread(() -> {
                        all.getLocation().getWorld().dropItem(all.getLocation().add(1, 1, 1), items);
                        for (Player online : Bukkit.getOnlinePlayers()) {
                            online.playSound(online.getLocation(), Sound.FIREWORK_TWINKLE2, 1.0F, 1.0F);
                        }
                    });
                }


            } else {

                tite.remove(all);


            }


        }


    }
}

