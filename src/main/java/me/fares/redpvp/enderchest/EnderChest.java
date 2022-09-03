package me.fares.redpvp.enderchest;

import me.fares.redpvp.RedPvP;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.io.File;
import java.io.IOException;


public class EnderChest implements Listener {


    public File config;
    public FileConfiguration cfg;

    public void loadEnderChestFile(Player p) {
        config = new File(RedPvP.getInstance().getDataFolder().toString(), p.getName() + ".yml");
        cfg = YamlConfiguration.loadConfiguration(config);

    }


    @EventHandler
    public void onClose(InventoryCloseEvent e) {

        if (e.getInventory().getName() == "EnderChest 1") {
            Inventory inv = e.getInventory();
            Player p = (Player) e.getPlayer();
            saveInventory1(inv, p);
            return;
        }

        if (e.getInventory().getName() == "EnderChest 2") {
            Inventory inv = e.getInventory();
            Player p = (Player) e.getPlayer();
            saveInventory2(inv, p);
            return;
        }

        if (e.getInventory().getName() == "EnderChest 3") {
            Inventory inv = e.getInventory();
            Player p = (Player) e.getPlayer();
            saveInventory3(inv, p);
            return;
        }

        if ("EnderChest 4".equals(e.getInventory().getName())) {
            Inventory inv = e.getInventory();
            Player p = (Player) e.getPlayer();
            saveInventory4(inv, p);
            return;
        }

        if (e.getInventory().getName() == "EnderChest 5") {
            Inventory inv = e.getInventory();
            Player p = (Player) e.getPlayer();
            saveInventory5(inv, p);
            return;
        }


        if (e.getInventory().getName() == "EnderChest 6") {
            Inventory inv = e.getInventory();
            Player p = (Player) e.getPlayer();
            saveInventory6(inv, p);
            return;
        }

    }

    void saveInventory1(Inventory inv, Player p) {
        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration1(p);

        int solt = 0;
        for (ItemStack item : inv.getContents()) {
            config.set(p.getName() + ".EnderChest1." + solt, item);

            solt++;

        }
        try {
            config.save(RedPvP.getInstance().getEnderChestFile1(p));
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        loadEnderChestFile(p);
    }

    void saveInventory2(Inventory inv, Player p) {
        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration2(p);

        int solt = 0;
        for (ItemStack item : inv.getContents()) {
            config.set(p.getName() + ".EnderChest2." + solt, item);
            solt++;

        }
        try {
            config.save(RedPvP.getInstance().getEnderChestFile2(p));
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        loadEnderChestFile(p);
    }

    void saveInventory3(Inventory inv, Player p) {
        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration3(p);

        int solt = 0;
        for (ItemStack item : inv.getContents()) {
            config.set(p.getName() + ".EnderChest3." + solt, item);
            solt++;

        }
        try {
            config.save(RedPvP.getInstance().getEnderChestFile3(p));
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        loadEnderChestFile(p);
    }

    void saveInventory4(Inventory inv, Player p) {
        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration4(p);

        int solt = 0;
        for (ItemStack item : inv.getContents()) {
            config.set(p.getName() + ".EnderChest4." + solt, item);
            solt++;

        }
        try {
            config.save(RedPvP.getInstance().getEnderChestFile4(p));
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        loadEnderChestFile(p);
    }

    void saveInventory5(Inventory inv, Player p) {
        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration5(p);

        int solt = 0;
        for (ItemStack item : inv.getContents()) {
            config.set(p.getName() + ".EnderChest5." + solt, item);
            solt++;

        }
        try {
            config.save(RedPvP.getInstance().getEnderChestFile5(p));
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        loadEnderChestFile(p);
    }

    void saveInventory6(Inventory inv, Player p) {
        FileConfiguration config = RedPvP.getInstance().getEnderChestConfiguration6(p);

        int solt = 0;
        for (ItemStack item : inv.getContents()) {
            config.set(p.getName() + ".EnderChest6." + solt, item);
            solt++;

        }
        try {
            config.save(RedPvP.getInstance().getEnderChestFile6(p));
        } catch (IOException ee) {
            ee.printStackTrace();
        }
        loadEnderChestFile(p);
    }

}

