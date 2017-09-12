package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemNegatronCloak extends Item{
	public ItemNegatronCloak( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.NEGATRONCLOAK.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.NEGATRONCLOAK.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}