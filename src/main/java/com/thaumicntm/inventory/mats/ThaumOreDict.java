package com.thaumicntm.inventory.mats;

import com.hbm.inventory.OreDictManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thaumcraft.common.config.ConfigBlocks;
import thaumcraft.common.config.ConfigItems;

import static com.hbm.blocks.ModBlocks.block_lead;
import static com.hbm.blocks.ModBlocks.ore_lead;
import static com.hbm.inventory.OreDictManager.*;
import static com.hbm.items.ModItems.*;
import static com.hbm.items.ModItems.plate_lead;

public class ThaumOreDict {

    public static final OreDictManager.DictFrame THAUMIUM = new OreDictManager.DictFrame("Thaumium");

    public static void registerResources() {
        THAUMIUM			.nugget(new ItemStack(ConfigItems.itemNugget, 1, 6))									.ingot(new ItemStack(ConfigItems.itemResource,1,2))							.block(new ItemStack(ConfigBlocks.blockCosmeticSolid, 1, 4));

    }
}
