package me.ncwd.sneaknausea;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class SneakNausea extends JavaPlugin {

    static int numSneaks = 0;
    static int amp = -1;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new Events(), this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static void sneaks(Player player){
        if(numSneaks >= 20){
            amp++;
            numSneaks = 0;
            PotionEffect effect = player.getPotionEffect(PotionEffectType.CONFUSION);
            if(effect == null){
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,Integer.MAX_VALUE,amp,false,false));
            }else{
                player.removePotionEffect(PotionEffectType.CONFUSION);
                player.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION,Integer.MAX_VALUE,amp,false,false));
            }
        }
    }
}
