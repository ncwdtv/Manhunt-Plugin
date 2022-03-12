package me.ncwd.healandfeedplugin.commands;

import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealAndFeedCommands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {return true;}
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("heal")) {
			double maxHealth = player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getDefaultValue();
			player.setHealth(maxHealth);
			player.sendMessage( "§e§l(!) §eYou have been healed!");
			return true;
		}
		else if(cmd.getName().equalsIgnoreCase("feed")) {
			player.setFoodLevel(20);
			player.sendMessage( "§e§l(!) §eYou have been fed!");
			return true;
		}
		
		
		return true;
	}

}
