package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemClothArmor extends Item{
	public ItemClothArmor( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.CLOTHARMOR.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.CLOTHARMOR.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

