package me.ncwd.SeaLevelRisesPlugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SeaLevelPlugin extends JavaPlugin implements CommandExecutor{
	@Override
	public void onEnable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (sender instanceof Player) {
			Player player = (Player) sender;
			int id = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
				int yAdd = 63;
				@Override
				public void run() {
					// TODO Auto-generated method stub
					
				}
				
			}, 0, 6000);
		}
		return false;
	}
}
