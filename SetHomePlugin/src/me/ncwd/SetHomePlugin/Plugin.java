package me.ncwd.SetHomePlugin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{
	public File folder = this.getDataFolder();
	public static File file = new File("homes.yml");
	public static YamlConfiguration homes = new YamlConfiguration();
	
	@Override
	public void onEnable() {
		if (!folder.exists()) {
			folder.mkdir();
		}
		if(!file.exists()) {
			file.mkdir();
		}
		try {
			homes.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onDisable() {
		
	}
}
