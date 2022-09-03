package me.fares.redpvp;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import me.fares.redpvp.actionbar.Combat;
import me.fares.redpvp.board.ScoreboardListener;
import me.fares.redpvp.fireshop.FireMenu;
import me.fares.redpvp.manager.CoolDown_RandomBox;
import me.fares.redpvp.manager.DropPartyCoolDown;
import me.fares.redpvp.manager.RedPvPSystm;
import me.fares.redpvp.manager.RegisterManager;
import me.fares.redpvp.manager.StopTite;
import me.fares.redpvp.manager.WaitCode;
import me.fares.redpvp.manager.WaitSpawn;
import me.fares.redpvp.mysql.Deaths;
import me.fares.redpvp.mysql.Kills;
import me.fares.redpvp.mysql.MySQL;
import me.fares.redpvp.mysql.Points;
import me.fares.redpvp.ps.NextPS;
import me.fares.redpvp.ps.PSList;
import me.fares.redpvp.shop.Interact;
import me.fares.redpvp.shop.ShopMenu;
import me.fares.redpvp.utils.DDropParty1;
import me.fares.redpvp.utils.DailyKit;
import me.fares.redpvp.utils.DefaultKit;
import me.fares.redpvp.utils.DropPart1;
import me.fares.redpvp.utils.DropParty2;
import me.fares.redpvp.utils.Geometrics;
import me.fares.redpvp.utils.Head;
import me.fares.redpvp.utils.RandomBox1;
import me.fares.redpvp.utils.RandomBox2;
import me.fares.redpvp.utils.RedPvPPlayer;
import me.fares.redpvp.warp.WarpMenu;
import net.luckperms.api.LuckPerms;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class RedPvP extends JavaPlugin {
    public static final Pattern HEX_PATTERN = Pattern.compile("&#([A-Fa-f0-9]{6})");
    public static final String PREFIX = "§6Nord§eMc §8┃ §F";
    public static final String CLAN_PREFIX = "§c§lClans §8┃ §F";
    public static final String NO_PERMS = "§6Nord§eMc §8┃ §F§cYou don't have permission";
    public static final String NOT_FOUND = "§6Nord§eMc §8┃ §F§cThis player could not be found.";
    public static final String USAGE = "§8┃ §cUsage §8» ";
    private static RedPvP plugin;
    public Map<Player, RedPvPPlayer> RedPvP_Player = new HashMap();
    private LuckPerms luckPerms;
    private Combat combat;
    private MySQL mySQL;
    private NextPS nextPS;
    private PSList psList;
    private Kills kills;
    private Deaths deaths;
    private WaitCode waitCode;
    private ShopMenu shopMenu;
    private DefaultKit defaultKit;
    private DailyKit dailyKit;
    private WaitSpawn waitSpawn;
    private StopTite stopTite;
    private FireMenu fireMenu;
    private RedPvPSystm system;
    private Interact interact;
    private DropPart1 dropPart1;
    private DropParty2 dropParty2;
    private DDropParty1 dDropParty1;
    private RandomBox1 randomBox1;
    private RandomBox2 randomBox2;
    private CoolDown_RandomBox coolDown_randomBox;
    private Head head;
    private WarpMenu warpMenu;
    private DropPartyCoolDown droppartycooldown;
    private Points points;
    private Geometrics geometrics;
    private ScoreboardListener scoreboardListener;
    public File ConfigFile = new File("plugins/RedStonePvP/Locations", "locations.yml");
    public FileConfiguration Config;

    public RedPvP() {
        this.Config = YamlConfiguration.loadConfiguration(this.ConfigFile);
    }

    public static RedPvP getInstance() {
        return plugin;
    }

    public Map<Player, RedPvPPlayer> getredpvpplayer() {
        return this.RedPvP_Player;
    }

    public RedPvP getPlugin() {
        return plugin;
    }

    public FileConfiguration getEnderChestConfiguration1(Player p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile1(p));
    }

    public File getEnderChestFile1(Player p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(1)/" + p.getName() + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration2(Player p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile2(p));
    }

    public File getEnderChestFile2(Player p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(2)/" + p.getName() + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration3(Player p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile3(p));
    }

    public File getEnderChestFile3(Player p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(3)/" + p.getName() + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration4(Player p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile4(p));
    }

    public File getEnderChestFile4(Player p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(4)/" + p.getName() + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration5(Player p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile5(p));
    }

    public File getEnderChestFile5(Player p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(5)/" + p.getName() + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration6(Player p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile6(p));
    }

    public File getEnderChestFile6(Player p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(6)/" + p.getName() + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration1(String p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile1(p));
    }

    public File getEnderChestFile1(String p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(1)/" + p + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration2(String p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile2(p));
    }

    public File getEnderChestFile2(String p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(2)/" + p + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration3(String p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile3(p));
    }

    public File getEnderChestFile3(String p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(3)/" + p + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration4(String p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile4(p));
    }

    public File getEnderChestFile4(String p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(4)/" + p + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration5(String p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile5(p));
    }

    public File getEnderChestFile5(String p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(5)/" + p + "/EnderChest.yml");
    }

    public FileConfiguration getEnderChestConfiguration6(String p) {
        return YamlConfiguration.loadConfiguration(this.getEnderChestFile6(p));
    }

    public File getEnderChestFile6(String p) {
        return new File("plugins/RedStonePvP/EnderChestStorage(6)/" + p + "/EnderChest.yml");
    }

    public FileConfiguration getSpawnFileConfiguration() {
        return YamlConfiguration.loadConfiguration(this.getSpawnFile());
    }

    public File getSpawnFile() {
        return new File("plugins/RedStonePvP/spawn.yml");
    }

    public FileConfiguration getMySQLFileConfiguration() {
        return YamlConfiguration.loadConfiguration(this.getMySQLFile());
    }

    public File getMySQLFile() {
        return new File("plugins/RedStonePvP/MySQL.yml");
    }

    public void SetMySQLDefault() {
        FileConfiguration config = this.getMySQLFileConfiguration();
        if (config.getString("Username") == null) {
            config.set("Username", "nordmc");
        }

        if (config.getString("Databace") == null) {
            config.set("Databace", "nordmc");
        }

        if (config.getString("Host") == null) {
            config.set("Host", "nordmc");
        }

        if (config.getString("Password") == null) {
            config.set("Password", "nordmc");
        }

        try {
            config.save(this.getMySQLFile());
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public void onEnable() {
        plugin = this;
        this.luckPerms = (LuckPerms)this.getServer().getServicesManager().load(LuckPerms.class);
        this.getter();
        this.SetMySQLDefault();
        this.saveDefaultConfig();
        this.mySQL.connect();
        this.kills.createTable();
        this.deaths.createTable();
        this.points.createTable();
        WaitCode.startTask();
        this.coolDown_randomBox.setupTime();
        this.getDataFolder().mkdir();
        this.droppartycooldown = new DropPartyCoolDown(this);
        RegisterManager.Register();
        Bukkit.getConsoleSender().sendMessage("§b§m------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§b");
        Bukkit.getConsoleSender().sendMessage("§7§m┃ §c§l RedPvP §7Plugin has been §a[Enable]");
        Bukkit.getConsoleSender().sendMessage("§b");
        Bukkit.getConsoleSender().sendMessage("§b§m------------------------------------------");
    }

    public void onDisable() {
        this.mySQL.disconnect();
        Bukkit.getConsoleSender().sendMessage("§b§m------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§b");
        Bukkit.getConsoleSender().sendMessage("§7§m┃ §c§l RedPvP §7Plugin has been §c[Disable]");
        Bukkit.getConsoleSender().sendMessage("§b");
        Bukkit.getConsoleSender().sendMessage("§b§m------------------------------------------");
    }

    public void setWarp(Location loc, String path) {
        FileConfiguration spawn = this.getSpawnFileConfiguration();
        spawn.set(path + ".World", loc.getWorld().getName());
        spawn.set(path + ".X", loc.getX());
        spawn.set(path + ".Y", loc.getY());
        spawn.set(path + ".Z", loc.getZ());
        spawn.set(path + ".Yaw", loc.getYaw());
        spawn.set(path + ".Pitch", loc.getPitch());

        try {
            spawn.save(this.getSpawnFile());
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }

    public Location getWarp(String path) {
        FileConfiguration spawn = this.getSpawnFileConfiguration();
        if (spawn.get(path) != null) {
            World world = Bukkit.getWorld(spawn.getString(path + ".World"));
            double x = spawn.getDouble(path + ".X");
            double y = spawn.getDouble(path + ".Y");
            double z = spawn.getDouble(path + ".Z");
            float yaw = (float)spawn.getDouble(path + ".Yaw");
            float pitch = (float)spawn.getDouble(path + ".Pitch");
            Location warp = new Location(world, x, y, z, yaw, pitch);
            return warp;
        } else {
            return null;
        }
    }

    private void getter() {
        this.combat = new Combat();
        this.mySQL = new MySQL();
        this.psList = new PSList();
        this.nextPS = new NextPS();
        this.waitCode = new WaitCode();
        this.kills = new Kills();
        this.deaths = new Deaths();
        this.shopMenu = new ShopMenu();
        this.defaultKit = new DefaultKit();
        this.dailyKit = new DailyKit();
        this.droppartycooldown = new DropPartyCoolDown(this);
        this.stopTite = new StopTite();
        this.waitSpawn = new WaitSpawn();
        this.fireMenu = new FireMenu();
        this.system = new RedPvPSystm();
        this.interact = new Interact();
        this.dropPart1 = new DropPart1();
        this.dDropParty1 = new DDropParty1();
        this.dropParty2 = new DropParty2();
        this.randomBox1 = new RandomBox1();
        this.randomBox2 = new RandomBox2();
        this.coolDown_randomBox = new CoolDown_RandomBox();
        this.head = new Head();
        this.warpMenu = new WarpMenu();
        this.points = new Points();
        this.geometrics = new Geometrics();
        this.scoreboardListener = new ScoreboardListener();
    }

    public Combat getCombat() {
        return this.combat;
    }

    public MySQL getMySQL() {
        return this.mySQL;
    }

    public PSList getPsList() {
        return this.psList;
    }

    public NextPS getNextPS() {
        return this.nextPS;
    }

    public WaitCode getWaitCode() {
        return this.waitCode;
    }

    public Deaths getDeaths() {
        return this.deaths;
    }

    public Kills getKills() {
        return this.kills;
    }

    public ShopMenu getShopMenu() {
        return this.shopMenu;
    }

    public DropPartyCoolDown getDroppartycooldown() {
        return this.droppartycooldown;
    }

    public DailyKit getDailyKit() {
        return this.dailyKit;
    }

    public DefaultKit getDefaultKit() {
        return this.defaultKit;
    }

    public StopTite getStopTite() {
        return this.stopTite;
    }

    public WaitSpawn getWaitSpawn() {
        return this.waitSpawn;
    }

    public FireMenu getFireMenu() {
        return this.fireMenu;
    }

    public RedPvPSystm getSystem() {
        return this.system;
    }

    public Interact getInteract() {
        return this.interact;
    }

    public DropPart1 getDropPart1() {
        return this.dropPart1;
    }

    public DDropParty1 getdDropParty1() {
        return this.dDropParty1;
    }

    public DropParty2 getDropParty2() {
        return this.dropParty2;
    }

    public RandomBox1 getRandomBox1() {
        return this.randomBox1;
    }

    public RandomBox2 getRandomBox2() {
        return this.randomBox2;
    }

    public CoolDown_RandomBox getCoolDown_randomBox() {
        return this.coolDown_randomBox;
    }

    public Head getHead() {
        return this.head;
    }

    public LuckPerms getLuckPerms() {
        return this.luckPerms;
    }

    public WarpMenu getWarpMenu() {
        return this.warpMenu;
    }

    public Points getPoints() {
        return this.points;
    }

    public Geometrics getGeometrics() {
        return this.geometrics;
    }

    public ScoreboardListener getScoreboardListener() {
        return this.scoreboardListener;
    }


    public void setLocation(String warp, Player p) {
        Location location = p.getLocation();
        this.Config.set("Spawns." + warp + ".x", location.getX());
        this.Config.set("Spawns." + warp + ".y", location.getY());
        this.Config.set("Spawns." + warp + ".z", location.getZ());
        this.Config.set("Spawns." + warp + ".pitch", location.getPitch());
        this.Config.set("Spawns." + warp + ".yaw", location.getYaw());
        this.Config.set("Spawns." + warp + ".world", p.getWorld().getName());

        try {
            this.Config.save(this.ConfigFile);
        } catch (IOException var5) {
            var5.printStackTrace();
        }

    }

    public Location getLocation(String warp) {
        double x = this.Config.getDouble("Spawns." + warp + ".x");
        double y = this.Config.getDouble("Spawns." + warp + ".y");
        double z = this.Config.getDouble("Spawns." + warp + ".z");
        double yaw = this.Config.getDouble("Spawns." + warp + ".yaw");
        double pitch = this.Config.getDouble("Spawns." + warp + ".pitch");
        String worldName = this.Config.getString("Spawns." + warp + ".world");
        World world = Bukkit.getWorld(worldName);
        Location location = new Location(world, x, y, z);
        location.setYaw((float)yaw);
        location.setPitch((float)pitch);
        return location;
    }
}