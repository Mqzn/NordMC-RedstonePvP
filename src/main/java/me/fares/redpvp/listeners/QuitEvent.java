package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.board.FastBoard;
import me.fares.redpvp.combat.CombatManager;
import me.fares.redpvp.utils.RedPvPPlayer;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import org.bukkit.Effect;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;

import java.text.DecimalFormat;

public class QuitEvent implements Listener {

    public boolean insideSpawn(final Location loc, final Location point1, final Location point2) {
        final int minX = Math.min(point1.getBlockX(), point2.getBlockX());
        final int minY = Math.min(point1.getBlockY(), point2.getBlockY());
        final int minZ = Math.min(point1.getBlockZ(), point2.getBlockZ());
        final int maxX = Math.max(point1.getBlockX(), point2.getBlockX());
        final int maxY = Math.max(point1.getBlockY(), point2.getBlockY());
        final int maxZ = Math.max(point1.getBlockZ(), point2.getBlockZ());
        return loc.getX() >= minX && loc.getY() >= minY && loc.getZ() >= minZ && loc.getX() <= maxX && loc.getY() <= maxY && loc.getZ() <= maxZ;
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent e) {
        Player p = e.getPlayer();

        e.setQuitMessage(null);

        CombatManager.getInstance().removeFromCombat(p.getUniqueId());

        FastBoard board = RedPvP.getInstance().getScoreboardListener().boards.remove(p.getUniqueId());
        if (board != null) {
            board.delete();
        }

        RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
        player.SaveData();


        if (insideSpawn(p.getLocation(), RedPvP.getInstance().getWarp("spawn1"), RedPvP.getInstance().getWarp("spawn2"))) {
            return;

        }

        RedPvP.getInstance().getredpvpplayer().remove(p);


    }


    private void registerMessageKiller(Player k, Player p) {
        String displayName = p.getDisplayName();

        Damageable d = k;
        DecimalFormat df = new DecimalFormat("##.##");
        String health = df.format(d.getHealth() / 2.0D);
        k.sendMessage(RedPvP.PREFIX + "§aYou have killed " + displayName + " §awith §c" + health
                + "§c❤ §aleft.");


    }

    private void registerMessageDeaather(Player p, Player k) {
        String displayName = k.getDisplayName();
        Damageable d = k;
        DecimalFormat df = new DecimalFormat("##.##");
        String health = df.format(d.getHealth() / 2.0D);
        p.sendMessage(RedPvP.PREFIX + "§aYou have been killed by " + displayName + " §awith §c"
                + health + "§c❤ §aleft.");

    }


    @SuppressWarnings("deprecation")
    private void SetUpKiller(Player p, Player k, RedPvPPlayer player) {


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


        if (p.getGameMode() != GameMode.CREATIVE) {
            p.setLevel(0);
            p.setHealth(20.0);
        }

        System.out.println(player.getP().getName() + " KILLED BY " + player.getKiller().getName());
        k.playEffect(p.getLocation().add(0, 1, 0), Effect.STEP_SOUND, 152);

        MinecraftServer.getServer().postToMainThread(() -> p.setGameMode(GameMode.SURVIVAL));
        MinecraftServer.getServer().postToMainThread(() -> p.teleport(RedPvP.getInstance().getWarp("Spawn")));


        //-----------------------------------------------------[Message]-----------------------------------------------------

        registerMessageDeaather(p, k);
        registerMessageKiller(k, p);

        //-----------------------------------------------------[Message]-----------------------------------------------------


        //-----------------------------------------------------[Stats]-----------------------------------------------------

        RedPvP.getInstance().getKills().addKillRedPvP(k, 1);
        RedPvP.getInstance().getDeaths().addDeathRedPvP(p, 1);


        //-----------------------------------------------------[Stats]-----------------------------------------------------

    }


}
