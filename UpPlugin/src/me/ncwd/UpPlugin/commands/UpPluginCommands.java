trpackage me.ncwd.UpPlugin.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class UpPluginCommands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {return true;}
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("up")) {
			if(args.length>= 1) {
				double x;
				double y;
				double z;
				try {
				x = player.getLocation().getX();
				y = (player.getLocation().getY())+Integer.parseInt(args[0]);
				z = player.getLocation().getZ();
				}
				catch(NumberFormatException e) {
					player.sendMessage(ChatColor.RED + "argument must be a number!");
					return true;
				}
				player.teleport(new Location(player.getWorld(),x,y,z));
				player.sendMessage(ChatColor.GREEN + "Teleported up " + args[0] + " blocks.");
				Location loc = new Location(player.getWorld(),x,y-1,z);
				loc.getBlock().setType(Material.GLASS);
			} else {
				player.sendMessage(ChatColor.RED + "use /up <amount>");
			}
			return true;
		}
		
		
		return true;
	}

}
