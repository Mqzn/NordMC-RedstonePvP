package me.fares.redpvp.mysql;

import me.fares.redpvp.RedPvP;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Points {

    public void createTable() {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("CREATE TABLE IF NOT EXISTS PointsRedPvP (Spielername VARCHAR(16), UUID VARCHAR(38), PointsRedPvP INT)");
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void register(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("INSERT INTO PointsRedPvP (SpielerName, UUID, PointsRedPvP) VALUES (?, ?, ?)");
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
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET SpielerName= ? WHERE UUID= ?");
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
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM PointsRedPvP WHERE UUID= ?");
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
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM PointsRedPvP WHERE SpielerName= ?");
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

    public boolean isRegistered(OfflinePlayer p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM KillSkyRedPvP WHERE UUID= ?");
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

    public int getPointsRedPvP(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM PointsRedPvP WHERE UUID= ?");
            ps.setString(1, p.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            int PointsRedPvP = rs.getInt("PointsRedPvP");
            rs.close();
            ps.close();
            return PointsRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public int getPointsRedPvP(OfflinePlayer tofline) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM PointsRedPvP WHERE UUID= ?");
            ps.setString(1, tofline.getUniqueId().toString());
            ResultSet rs = ps.executeQuery();
            rs.next();
            int PointsRedPvP = rs.getInt("PointsRedPvP");
            rs.close();
            ps.close();
            return PointsRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public void setPointsRedPvP(Player p, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, PointsRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setPointsRedPvP(OfflinePlayer tofline, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, PointsRedPvP);
            ps.setString(2, tofline.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void addPointsRedPvP(Player p, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, getPointsRedPvP(p) + PointsRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addPointsRedPvP(OfflinePlayer tof, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, getPointsRedPvP(tof) + PointsRedPvP);
            ps.setString(2, tof.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void removePointsRedPvP(Player p, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, getPointsRedPvP(p) - PointsRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getPointsRedPvP(String name) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM PointsRedPvP WHERE SpielerName= ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            rs.next();
            int PointsRedPvP = rs.getInt("PointsRedPvP");
            rs.close();
            ps.close();
            return PointsRedPvP;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    public void setPointsRedPvP(String name, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, PointsRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addPointsRedPvP(String name, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, getPointsRedPvP(name) + PointsRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void removePointsRedPvP(String name, int PointsRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE PointsRedPvP SET PointsRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, getPointsRedPvP(name) - PointsRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
