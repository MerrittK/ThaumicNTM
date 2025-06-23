package com.thaumicntm.research;


import com.hbm.items.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.common.config.ConfigResearch;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;



public class ThaumResearchRegistry {
	public static void mainResearchRegistry(){
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
			"apocalypseLore",
			"NTM",
			(new AspectList()).add(Aspect.ORDER,2).add(Aspect.ELDRITCH, 2),
			0,
			0,
			1,
			new ItemStack(ModItems.powder_balefire)
		);

		apocalypseLorePage1 = new ResearchPage("apocalypseLorePage1");
		apocalypseLore.setPages(
			apocalypseLorePage1
		);

		ResearchCategories.addResearch(apocalypseLore);

	}


}
