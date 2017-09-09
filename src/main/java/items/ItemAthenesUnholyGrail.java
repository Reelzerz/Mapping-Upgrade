package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import net.minecraft.item.Item;

public class ItemAthenesUnholyGrail extends Item{
	public ItemAthenesUnholyGrail( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.ATHENESUNHOLYGRAIL.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.ATHENESUNHOLYGRAIL.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}

