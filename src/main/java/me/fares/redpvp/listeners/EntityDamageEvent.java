package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import java.text.DecimalFormat;


public class EntityDamageEvent implements Listener {

    @SuppressWarnings("deprecation")
    @EventHandler(priority = EventPriority.MONITOR)
    public void onDamage(org.bukkit.event.entity.EntityDamageEvent e) {
        if (e.isCancelled()) return;
            Entity entity = e.getEntity();
            DamageCause cause = e.getCause();
            if (RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone1"), RedPvP.getInstance().getLocation("Zone2")) ||
                    RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone3"), RedPvP.getInstance().getLocation("Zone4")) ||
                    RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone5"), RedPvP.getInstance().getLocation("Zone6")) ||
                    RedPvP.getInstance().getGeometrics().insideSpawn(e.getEntity().getLocation(), RedPvP.getInstance().getLocation("Zone7"), RedPvP.getInstance().getLocation("Zone8"))) {
                e.setCancelled(true);
                return;
            }
            if (cause == DamageCause.FALL) {
                e.setCancelled(true);
            } else if (entity instanceof Player) {
                Player p = (Player) entity;
                if (p.getHealth() - e.getFinalDamage() <= 0) {
                    if (!e.isCancelled()) {
                        e.setCancelled(true);
                        p.closeInventory();
                        p.setGameMode(GameMode.SPECTATOR);
                        ItemDropAndClear(p);
                        p.teleport(RedPvP.getInstance().getWarp("Spawn"));
                        RedPvP.getInstance().getStopTite().tite.put(p, 3);
                        RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
                        player.addDeath();


                        Player k = player.getKiller();


                        if (k == null) {
                            p.sendMessage(RedPvP.PREFIX + "§cYou Dead");
                            return;
                        }


                        if (k != null) {


                            p.sendMessage(RedPvP.PREFIX + "§aYou`re no longer in combat.");
                            k.playEffect(p.getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);
                            System.out.print(player.getP().getName() + " KILLED BY " + player.getKiller().getName());

                            p.sendTitle("§cYou Dead", "§c:(");
                            registerMessageDeaather(p, k);
                            registerMessageKiller(k, p);
                            RedPvPPlayer playerk = RedPvP.getInstance().getredpvpplayer().get(k);
                            playerk.addKill();
                            player.setKiller(null);
                            RedPvP.getInstance().getCombat().CombatTite.remove(p);
                            return;


                        }
                    }
                }
        }
        }


    private void registerMessageKiller(Player k, Player p) {
        Damageable d = k;
        DecimalFormat df = new DecimalFormat("##.##");
        String health = df.format(d.getHealth() / 2.0D);
        k.sendMessage(RedPvP.PREFIX + "§aYou have killed " + p.getName() + " §awith §c" + health
                + "§c❤ §aleft.");
    }


    private void registerMessageDeaather(Player p, Player k) {
        Damageable d = k;
        DecimalFormat df = new DecimalFormat("##.##");
        String health = df.format(d.getHealth() / 2.0D);
        p.sendMessage(RedPvP.PREFIX + "§aYou have been killed by " + k.getName() + " §awith §c"
                + health + "§c❤ §aleft.");

    }


    private void ItemDropAndClear(Player p) {


        for (int i = 0; i < p.getInventory().getSize(); i++) {
            ItemStack items = p.getInventory().getItem(i);
            if (items != null && items.getType() != Material.AIR) {
                if (items.hasItemMeta()) {
                    ItemMeta meta = items.getItemMeta();
                    if (meta.hasLore()) {
                        if (meta.getLore().contains("§c§lLOCKED") && items.getType() != Material.DIAMOND_AXE) {
                            p.getInventory().setItem(i, null);
                        } else if (items.getType() != Material.DIAMOND_AXE) {
                            p.getWorld().dropItem(p.getLocation(), items);
                            p.getInventory().setItem(i, null);
                        }
                    } else {
                        if (items.getType() != Material.DIAMOND_AXE) {
                            p.getWorld().dropItem(p.getLocation(), items);
                            p.getInventory().setItem(i, null);
                        }
                    }
                } else {
                    if (items.getType() != Material.DIAMOND_AXE) {
                        p.getWorld().dropItem(p.getLocation(), items);
                        p.getInventory().setItem(i, null);
                    }
                }
            }

        }


        ItemStack helmet = p.getInventory().getHelmet();
        ItemStack chestplate = p.getInventory().getChestplate();
        ItemStack leggings = p.getInventory().getLeggings();
        ItemStack boot = p.getInventory().getBoots();


        if (helmet != null) {

            if (helmet.hasItemMeta() && helmet.getItemMeta().hasLore() && helmet.getItemMeta().getLore().contains("§c§lLOCKED")) {
                p.getInventory().setHelmet(null);

            } else {
                p.getWorld().dropItem(p.getLocation(), helmet);
                p.getInventory().setHelmet(null);
            }

        }

        if (chestplate != null) {

            if (chestplate.hasItemMeta() && chestplate.getItemMeta().hasLore() && chestplate.getItemMeta().getLore().contains("§c§lLOCKED")) {
                p.getInventory().setChestplate(null);

            } else {
                p.getWorld().dropItem(p.getLocation(), chestplate);
                p.getInventory().setChestplate(null);
            }
        }

        if (leggings != null) {

            if (leggings.hasItemMeta() && leggings.getItemMeta().hasLore() && leggings.getItemMeta().getLore().contains("§c§lLOCKED")) {
                p.getInventory().setLeggings(null);

            } else {
                p.getWorld().dropItem(p.getLocation(), leggings);
                p.getInventory().setLeggings(null);
            }
        }

        if (boot != null) {

            if (boot.hasItemMeta() && boot.getItemMeta().hasLore() && boot.getItemMeta().getLore().contains("§c§lLOCKED")) {
                p.getInventory().setBoots(null);

            } else {
                p.getWorld().dropItem(p.getLocation(), boot);
                p.getInventory().setBoots(null);
            }
        }


        for (PotionEffect effect : p.getActivePotionEffects()) {
            p.removePotionEffect(effect.getType());
        }

    }
}


