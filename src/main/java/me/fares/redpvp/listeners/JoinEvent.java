package me.fares.redpvp.listeners;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.board.FastBoard;
import me.fares.redpvp.utils.RedPvPPlayer;
import net.md_5.bungee.api.ChatColor;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.concurrent.CompletableFuture;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        e.setJoinMessage(null);
        CompletableFuture.runAsync(() -> {
            this.runSync(() -> {
                p.teleport(RedPvP.getInstance().getWarp("Spawn"));
            });
            if (!RedPvP.getInstance().getKills().isRegistered(p.getName()) &&
                    RedPvP.getInstance().getKills().isRegistered(p)) {
                RedPvP.getInstance().getKills().registerName(p);
                this.runSync(() -> {
                    p.teleport(RedPvP.getInstance().getWarp("Spawn"));
                });
            }

            if (!RedPvP.getInstance().getKills().isRegistered(p)) {
                RedPvP.getInstance().getKills().register(p);
                this.runSync(() -> {
                    p.teleport(RedPvP.getInstance().getWarp("Spawn"));
                });
            }

            if (!RedPvP.getInstance().getDeaths().isRegistered(p.getName()) &&
                    RedPvP.getInstance().getDeaths().isRegistered(p)) {
                RedPvP.getInstance().getDeaths().registerName(p);
            }

            if (!RedPvP.getInstance().getDeaths().isRegistered(p)) {
                RedPvP.getInstance().getDeaths().register(p);
            }

            if (!RedPvP.getInstance().getPoints().isRegistered(p.getName()) &&
                    RedPvP.getInstance().getPoints().isRegistered(p)) {
                RedPvP.getInstance().getPoints().registerName(p);
            }

            if (!RedPvP.getInstance().getPoints().isRegistered(p)) {
                RedPvP.getInstance().getPoints().register(p);
            }

            RedPvP.getInstance().getredpvpplayer().put(p, new RedPvPPlayer(p));
            System.out.print("New RedPvP Player registered; " + p.getName());
            RedPvPPlayer player = (RedPvPPlayer)RedPvP.getInstance().getredpvpplayer().get(p);
            player.setKills(RedPvP.getInstance().getKills().getKillRedPvP(p));
            player.setDeaths(RedPvP.getInstance().getDeaths().getDeathRedPvP(p));
            player.setPoints(RedPvP.getInstance().getPoints().getPointsRedPvP(p));
            this.runSync(() -> {
                if (p.getGameMode() == GameMode.SPECTATOR) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.teleport(RedPvP.getInstance().getWarp("Spawn"));
                }

            });
            FastBoard board = new FastBoard(p);
            String title = RedPvP.getInstance().getConfig().getString("scoreboard.title");
            board.updateTitle(ChatColor.translateAlternateColorCodes('&', title));
            RedPvP.getInstance().getScoreboardListener().updateLines(board);
            RedPvP.getInstance().getScoreboardListener().boards.put(p.getUniqueId(), board);
        });
    }

    private void runSync(Runnable runnable) {
        MinecraftServer.getServer().postToMainThread(runnable);
    }

}