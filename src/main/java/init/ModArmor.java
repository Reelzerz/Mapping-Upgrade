package init;



import java.time.format.TextStyle;

import com.ibm.icu.impl.duration.impl.Utils;
import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import akka.japi.Util;
import items.ItemModArmor;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {
	
	public static ArmorMaterial SteelMaterial = EnumHelper.addArmorMaterial("Steel", Reference.MOD_ID + ":Steel", 33, new int[] {10,10,10,10}, 9, SoundEvents.BLOCK_END_GATEWAY_SPAWN, 2.0F);
	public static ArmorMaterial DarkIronMaterial = EnumHelper.addArmorMaterial("DarkIron", Reference.MOD_ID + ":DarkIron", 15, new int[] {10,10,10,10}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);

	public static ItemArmor SteelHelmet;
	public static ItemArmor SteelChestplate;
	public static ItemArmor SteelLeggings;
	public static ItemArmor SteelBoots;
	public static ItemArmor DarkIronHelmet;
	public static ItemArmor DarkIronChestplate;
	public static ItemArmor DarkIronLeggings;
	public static ItemArmor DarkIronBoots;
	
	
	
	public static void  init() {
		SteelHelmet = new ItemModArmor(SteelMaterial, 1, EntityEquipmentSlot.HEAD, "Steel_Helmet");
		SteelChestplate = new ItemModArmor(SteelMaterial, 1, EntityEquipmentSlot.CHEST, "Steel_Chestplate");
		SteelLeggings = new ItemModArmor(SteelMaterial, 2, EntityEquipmentSlot.LEGS, "Steel_Leggings");
		SteelBoots = new ItemModArmor(SteelMaterial, 1, EntityEquipmentSlot.FEET, "Steel_Boots");
		DarkIronHelmet = new ItemModArmor(DarkIronMaterial, 1, EntityEquipmentSlot.HEAD, "DarkIron_Helmet");
		DarkIronChestplate = new ItemModArmor(DarkIronMaterial, 1, EntityEquipmentSlot.CHEST, "DarkIron_Chestplate");
		DarkIronLeggings = new ItemModArmor(DarkIronMaterial, 2, EntityEquipmentSlot.LEGS, "DarkIron_Leggings");
		DarkIronBoots = new ItemModArmor(DarkIronMaterial, 1, EntityEquipmentSlot.FEET, "DarkIron_Boots");
	}
		
	
	public static void register() {
		registerItem(SteelHelmet);
		registerItem(SteelChestplate);
		registerItem(SteelLeggings);
		registerItem(SteelBoots);
		registerItem(DarkIronHelmet);
		registerItem(DarkIronChestplate);
		registerItem(DarkIronLeggings);
		registerItem(DarkIronBoots);
		
	}
	
	public static void registerRenders() {
		registerRender(SteelHelmet);
		registerRender(SteelChestplate);
		registerRender(SteelLeggings);
		registerRender(SteelBoots);
		registerRender(DarkIronHelmet);
		registerRender(DarkIronChestplate);
		registerRender(DarkIronLeggings);
		registerRender(DarkIronBoots);

		
	}
	
	

	
	public static void registerItem(Item item) {
		item.setCreativeTab(MappingUpgrade.armor);
		GameRegistry.register(item);

		
	}
	
	private static void registerRender(Item item) {
		System.out.println(item.getRegistryName());
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}

}
