package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemRejuvenationBead extends Item{
	public ItemRejuvenationBead( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.REJUVENATIONBEAD.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.REJUVENATIONBEAD.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}