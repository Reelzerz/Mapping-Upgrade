package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemChainVest extends Item{
	public ItemChainVest( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.CHAINVEST.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.CHAINVEST.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

