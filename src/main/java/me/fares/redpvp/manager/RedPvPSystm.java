package me.fares.redpvp.manager;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.HashMap;
import java.util.Map;

public class RedPvPSystm {

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
}
