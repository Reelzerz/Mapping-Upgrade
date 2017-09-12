package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemTrinityForce extends Item{
	public ItemTrinityForce( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.TRINITYFORCE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.TRINITYFORCE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
