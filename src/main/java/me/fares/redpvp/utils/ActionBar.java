package me.fares.redpvp.utils;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import javax.swing.*;

public class ActionBar {

    private final PacketPlayOutChat packet;

    private ActionBar(String text) {
        this.packet = new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + text + "\"}"), (byte)2);
    }

    public static void sendActionBar(Player player, String msg) {
        new ActionBar(msg).send(player);
    }

    public void send(Player p) {
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(this.packet);
    }
}
