package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemBansheesVeil extends Item{
	public ItemBansheesVeil( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.BANSHEESVEIL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.BANSHEESVEIL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

