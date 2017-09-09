package init;

import items.ItemAegisOfTheLegion;
import items.ItemAetherWisp;
import items.ItemAmplifyingTome;
import items.ItemArdentCenser;
import items.ItemClothArmor;
import items.ItemFaerieCharm;
import items.ItemTestinggem;
import items.ItemTestingingot;
import items.ItemForbiddenIdol;
import items.ItemLocketOfTheIronSolari;
import items.ItemNullMagicMantle;
import items.ItemRubyCrystal;
import items.ItemSaphireCrystal;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item testingingot;
	public static Item testinggem;
	public static Item aegisofthelegion;
	public static Item aetherwisp;
	public static Item amplifyingtome;
	public static Item ardentcenser;
	public static Item forbiddenidol;
	public static Item faeriecharm;
	public static Item nullmagicmantle;
	public static Item clotharmor;
	public static Item locketoftheironsolari;
	public static Item rubycrystal;
	public static Item saphirecrystal;
	

	public static void init() {
		testingingot = new ItemTestingingot();
		testinggem = new ItemTestinggem();
		aegisofthelegion = new ItemAegisOfTheLegion();
		aetherwisp = new ItemAetherWisp();
		amplifyingtome = new ItemAmplifyingTome();
		ardentcenser = new ItemArdentCenser();
		forbiddenidol = new ItemForbiddenIdol();
		faeriecharm = new ItemFaerieCharm();
		nullmagicmantle = new ItemNullMagicMantle();
		clotharmor = new ItemClothArmor();
		locketoftheironsolari = new ItemLocketOfTheIronSolari();
		rubycrystal = new ItemRubyCrystal();
		saphirecrystal = new ItemSaphireCrystal();
		
	}
	
	public static void register() {
		GameRegistry.register(testingingot);
		GameRegistry.register(testinggem);
		GameRegistry.register(aegisofthelegion);
		GameRegistry.register(aetherwisp);
		GameRegistry.register(amplifyingtome);
		GameRegistry.register(ardentcenser);
		GameRegistry.register(forbiddenidol);
		GameRegistry.register(faeriecharm);
		GameRegistry.register(nullmagicmantle);
		GameRegistry.register(clotharmor);
		GameRegistry.register(locketoftheironsolari);
		GameRegistry.register(rubycrystal);
		GameRegistry.register(saphirecrystal);
		
		
	}
	
	public static void registerRenders() {
		registerRender(testingingot);
		registerRender(testinggem);
		registerRender(aegisofthelegion);
		registerRender(aetherwisp);
		registerRender(amplifyingtome);
		registerRender(ardentcenser);
		registerRender(forbiddenidol);
		registerRender(faeriecharm);
		registerRender(nullmagicmantle);
		registerRender(clotharmor);
		registerRender(locketoftheironsolari);
		registerRender(rubycrystal);
		registerRender(saphirecrystal);
		
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
