package me.ncwd.blocktosource;

import org.bukkit.plugin.java.JavaPlugin;

public final class BlockToSource extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Events(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
