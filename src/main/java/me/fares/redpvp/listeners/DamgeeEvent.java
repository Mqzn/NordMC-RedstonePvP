package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DamgeeEvent implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onHit(EntityDamageByEntityEvent e) {
        if (e.isCancelled()) return;
            if (e.getEntity() instanceof Player && e.getDamager() instanceof Player) {
                Player p = (Player) e.getEntity();
                RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
                Player k = (Player) e.getDamager();

                if (RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone1"), RedPvP.getInstance().getLocation("Zone2")) ||
                        RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone3"), RedPvP.getInstance().getLocation("Zone4")) ||
                        RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone5"), RedPvP.getInstance().getLocation("Zone6")) ||
                        RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone7"), RedPvP.getInstance().getLocation("Zone8"))) {
                    e.setCancelled(true);
                    return;
                }

                RedPvPPlayer playerk = RedPvP.getInstance().getredpvpplayer().get(k);

                //-------------------------------------------------[Axes]-------------------------------
                if (k.getItemInHand().hasItemMeta() && k.getItemInHand().getItemMeta().hasDisplayName() && k.getItemInHand().getType() == Material.DIAMOND_AXE) {

                    if (k.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§7POISON AXES")) {

                        p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 5, 1));
                        p.getWorld().dropItem(p.getLocation(), new ItemStack(Material.REDSTONE, 4));
                        p.getWorld().playEffect(p.getLocation(), Effect.POTION_BREAK, 10);

                    } else if (k.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§7BLINDNESS AXES")) {
                        p.getWorld().dropItem(p.getLocation(), new ItemStack(Material.REDSTONE, 4));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 5, 1));
                        p.getWorld().playEffect(p.getLocation(), Effect.POTION_BREAK, 10);

                    } else if (k.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§7WITHER AXES")) {
                        p.getWorld().dropItem(p.getLocation(), new ItemStack(Material.REDSTONE, 4));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20 * 5, 1));
                        p.getWorld().playEffect(p.getLocation(), Effect.POTION_BREAK, 10);

                    } else if (k.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§7SLOWNESS AXES")) {
                        p.getWorld().dropItem(p.getLocation(), new ItemStack(Material.REDSTONE, 4));

                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20 * 5, 1));
                        p.getWorld().playEffect(p.getLocation(), Effect.POTION_BREAK, 10);

                    } else if (k.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§7OMEGA AXES")) {
                        p.getWorld().dropItem(p.getLocation(), new ItemStack(Material.REDSTONE, 4));

                        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 20 * 5, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 20 * 5, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 20 * 5, 1));
                        p.addPotionEffect(new PotionEffect(PotionEffectType.POISON, 20 * 5, 1));
                        p.getWorld().playEffect(p.getLocation(), Effect.POTION_BREAK, 10);


                    } else if (k.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§7Strength AXES")) {
                        p.getWorld().dropItem(p.getLocation(), new ItemStack(Material.REDSTONE, 4));

                        k.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 20 * 5, 1));
                        p.getWorld().playEffect(p.getLocation(), Effect.POTION_BREAK, 10);


                    }

                } else if (k.getItemInHand().getType() == Material.DIAMOND_SWORD) {
                    p.getWorld().dropItem(p.getLocation(), new ItemStack(Material.REDSTONE, 3));

                }


                //-------------------------------------------------[Axes]-------------------------------


                if (RedPvP.getInstance().getCombat().CombatTite.containsKey(k)) {
                    playerk.setKiller(p);
                    RedPvP.getInstance().getCombat().CombatTite.put(p, 15);

                } else {
                    playerk.setKiller(p);
                    RedPvP.getInstance().getCombat().CombatTite.put(p, 15);
                    k.sendMessage(RedPvP.PREFIX + "§7You`r now in Combat §c§lDONT LEAVE THE SERVER");

                }


                if (RedPvP.getInstance().getCombat().CombatTite.containsKey(p)) {
                    player.setKiller(k);
                    RedPvP.getInstance().getCombat().CombatTite.put(k, 15);


                } else {
                    player.setKiller(k);
                    RedPvP.getInstance().getCombat().CombatTite.put(k, 15);
                    p.sendMessage(RedPvP.PREFIX + "§7You`r now in Combat §c§lDONT LEAVE THE SERVER");

                }


                if (p.getHealth() - e.getFinalDamage() <= 0) {
                    if (RedPvP.getInstance().getCombat().CombatTite.containsKey(k)) {
                        playerk.setKiller(p);
                        RedPvP.getInstance().getCombat().CombatTite.put(p, 15);

                    } else {
                        playerk.setKiller(p);
                        RedPvP.getInstance().getCombat().CombatTite.put(p, 15);
                        k.sendMessage(RedPvP.PREFIX + "§7You`r now in Combat §c§lDONT LEAVE THE SERVER");

                    }


                    if (RedPvP.getInstance().getCombat().CombatTite.containsKey(p)) {
                        player.setKiller(k);
                        RedPvP.getInstance().getCombat().CombatTite.put(k, 15);


                    } else {
                        player.setKiller(k);
                        RedPvP.getInstance().getCombat().CombatTite.put(k, 15);
                        p.sendMessage(RedPvP.PREFIX + "§7You`r now in Combat §c§lDONT LEAVE THE SERVER");

                    }
                }


            } else if (e.getDamager() instanceof Arrow) {
                Arrow arrow = (Arrow) e.getDamager();
                if (arrow.getShooter() instanceof Player) {
                    Player p = (Player) e.getEntity();
                    RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
                    Player k = (Player) arrow.getShooter();

                    if (p != k) {
                        if (RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone1"), RedPvP.getInstance().getLocation("Zone2")) ||
                                RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone3"), RedPvP.getInstance().getLocation("Zone4")) ||
                                RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone5"), RedPvP.getInstance().getLocation("Zone6")) ||
                                RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone7"), RedPvP.getInstance().getLocation("Zone8"))) {
                            e.setCancelled(true);
                            return;
                        }
                        RedPvPPlayer playerk = RedPvP.getInstance().getredpvpplayer().get(k);

                        if (RedPvP.getInstance().getCombat().CombatTite.containsKey(k)) {
                            playerk.setKiller(p);
                            RedPvP.getInstance().getCombat().CombatTite.put(p, 15);

                        } else {
                            playerk.setKiller(p);
                            RedPvP.getInstance().getCombat().CombatTite.put(p, 15);
                            k.sendMessage(RedPvP.PREFIX + "§7You`r now in Combat §c§lDONT LEAVE THE SERVER");

                        }


                        if (RedPvP.getInstance().getCombat().CombatTite.containsKey(p)) {
                            player.setKiller(k);
                            RedPvP.getInstance().getCombat().CombatTite.put(k, 15);


                        } else {
                            player.setKiller(k);
                            RedPvP.getInstance().getCombat().CombatTite.put(k, 15);
                            p.sendMessage(RedPvP.PREFIX + "§7You`r now in Combat §c§lDONT LEAVE THE SERVER");
                        }
                    }
                }
            }
        }
}






