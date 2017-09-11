package init;

import items.ItemAegisOfTheLegion;
import items.ItemAetherWisp;
import items.ItemAmplifyingTome;
import items.ItemArchAngelsStaff;
import items.ItemArdentCenser;
import items.ItemAthenesUnholyGrail;
import items.ItemBFSword;
import items.ItemBansheesVeil;
import items.ItemBlastingWand;
import items.ItemCatalystOfAeons;
import items.ItemChaliceOfHarmony;
import items.ItemClothArmor;
import items.ItemFaerieCharm;
import items.ItemFlendishCodex;
import items.ItemTestinggem;
import items.ItemTheBloodthirster;
import items.ItemVampiricScepter;
import items.ItemReplacedScepter;
import items.ItemVoidStaff;
import items.ItemZekesConvergence;
import items.ItemForbiddenIdol;
import items.ItemGuardianAngel;
import items.ItemGlacialShroud;
import items.ItemLocketOfTheIronSolari;
import items.ItemLongSword;
import items.ItemLostChapter;
import items.ItemMorellonomicon;
import items.ItemNeedlesslyLargeRod;
import items.ItemNullMagicMantle;
import items.ItemRabodansDeathcap;
import items.ItemRodOfAges;
import items.ItemRubyCrystal;
import items.ItemRylaisCrystalScepter;
import items.ItemSaphireCrystal;
import items.ItemTearOfTheGoddess;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item replacedscepter;
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
	public static Item morellonomicon;
	public static Item glacialshroud;
	public static Item zekesconvergence;
	public static Item blastingwand;
	public static Item rodofages;
	public static Item rabodansdeathcap;
	public static Item voidstaff;
	public static Item bansheesveil;
	public static Item rylaiscrystalscepter;
	public static Item bfsword;
	public static Item guardianangel;
	public static Item longsword;
	public static Item vampiricscepter;
	public static Item thebloodthirster;
	

	public static void init() {
		replacedscepter = new ItemReplacedScepter();
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
		morellonomicon = new ItemMorellonomicon();
		glacialshroud = new ItemGlacialShroud();
		zekesconvergence = new ItemZekesConvergence();
		blastingwand = new ItemBlastingWand();
		rodofages = new ItemRodOfAges();
		rabodansdeathcap = new ItemRabodansDeathcap();
		voidstaff = new ItemVoidStaff();
		bansheesveil = new ItemBansheesVeil();
		rylaiscrystalscepter = new ItemRylaisCrystalScepter();
		bfsword = new ItemBFSword();
		guardianangel = new ItemGuardianAngel();
		longsword = new ItemLongSword();
		vampiricscepter = new ItemVampiricScepter();
		thebloodthirster = new ItemTheBloodthirster();
		
	}
	
	public static void register() {
		GameRegistry.register(replacedscepter);
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
		GameRegistry.register(morellonomicon);
		GameRegistry.register(glacialshroud);
		GameRegistry.register(zekesconvergence);
		GameRegistry.register(blastingwand);
		GameRegistry.register(rodofages);
		GameRegistry.register(rabodansdeathcap);
		GameRegistry.register(voidstaff);
		GameRegistry.register(bansheesveil);
		GameRegistry.register(rylaiscrystalscepter);
		GameRegistry.register(bfsword);
		GameRegistry.register(guardianangel);
		GameRegistry.register(longsword);
		GameRegistry.register(vampiricscepter);
		GameRegistry.register(thebloodthirster);
		
	}
	
	public static void registerRenders() {
		registerRender(replacedscepter);
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
		registerRender(morellonomicon);
		registerRender(glacialshroud);
		registerRender(zekesconvergence);
		registerRender(blastingwand);
		registerRender(rodofages);
		registerRender(rabodansdeathcap);
		registerRender(voidstaff);
		registerRender(bansheesveil);
		registerRender(rylaiscrystalscepter);
		registerRender(bfsword);
		registerRender(guardianangel);
		registerRender(longsword);
		registerRender(vampiricscepter);
		registerRender(thebloodthirster);
		
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}
