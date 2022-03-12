package me.ncwd.healandfeedplugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.ncwd.healandfeedplugin.commands.HealAndFeedCommands;

public class HealAndFeedPlugin extends JavaPlugin{
	@Override
	public void onEnable() {
		HealAndFeedCommands commands = new HealAndFeedCommands();
		getLogger().info("onEnable is called!");
		getCommand("heal").setExecutor(commands);
		getCommand("feed").setExecutor(commands);
	}
	
	@Override
	public void onDisable() {
		getLogger().info("onDisable is called!");
	}
}
