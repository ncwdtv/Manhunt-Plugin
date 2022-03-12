package me.ncwd.inventoryrearanges;

import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class Countdown extends BukkitRunnable {
    InventoryScramble plugin;

    public Countdown(InventoryScramble plugin){ this.plugin = plugin;}

    @Override
    public void run() {
        if(Commands.canDo == true) {
            int seconds = (int) (InventoryScramble.cIntv / 20);
            Bukkit.broadcastMessage(seconds + " seconds till inventory scramble!");
        }
    }
}
