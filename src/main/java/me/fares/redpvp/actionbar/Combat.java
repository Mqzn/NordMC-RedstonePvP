package me.fares.redpvp.actionbar;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.entity.Player;

import java.util.*;

public class Combat {

	public Map<Player, Integer> CombatTite = new HashMap();

	public void Run() {
		if (this.CombatTite.size() > 0) {
			List<Player> players = new ArrayList(this.CombatTite.keySet());
			Iterator var2 = players.iterator();

			while(true) {
				while(var2.hasNext()) {
					Player all = (Player)var2.next();
					Integer Int = (Integer)this.CombatTite.get(all);
					if (Int > 0) {
						Int = Int - 1;
						this.CombatTite.put(all, Int);
						ActionBar msg = new ActionBar("§aYou`re in combat §c" + Int + "§a(s)");
						if (Int <= 14 && Int >= 1) {
							msg.send(all);
						}
					} else if (this.CombatTite.containsKey(all) && all.isOnline()) {
						this.CombatTite.remove(all);
						RedPvPPlayer player = (RedPvPPlayer)RedPvP.getInstance().getredpvpplayer().get(all);
						player.setKiller((Player)null);
						all.sendMessage("§bNord§fMc §8┃ §F§aYou`re no longer in combat.");
						ActionBar msg = new ActionBar("§aYou`re no longer in combat.");
						msg.send(all);
					} else if (this.CombatTite.containsKey(all)) {
						this.CombatTite.remove(all);
					}
				}

				return;
			}
		}
	}
}