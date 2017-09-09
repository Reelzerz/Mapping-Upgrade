package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemAmplifyingTome extends Item {
	public ItemAmplifyingTome( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.AMPLIFYINGTOME.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.AMPLIFYINGTOME.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
