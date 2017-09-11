package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemReplacedScepter extends Item {
	
	public ItemReplacedScepter( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.REPLACEDSCEPTER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.REPLACEDSCEPTER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
	}

}
