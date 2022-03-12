package me.ncwd.blockbreakitemgoneevents;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class Listeners implements Listener{
	@EventHandler
	public void PlayerHarvestBlockEvent(Player player, Block harvestedBlock, List<ItemStack> itemsHarvested) {
		player
	}
}
