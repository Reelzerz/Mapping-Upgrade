package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemBilgewatercutlass extends Item{
	public ItemBilgewatercutlass( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.BILGEWATERCUTLASS.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.BILGEWATERCUTLASS.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
