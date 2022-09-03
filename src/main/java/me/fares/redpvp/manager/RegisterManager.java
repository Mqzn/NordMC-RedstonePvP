package me.fares.redpvp.manager;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.commands.*;
import me.fares.redpvp.enderchest.EnderChest;
import me.fares.redpvp.enderchest.OpenEnderChest;
import me.fares.redpvp.enderchest.OpenEnderChestINV;
import me.fares.redpvp.fireshop.FireShop;
import me.fares.redpvp.listeners.*;
import me.fares.redpvp.shop.Armor;
import me.fares.redpvp.shop.Axes;
import me.fares.redpvp.shop.Food;
import me.fares.redpvp.shop.Interact;
import me.fares.redpvp.warp.WarpInteract;
import org.bukkit.Bukkit;

import java.util.Arrays;

public class RegisterManager {

    public static void Register() {
        Arrays.asList(new JoinEvent(), new CancelledEvent(), new QuitEvent(), new Chat(),
                new ItemFrameListener(), new RightClickBlockEvent(), new Repir(),
                new FireShop(), new Interact(), new Armor(), new Axes(), new Food(), new OpenEnderChest(),
                new OpenEnchanting(), new EnderChest(), new OpenEnderChestINV(), new WarpInteract(),
                new ChestListener(), new DailyKitHandler(), new EntityDamageEvent(), new DamgeeEvent(),
                new MoveEvent(), new CombatCommands(), new LeftClickBlockEvent(),
                new WarpListener()).forEach(listener ->
                Bukkit.getPluginManager().registerEvents(listener, RedPvP.getInstance()));

        RedPvP.getInstance().getCommand("stats").setExecutor(new Stats());
        RedPvP.getInstance().getCommand("ps").setExecutor(new PS());
        RedPvP.getInstance().getCommand("reset").setExecutor(new ResetStats());
        RedPvP.getInstance().getCommand("setspawn").setExecutor(new SetSpawn());
        RedPvP.getInstance().getCommand("top").setExecutor(new Top());
        RedPvP.getInstance().getCommand("setlocation").setExecutor(new Setlocation());
        RedPvP.getInstance().getCommand("trash").setExecutor(new Trash());
        RedPvP.getInstance().getCommand("spawn").setExecutor(new Spawn());
        RedPvP.getInstance().getCommand("locked").setExecutor(new LockedCMD());
        RedPvP.getInstance().getCommand("kit").setExecutor(new Kit());
        RedPvP.getInstance().getCommand("settop").setExecutor(new SetTop());
        RedPvP.getInstance().getCommand("fire").setExecutor(new FireCommand());
        RedPvP.getInstance().getCommand("setzone").setExecutor(new SetZoneCommand());
    }
}
