package me.fares.redpvp.mysql;

import me.fares.redpvp.RedPvP;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Deaths {

    public void createTable() {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("CREATE TABLE IF NOT EXISTS DeathRedPvP(SpielerName VARCHAR(16), UUID VARCHAR(38), DeathRedPvP INT)");
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void register(Player p) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("INSERT INTO DeathRedPvP (SpielerName, UUID, DeathRedPvP) VALUES (?, ?, ?)");
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
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET SpielerName= ? WHERE UUID= ?");
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
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM DeathRedPvP WHERE UUID= ?");
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
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM DeathRedPvP WHERE SpielerName= ?");
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
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("SELECT * FROM Kill1SkyPvP WHERE UUID= ?");
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

    public int getDeathRedPvP(Player p) {
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

    public int getDeathRedPvP(OfflinePlayer tofline) {
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

    public void setDeathRedPvP(Player p, int DeathRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET DeathRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, DeathRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void setDeathRedPvP(OfflinePlayer tofline, int DeathRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET DeathRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, DeathRedPvP);
            ps.setString(2, tofline.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    public void addDeathRedPvP(Player p, int DeathRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET DeathRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, getDeathRedPvP(p) + DeathRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void removeDeathRedPvP(Player p, int DeathRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET DeathRedPvP= ? WHERE UUID= ?");
            ps.setInt(1, getDeathRedPvP(p) - DeathRedPvP);
            ps.setString(2, p.getUniqueId().toString());
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public int getDeathRedPvP(String name) {
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

    public void setDeathRedPvP(String name, int DeathRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET DeathRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, DeathRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addDeathRedPvP(String name, int DeathRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET DeathRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, getDeathRedPvP(name) + DeathRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void removeDeathRedPvP(String name, int DeathRedPvP) {
        try {
            PreparedStatement ps = RedPvP.getInstance().getMySQL().getStatement("UPDATE DeathRedPvP SET DeathRedPvP= ? WHERE SpielerName= ?");
            ps.setInt(1, getDeathRedPvP(name) - DeathRedPvP);
            ps.setString(2, name);
            ps.executeUpdate();
            ps.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}