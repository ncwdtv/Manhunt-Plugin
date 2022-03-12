package me.ncwd.multiplydrops;

import org.bukkit.plugin.java.JavaPlugin;

public final class Multiplydrops extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new BreakBlock(), this);
        getCommand("changedroprate").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
