package me.ncwd.blockbreakitemgoneplugin;

import org.bukkit.plugin.java.JavaPlugin;

import me.ncwd.blockbreakitemgoneevents.Listeners;

public class Plugin extends JavaPlugin{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}
	
}
