package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemRylaisCrystalScepter extends Item{
	public ItemRylaisCrystalScepter( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.RYLAISCRYSTALSCEPTER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.RYLAISCRYSTALSCEPTER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

