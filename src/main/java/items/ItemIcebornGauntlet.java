package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemIcebornGauntlet extends Item{
	public ItemIcebornGauntlet( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ICEBORNGAUNTLET.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ICEBORNGAUNTLET.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

