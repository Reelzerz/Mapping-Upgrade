package init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void registerCraftingRecipies() {

	}

	public static void register() {
		//Crafting
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.testingcube), "TTT","TTT","TTT",'T', ModItems.testinggem);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.testingingot), Items.GOLD_INGOT, Items.DIAMOND, new ItemStack(Blocks.STAINED_GLASS, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aetherwisp), ModItems.amplifyingtome);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.forbiddenidol), ModItems.faeriecharm, ModItems.faeriecharm);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ardentcenser), ModItems.aetherwisp, ModItems.forbiddenidol);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.aegisofthelegion), ModItems.clotharmor, ModItems.nullmagicmantle);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.locketoftheironsolari), ModItems.nullmagicmantle, ModItems.aegisofthelegion);
		
		
		//Smelting
		GameRegistry.addSmelting(ModItems.testingingot, new ItemStack(ModItems.testinggem), .02F);
		
		
		//Armor
		GameRegistry.addRecipe(new ItemStack(ModArmor.SteelHelmet), new Object[] { "TTT","T T","   ",'T', ModItems.testinggem});
		GameRegistry.addRecipe(new ItemStack(ModArmor.SteelLeggings), new Object[] { "TTT","T T","T T",'T', ModItems.testinggem});
		GameRegistry.addRecipe(new ItemStack(ModArmor.SteelChestplate), new Object[] { "T T","TTT","TTT",'T', ModItems.testinggem});
		GameRegistry.addRecipe(new ItemStack(ModArmor.SteelBoots), new Object[] { "   ","T T","T T",'T', ModItems.testinggem});
	}
}
