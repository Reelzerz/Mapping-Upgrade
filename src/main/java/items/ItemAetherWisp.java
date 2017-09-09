package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemAetherWisp extends Item{
	public ItemAetherWisp( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.AETHERWISP.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.AETHERWISP.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
