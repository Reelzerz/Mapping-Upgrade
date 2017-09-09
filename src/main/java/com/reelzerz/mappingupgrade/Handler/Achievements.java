package com.reelzerz.mappingupgrade.Handler;

import java.util.ArrayList;
import java.util.List;

import com.reelzerz.mappingupgrade.MappingUpgrade;
import com.reelzerz.mappingupgrade.Reference;

import init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;

public class Achievements {
	private static List<Achievement> achievements = new ArrayList<Achievement>();
	
	public static Achievement achievementtesting = createAchievement("Testing", 0, 0, ModItems.testinggem);
	
	public static void registerAchievements() {
		Achievement[] achievementArray = new Achievement[achievements.size()];
		for(Achievement achievement : achievements) {
			achievement.registerStat();
			achievementArray[achievements.indexOf(achievement)] = achievement;
		}
		
		AchievementPage.registerAchievementPage(new AchievementPage(Reference.NAME, achievementArray));
	}
	
	private static Achievement createAchievement(String name, int column, int row, Item item) {
		Achievement achievement = new Achievement("Achievement." + name, name, column, row, item, (Achievement)null);
		achievements.add(achievement);
		return achievement;
	}	
	private static Achievement createAchievement(String name, int column, int row, Block block) {
		Achievement achievement = new Achievement("Achievement." + name, name, column, row, block, (Achievement)null);
		achievements.add(achievement);
		return achievement;
	}
	private static Achievement createAchievement(String name, int column, int row, ItemStack stack) {
		Achievement achievement = new Achievement("Achievement." + name, name, column, row, stack, (Achievement)null);
		achievements.add(achievement);
		return achievement;
	}


}
