package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemLostChapter extends Item{
	public ItemLostChapter( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.LOSTCHAPTER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.LOSTCHAPTER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

