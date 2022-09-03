package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.combat.CombatManager;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class DamgeeEvent implements Listener {

    @EventHandler(priority = EventPriority.MONITOR)
    public void onHit(EntityDamageByEntityEvent e) {

        Entity damagerEntity = e.getDamager();
        if(!(damagerEntity instanceof Player) && !(damagerEntity instanceof Projectile)) {
            return;
        }

        Player damager;
        if(damagerEntity instanceof Player)
            damager = (Player) damagerEntity;
        else
            damager = (Player) ((Projectile)damagerEntity).getShooter();

        assert damager != null;

        Entity damagedEntity = e.getEntity();
        if(!(damagedEntity instanceof Player)) {
            return;
        }
        Player damaged = (Player) damagedEntity;

        CombatManager.getInstance().setInCombat(damaged.getUniqueId(), damager.getUniqueId());

    }

}






