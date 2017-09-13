package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemSunfireCape extends Item{
	public ItemSunfireCape( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.SUNFIRECAPE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.SUNFIRECAPE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

