package me.fares.redpvp.manager;

import me.fares.redpvp.RedPvP;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class WaitSpawn {


    public Map<Player, Integer> Timetiteleport = new HashMap<>();

    public void Run() {


        if (Timetiteleport.size() > 0) {

            List<Player> players = new ArrayList<>(Timetiteleport.keySet());


            for (Player all : players) {

                Integer Int = Timetiteleport.get(all);

                if (Int > 0) {

                    Int = Int - 1;
                    Timetiteleport.put(all, Int);

                    if (Int == 4) {

                        all.sendMessage(RedPvP.PREFIX + "§aYou will teleport to spawn in §c4(s) §aplease don`t move");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }

                    if (Int == 3) {

                        all.sendMessage(RedPvP.PREFIX + "§aYou will teleport to spawn in §c3(s) §aplease don`t move");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }

                    if (Int == 2) {

                        all.sendMessage(RedPvP.PREFIX + "§aYou will teleport to spawn in §c2(s) §aplease don`t move");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }

                    if (Int == 1) {

                        all.sendMessage(RedPvP.PREFIX + "§aYou will teleport to spawn in §c1(s) §aplease don`t move");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }


                } else {

                    if (Timetiteleport.containsKey(all) && all.isOnline()) {


                        MinecraftServer.getServer().postToMainThread(() -> all.teleport(RedPvP.getInstance().getWarp("Spawn")));

                        Timetiteleport.remove(all);

                    } else Timetiteleport.remove(all);


                }


            }


        }

    }
}

