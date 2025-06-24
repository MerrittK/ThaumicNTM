package com.thaumicntm.inventory.recipes;

import api.hbm.recipe.IRecipeRegisterListener;

public class RecipePatchListner implements IRecipeRegisterListener {
	
	@Override
	public void onRecipeLoad(String RecipeClassName) {
		
		if (RecipeClassName.equals("CrucibleRecipes") ) {
			NTMCrucibleRecipes.registerRecipes();
		}
	}

}
