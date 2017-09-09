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
		TESTINGINGOT("testingingot", "ItemTestingingot"),
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
		FLENDISHCODEX("flendishcodex", "ItemFlendishCodex"),
		ATHENESUNHOLYGRAIL("athenesunholygrail", "ItemAthenesUnholyGrail"),
		LOSTCHAPTER("lostchapter", "ItemLostChapter");
		
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
