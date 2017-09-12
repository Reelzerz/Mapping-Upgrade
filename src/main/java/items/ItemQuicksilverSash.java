package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemQuicksilverSash extends Item{
	public ItemQuicksilverSash( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.QUICKSILVERSASH.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.QUICKSILVERSASH.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}