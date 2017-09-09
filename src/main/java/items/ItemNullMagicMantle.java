package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemNullMagicMantle extends Item{
	public ItemNullMagicMantle( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.NULLMAGICMANTLE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.NULLMAGICMANTLE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

