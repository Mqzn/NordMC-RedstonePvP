package me.fares.redpvp.manager;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class CoolDown_RandomBox {

    public HashMap<UUID, Double> Time;

    public void setupTime() {
        Time = new HashMap<>();
    }

    //setTime
    public void setTime(Player p, int seconds) {
        double delay = System.currentTimeMillis() + (seconds * 1000);
        Time.put(p.getUniqueId(), delay);
    }

    //getTime
    public long getTime(Player p) {
        return Math.round((Time.get(p.getUniqueId()) - System.currentTimeMillis()));
    }

    //checkTime
    public boolean checkTime(Player p) {
		return !Time.containsKey(p.getUniqueId()) || Time.get(p.getUniqueId()) <= System.currentTimeMillis();
	}


}
