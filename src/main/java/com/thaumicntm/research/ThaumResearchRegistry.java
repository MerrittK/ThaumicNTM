package com.thaumicntm.research;


import com.hbm.items.ModItems;
import com.thaumicntm.inventory.recipes.ThaumInfusionRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;



public class ThaumResearchRegistry {
	public static void initResearchRegistry(){
		registerCategories();
		registerResearch();
	}

    public static void registerCategories(){
        ResearchCategories.registerCategory(
			"NTM",
			new ResourceLocation("thaumicntm","textures/misc/researchtab.png"),
			new ResourceLocation("thaumcraft", "textures/gui/gui_researchback.png"));
	}
	
	public static void registerResearch(){

		ResearchItem apocalypseLore;
		ResearchPage apocalypseLorePage1;
		apocalypseLore = new ResearchItem(
			"APOCALYPSELORE",
			"ELDRITCH",
			(new AspectList()).add(Aspect.ORDER,8).add(Aspect.ELDRITCH, 8),
			1,
			2,
			2,
			new ItemStack(ModItems.powder_balefire)
		);

		apocalypseLorePage1 = new ResearchPage("apocalypseLorePage1");
		apocalypseLore.setPages(
			apocalypseLorePage1
		);
		apocalypseLore.setParents("ELDRITCHMINOR");
		ResearchCategories.addResearch(apocalypseLore);

		ResearchItem chlorinePinwheel;
		ResearchPage chlorinePinwheelPage1;
		ResearchPage chlorinePinwheelPage2;

		chlorinePinwheel = new ResearchItem(
			"CHLORINEPINWHEEL",
			"ARTIFICE",
			(new AspectList()).add(Aspect.MECHANISM,6).add(Aspect.POISON,6).add(Aspect.AIR, 6),
			-3,
			2,
			1,
			new ItemStack(ModItems.chlorine_pinwheel)
		);

		chlorinePinwheelPage1 = new ResearchPage("chlorinePinwheelPage1");
		chlorinePinwheelPage2 = new ResearchPage(ThaumInfusionRecipes.recipeChlorinePinwheel);

		chlorinePinwheel.setPages(
			chlorinePinwheelPage1,
			chlorinePinwheelPage2
		);
		chlorinePinwheel.setParents("INFUSION");

		ResearchCategories.addResearch(chlorinePinwheel);

	}
}
