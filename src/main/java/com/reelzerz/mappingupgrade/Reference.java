package com.reelzerz.mappingupgrade;

public class Reference {

	public static final String MOD_ID = "rmumx";
	public static final String NAME = "Mapping Upgrade";
	public static final String VERSION = "0.0.1";
	public static final String ACCEPTED_VERSIONS = "[1.11.2]";
	
	//Proxy References
	public static final String CLIENT_PROXY_CLASS = "com.reelzerz.mappingupgrade.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.reelzerz.mappingupgrade.proxy.ServerProxy";
	
	
	
	
		//Items
	public static enum MappingUpgradeItems {
		REPLACEDSCEPTER("replacedscepter", "ItemReplacedScepter"),
		TESTINGGEM("testinggem", "ItemTestinggem"),
		AEGISOFTHELEGION("aegisofthelegion", "ItemAegisOfTheLegion"),
		AETHERWISP("aetherwisp", "ItemAetherWisp"),
		AMPLIFYINGTOME("amplifyingtome", "ItemAmplifyingTome"),
		ARDENTCENSER("ardentcenser", "ItemArdentCenser"),
		FORBIDDENIDOL("forbiddenidol", "ItemForbiddenIdol"),
		FAERIECHARM("faeriecharm", "ItemFaerieCharm"),
		NULLMAGICMANTLE("nullmagicmantle", "ItemNullMagicMantle"),
		CLOTHARMOR("clotharmor", "ItemClothArmor"),
		LOCKETOFTHEIRONSOLARI("locketoftheironsolari", "ItemLocketOfTheIronSolari"),
		RUBYCRYSTAL("rubycrystal", "ItemRubyCrystal"),
		SAPHIRECRYSTAL("saphirecrystal", "ItemSaphireCrystal"),
		CATALYSTOFAEONS("catalystofaeons", "ItemCatalystOfAeons"),
		TEAROFTHEGODDESS("tearofthegoddess", "ItemTearOfTheGoddess"),
		ARCHANGELSSTAFF("archangelsstaff", "ItemArchAngelsStaff"),
		NEEDLESSLYLARGEROD("needlesslylargerod", "ItemNeedlesslyLargeRod"),
		CHALICEOFHARMONY("chaliceofharmony", "ItemChaliceOfHarmony"),
		FIENDISHCODEX("fiendishcodex", "ItemFiendishCodex"),
		ATHENESUNHOLYGRAIL("athenesunholygrail", "ItemAthenesUnholyGrail"),
		LOSTCHAPTER("lostchapter", "ItemLostChapter"),
		MORELLONOMICON("morellonomicon", "ItemMorellonomicon"),
		GLACIALSHROUD("glacialshroud", "ItemGlacialShroud"),
		ZEKESCONVERGENCE("zekesconvergence", "ItemZekesConvergence"),
		BLASTINGWAND("blastingwand", "ItemBlastingWand"),
		RODOFAGES("rodofages", "ItemRodOfAges"),
		RABODANSDEATHCAP("rabodansdeathcap", "ItemRabodansDeathcap"),
		VOIDSTAFF("voidstaff", "ItemVoidStaff"),
		BANSHEESVEIL("bansheesveil", "ItemBansheesVeil"),
		RYLAISCRYSTALSCEPTER("rylaiscrystalscepter", "ItemRylaisCrystalScepter"),
		ITEMBFSWORD("bfsword", "ItemBFSword"),
		GUARDIANANGEL("guardianangel", "ItemGuardianAngel"),
		LONGSWORD("longsword", "ItemLongSword"),
		VAMPIRICSCEPTER("vampiricscepter", "ItemVampiricScepter"),
		THEBLOODTHIRSTER("thebloodthirster", "ItemTheBloodthirster"),
		KINDLEGEM("kindlegem", "ItemKindleGem"),
		PHAGE("phage", "ItemPhage"),
		BLACKCLEAVER("blackcleaver", "ItemBlackCleaver"),
		SPECTRESCOWL("spectrescowl", "ItemSpectresCowl"),
		SPIRITVISAGE("spiritvisage", "ItemSpiritVisage"),
		REJUVENATIONBEAD("rejuvenationbead", "ItemRejuvenationBead"),
		ADAPTIVEHELM("adaptivehelm", "ItemAdaptiveHelm"),
		SHEEN("sheen", "ItemSheen"),
		LICHBANE("lichbane", "ItemLichBane"),
		ICEBORNGAUNTLET("iceborngauntlet", "ItemIcebornGauntlet"),
		DAGGER("dagger", "ItemDagger"),
		STINGER("stinger", "ItemStinger"),
		RECURVEBOW("recurvebow", "ItemRecurveBow"),
		TRINITYFORCE("trinityforce", "ItemTrinityForce"),
		NASHORSTOOTH("nashorstooth", "ItemNashorsTooth"),
		BILGEWATERCUTLASS("bilgewatercutlass", "ItemBilgewatercutlass"),
		BLADEOFTHERUINEDKING("bladeoftheruinedking", "ItemBladeOfTheRuinedKing"),
		NEGATRONCLOAK("negatroncloak", "ItemNegatronCloak"),
		QUICKSILVERSASH("quicksilversash", "ItemQuicksilverSash"),
		WITSEND("witsend", "ItemWitsEnd"),
		ABYSSALMASK("abyssalmask", "ItemAbyssalMask"),
		PICKAXE("pickaxe", "ItemPickaxe"),
		GUINSOOSRAGEBLADE("guinsoosrageblade", "ItemGuinsoosRageblade"),
		HAUNTINGGUISE("hauntingguise", "ItemHauntingGuise"),
		LIANDRYSTORMENT("liandrystorment", "ItemLiandrysTorment"),
		GIANTSBELT("giantsbelt", "ItemGiantsBelt"),
		BAMISCINDER("bamiscinder", "ItemBamisCinder"),
		FROZENMALLET("frozenmallet", "ItemFrozenMallet"),
		JAURIMSFIST("jaurimsfist", "ItemJaurimsFist"),
		CHAINVEST("chainvest", "ItemChainVest"),
		SUNFIRECAPE("sunfirecape", "ItemSunfireCape"),
		DEADMANSPLATE("deadmansplate", "ItemDeadMansPlate"),
		KNIGHTSVOW("knightsvow", "ItemKnightsVow"),
		GARGOYLESTONEPLATE("gargoylestoneplate", "ItemGargoyleStoneplate"),
		WARDENSMAIL("wardensmail", "ItemWardensMail"),
		FROZENHEART("frozenheart", "ItemFrozenHeart"),
		RANDUINSOMEN("randuinsomen", "ItemRanduinsOmen");
		
		
		private String unlocalizedName;
		private String registryName; 
		
		
		MappingUpgradeItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName; 
		}
	
		public String getUnlocalizedName() {
			return unlocalizedName;
			
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		//Blocks
	}
		public static enum MappingUpgradeBlocks {
			TESTINGCUBE("testingcube", "BlockTestingcube");
			
			private String unlocalizedName;
			private String registryName; 
			
			
			MappingUpgradeBlocks(String unlocalizedName, String registryName) {
				this.unlocalizedName = unlocalizedName;
				this.registryName = registryName; 
			}
		
			public String getUnlocalizedName() {
				return unlocalizedName;
				
			}
			
			public String getRegistryName() {
				return registryName;
			}
			
			//Armor
		}
		public static enum MappingUpgradeArmor {
			MODARMOR("ModArmor", "ItemModArmor");

			
			private String unlocalizedName;
			private String registryName; 
			
			
			MappingUpgradeArmor(String unlocalizedName, String registryName) {
				this.unlocalizedName = unlocalizedName;
				this.registryName = registryName; 
			}
		
			public String getUnlocalizedName() {
				return unlocalizedName;
				
			}
			
			public String getRegistryName() {
				return registryName;
			}
			
			
			
	}
	
}
