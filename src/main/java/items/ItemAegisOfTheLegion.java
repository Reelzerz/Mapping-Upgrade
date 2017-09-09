package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemAegisOfTheLegion extends Item{
	public ItemAegisOfTheLegion( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.AEGISOFTHELEGION.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.AEGISOFTHELEGION.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

