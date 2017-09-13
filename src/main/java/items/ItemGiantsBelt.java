package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemGiantsBelt extends Item{
	public ItemGiantsBelt( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.GIANTSBELT.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.GIANTSBELT.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

