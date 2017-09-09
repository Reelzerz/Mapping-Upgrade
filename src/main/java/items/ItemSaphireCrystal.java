package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemSaphireCrystal extends Item{
	public ItemSaphireCrystal( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.SAPHIRECRYSTAL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.SAPHIRECRYSTAL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

