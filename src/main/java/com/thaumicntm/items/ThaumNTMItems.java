package com.thaumicntm.items;


import com.thaumicntm.main.Tags;
import cpw.mods.fml.common.registry.GameRegistry;
//import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
//import net.minecraft.item.Item.ToolMaterial;
//import net.minecraft.item.ItemArmor.ArmorMaterial;
//import net.minecraft.item.ItemFood;
//import net.minecraft.item.ItemSoup;
//import net.minecraft.item.ItemStack;
//import net.minecraft.potion.Potion;
//import net.minecraft.potion.PotionEffect;
//import net.minecraft.util.EnumChatFormatting;
//import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.common.util.EnumHelper;
//import net.minecraftforge.fluids.FluidContainerRegistry;
//import net.minecraftforge.fluids.FluidStack;

public class ThaumNTMItems {

	public static void mainRegistry() {
		initializeItem();
    	registerItem();
	}

	public static Item thaumic_plate;
	public static Item thaumic_plate_welded;
	public static Item thaumic_part;

	public static void initializeItem() {
		thaumic_plate = new Item().setUnlocalizedName("thaumic_plate").setTextureName(Tags.MODID + ":thaumic_plate");
		thaumic_part = new ThaumicPart().setUnlocalizedName("part_generic").setTextureName(Tags.MODID + ":part_generic");
	}

	private static void registerItem() {
		GameRegistry.registerItem(thaumic_plate, thaumic_plate.getUnlocalizedName());
		GameRegistry.registerItem(thaumic_part, thaumic_part.getUnlocalizedName());
	}

}
