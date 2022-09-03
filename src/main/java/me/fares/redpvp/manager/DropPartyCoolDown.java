package me.fares.redpvp.manager;

import me.fares.redpvp.RedPvP;
import org.bukkit.block.Block;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class DropPartyCoolDown {
    private final RedPvP instance;

    public DropPartyCoolDown(RedPvP instance) {
        this.instance = instance;
    }

    public boolean getAllowKit(Block block) {
        long current = System.currentTimeMillis();
        long millis = getKitTime(block);
        return (current > millis);
    }

    public File getRewardFile() {
        return new File(this.instance.getDataFolder(), "DropParty.yml");
    }

    public void setKit(Block block) {
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(getRewardFile());
        long toSet = System.currentTimeMillis() + 1800000L;
        yamlConfiguration.set(block.getLocation() + ".millis", Long.valueOf(toSet));
        try {
            yamlConfiguration.save(getRewardFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long getKitTime(Block block) {
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(getRewardFile());
        return yamlConfiguration.getLong(block.getLocation() + ".millis");
    }

    public String getRemainingTime(long millis) {
        long seconds;
        long minutes;
        for (seconds = millis / 1000L, minutes = 0L; seconds > 60L; ) {
            seconds -= 60L;
            minutes++;
        }
        long hours;
        for (hours = 0L; minutes > 60L; ) {
            minutes -= 60L;
            hours++;
        }
        return "§c" + minutes + "§7 Minute(s) §c" + seconds + "§7 Second(s)";
    }
}