package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemLiandrysTorment extends Item{
	public ItemLiandrysTorment( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.LIANDRYSTORMENT.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.LIANDRYSTORMENT.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}