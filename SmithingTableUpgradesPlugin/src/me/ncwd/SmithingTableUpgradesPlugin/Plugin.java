package me.ncwd.SmithingTableUpgradesPlugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.SmithingRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin{
	@SuppressWarnings("deprecation")
	@Override
	public void onEnable() {
		//swords
		SmithingRecipe wSS = new SmithingRecipe(NamespacedKey.minecraft("woodtostonesword"), new ItemStack(Material.STONE_SWORD),
				new RecipeChoice.ExactChoice(new ItemStack(Material.WOODEN_SWORD)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.COBBLESTONE)) );
		
		Bukkit.addRecipe(wSS);
		SmithingRecipe sIS = new SmithingRecipe(NamespacedKey.minecraft("stonetoironsword"), new ItemStack(Material.IRON_SWORD),
				new RecipeChoice.ExactChoice(new ItemStack(Material.STONE_SWORD)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT)));
		Bukkit.addRecipe(sIS);
		SmithingRecipe iGS = new SmithingRecipe(NamespacedKey.minecraft("irontogoldsword"), new ItemStack(Material.GOLDEN_SWORD),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_SWORD)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGS);
		SmithingRecipe gDS = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondsword"), new ItemStack(Material.DIAMOND_SWORD),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_SWORD)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDS);
		
		//pickaxes
		SmithingRecipe wSP = new SmithingRecipe(NamespacedKey.minecraft("woodtostonepick"), new ItemStack(Material.STONE_PICKAXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.WOODEN_PICKAXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.COBBLESTONE)) );
		Bukkit.addRecipe(wSP);
		SmithingRecipe sIP = new SmithingRecipe(NamespacedKey.minecraft("stonetoironpick"), new ItemStack(Material.IRON_PICKAXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.STONE_PICKAXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT)));
		Bukkit.addRecipe(sIP);
		SmithingRecipe iGP = new SmithingRecipe(NamespacedKey.minecraft("irontogoldpick"), new ItemStack(Material.GOLDEN_PICKAXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_PICKAXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGP);
		SmithingRecipe gDP = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondpick"), new ItemStack(Material.DIAMOND_PICKAXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_PICKAXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDP);
		//axes
		SmithingRecipe wSA = new SmithingRecipe(NamespacedKey.minecraft("woodtostoneaxe"), new ItemStack(Material.STONE_AXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.WOODEN_AXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.COBBLESTONE)) );
		Bukkit.addRecipe(wSA);
		SmithingRecipe sIA = new SmithingRecipe(NamespacedKey.minecraft("stonetoironaxe"), new ItemStack(Material.IRON_AXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.STONE_AXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT)));
		Bukkit.addRecipe(sIA);
		SmithingRecipe iGA = new SmithingRecipe(NamespacedKey.minecraft("irontogoldaxe"), new ItemStack(Material.GOLDEN_AXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_AXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGA);
		SmithingRecipe gDA = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondaxe"), new ItemStack(Material.DIAMOND_AXE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_AXE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDA);
		
		//shovels
		SmithingRecipe wSASH = new SmithingRecipe(NamespacedKey.minecraft("woodtostoneshovel"), new ItemStack(Material.STONE_SHOVEL),
				new RecipeChoice.ExactChoice(new ItemStack(Material.WOODEN_SHOVEL)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.COBBLESTONE)) );
		Bukkit.addRecipe(wSASH);
		SmithingRecipe sIASH = new SmithingRecipe(NamespacedKey.minecraft("stonetoironshovel"), new ItemStack(Material.IRON_SHOVEL),
				new RecipeChoice.ExactChoice(new ItemStack(Material.STONE_SHOVEL)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT)));
		Bukkit.addRecipe(sIASH);
		SmithingRecipe iGASH = new SmithingRecipe(NamespacedKey.minecraft("irontogoldshovel"), new ItemStack(Material.GOLDEN_SHOVEL),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_SHOVEL)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGASH);
		SmithingRecipe gDASH = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondshovel"), new ItemStack(Material.DIAMOND_SHOVEL),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_SHOVEL)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) );  
		Bukkit.addRecipe(gDASH);
		
		//hoe
		SmithingRecipe wSH = new SmithingRecipe(NamespacedKey.minecraft("woodtostonehoe"), new ItemStack(Material.STONE_HOE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.WOODEN_HOE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.COBBLESTONE)) );
		Bukkit.addRecipe(wSH);
		SmithingRecipe sIH = new SmithingRecipe(NamespacedKey.minecraft("stonetoironhoe"), new ItemStack(Material.IRON_HOE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.STONE_HOE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT)));
		Bukkit.addRecipe(sIH);
		SmithingRecipe iGH = new SmithingRecipe(NamespacedKey.minecraft("irontogoldhoe"), new ItemStack(Material.GOLDEN_HOE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_HOE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGH);
		SmithingRecipe gDH = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondhoe"), new ItemStack(Material.DIAMOND_HOE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_HOE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDH);
		
		//helmet
		SmithingRecipe lIHL = new SmithingRecipe(NamespacedKey.minecraft("leathertoironhelmet"), new ItemStack(Material.IRON_HELMET),
				new RecipeChoice.ExactChoice(new ItemStack(Material.LEATHER_HELMET)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT))); 
		Bukkit.addRecipe(lIHL);
		SmithingRecipe iGHL = new SmithingRecipe(NamespacedKey.minecraft("irontogoldhelmet"), new ItemStack(Material.GOLDEN_HELMET),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_HELMET)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGHL);
		SmithingRecipe gDHL = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondhelmet"), new ItemStack(Material.DIAMOND_HELMET),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_HELMET)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDHL);
		
		//chestplate
		SmithingRecipe lICH = new SmithingRecipe(NamespacedKey.minecraft("leathertoironchestplate"), new ItemStack(Material.IRON_CHESTPLATE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.LEATHER_CHESTPLATE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT))); 
		Bukkit.addRecipe(lICH);
		SmithingRecipe iGCH = new SmithingRecipe(NamespacedKey.minecraft("irontogoldchestplate"), new ItemStack(Material.GOLDEN_CHESTPLATE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_CHESTPLATE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGCH);
		SmithingRecipe gDCH = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondchestplate"), new ItemStack(Material.DIAMOND_CHESTPLATE),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_CHESTPLATE)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDCH);
		
		//leggings
		SmithingRecipe lIL = new SmithingRecipe(NamespacedKey.minecraft("leathertoironleggings"), new ItemStack(Material.IRON_LEGGINGS),
				new RecipeChoice.ExactChoice(new ItemStack(Material.LEATHER_LEGGINGS)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT))); 
		Bukkit.addRecipe(lIL);
		SmithingRecipe iGL = new SmithingRecipe(NamespacedKey.minecraft("irontogoldleggings"), new ItemStack(Material.GOLDEN_LEGGINGS),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_LEGGINGS)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGL);
		SmithingRecipe gDL = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondleggings"), new ItemStack(Material.DIAMOND_LEGGINGS),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_LEGGINGS)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDL);
		
		//boots
		SmithingRecipe lIB = new SmithingRecipe(NamespacedKey.minecraft("leathertoironboots"), new ItemStack(Material.IRON_BOOTS),
				new RecipeChoice.ExactChoice(new ItemStack(Material.LEATHER_BOOTS)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.IRON_INGOT))); 
		Bukkit.addRecipe(lIB);
		SmithingRecipe iGB = new SmithingRecipe(NamespacedKey.minecraft("irontogoldboots"), new ItemStack(Material.GOLDEN_BOOTS),
				new RecipeChoice.ExactChoice(new ItemStack(Material.IRON_BOOTS)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.GOLD_INGOT))); 
		Bukkit.addRecipe(iGB);
		SmithingRecipe gDB = new SmithingRecipe(NamespacedKey.minecraft("goldtodiamondboots"), new ItemStack(Material.DIAMOND_BOOTS),
				new RecipeChoice.ExactChoice(new ItemStack(Material.GOLDEN_BOOTS)), 
				new RecipeChoice.ExactChoice( new ItemStack(Material.DIAMOND)) ); 
		Bukkit.addRecipe(gDB);
	}
	@Override
	public void onDisable() {
		
	}
}
