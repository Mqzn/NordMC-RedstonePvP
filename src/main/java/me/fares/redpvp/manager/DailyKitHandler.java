package me.fares.redpvp.manager;

import me.fares.redpvp.RedPvP;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.HashMap;
import java.util.Map;

public class DailyKitHandler implements Listener {

    Map<String, Long> cooldowns = new HashMap<String, Long>();

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Action action = e.getAction();
        Block block = e.getClickedBlock();
        Player p = e.getPlayer();
        if (action.equals(Action.RIGHT_CLICK_BLOCK)) {
            if (block.getType().equals(Material.DIAMOND_BLOCK)) {
                e.setCancelled(true);
                if (cooldowns.containsKey(p.getName())) {
                    if (cooldowns.get(p.getName()) > System.currentTimeMillis()) {
                        long timeleft = (cooldowns.get(p.getName()) - System.currentTimeMillis()) / 1000;
                        p.sendMessage(RedPvP.PREFIX + "§aYou can take the kit after 1 hour");
                        return;
                    }
                }
                cooldowns.put(p.getName(), System.currentTimeMillis() + (3600 * 1000));
                RedPvP.getInstance().getDailyKit().DailyKit(p);
            }
        }
    }
}
