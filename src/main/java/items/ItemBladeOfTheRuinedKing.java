package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemBladeOfTheRuinedKing extends Item{
	public ItemBladeOfTheRuinedKing( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.BLADEOFTHERUINEDKING.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.BLADEOFTHERUINEDKING.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
