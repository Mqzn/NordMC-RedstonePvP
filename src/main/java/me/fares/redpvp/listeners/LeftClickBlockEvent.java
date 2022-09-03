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
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.HashMap;
import java.util.Map;

public class LeftClickBlockEvent implements Listener {

    public boolean item(Player ply, Material type, int amount) {
        PlayerInventory inv = ply.getInventory();
        int available = 0;
        Map<Integer, ItemStack> items = new HashMap<>();
        for (int i = 0; i < inv.getSize(); i++) {
            ItemStack stack = inv.getItem(i);
            if (stack != null && stack.getType() == type) {
                items.put(Integer.valueOf(i), stack);
                available += stack.getAmount();
            }
        }
        if (available < amount)
            return false;
        int unpaidAmount = amount;
        for (Map.Entry<Integer, ItemStack> stackEntry : items.entrySet()) {
            int invSlot = stackEntry.getKey().intValue();
            ItemStack stack = stackEntry.getValue();
            if (stack.getAmount() < unpaidAmount) {
                unpaidAmount -= stack.getAmount();
                inv.setItem(invSlot, null);
                continue;
            }
            if (stack.getAmount() == unpaidAmount) {
                inv.setItem(invSlot, null);
                break;
            }
            stack.setAmount(stack.getAmount() - unpaidAmount);
            break;
        }
        ply.updateInventory();
        return true;
    }

    public boolean checkslots(Player player, int solt) {
        PlayerInventory inv = player.getInventory();
        int check = 0;
        for (ItemStack item : inv.getContents()) {
            if (item == null) {
                check++;
            }
        }
        return check > solt;
    }


    @EventHandler
    public void onInteract(PlayerInteractEvent e) {
        Action action = e.getAction();
        Player p = e.getPlayer();
        Block block = e.getClickedBlock();

        //-----------------------------------------------[Spawn]---------------------------------------

        if (action.equals(Action.LEFT_CLICK_BLOCK)) {


            if (block.getType().equals(Material.GOLD_BLOCK)) {
                e.setCancelled(true);
                if (checkslots(p, 0)) {
                    if (item(p, Material.GOLD_INGOT, 1)) {
                        p.getInventory().addItem(new ItemStack(Material.REDSTONE, 64));
                        p.updateInventory();
                        p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1.0F, 1.0F);
                        return;
                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cSorry but you need 1 §6Gold §cto transfer.");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
                    }
                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don't have aviliable slots");
                }
            } else if (block.getType().equals(Material.EMERALD_BLOCK)) {
                e.setCancelled(true);
                if (checkslots(p, 0)) {

                    if (item(p, Material.EMERALD, 1)) {
                        p.getInventory().addItem(new ItemStack(Material.GOLD_INGOT, 2));
                        p.updateInventory();
                        p.playSound(p.getLocation(), Sound.CHICKEN_EGG_POP, 1.0F, 1.0F);
                        return;
                    } else {
                        p.sendMessage(RedPvP.PREFIX + "§cSorry but you need 1 §aEmerald §cto transfer.");
                        p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 1.0F);
                    }

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cYou don't have aviliable slots");
                }

            }

        }

    }
}
