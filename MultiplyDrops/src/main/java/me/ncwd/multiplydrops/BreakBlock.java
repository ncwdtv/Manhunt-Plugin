package me.ncwd.multiplydrops;

import jdk.nashorn.internal.ir.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

import static org.bukkit.Bukkit.getServer;

public class BreakBlock implements Listener {
    public static int dropAmount = 200;
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent e){
        e.setDropItems(false);
        e.getBlock().getWorld().dropItem(e.getBlock().getLocation(), new ItemStack(e.getBlock().getDrops().iterator().next().getType(),(int)((Math.random()*dropAmount) +1)));
    }
    @EventHandler
    public void onEntityDropItem(EntityDeathEvent e){
        if(e.getEntity().getKiller() instanceof Player){
            for(ItemStack item : e.getDrops()){
                item.setAmount((int)(Math.random()*dropAmount)+1);
                e.getDrops().add(new ItemStack(item));
            }
        }
    }

}
