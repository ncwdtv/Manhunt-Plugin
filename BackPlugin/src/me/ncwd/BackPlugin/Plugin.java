package me.ncwd.BackPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.ncwd.BackPlugin.commands.BackPluginCommands;

public class Plugin extends JavaPlugin{
	@Override
	public void onEnable() {
		BackPluginCommands cmd = new BackPluginCommands();
		getCommand("back").setExecutor(cmd);
	}
	@Override
	public void onDisable() {
		
	}
}
