package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemLongSword extends Item{
	public ItemLongSword( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.LONGSWORD.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.LONGSWORD.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
