package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemKindleGem extends Item{
	public ItemKindleGem( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.KINDLEGEM.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.KINDLEGEM.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
