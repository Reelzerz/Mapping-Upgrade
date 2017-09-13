package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemGargoyleStoneplate extends Item{
	public ItemGargoyleStoneplate( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.GARGOYLESTONEPLATE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.GARGOYLESTONEPLATE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

