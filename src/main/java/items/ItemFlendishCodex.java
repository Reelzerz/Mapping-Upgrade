package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemFlendishCodex extends Item{
	public ItemFlendishCodex( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.FLENDISHCODEX.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.FLENDISHCODEX.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

