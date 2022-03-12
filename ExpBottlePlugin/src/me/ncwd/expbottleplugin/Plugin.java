package me.ncwd.expbottleplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin implements Listener{
	public static ItemStack levelBottle;
	public static ItemStack item = new ItemStack(Material.EXPERIENCE_BOTTLE, 1);
	public static ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("level_bottle"),item);
	public static int xpToBottle;
	public static int level;
	@Override
	public void onEnable() {
		
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName("Level Bottle");
		meta.addEnchant(Enchantment.LUCK, 1, false);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		item.setItemMeta(meta);
		levelBottle = item;
		recipe.shape("AAA", "GDG", "AGA");
		recipe.setIngredient('A', Material.AIR);
		recipe.setIngredient('G', Material.GLASS);
		recipe.setIngredient('D', Material.DIAMOND);
		Bukkit.addRecipe(recipe);
		getServer().getPluginManager().registerEvents(this, this);
	}
	@EventHandler
	public static void onThrow(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		if(player.getItemInHand().getItemMeta() == item) {
			level = player.getLevel();
			if(level>=32)
				xpToBottle = (int) (4.5 * Math.pow(level,2) - 162.5 * level + 2220);
			else if(level>=17 && level<=31)
				xpToBottle = (int) (2.5 * Math.pow(level, 2) - 40.5 * level + 360);
			else if(level>=0 && level<=16)
				xpToBottle = (int) (Math.pow(level, 2) + 6 * level);
			xpToBottle +=(int) player.getExp();
			
			player.setExp(0);
			player.setLevel(0);
		}
	}
	
	@EventHandler
	public static void onCraft(CraftItemEvent event) {
		Player player = (Player) event.getWhoClicked();
		if(event.getRecipe().equals(recipe) && event.getResult().equals(item));
		{
			level = player.getLevel();
			if(level>=32)
				xpToBottle = (int) (4.5 * Math.pow(level,2) - 162.5 * level + 2220);
			else if(level>=17 && level<=31)
				xpToBottle = (int) (2.5 * Math.pow(level, 2) - 40.5 * level + 360);
			else if(level>=0 && level<=16)
				xpToBottle = (int) (Math.pow(level, 2) + 6 * level);
			xpToBottle +=(int) player.getExp();
			
			player.setExp(0);
			player.setLevel(0);
		}
	}
}
