package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemArdentCenser extends Item{
	public ItemArdentCenser( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ARDENTCENSER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ARDENTCENSER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}