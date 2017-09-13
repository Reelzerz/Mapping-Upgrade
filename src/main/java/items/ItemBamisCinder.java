package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemBamisCinder extends Item{
	public ItemBamisCinder( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.BAMISCINDER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.BAMISCINDER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

