package me.ncwd.UpPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.ncwd.UpPlugin.commands.UpPluginCommands;

public class UpPlugin extends JavaPlugin{
	@Override
	public void onEnable() {
		UpPluginCommands commands = new UpPluginCommands();
		getLogger().info("onEnable is called!");
		getCommand("up").setExecutor(commands);
	}
	@Override
	public void onDisable() {
		
	}
}
