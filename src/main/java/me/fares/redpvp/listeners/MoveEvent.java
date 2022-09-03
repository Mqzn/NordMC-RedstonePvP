package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;


public class MoveEvent implements Listener {

    @EventHandler
    public void onMove(PlayerMoveEvent e) {

        Player p = e.getPlayer();


        if (e.getFrom().getX() != e.getTo().getX() || e.getFrom().getZ() != e.getTo().getZ()) {
            if (!RedPvP.getInstance().getWaitSpawn().Timetiteleport.isEmpty() && RedPvP.getInstance().getWaitSpawn().Timetiteleport.containsKey(p)) {
                p.sendMessage(RedPvP.PREFIX + "§cYou`r teleport has been canceled because you moved!");
                RedPvP.getInstance().getWaitSpawn().Timetiteleport.remove(p);
                return;
            }
        }


    }

}
