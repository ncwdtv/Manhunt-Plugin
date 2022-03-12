package me.ncwd.blocktosource;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;

public class Events implements Listener {

    @EventHandler
    public void BreakBlock(BlockBreakEvent e){
        e.setCancelled(true);
        Bukkit.broadcastMessage("Broken");
        Block b = e.getBlock();
        b.setType(Material.WATER);
    }
}
