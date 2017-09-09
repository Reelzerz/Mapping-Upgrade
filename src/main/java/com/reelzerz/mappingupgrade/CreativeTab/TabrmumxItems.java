package com.reelzerz.mappingupgrade.CreativeTab;

import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabrmumxItems extends CreativeTabs {


	public TabrmumxItems() {
		super("rmumxitems");
	}


	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.testingingot);
	}
}
