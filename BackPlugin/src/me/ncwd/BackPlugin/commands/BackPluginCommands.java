package me.ncwd.BackPlugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ncwd.BackPlugin.events.DeathAndTpEvents;

public class BackPluginCommands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {return true;}
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("back")) {
			player.teleport(DeathAndTpEvents.l);
			return true;
		}
		return true;
	}

}
