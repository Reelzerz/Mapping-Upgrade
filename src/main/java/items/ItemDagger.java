package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemDagger extends Item{
	public ItemDagger( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.DAGGER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.DAGGER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

