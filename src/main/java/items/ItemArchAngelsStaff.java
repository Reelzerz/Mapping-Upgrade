package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemArchAngelsStaff extends Item{
	public ItemArchAngelsStaff( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ARCHANGELSSTAFF.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ARCHANGELSSTAFF.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

