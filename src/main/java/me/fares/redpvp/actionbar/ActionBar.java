package me.fares.redpvp.actionbar;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.Packet;
import net.minecraft.server.v1_8_R3.PacketPlayOutChat;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class ActionBar {

    private final PacketPlayOutChat packet;

    public ActionBar(String text) {
        this.packet = new PacketPlayOutChat(IChatBaseComponent.ChatSerializer.a("{\"text\":\"" + text + "\"}"), (byte)2);
    }

    public void send(Player p) {
        ((CraftPlayer)p).getHandle().playerConnection.sendPacket(this.packet);
    }
}
