package com.thaumicntm.inventory.recipes;

import com.hbm.items.ModItems;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.InfusionRecipe;
import thaumcraft.common.config.ConfigItems;

public class ThaumInfusionRecipes {

	public static InfusionRecipe recipeChlorinePinwheel;

	public static void registerRecipes(){
		//Register Recipes here
		recipeChlorinePinwheel = ThaumcraftApi.addInfusionCraftingRecipe(
			"CHLORINEPINWHEEL",
			new ItemStack(ModItems.chlorine_pinwheel),
			2,
			(new AspectList()).add(Aspect.EXCHANGE,16)
				.add(Aspect.POISON,16)
				.add(Aspect.TAINT,16)
				.add(Aspect.AIR, 16),
			new ItemStack(ConfigItems.itemBaubleBlanks),
			new ItemStack[]{
				new ItemStack(ConfigItems.itemResource, 1, 1),
				new ItemStack(ConfigItems.itemResource, 1, 1),
				new ItemStack(ConfigItems.itemResource, 1, 15),
				new ItemStack(ModItems.gas_full, 1, 89),
				new ItemStack(ModItems.gas_full, 1, 39)
			}
		);


	}
}
