package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemJaurimsFist extends Item{
	public ItemJaurimsFist( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.JAURIMSFIST.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.JAURIMSFIST.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

