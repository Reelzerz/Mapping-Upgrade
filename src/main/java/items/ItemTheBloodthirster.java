package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemTheBloodthirster extends Item{
	public ItemTheBloodthirster( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.THEBLOODTHIRSTER.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.THEBLOODTHIRSTER.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

