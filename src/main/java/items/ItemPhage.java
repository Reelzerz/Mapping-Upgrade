package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemPhage extends Item{
	public ItemPhage( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.PHAGE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.PHAGE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
