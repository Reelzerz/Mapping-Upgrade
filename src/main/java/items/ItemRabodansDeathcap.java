package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemRabodansDeathcap extends Item{
	public ItemRabodansDeathcap( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.RABODANSDEATHCAP.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.RABODANSDEATHCAP.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

