package me.fares.redpvp.board;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import net.md_5.bungee.api.ChatColor;

import java.util.*;

public class ScoreboardListener {

    public final Map<UUID, FastBoard> boards = new HashMap();

    public ScoreboardListener() {
        RedPvP.getInstance().getServer().getScheduler().runTaskTimer(RedPvP.getInstance(), () -> {
            Iterator var1 = this.boards.values().iterator();

            while(var1.hasNext()) {
                FastBoard board = (FastBoard)var1.next();
                this.updateLines(board);
            }

        }, 0L, (long)RedPvP.getInstance().getConfig().getInt("scoreboard.speed"));
    }

    public void updateLines(FastBoard board) {
        List<String> lines = RedPvP.getInstance().getConfig().getStringList("scoreboard.lines");
        int index = 0;

        for(Iterator var4 = lines.iterator(); var4.hasNext(); ++index) {
            String line = (String)var4.next();
            RedPvPPlayer player = (RedPvPPlayer)RedPvP.getInstance().getredpvpplayer().get(board.getPlayer());
            String translatedLine = ChatColor.translateAlternateColorCodes('&', line);
            String replacementLine = translatedLine
                    .replace("<player>", String.valueOf(board.getPlayer().getName()))
                    .replace("<kills>", String.valueOf(player.getKills()))
                    .replace("<deaths>", String.valueOf(player.getDeaths()))
                    .replace("<points>", String.valueOf(player.getPoints()))
                    .replace("<prestige>", RedPvP.getInstance().getPsList().getPs(board.getPlayer()));
            lines.set(index, replacementLine);
        }

        board.updateLines(lines);
    }
}
