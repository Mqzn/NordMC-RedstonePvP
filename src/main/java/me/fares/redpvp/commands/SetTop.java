package me.fares.redpvp.commands;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.List;

public class SetTop implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String arg2, String[] args) {

        if (s instanceof Player) {
            Player p = (Player) s;
            if (p.hasPermission("redpvp.settop")) {
                if (args.length == 0) {


                    final ArmorStand leaderboard = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, 1.400, 0), EntityType.ARMOR_STAND);
                    leaderboard.setVisible(false);
                    leaderboard.setCanPickupItems(true);
                    leaderboard.setSmall(true);
                    leaderboard.setGravity(false);
                    leaderboard.setCustomName("§cLeaderboard - Sorted By Kills");
                    leaderboard.setCustomNameVisible(true);

                    //----------------

                    final ArmorStand yellow = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, 1.0, 0), EntityType.ARMOR_STAND);
                    yellow.setVisible(false);
                    yellow.setCanPickupItems(true);
                    yellow.setSmall(true);
                    yellow.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(1) != null) {
                        yellow.setCustomName("§c#1" + RedPvP.getInstance().getKills().GetTopNumber(1));
                    } else {
                        yellow.setCustomName("§c#1 §aLOADING...");
                    }
                    yellow.setCustomNameVisible(true);

                    //-----------------------

                    final ArmorStand red = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, 0.750, 0), EntityType.ARMOR_STAND);
                    red.setVisible(false);
                    red.setCanPickupItems(true);
                    red.setSmall(true);
                    red.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(2) != null) {
                        red.setCustomName("§c#2" + RedPvP.getInstance().getKills().GetTopNumber(2));
                    } else {
                        red.setCustomName("§c#2 §aLOADING...");
                    }
                    red.setCustomNameVisible(true);

//-----------------------

                    final ArmorStand green = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, 0.500, 0), EntityType.ARMOR_STAND);
                    green.setVisible(false);
                    green.setCanPickupItems(true);
                    green.setSmall(true);
                    green.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(3) != null) {
                        green.setCustomName("§c#3" + RedPvP.getInstance().getKills().GetTopNumber(3));
                    } else {
                        green.setCustomName("§c#3 §aLOADING...");
                    }
                    green.setCustomNameVisible(true);
//-----------------------

                    final ArmorStand blue = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, 0.250, 0), EntityType.ARMOR_STAND);
                    blue.setVisible(false);
                    blue.setCanPickupItems(true);
                    blue.setSmall(true);
                    blue.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(4) != null) {
                        blue.setCustomName("§c#4" + RedPvP.getInstance().getKills().GetTopNumber(4));
                    } else {
                        blue.setCustomName("§c#4 §aLOADING...");
                    }
                    blue.setCustomNameVisible(true);
//-----------------------

                    final ArmorStand cyan = (ArmorStand) p.getWorld().spawnEntity(p.getLocation(), EntityType.ARMOR_STAND);
                    cyan.setVisible(false);
                    cyan.setCanPickupItems(true);
                    cyan.setSmall(true);
                    cyan.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(5) != null) {
                        cyan.setCustomName("§c#5" + RedPvP.getInstance().getKills().GetTopNumber(5));
                    } else {
                        cyan.setCustomName("§c#5 §aLOADING...");
                    }
                    cyan.setCustomNameVisible(true);
//
//-----------------------

                    final ArmorStand aqua = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, -0.250, 0), EntityType.ARMOR_STAND);
                    aqua.setVisible(false);
                    aqua.setCanPickupItems(true);
                    aqua.setSmall(true);
                    aqua.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(6) != null) {
                        aqua.setCustomName("§c#6" + RedPvP.getInstance().getKills().GetTopNumber(6));
                    } else {
                        aqua.setCustomName("§c#6 §aLOADING...");
                    }
                    aqua.setCustomNameVisible(true);
//
//-----------------------

                    final ArmorStand orange = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, -0.500, 0), EntityType.ARMOR_STAND);
                    orange.setVisible(false);
                    orange.setCanPickupItems(true);
                    orange.setSmall(true);
                    orange.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(7) != null) {
                        orange.setCustomName("§c#7" + RedPvP.getInstance().getKills().GetTopNumber(7));
                    } else {
                        orange.setCustomName("§c#7 §aLOADING...");
                    }
                    orange.setCustomNameVisible(true);
//
//-----------------------

                    final ArmorStand pink = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, -0.750, 0), EntityType.ARMOR_STAND);
                    pink.setVisible(false);
                    pink.setCanPickupItems(true);
                    pink.setSmall(true);
                    pink.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(8) != null) {
                        pink.setCustomName("§c#8" + RedPvP.getInstance().getKills().GetTopNumber(8));
                    } else {
                        pink.setCustomName("§c#8 §aLOADING...");
                    }
                    pink.setCustomNameVisible(true);
//-----------------------

                    final ArmorStand White = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, -1.0, 0), EntityType.ARMOR_STAND);
                    White.setVisible(false);
                    White.setCanPickupItems(true);
                    White.setSmall(true);
                    White.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(9) != null) {
                        White.setCustomName("§c#9" + RedPvP.getInstance().getKills().GetTopNumber(9));
                    } else {
                        White.setCustomName("§c#9 §aLOADING...");
                    }
                    White.setCustomNameVisible(true);
//-----------------------

                    final ArmorStand silver = (ArmorStand) p.getWorld().spawnEntity(p.getLocation().add(0, -1.250, 0), EntityType.ARMOR_STAND);
                    silver.setVisible(false);
                    silver.setCanPickupItems(true);
                    silver.setSmall(true);
                    silver.setGravity(false);
                    if (RedPvP.getInstance().getKills().GetTopNumber(10) != null) {
                        silver.setCustomName("§c#10" + RedPvP.getInstance().getKills().GetTopNumber(10));
                    } else {
                        silver.setCustomName("§c#10 §aLOADING...");
                    }
                    silver.setCustomNameVisible(true);


                } else if (args.length == 1 && args[0].equalsIgnoreCase("remove")) {
                    World w = RedPvP.getInstance().getWarp("Spawn").getWorld();


                    List<Entity> entlist = w.getEntities();
                    for (Entity cart : entlist) {


                        if (cart instanceof Item) {
                            cart.remove();
                        } else if (cart instanceof ArmorStand) {
                            if (cart.getCustomName() != null) {
                                if (cart.getCustomName().startsWith("§c#")) {
                                    cart.remove();

                                } else if (cart.getCustomName().startsWith("§cLeaderboard")) {
                                    cart.remove();

                                }
                            }
                        }
                    }
                    p.sendMessage(RedPvP.PREFIX + "§eThe §aTop Kills §ehas been removed.");
                }

            }

        } else {
            s.sendMessage(RedPvP.PREFIX + "§cYou can`t do it");
        }
        return false;

    }

    public ItemStack item(Player p) {
        ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setOwner(p.getName());
        item.setItemMeta(meta);
        return item;
    }

    public ItemStack item(OfflinePlayer p) {
        ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        meta.setOwner(p.getName());
        item.setItemMeta(meta);
        return item;
    }
}
