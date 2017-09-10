package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemVoidStaff extends Item{
	public ItemVoidStaff( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.VOIDSTAFF.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.VOIDSTAFF.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

