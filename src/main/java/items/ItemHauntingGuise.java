package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemHauntingGuise extends Item{
	public ItemHauntingGuise( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.HAUNTINGGUISE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.HAUNTINGGUISE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}