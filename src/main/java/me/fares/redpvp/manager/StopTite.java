package me.fares.redpvp.manager;

import me.fares.redpvp.RedPvP;
import net.minecraft.server.v1_8_R3.MinecraftServer;
import org.bukkit.GameMode;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StopTite {
    public Map<Player, Integer> tite = new HashMap<>();

    @SuppressWarnings("deprecation")
    public void Run() {

        if (tite.size() > 0) {

            List<Player> players = new ArrayList<>(tite.keySet());


            for (Player all : players) {

                Integer Int = tite.get(all);

                if (Int > 0) {

                    Int = Int - 1;
                    tite.put(all, Int);

                    if (Int == 3) {

                        all.sendTitle("§c➌", "§7");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }

                    if (Int == 2) {

                        all.sendTitle("§c➋", "§7");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }

                    if (Int == 1) {

                        all.sendTitle("§c➊", "§7");
                        all.playSound(all.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
                    }


                } else {

                    if (tite.containsKey(all) && all.isOnline()) {
                        tite.remove(all);

                        all.sendTitle("§c", "§7");
                        MinecraftServer.getServer().postToMainThread(() -> all.teleport(RedPvP.getInstance().getWarp("Spawn")));
                        MinecraftServer.getServer().postToMainThread(() -> all.setGameMode(GameMode.SURVIVAL));
                        for (PotionEffect effect : all.getActivePotionEffects()) {
                            all.removePotionEffect(effect.getType());
                        }
                        all.setHealth(20.0);
                        all.updateInventory();

                        RedPvP.getInstance().getDefaultKit().DefaultKit(all);
                    } else tite.remove(all);


                }


            }


        }

    }
}
