package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class LockedCMD implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String arg2, String[] args) {

        if (s instanceof Player) {
            Player p = (Player) s;
            if (p.hasPermission("redpvp.locked")) {

                ItemStack hand = p.getInventory().getItemInHand();

                if (hand.getType() != null && hand.getType() != Material.AIR) {
                    p.setItemInHand(null);

                    ItemStack item = new ItemStack(hand);
                    ItemMeta meta = item.getItemMeta();
                    ArrayList<String> lore = new ArrayList<>(1);
                    lore.add("§e  ");
                    lore.add("§c§lLOCKED");
                    meta.setLore(lore);
                    item.setItemMeta(meta);

                    p.setItemInHand(item);
                    p.sendMessage(RedPvP.PREFIX + "§aYou will added locked for your item in hand");
                    return true;

                } else {
                    p.sendMessage(RedPvP.PREFIX + "§cyour item in hand is null");
                }
            } else {
                p.sendMessage(RedPvP.NO_PERMS);
                return true;
            }
        } else {
            s.sendMessage(RedPvP.PREFIX + "§cSorry but you can`t do this");
            return true;
        }
        return true;

    }
}
