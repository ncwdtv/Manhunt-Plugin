package me.ncwd.inventoryrearanges;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

public final class InventoryScramble extends JavaPlugin {

    private static InventoryScramble instance;
    public static long cIntv = 1100L;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        getCommand("changeinterval").setExecutor(new Commands());
        getCommand("startIS").setExecutor(new Commands());
        getCommand("getinterval").setExecutor(new Commands());
        getCommand("stopIS").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    public static void startChallenge(CommandSender sender){
        long x = Commands.interval;
        int seconds = ((int)x) / 20;
        cIntv = 1100L;
        if(seconds < 10){
            cIntv = (seconds/2) * 20;
        }
        BukkitTask reminder = new Countdown(instance).runTaskTimer(instance,0L,cIntv);
        sender.sendMessage("started inventory scramble challenge");
        BukkitTask startTask = new Messenger(instance).runTaskTimer( instance, 0L,Commands.interval);
    }
    public static InventoryScramble getPlugin(){
        return instance;
    }
}
