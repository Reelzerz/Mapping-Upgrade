package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemLocketOfTheIronSolari extends Item{
	public ItemLocketOfTheIronSolari( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.LOCKETOFTHEIRONSOLARI.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.LOCKETOFTHEIRONSOLARI.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

