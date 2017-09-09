package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemNeedlesslyLargeRod extends Item{
	public ItemNeedlesslyLargeRod( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.NEEDLESSLYLARGEROD.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.NEEDLESSLYLARGEROD.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

