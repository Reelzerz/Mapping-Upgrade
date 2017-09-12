package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemPickaxe extends Item{
	public ItemPickaxe( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.PICKAXE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.PICKAXE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}