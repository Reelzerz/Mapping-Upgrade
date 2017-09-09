package items;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;
import com.reelzerz.mappingupgrade.Handler.Achievements;

import init.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;


public class ItemTestinggem extends Item {
	public ItemTestinggem( ) {
		setUnlocalizedName(Reference.MappingUpgradeItems.TESTINGGEM.getUnlocalizedName());
		setRegistryName(Reference.MappingUpgradeItems.TESTINGGEM.getRegistryName());
		setCreativeTab(MappingUpgrade.items);
		
	}

}
