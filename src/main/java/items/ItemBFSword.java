package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemBFSword extends Item{
	public ItemBFSword( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ITEMBFSWORD.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ITEMBFSWORD.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
