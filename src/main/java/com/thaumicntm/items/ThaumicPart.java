package com.thaumicntm.items;

import com.hbm.items.ItemEnumMulti;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import com.thaumicntm.main.Tags;

public class ThaumicPart extends ItemEnumMulti {

	public static enum EnumPartType {

		ENGRAVED_PLATE("engraved_plate"),
		VIS_CAPACITOR("vis_capacitor");

		private String texName;

		private EnumPartType(String texName) {
			this.texName = texName;
		}
	}

	public ThaumicPart() {
		super(EnumPartType.class, true, true);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg) {

		Enum[] enums = theEnum.getEnumConstants();
		this.icons = new IIcon[enums.length];

		for(int i = 0; i < icons.length; i++) {
			EnumPartType num = (EnumPartType)enums[i];
			this.icons[i] = reg.registerIcon(Tags.MODID + ":" + num.texName);
		}
	}
}
