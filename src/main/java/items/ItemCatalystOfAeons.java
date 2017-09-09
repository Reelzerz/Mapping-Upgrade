package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemCatalystOfAeons extends Item{
	public ItemCatalystOfAeons( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.CATALYSTOFAEONS.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.CATALYSTOFAEONS.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

