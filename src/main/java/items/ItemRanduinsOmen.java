package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemRanduinsOmen extends Item{
	public ItemRanduinsOmen( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.RANDUINSOMEN.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.RANDUINSOMEN.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

