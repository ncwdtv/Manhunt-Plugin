package me.ncwd.manhunt;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {

    @EventHandler
    public void RightClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if(p.getItemInHand().getType() == Material.COMPASS){
            if(Manhunt.hunters.contains(p)) {
                if(Manhunt.canTrack) {
                    if(p.getWorld().getEnvironment().equals(Manhunt.runners.get(0).getWorld().getEnvironment())){
                        p.setCompassTarget(Manhunt.runners.get(0).getLocation());
                    }
                }else{
                    if(p.getWorld().getEnvironment() == World.Environment.NORMAL){
                        p.setCompassTarget(Manhunt.runners.get(0).getLocation());
                    }
                }
            }
        }
    }

    @EventHandler
    public void OnRespawn(PlayerRespawnEvent e){
        Player p = e.getPlayer();
        if(Manhunt.hunters.contains(p)){
            p.getInventory().setItemInMainHand(new ItemStack(Material.COMPASS));
        }
    }
}
