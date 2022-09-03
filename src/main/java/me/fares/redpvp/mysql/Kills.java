package me.fares.redpvp.mysql;

import me.fares.redpvp.RedPvP;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Kills {

    public void createTable() {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("CREATE TABLE IF NOT EXISTS KillRedPvP (Spielername VARCHAR(16), UUID VARCHAR(38), KillRedPvP INT)");
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void register(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("INSERT INTO KillRedPvP (SpielerName, UUID, KillRedPvP) VALUES (?, ?, ?)");
            ps.setString(1, p.getName());
            ps.setString(2, p.getUniqueId().toString());
            ps.setInt(3, 0);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void registerName(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET SpielerName= ? WHERE UUID= ?");
            ps.setString(1, p.getName());
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public boolean isRegistered(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM KillRedPvP WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            boolean user = rs.next();
            rs.close();
            rs.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean isRegistered(OfflinePlayer p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM KillRedPvP WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            boolean user = rs.next();
            rs.close();
            rs.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public boolean isRegistered(String name) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM KillRedPvP WHERE SpielerName= ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            boolean user = rs.next();
            rs.close();
            rs.close();
            return user;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public int getKillRedPvP(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM KillRedPvP WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            int KillRedPvP = rs.getInt("KillRedPvP");
            rs.close();
            ps.close();
            return KillRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int getKillRedPvP(OfflinePlayer tofline) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM KillRedPvP WHERE UUID= ?");
            ps.setString(1, tofline.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            int KillRedPvP = rs.getInt("KillRedPvP");
            rs.close();
            ps.close();
            return KillRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public void setKillRedPvP(Player p, int KillRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET KillRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, KillRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setKillRedPvP(OfflinePlayer tofline, int KillRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET KillRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, KillRedPvP);
            ps.setString(2, tofline.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addKillRedPvP(Player p, int KillRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET KillRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, getKillRedPvP(p) + KillRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void removeKillRedPvP(Player p, int KillRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET KillRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, getKillRedPvP(p) - KillRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getKillRedPvP(String name) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM KillRedPvP WHERE SpielerName= ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int KillRedPvP = rs.getInt("KillRedPvP");
            rs.close();
            ps.close();
            return KillRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public void setKillRedPvP(String name, int KillRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET KillRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, KillRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addKillRedPvP(String name, int KillRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET KillRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, getKillRedPvP(name) + KillRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void removeKillRedPvP(String name, int KillRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE KillRedPvP SET KillRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, getKillRedPvP(name) - KillRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void getTopPlayers(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getCon().prepareStatement("SELECT `SpielerName`,`KillRedPvP` FROM KillRedPvP ORDER BY KillRedPvP DESC LIMIT 10");
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                ++i;
                p.sendMessage(RedPvP.PREFIX + "§c#" + i + "§7: " + "§6" + rs.getString("SpielerName") + " §7» §6" + rs.getInt("KillRedPvP") + " Kills");
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getDeathSK(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM DeathRedPvP WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            int DeathRedPvP = rs.getInt("DeathRedPvP");
            rs.close();
            ps.close();
            return DeathRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int getDeathSK(OfflinePlayer tofline) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM DeathRedPvP WHERE UUID= ?");
            ps.setString(1, tofline.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            int DeathRedPvP = rs.getInt("DeathRedPvP");
            rs.close();
            ps.close();
            return DeathRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int getDeathSK(String name) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM DeathRedPvP WHERE SpielerName= ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int DeathRedPvP = rs.getInt("DeathRedPvP");
            rs.close();
            ps.close();
            return DeathRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }


    public double round(final double D, final int C) {
        final double P = Math.pow(10.0, C);
        return Math.round(D * P) / P;
    }

    public float getKD(final Player p) {
        final float Kills = (float) getKillRedPvP(p);
        final float Deaths = (float) getDeathSK(p);
        if (Kills == 0.0f && Deaths == 0.0f) {
            return 0.0f;
        }
        if (Kills > 0.0f && Deaths == 0.0f) {
            return Kills;
        }
        if (Deaths > 0.0f && Kills == 0.0f) {
            return 0.0f;
        }
        if (Kills / Deaths > 1.0E-4) {
            Math.round(0.1);
            return (float) round(Kills / Deaths, 2);
        }
        if (Kills > Deaths) {
            return Kills / Deaths;
        }
        if (Deaths / Kills > 1.0E-4) {
            Math.round(0.1);
            return (float) round(Deaths / Kills, 2);
        }
        if (Deaths > Kills) {
            return Deaths / Kills;
        }
        return Kills / Deaths;
    }

    public float getKD(final String SpielerName) {
        final float kills = (float) getKillRedPvP(SpielerName);
        final float deaths = (float) getDeathSK(SpielerName);
        /* OLD KDR
        if (kills == 0.0f && deaths == 0.0f) {
            return 0.0f;
        }
        if (kills > 0.0f && deaths == 0.0f) {
            return kills;
        }
        if (deaths > 0.0f && kills == 0.0f) {
            return 0.0f;
        }
        if (kills / deaths > 1.0E-4) {
            Math.round(0.1);
            return (float) round(kills / deaths, 2);
        }
        if (kills > deaths) {
            return kills / deaths;
        }
        if (deaths / kills > 1.0E-4) {
            Math.round(0.1);
            return (float) round(deaths / kills, 2);
        }
        if (deaths > kills) {
            return deaths / kills;
        } */
        return kills / (deaths == 0? 1f : deaths);
    }

    public float getKD(final OfflinePlayer offline) {
        final float kills = (float) getKillRedPvP(offline);
        final float deaths = (float) getDeathSK(offline);

       /* OLD KDR
        if (kills == 0.0f && deaths == 0.0f) {
            return 0.0f;
        }
        if (kills > 0.0f && deaths == 0.0f) {
            return kills;
        }
        if (deaths > 0.0f && kills == 0.0f) {
            return 0.0f;
        }
        if (kills / deaths > 1.0E-4) {
            Math.round(0.1);
            return (float) round(kills / deaths, 2);
        }
        if (kills > deaths) {
            return kills / deaths;
        }
        if (deaths / kills > 1.0E-4) {
            Math.round(0.1);
            return (float) round(deaths / kills, 2);
        }
        if (deaths > kills) {
            return deaths / kills;
        } */

        return kills / (deaths == 0? 1f : deaths);
    }


    public String GetTopNumber(int INT) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getCon().prepareStatement("SELECT `SpielerName`,`KillRedPvP` FROM KillRedPvP ORDER BY KillRedPvP DESC LIMIT 10");
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                ++i;
                if (i == INT) {
                    return " §c" + rs.getString("SpielerName") + " §7➥  §a" + rs.getInt("KillRedPvP") + " §eKills";
                }
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }


}