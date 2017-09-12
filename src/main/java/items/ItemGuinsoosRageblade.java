package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemGuinsoosRageblade extends Item{
	public ItemGuinsoosRageblade( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.GUINSOOSRAGEBLADE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.GUINSOOSRAGEBLADE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}