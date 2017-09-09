package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemTestingingot extends Item {
	
	public ItemTestingingot( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.TESTINGINGOT.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.TESTINGINGOT.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
	}

}
