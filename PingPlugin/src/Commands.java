import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {return true;}
		
		Player player = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("ping")) {
			if(args.length >= 1) {
				try {
					Player playerTwo = (Player) Bukkit.getServer().getPlayer(args[0]);
				}
				catch (IllegalArgumentException | SecurityException e) {
				       e.printStackTrace();
				}
			}
		}
		
		playerTwo.sendMessage("ping");
		player.sendMessage("pong");
		
		return true;
	}
	
}


