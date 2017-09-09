package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemTearOfTheGoddess extends Item{
	public ItemTearOfTheGoddess( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.TEAROFTHEGODDESS.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.TEAROFTHEGODDESS.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

