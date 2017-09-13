package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemKnightsVow extends Item{
	public ItemKnightsVow( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.KNIGHTSVOW.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.KNIGHTSVOW.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

