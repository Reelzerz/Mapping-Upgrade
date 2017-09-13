package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemWardensMail extends Item{
	public ItemWardensMail( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.WARDENSMAIL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.WARDENSMAIL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

