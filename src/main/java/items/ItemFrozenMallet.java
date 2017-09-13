package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemFrozenMallet extends Item{
	public ItemFrozenMallet( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.FROZENMALLET.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.FROZENMALLET.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

