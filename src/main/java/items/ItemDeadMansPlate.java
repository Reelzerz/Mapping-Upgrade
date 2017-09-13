package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemDeadMansPlate extends Item{
	public ItemDeadMansPlate( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.DEADMANSPLATE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.DEADMANSPLATE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

