package me.ncwd.inventoryrearanges;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

public class Commands implements CommandExecutor {
    public static boolean canDo = false;
    public static Long interval = 1200L;
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){return true;}

        if(cmd.getName().equalsIgnoreCase("changeinterval")){
            if(args.length > 1){
                sender.sendMessage("/<command> <seconds>");
            }
            sender.sendMessage("changed interval to " + args[0] + " seconds.");
            interval = Long.parseLong(args[0])*20;
        }
        if(cmd.getName().equalsIgnoreCase("startIS")){
            canDo = true;
            InventoryScramble.startChallenge(sender);

        }
        if(cmd.getName().equalsIgnoreCase("getinterval")){
            sender.sendMessage("Interval in L notation: "+interval.toString());
            sender.sendMessage("Interval in Second notation: " + ((interval.intValue()/20)) );
        }
        if(cmd.getName().equalsIgnoreCase("stopIS")){
            canDo = false;
            sender.sendMessage("stopped inventory scramble challenge");
        }
        return true;
    }
}
