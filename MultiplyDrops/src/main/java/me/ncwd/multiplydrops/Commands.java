package me.ncwd.multiplydrops;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)){return true;}
        Player player = (Player) sender;

        if(cmd.getName().equalsIgnoreCase("changedroprate")){
            BreakBlock.dropAmount = Integer.parseInt(args[0]);
            player.sendMessage("Drop Amount has changed to " + args[0]);
        }

        return true;
    }
}
