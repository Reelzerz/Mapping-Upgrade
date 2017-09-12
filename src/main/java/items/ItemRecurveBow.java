package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemRecurveBow extends Item{
	public ItemRecurveBow( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.RECURVEBOW.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.RECURVEBOW.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

