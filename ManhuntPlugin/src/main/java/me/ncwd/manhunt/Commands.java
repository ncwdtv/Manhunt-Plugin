package me.ncwd.manhunt;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){return true;}

        if(cmd.getName().equalsIgnoreCase("hunter")){
            if(args.length > 1){
                sender.sendMessage("Usage: /<command> <player>");
            }
            Manhunt.hunters.add(Bukkit.getServer().getPlayer(args[0]));
            Bukkit.broadcastMessage("added " + args[0] + " to hunters.");
        }

        if(cmd.getName().equalsIgnoreCase("runner")){
            if(args.length > 1){
                sender.sendMessage("Usage: /<command> <player>");
            }
            if(Manhunt.runners.size() > 1){
                sender.sendMessage("Cannot have more than one runner");
            }else {
                Manhunt.runners.add(Bukkit.getServer().getPlayer(args[0]));
                Bukkit.broadcastMessage("added " + args[0] + " to runners.");
            }
        }
        if(cmd.getName().equalsIgnoreCase("clearhuntersandrunners")){
            Manhunt.runners.clear();
            Manhunt.hunters.clear();
            Bukkit.broadcastMessage("hunters and runners reset");
        }
        if(cmd.getName().equalsIgnoreCase("gethuntersandrunners")){
            String h = "";
            for (Player p : Manhunt.hunters){
                h += p.getDisplayName() + " ";
            }
            String r = "";
            for (Player p : Manhunt.runners){
                r += p.getDisplayName() + " ";
            }
            Bukkit.broadcastMessage("Hunters: " + h);
            Bukkit.broadcastMessage("Runners: " + r);
        }
        if(cmd.getName().equalsIgnoreCase(" ")){
            if( ((args[0].equalsIgnoreCase("true"))) || ((args[0].equalsIgnoreCase("false")))){
                if(args[0].equalsIgnoreCase("true")){
                    Manhunt.canTrack = true;
                }else{
                    Manhunt.canTrack = false;
                }
            }else{
                sender.sendMessage("usage: /<command> <true or false>");
            }
        }
        if(cmd.getName().equalsIgnoreCase("getcantrack")){
            if(Manhunt.canTrack){
                sender.sendMessage("Runner can be tracked in other dimensions.");
            }else{
                sender.sendMessage("Runner cannot be tracked in other dimensions.");
            }
        }
        return true;
    }
}
