package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemRodOfAges extends Item{
	public ItemRodOfAges( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.RODOFAGES.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.RODOFAGES.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

