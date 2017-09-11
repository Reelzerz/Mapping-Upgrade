package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemVampiricScepter extends Item{
	public ItemVampiricScepter( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.VAMPIRICSCEPTER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.VAMPIRICSCEPTER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

