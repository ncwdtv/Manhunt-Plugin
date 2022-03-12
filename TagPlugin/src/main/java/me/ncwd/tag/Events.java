package me.ncwd.tag;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Events implements Listener {

    @EventHandler
    public void PlayerTagged(PlayerInteractEntityEvent e){
        if(Tag.active) {
            Player tagged = (Player) e.getRightClicked();

            Tag.it.removePotionEffect(PotionEffectType.GLOWING);
            Tag.it = tagged;
            Bukkit.broadcastMessage(Tag.it.getDisplayName() + " is now it!");
            Tag.it.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING, Integer.MAX_VALUE, 1));
        }
    }
}
