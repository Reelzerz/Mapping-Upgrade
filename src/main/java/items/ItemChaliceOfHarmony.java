package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemChaliceOfHarmony extends Item{
	public ItemChaliceOfHarmony( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.CHALICEOFHARMONY.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.CHALICEOFHARMONY.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

