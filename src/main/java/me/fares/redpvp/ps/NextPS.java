package me.fares.redpvp.ps;

import me.fares.redpvp.RedPvP;
import me.fares.redpvp.utils.RedPvPPlayer;
import org.bukkit.entity.Player;

public class NextPS {
    public String getPs(Player p) {
        RedPvPPlayer player = RedPvP.getInstance().getredpvpplayer().get(p);
        if (player.getKills() >= 5000) {
            return "The Master";
        } else if (player.getKills() >= 4500) {
            return "§4Champoin V";
        } else if (player.getKills() >= 4000) {
            return "§4Champoin III";
        } else if (player.getKills() >= 3650) {
            return "§4Champoin I";
        } else if (player.getKills() >= 3250) {
            return "§bDiamond V";
        } else if (player.getKills() >= 2900) {
            return "§bDiamond III";
        } else if (player.getKills() >= 2600) {
            return "§bDiamond I";
        } else if (player.getKills() >= 2250) {
            return "§3Platinum V";
        } else if (player.getKills() >= 2000) {
            return "§3Platinum III";
        } else if (player.getKills() >= 1800) {
            return "§3Platinum I";
        } else if (player.getKills() >= 1650) {
            return "§6Gold V";
        } else if (player.getKills() >= 1400) {
            return "§6Gold III";
        } else if (player.getKills() >= 1250) {
            return "§6Gold I";
        } else if (player.getKills() >= 1000) {
            return "§7Silver  V";
        } else if (player.getKills() >= 900) {
            return "§7Silver III";
        } else if (player.getKills() >= 750) {
            return "§7Silver I";
        } else if (player.getKills() >= 600) {
            return "§eNewBie V";
        } else if (player.getKills() >= 550) {
            return "§eNewBie III";
        } else if (player.getKills() >= 0) {
            return "§eNewBie I";
        } else {

            return "NewBie";

        }
    }
}
