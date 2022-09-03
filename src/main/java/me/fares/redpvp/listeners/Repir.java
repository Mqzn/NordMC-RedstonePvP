package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class Repir implements Listener {

    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Action action = e.getAction();
        Player p = e.getPlayer();
        Block block = e.getClickedBlock();

        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block.getType().equals(Material.ANVIL)) {
                e.setCancelled(true);
                if (p.getItemInHand().getType() != null && p.getItemInHand().getType() == Material.DIAMOND_SWORD ||
                        p.getItemInHand().getType() == Material.BOW || p.getItemInHand().getType() == Material.DIAMOND_HELMET ||
                        p.getItemInHand().getType() == Material.DIAMOND_AXE ||
                        p.getItemInHand().getType() == Material.DIAMOND_CHESTPLATE || p.getItemInHand().getType() == Material.DIAMOND_CHESTPLATE ||
                        p.getItemInHand().getType() == Material.DIAMOND_LEGGINGS || p.getItemInHand().getType() == Material.DIAMOND_BOOTS) {

                    if (p.getItemInHand().getDurability() != 0) {

                        if (RedPvP.getInstance().getSystem().item(p, Material.GOLD_INGOT, 1)) {

                            p.getItemInHand().setDurability((short) 0);
                            p.playSound(p.getLocation(), Sound.ANVIL_USE, 1.0F, 1.0F);
                            p.sendMessage(RedPvP.PREFIX + "§7 - 1 §6Gold");

                        } else {
                            p.sendMessage(RedPvP.PREFIX + "§cSorry but you need 1 Gold to repair.");
                            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
                        }
                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cYou can`t repair this item !");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);

                    }
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou can`t repair this item !");
                    p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);

                }

            }


        }
    }
}
	 
	

