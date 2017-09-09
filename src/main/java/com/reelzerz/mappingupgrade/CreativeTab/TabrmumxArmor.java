package com.reelzerz.mappingupgrade.CreativeTab;

import init.ModArmor;
import init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabrmumxArmor extends CreativeTabs{
	public TabrmumxArmor() {
		super("rmumxarmor");
	}


	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModArmor.SteelHelmet);
	}


}
