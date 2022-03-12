package me.ncwd.tag;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class Tag extends JavaPlugin {

    public static Player it = null;
    public static boolean active = false;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Events(), this);
        getCommand("starttag").setExecutor(new Commands());
        getCommand("stoptag").setExecutor(new Commands());
        getCommand("whoisit").setExecutor(new Commands());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
