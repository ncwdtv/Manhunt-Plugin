package me.ncwd.enchantmentsplus.customenchants;

import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.inventory.ItemStack;

public class AutoSmeltEnchantment extends Enchantment{
	private final String name;
	private final int maxLvl;
	public AutoSmeltEnchantment(String namespace, String name, int lvl) {
		super(NamespacedKey.minecraft(namespace));
		this.name = name;
		this.maxLvl = lvl;
		
	}

	@Override
	public boolean canEnchantItem(ItemStack arg0) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean conflictsWith(Enchantment arg0) {
		if(arg0 == SILK_TOUCH)
			return true;
		else
			return false;
	}

	@Override
	public EnchantmentTarget getItemTarget() {
		// TODO Auto-generated method stub
		return EnchantmentTarget.TOOL;
	}
	
	@Override
	public String getName() {
		return "Smelting";
	}
	
	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public int getStartLevel() {
		return 1;
	}

	@Override
	public boolean isCursed() {
		return false;
	}

	@Override
	public boolean isTreasure() {
		return false;
	}

}
