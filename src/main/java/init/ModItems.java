package init;

import items.ItemAegisOfTheLegion;
import items.ItemAetherWisp;
import items.ItemAmplifyingTome;
import items.ItemArchAngelsStaff;
import items.ItemArdentCenser;
import items.ItemAthenesUnholyGrail;
import items.ItemCatalystOfAeons;
import items.ItemChaliceOfHarmony;
import items.ItemClothArmor;
import items.ItemFaerieCharm;
import items.ItemFlendishCodex;
import items.ItemTestinggem;
import items.ItemTestingingot;
import items.ItemForbiddenIdol;
import items.ItemLocketOfTheIronSolari;
import items.ItemLostChapter;
import items.ItemNeedlesslyLargeRod;
import items.ItemNullMagicMantle;
import items.ItemRubyCrystal;
import items.ItemSaphireCrystal;
import items.ItemTearOfTheGoddess;
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
	public static Item catalystofaeons;
	public static Item tearofthegoddess;
	public static Item archangelsstaff;
	public static Item needlesslylargerod;
	public static Item chaliceofharmony;
	public static Item flendishcodex;
	public static Item athenesunholygrail;
	public static Item lostchapter;
	

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
		catalystofaeons = new ItemCatalystOfAeons();
		tearofthegoddess = new ItemTearOfTheGoddess();
		archangelsstaff = new ItemArchAngelsStaff();
		needlesslylargerod = new ItemNeedlesslyLargeRod();
		chaliceofharmony = new ItemChaliceOfHarmony();
		flendishcodex = new ItemFlendishCodex();
		athenesunholygrail = new ItemAthenesUnholyGrail();
		lostchapter = new ItemLostChapter();
		
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
		GameRegistry.register(catalystofaeons);
		GameRegistry.register(tearofthegoddess);
		GameRegistry.register(archangelsstaff);
		GameRegistry.register(needlesslylargerod);
		GameRegistry.register(chaliceofharmony);
		GameRegistry.register(flendishcodex);
		GameRegistry.register(athenesunholygrail);
		GameRegistry.register(lostchapter);
		
		
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
		registerRender(catalystofaeons);
		registerRender(tearofthegoddess);
		registerRender(archangelsstaff);
		registerRender(needlesslylargerod);
		registerRender(chaliceofharmony);
		registerRender(flendishcodex);
		registerRender(athenesunholygrail);
		registerRender(lostchapter);
		
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
