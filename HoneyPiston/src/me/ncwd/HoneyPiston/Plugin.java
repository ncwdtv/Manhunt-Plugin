package me.ncwd.HoneyPiston;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{
	@Override
	public void onEnable() {
		ShapelessRecipe sr = new ShapelessRecipe(NamespacedKey.minecraft("sticky_piston_shapeless"), new ItemStack(Material.STICKY_PISTON, 1));
		sr.addIngredient(1, Material.PISTON);
		sr.addIngredient(1, Material.HONEYCOMB);
		Bukkit.getServer().addRecipe(sr);
	}
	@Override
	public void onDisable(){
		
	}
}
