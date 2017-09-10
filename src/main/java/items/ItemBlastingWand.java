package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemBlastingWand extends Item{
	public ItemBlastingWand( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.BLASTINGWAND.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.BLASTINGWAND.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

