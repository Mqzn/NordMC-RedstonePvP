package me.fares.redpvp.mysql;

import me.fares.redpvp.RedPvP;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.sql.*;

public class MySQL {


    public FileConfiguration config = RedPvP.getInstance().getMySQLFileConfiguration();

    private final String host = config.getString("Host");
    private final String port = "3306";
    private final String database = config.getString("Databace");
    private final String username = config.getString("Username");
    private final String password = config.getString("Password");


    public Connection con;

    public boolean isConnected() {
        return con != null;
    }


    public Connection getCon() {
        return con;
    }

    public void connect() {
        if (!isConnected()) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?autoReconnect=true", username, password);
                Bukkit.getConsoleSender().sendMessage(RedPvP.PREFIX + "§aIt could be successfully connected to the database");
            } catch (SQLException e) {
                Bukkit.getConsoleSender().sendMessage(RedPvP.PREFIX + "§cIt could not be connected to the database");
            }
        }
    }

    public void disconnect() {
        try {
            con.close();
            Bukkit.getConsoleSender().sendMessage(RedPvP.PREFIX + "§aThe connection to the database could be closed successfully");
        } catch (SQLException e) {
            Bukkit.getConsoleSender().sendMessage(RedPvP.PREFIX + "§cThe connection to the database could not be closed");
        }
    }

    public PreparedStatement getStatement(String sql) {
        if (isConnected()) {
            PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                return ps;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public ResultSet getResult(String sql) {
        if (isConnected()) {
            PreparedStatement ps;
            ResultSet rs;
            try {
                ps = getStatement(sql);
                rs = ps.executeQuery();
                return rs;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

}