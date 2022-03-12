package me.ncwd.manhunt;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Manhunt extends JavaPlugin {

    public static ArrayList<Player> hunters = new ArrayList<>();
    public static ArrayList<Player> runners = new ArrayList<>();
    public static boolean canTrack = true;

    @Override
    public void onEnable() {
        // Plugin startup logic
        hunters.clear();
        runners.clear();
        getServer().getPluginManager().registerEvents(new Events(),this);
        getCommand("hunter").setExecutor(new Commands());
        getCommand("runner").setExecutor(new Commands());
        getCommand("clearhuntersandrunners").setExecutor(new Commands());
        getCommand("gethuntersandrunners").setExecutor(new Commands());
        getCommand("trackindimensions").setExecutor(new Commands());
        getCommand("getcantrack").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
