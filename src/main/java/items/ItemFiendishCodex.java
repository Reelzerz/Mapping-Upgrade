package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemFiendishCodex extends Item{
	public ItemFiendishCodex( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.FIENDISHCODEX.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.FIENDISHCODEX.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

