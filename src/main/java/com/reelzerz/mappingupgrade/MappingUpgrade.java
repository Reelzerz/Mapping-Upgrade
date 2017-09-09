package com.reelzerz.mappingupgrade;

import java.util.EventListenerProxy;

import com.reelzerz.mappingupgrade.CreativeTab.TabrmumxArmor;
import com.reelzerz.mappingupgrade.CreativeTab.TabrmumxBlocks;
import com.reelzerz.mappingupgrade.CreativeTab.TabrmumxItems;
import com.reelzerz.mappingupgrade.Handler.Achievements;
import com.reelzerz.mappingupgrade.Handler.EventListener;
import com.reelzerz.mappingupgrade.proxy.CommonProxy;

import init.ModArmor;
import init.ModBlocks;
import init.ModCrafting;
import init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.util.Util;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class MappingUpgrade {
	
		
	//Creative Tabs
	public static final CreativeTabs blocks = new TabrmumxBlocks();
	public static final CreativeTabs items = new TabrmumxItems();
	public static final CreativeTabs armor = new TabrmumxArmor();
	
	
	@Mod.Instance(Reference.MOD_ID)
	public static MappingUpgrade instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		proxy.registerRenders();
		Achievements.registerAchievements();
		 
		 
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModArmor.init();
		ModArmor.register();
		
		
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {

		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler
	public void PostInit(FMLPostInitializationEvent event) {

		
	}
	
	//Creative Tabs
	//public static CreativeTabs tabMappingUpgrade = new CreativeTabs("tab_Mapping") {
		
	//	@Override
	//	public ItemStack getTabIconItem() {
	//		return new ItemStack(ModItems.testingingot);
			
	
		
	

	
}
