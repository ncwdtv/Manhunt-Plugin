package me.ncwd.tag;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(cmd.getName().equalsIgnoreCase("starttag")){
            ArrayList<Player> players = new ArrayList<> (Bukkit.getOnlinePlayers());


            int chance = (int) ((Math.random()*players.size()));
            Tag.it = players.get(chance);
            Bukkit.broadcastMessage(Tag.it.getDisplayName() + " is it!");
            Tag.it.addPotionEffect(new PotionEffect(PotionEffectType.GLOWING,Integer.MAX_VALUE,1));
            Tag.active = true;
        }

        if(cmd.getName().equalsIgnoreCase("stoptag")){
            Tag.it.removePotionEffect(PotionEffectType.GLOWING);
            Tag.it = null;
            Bukkit.broadcastMessage("Tag has ended");
            Tag.active = false;
        }

        if(cmd.getName().equalsIgnoreCase("whoisit")){
            if(Tag.it != null){
                sender.sendMessage(Tag.it.getDisplayName() + " is currently it.");
            }else{
                sender.sendMessage("No one is currently it.");
            }
        }
        return true;
    }
}
