package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemMorellonomicon extends Item{
	public ItemMorellonomicon( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.MORELLONOMICON.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.MORELLONOMICON.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

