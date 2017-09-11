package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemLichBane extends Item{
	public ItemLichBane( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.LICHBANE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.LICHBANE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

