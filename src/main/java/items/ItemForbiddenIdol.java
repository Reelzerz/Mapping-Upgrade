package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemForbiddenIdol extends Item{
	public ItemForbiddenIdol( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.FORBIDDENIDOL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.FORBIDDENIDOL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

