package me.ncwd.sneaknausea;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class Events implements Listener {

    @EventHandler
    public void PlayerSneak(PlayerToggleSneakEvent e){
        Player player = e.getPlayer();
        SneakNausea.numSneaks++;
        SneakNausea.sneaks(player);
    }
}
