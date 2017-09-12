package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemNashorsTooth extends Item{
	public ItemNashorsTooth( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.NASHORSTOOTH.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.NASHORSTOOTH.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
