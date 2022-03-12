package me.ncwd.enchantmentsplus;

import java.util.Collection;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Container;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.ncwd.enchantmentsplus.customenchants.CustomEnchants;

public class EnchantmentsPlusPlugin extends JavaPlugin implements Listener{
	
	
	@Override 
	public void onEnable() {
		CustomEnchants.register();
		this.getServer().getPluginManager().registerEvents(this, this);
	}
	
	
	@EventHandler()
	public void onBlockBreak(BlockBreakEvent event) {
		if(event.getPlayer().getInventory().getItemInMainHand() == null)
			return;
		if(!event.getPlayer().getInventory().getItemInMainHand().hasItemMeta())
			return;
		if(!event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.SMELTING))
			return;
		if(event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR)
			return;
		if(event.getBlock().getState() instanceof Container)
			return;
		
		event.setDropItems(true);
		Player player = event.getPlayer();
		Block block = event.getBlock();
		
		if(event.getBlock().getType().equals(new ItemStack(Material.GOLD_ORE))) {
			event.getBlock().setType(Material.AIR);
			event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.GOLD_INGOT));
		}
		if(event.getBlock().getType().equals(new ItemStack(Material.IRON_ORE))) {
			event.getBlock().setType(Material.AIR);
			event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.IRON_INGOT));
		}
		if(event.getBlock().getType().equals(new ItemStack(Material.ANCIENT_DEBRIS))) {
			event.getBlock().setType(Material.AIR);
			event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(Material.NETHERITE_SCRAP));
		}
		
		
		/*
		 * This checks if they have any room in inventory
		 * if (event.getPlayer().getInventory().firstEmpyty() == -1) return; 
		 */
	}
}
