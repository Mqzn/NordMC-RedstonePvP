package me.fares.redpvp.utils;

import me.fares.redpvp.RedPvP;
import org.bukkit.entity.Player;


public class RedPvPPlayer {

    Player p;
    Player killer;
    int kills, deaths, points;


    public RedPvPPlayer(Player player) {
        p = player;
        setKills(RedPvP.getInstance().getKills().getKillRedPvP(p));
        setDeaths(RedPvP.getInstance().getDeaths().getDeathRedPvP(p));
        setPoints(RedPvP.getInstance().getPoints().getPointsRedPvP(p));
    }


    public Player getP() {
        return p;
    }


    public Player getKiller() {
        return killer;
    }


    public void setKiller(Player killer) {
        this.killer = killer;
    }

    public void SaveData() {
        RedPvP.getInstance().getKills().setKillRedPvP(getP(), this.kills);
        RedPvP.getInstance().getDeaths().setDeathRedPvP(getP(), this.deaths);
        RedPvP.getInstance().getPoints().setPointsRedPvP(getP(), this.points);
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getPoints() {
        return points;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int addKill() {
        return this.kills += 1;
    }

    public int addDeath() {
        return this.deaths += 1;
    }

    public int addPoints(int value) {
        return this.points += value;
    }

    public int addkillss(int value) {
        return this.kills += value;
    }

    public int adddeathss(int value) {
        return this.deaths += value;
    }

    public int removePoints(int value) {
        return this.points -= value;
    }
}
	


