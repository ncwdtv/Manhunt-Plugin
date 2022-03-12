package me.ncwd.RottenFleshToLeather;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.CampfireRecipe;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.SmokingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{
	@Override
	public void onEnable() {
		CampfireRecipe rTLC = new CampfireRecipe(NamespacedKey.minecraft("rottenflesh_campfire"), new ItemStack(Material.LEATHER), 
				Material.ROTTEN_FLESH, 2, 600);
		Bukkit.getServer().addRecipe(rTLC);
		SmokingRecipe rTLS = new SmokingRecipe(NamespacedKey.minecraft("rottenflesh_smoker"), new ItemStack(Material.LEATHER), 
				Material.ROTTEN_FLESH, 2, 300);
		Bukkit.getServer().addRecipe(rTLS);
	}
}
