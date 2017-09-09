package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemFaerieCharm extends Item{
	public ItemFaerieCharm( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.FAERIECHARM.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.FAERIECHARM.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

