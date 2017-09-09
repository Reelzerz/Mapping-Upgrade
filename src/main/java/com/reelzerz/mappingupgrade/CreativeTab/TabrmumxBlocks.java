package com.reelzerz.mappingupgrade.CreativeTab;

import init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TabrmumxBlocks extends CreativeTabs {
	public TabrmumxBlocks() {
		super("rmumxblocks");
	}


	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.testingcube);
	}

}


