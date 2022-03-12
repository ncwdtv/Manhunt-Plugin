package me.ncwd.expbank;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Plugin extends JavaPlugin implements CommandExecutor, Listener{
	private HashMap<UUID, PlayerLevelManager> levelManagerHashMap;
	
	@Override
	public void onEnable(){
		this.levelManagerHashMap = new HashMap<>();
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getConfig().options().copyDefaults(true);
		this.saveConfig();
		getCommand("xpbank").setExecutor(this);
	}
	@Override
	public void onDisable() {this.levelManagerHashMap.clear();}
	
	@EventHandler
	public void join(PlayerJoinEvent event) {
		Player player = event.getPlayer();
		
		if(!player.hasPlayedBefore()) {
			this.levelManagerHashMap.put(player.getUniqueId(), new PlayerLevelManager(player.getTotalExperience()));
			this.getConfig().set("PlayerLevels." + player.getUniqueId() + ".level", player.getTotalExperience());
			this.saveConfig();
		}else {
			int xp = this.getConfig().getInt("PlayerLevels." + player.getUniqueId() + ".level", player.getTotalExperience());
			levelManagerHashMap.put(player.getUniqueId(), new PlayerLevelManager(xp));
		}
	}
	@SuppressWarnings("unused")
	public void quit(PlayerQuitEvent event) {
		Player player= event.getPlayer();
		PlayerLevelManager playerLevelManager= this.levelManagerHashMap.get(player.getUniqueId());
		if(this.levelManagerHashMap.containsKey(player.getUniqueId())) {
			this.levelManagerHashMap.remove(player.getUniqueId());
			this.getConfig().set("PlayerLevels." + player.getUniqueId() + ".level", player.getTotalExperience());
			this.saveConfig();
		}
	}
	
	public void addXp(Player player, int xp) {
		PlayerLevelManager playerLevelManager = this.levelManagerHashMap.get(player.getUniqueId());
		playerLevelManager.setXp(playerLevelManager.getXp() + xp);
		player.sendMessage(ChatColor.GREEN +"You've deposited " + xp + " experience.");
		this.getConfig().set("PlayerLevels." + player.getUniqueId() + ".level", player.getTotalExperience());
		this.saveConfig();
	}
	public void takeXp(Player player, int xp) {
		PlayerLevelManager playerLevelManager = this.levelManagerHashMap.get(player.getUniqueId());
		player.giveExp(xp);
		playerLevelManager.lowerXp(xp);
		player.sendMessage(ChatColor.GREEN + "You've taken out " + xp + " experience from your account");
		this.getConfig().set("PlayerLevels." + player.getUniqueId() + ".level", player.getTotalExperience());
		this.saveConfig();
	}

	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {return true;}
		Player player = (Player) sender;
		
		// /xpbank <Deposit/Withdraw> <amount>
		if(cmd.getName().equalsIgnoreCase("xpbank")) {
			if(args.length >= 2) {
				try {
					while(true) {
						
						if(args[0].equalsIgnoreCase("Deposit")||args[0].equalsIgnoreCase("Withdraw")) {
							player.sendMessage(ChatColor.RED + "That is not a valid argument <action> must be deposit or withdraw.");
							return true;
						}else {
							break;
						}
					}
					while(true) {
						if(Integer.parseInt(args[1]) < player.getTotalExperience()) {
							player.sendMessage(ChatColor.RED + "You don't have enough experience");
							return true;
						}else {
							break;
						}
					}
					if(args[0].equalsIgnoreCase("Deposit")) {
						addXp(player, Integer.parseInt(args[1]));
						return true;
					}
					else if(args[0].equalsIgnoreCase("Withdraw")) {
						takeXp(player,Integer.parseInt(args[1]));
						return true;
					}
				}catch (IllegalArgumentException e) {
					player.sendMessage(ChatColor.RED + "That is not a valid argument.");
				}
				
			}else {
				player.sendMessage(ChatColor.RED + "Use /xpbank <action> <amount>");
			}
		}
		return true;
	}
	
	
	
	
	
}
