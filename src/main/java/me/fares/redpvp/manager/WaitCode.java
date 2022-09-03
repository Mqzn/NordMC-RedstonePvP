package me.fares.redpvp.manager;

import me.fares.redpvp.RedPvP;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Item;

import java.util.List;

public class WaitCode {


    @SuppressWarnings("deprecation")
    public static void startTask() {


        Bukkit.getScheduler().scheduleAsyncRepeatingTask(RedPvP.getInstance(), new Runnable() {


            int min = 0;
            int counter = 0;

            @Override
            public void run() {


                if (min == 20) {

                    RedPvP.getInstance().getStopTite().Run();
                    RedPvP.getInstance().getRandomBox1().Run();
                    RedPvP.getInstance().getRandomBox2().Run();
                    RedPvP.getInstance().getdDropParty1().Run();
                    RedPvP.getInstance().getDropParty2().Run();
                    RedPvP.getInstance().getdDropParty1().Run();
                    RedPvP.getInstance().getWaitSpawn().Run();

                    counter++;
                    min = 0;


                    if (counter == 60 * 3) {
                        Bukkit.broadcastMessage(RedPvP.PREFIX + "§citems drop will clear in 120s.");
                    }

                    if (counter == 60 * 4) {
                        Bukkit.broadcastMessage(RedPvP.PREFIX + "§citems drop will clear in 60s.");
                    }
                    if (counter == 60 * 5 - 30) {
                        Bukkit.broadcastMessage(RedPvP.PREFIX + "§citems drop will clear in 30s.");

                    }

                    if (counter == 60 * 5 - 10) {
                        Bukkit.broadcastMessage(RedPvP.PREFIX + "§citems drop will clear in 10s.");

                    }


                    if (counter == 60 * 5) {
                        Bukkit.broadcastMessage(RedPvP.PREFIX + "§citems Drop has been cleared.");

                        World w = RedPvP.getInstance().getWarp("Spawn").getWorld();

                        System.out.println("TOP UDATED!");
                        List<Entity> entlist = w.getEntities();
                        for (Entity cart : entlist) {
                            RELOADTOP(cart);

                            if (cart instanceof Item) {
                                cart.remove();
                            } else if (cart instanceof ArmorStand) {


                            }


                        }
                        counter = 0;

                    }


                }
                ++min;
            }

        }, 1, 1);


    }

    public static void RELOADTOP(Entity cart) {
        if (cart.getCustomName() != null) {
            if (cart.getCustomName().startsWith("§c#10")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(10) != null) {
                    cart.setCustomName("§c#10" + RedPvP.getInstance().getKills().GetTopNumber(10));
                } else {
                    cart.setCustomName("§c#10 §aLOADING...");
                }

            } else if (cart.getCustomName().startsWith("§c#9")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(9) != null) {
                    cart.setCustomName("§c#9" + RedPvP.getInstance().getKills().GetTopNumber(9));
                } else {
                    cart.setCustomName("§c#9 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#8")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(8) != null) {
                    cart.setCustomName("§c#8" + RedPvP.getInstance().getKills().GetTopNumber(8));
                } else {
                    cart.setCustomName("§c#8 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#7")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(7) != null) {
                    cart.setCustomName("§c#7" + RedPvP.getInstance().getKills().GetTopNumber(7));
                } else {
                    cart.setCustomName("§c#7 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#6")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(6) != null) {
                    cart.setCustomName("§c#6" + RedPvP.getInstance().getKills().GetTopNumber(6));
                } else {
                    cart.setCustomName("§c#6 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#5")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(5) != null) {
                    cart.setCustomName("§c#5" + RedPvP.getInstance().getKills().GetTopNumber(5));
                } else {
                    cart.setCustomName("§c#5 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#4")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(4) != null) {
                    cart.setCustomName("§c#4" + RedPvP.getInstance().getKills().GetTopNumber(4));
                } else {
                    cart.setCustomName("§c#4 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#3")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(3) != null) {
                    cart.setCustomName("§c#3" + RedPvP.getInstance().getKills().GetTopNumber(3));
                } else {
                    cart.setCustomName("§c#3 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#2")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(2) != null) {
                    cart.setCustomName("§c#2" + RedPvP.getInstance().getKills().GetTopNumber(2));
                } else {
                    cart.setCustomName("§c#2 §aLOADING...");
                }
            } else if (cart.getCustomName().startsWith("§c#1")) {
                if (RedPvP.getInstance().getKills().GetTopNumber(1) != null) {
                    cart.setCustomName("§c#1" + RedPvP.getInstance().getKills().GetTopNumber(1));
                } else {
                    cart.setCustomName("§c#1 §aLOADING...");
                }

                //-=-=--=-=-=-=-[Top CLANS]-=-=-==-=-=-==-=
            }
        }
    }

}
