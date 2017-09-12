package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemAbyssalMask extends Item{
	public ItemAbyssalMask( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ABYSSALMASK.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ABYSSALMASK.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}