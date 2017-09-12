package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemWitsEnd extends Item{
	public ItemWitsEnd( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.WITSEND.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.WITSEND.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}