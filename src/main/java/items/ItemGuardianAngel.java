package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemGuardianAngel extends Item{
	public ItemGuardianAngel( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.GUARDIANANGEL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.GUARDIANANGEL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
