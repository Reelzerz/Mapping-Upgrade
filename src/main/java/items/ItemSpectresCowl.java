package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemSpectresCowl extends Item{
	public ItemSpectresCowl( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.SPECTRESCOWL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.SPECTRESCOWL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}