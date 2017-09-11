package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemSheen extends Item{
	public ItemSheen( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.SHEEN.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.SHEEN.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

