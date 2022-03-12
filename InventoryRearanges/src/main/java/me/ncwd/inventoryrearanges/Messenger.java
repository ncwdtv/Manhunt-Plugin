package me.ncwd.inventoryrearanges;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;


public class Messenger extends BukkitRunnable {


    InventoryScramble plugin;

    public Messenger(InventoryScramble plugin){
        this.plugin = plugin;
    }
    @Override
    public void run() {
        if(Commands.canDo == true) {
            Bukkit.broadcastMessage("Scrambled!");
            for(Player player : Bukkit.getOnlinePlayers()){
                Inventory inv = player.getInventory();
                for(int i = 0; i < inv.getSize();i++){
                    if(i > 36 && i < 39){ continue; }
                    ItemStack temp = inv.getItem(i);
                    int rand = (int)Math.random()*41;
                    inv.setItem(i,inv.getItem(rand));
                    inv.setItem(rand,temp);
                }
            }
        }
    }
}
