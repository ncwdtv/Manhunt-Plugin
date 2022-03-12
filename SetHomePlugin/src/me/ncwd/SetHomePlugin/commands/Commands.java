package me.ncwd.SetHomePlugin.commands;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import me.ncwd.SetHomePlugin.Plugin;
import net.md_5.bungee.api.ChatColor;

public class Commands implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Plugin.homes.load(Plugin.file);
		Plugin.set(sender.getName() + ".x", ((Entity) sender).getLocation().getBlockX());
		Plugin.set(sender.getName() + ".y", sender.getLocation().getBlockY());
		Plugin.set(sender.getName() + ".z", sender.getLocation().getBlockZ());
		Plugin.set(sender.getName() + ".world", sender.getWorld().getName());
		Plugin.homes.save(Plugin.file); 
	}{

}
