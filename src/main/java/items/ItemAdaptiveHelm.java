package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemAdaptiveHelm extends Item{
	public ItemAdaptiveHelm( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ADAPTIVEHELM.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ADAPTIVEHELM.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}