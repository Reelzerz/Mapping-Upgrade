package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemRubyCrystal extends Item{
	public ItemRubyCrystal( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.RUBYCRYSTAL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.RUBYCRYSTAL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

