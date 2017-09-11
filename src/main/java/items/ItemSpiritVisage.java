package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemSpiritVisage extends Item{
	public ItemSpiritVisage( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.SPIRITVISAGE.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.SPIRITVISAGE.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}