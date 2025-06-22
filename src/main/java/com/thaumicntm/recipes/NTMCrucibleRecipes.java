package com.thaumicntm.recipes;

import com.hbm.inventory.material.MaterialShapes;
import com.hbm.inventory.material.Mats;
import com.hbm.items.ModItems;
import com.thaumicntm.inventory.mats.ThaumMats;
import net.minecraft.item.ItemStack;

import static com.hbm.inventory.recipes.CrucibleRecipes.*;

public class NTMCrucibleRecipes {

    static int n = MaterialShapes.NUGGET.q(1);
    static int i = MaterialShapes.INGOT.q(1);
    /**Add this when registring any new NTM crucible recipe **/
    static int idOffset = 300;
    public static void registerRecipes(){
        recipes.add(new CrucibleRecipe(idOffset, "crucible.thaumiumHSS", 9, new ItemStack(ModItems.ingot_dura_steel))
            .inputs(new Mats.MaterialStack(ThaumMats.MAT_THAUMIUM, n * 5), new Mats.MaterialStack(Mats.MAT_TUNGSTEN, n * 4))
            .outputs(new Mats.MaterialStack(Mats.MAT_DURA, i)));
    }
}
