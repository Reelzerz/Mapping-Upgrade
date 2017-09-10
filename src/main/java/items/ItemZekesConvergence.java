package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemZekesConvergence extends Item{
	public ItemZekesConvergence( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ZEKESCONVERGENCE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ZEKESCONVERGENCE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

