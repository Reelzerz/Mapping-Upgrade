package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemFrozenHeart extends Item{
	public ItemFrozenHeart( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.FROZENHEART.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.FROZENHEART.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

