package me.fares.redpvp.warp;

import me.fares.redpvp.RedPvP;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class WarpMenu {

    public ItemStack nordMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRjZmYxYWNjMTJmMTZkNDRhZWUxZjdlODQ0MTRjYjJlOGVhN2ViNDY0MmU3ZDI5MmQ3NmYxYzE3YjRiNDM0YSJ9fX0="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Nord+ Rank Warp");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack epicMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRjZmYxYWNjMTJmMTZkNDRhZWUxZjdlODQ0MTRjYjJlOGVhN2ViNDY0MmU3ZDI5MmQ3NmYxYzE3YjRiNDM0YSJ9fX0="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Epic Rank Warp");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack legendMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRjZmYxYWNjMTJmMTZkNDRhZWUxZjdlODQ0MTRjYjJlOGVhN2ViNDY0MmU3ZDI5MmQ3NmYxYzE3YjRiNDM0YSJ9fX0="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Legend Rank Warp");
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack superMenu() {
        ItemStack item = new ItemStack(RedPvP.getInstance().getHead().getCustomSkull("eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGRjZmYxYWNjMTJmMTZkNDRhZWUxZjdlODQ0MTRjYjJlOGVhN2ViNDY0MmU3ZDI5MmQ3NmYxYzE3YjRiNDM0YSJ9fX0="));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Super Rank Warp");
        item.setItemMeta(meta);
        return item;
    }
}
