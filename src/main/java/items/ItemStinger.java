package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemStinger extends Item{
	public ItemStinger( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.STINGER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.STINGER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

