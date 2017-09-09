package com.reelzerz.mappingupgrade.blocks;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTestingcube extends Block {
	

	public BlockTestingcube() {
		super(Material.IRON);
		setUnlocalizedName(Reference.MappingUpgradeBlocks.TESTINGCUBE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeBlocks.TESTINGCUBE.getRegistryName());
		setHardness(25.0F);
		setResistance(30.0F);
		setLightLevel(0.3F);
		
		
		//For later.. setMaxItemStack
	setCreativeTab(MappingUpgrade.blocks);
	}
	
	
}
