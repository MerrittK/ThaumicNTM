package com.thaumicntm.recipes;

import com.thaumicntm.recipes.NTMCrucibleRecipes;
import api.hbm.recipe.IRecipeRegisterListener;

public class RecipePatchListner implements IRecipeRegisterListener {
	
	@Override
	public void onRecipeLoad(String RecipeClassName) {
		
		if (RecipeClassName.equals("CrucibleRecipes") ) {
			NTMCrucibleRecipes.registerRecipes();
		}
	}

}
