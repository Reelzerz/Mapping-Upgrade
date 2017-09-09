package init;


import com.reelzerz.mappingupgrade.blocks.BlockTestingcube;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;



public class ModBlocks {

	public static Block testingcube;
	

	public static void init() {
		testingcube = new BlockTestingcube();
			
	}
	
	public static void register() {
		registerBlock(testingcube);
	}
	private static void registerBlock(Block block) {
		GameRegistry.register(testingcube);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
	}
	
	public static void registerRenders() {
		registerRender(testingcube);
		
	}
	
	private static void registerRender(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
		
	}
}

