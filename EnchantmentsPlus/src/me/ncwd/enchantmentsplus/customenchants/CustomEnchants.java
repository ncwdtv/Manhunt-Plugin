package me.ncwd.enchantmentsplus.customenchants;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;

public class CustomEnchants {
	public static final Enchantment SMELTING = new EnchantmentWrapper("smelting");
	
	public static void register() {
		boolean registered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(CustomEnchants.SMELTING);
		
		if(!registered) {
			registerEnchantment(SMELTING);
		}
	}
	
	public static void registerEnchantment(Enchantment enchantment) {
		boolean registered = true;
		
		try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
			Enchantment.registerEnchantment(enchantment);
		}catch(Exception e) {
			registered = false;
			e.printStackTrace();
		}
		if(registered) {
			
		}
	}
}
