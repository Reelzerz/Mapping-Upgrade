package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemBlackCleaver extends Item{
	public ItemBlackCleaver( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.BLACKCLEAVER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.BLACKCLEAVER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}