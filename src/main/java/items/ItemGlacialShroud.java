package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemGlacialShroud extends Item{
	public ItemGlacialShroud( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.GLACIALSHROUD.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.GLACIALSHROUD.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

