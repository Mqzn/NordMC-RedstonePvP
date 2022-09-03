package me.fares.redpvp.combat;

import lombok.Getter;
import lombok.Setter;
import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.ActionBar;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import java.util.UUID;

@Getter
@Setter
public class CombatData {

	private UUID attacked, attacker;
	private CombatTask task;

	private CombatData(UUID attacked, UUID attacker) {
		this.attacked = attacked;
		this.attacker = attacker;

		this.task = new CombatTask();
	}

	public static CombatData of(UUID attacked, UUID attacker) {
		return new CombatData(attacked, attacker);
	}

	final class CombatTask extends BukkitRunnable {

		public static final int COMBAT_TIME = 15; //in seconds
		private int count = COMBAT_TIME;

		private CombatTask() {
			this.runTaskTimerAsynchronously(RedPvP.getInstance(),1L, 20L);
		}


		@Override
		public void run() {

			Player attackedPlayer = Bukkit.getPlayer(attacked);
			Player attackerPlayer = Bukkit.getPlayer(attacker);

			if(count < 1) {
				CombatManager.getInstance().removeFromCombat(attacked);
				CombatManager.getInstance().removeFromCombat(attacker);

				ActionBar.sendActionBar(attackedPlayer, "§bNord§fMc §8┃ §F§aYou`re no longer in combat.");
				ActionBar.sendActionBar(attackerPlayer, "§bNord§fMc §8┃ §F§aYou`re no longer in combat.");

				this.cancel();
				return;
			}else {

				ActionBar.sendActionBar(attackedPlayer, getCounterMsg());
				ActionBar.sendActionBar(attackerPlayer, getCounterMsg());

			}
			count--;
		}

		private String getCounterMsg() {

			StringBuilder builder = new StringBuilder();
			builder.append("§7[");

			int c = 0;
			for (int i = 0; i < count; i++) {
				builder.append("§a|");
				c++;
			}

			while (c < 15) {
				builder.append("§c|");
				c++;
			}

			builder.append("§7]");

			return builder.toString();
		}

	}



}
