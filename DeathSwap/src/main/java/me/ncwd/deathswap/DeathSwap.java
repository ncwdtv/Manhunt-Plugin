package me.ncwd.deathswap;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class DeathSwap extends JavaPlugin {

    /*
    Alive Players list
    dead players list
    lock dead to spectator
    swap random players but check if not yourself so it will work with 2 players
     */

    static ArrayList<Player> alivePlayers = new ArrayList<Player>();
    static ArrayList<Player> deadPlayers = new ArrayList<Player>();


    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
