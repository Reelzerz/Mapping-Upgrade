package com.reelzerz.mappingupgrade.Handler;

import init.ModItems;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemSmeltedEvent;

public class EventListener {

	@SubscribeEvent
	 public void smelting(ItemSmeltedEvent event)
	 {
	 if(event.smelting.getItem() == ModItems.testinggem)
	 {
	 event.player.addStat(Achievements.achievementtesting, 1);
	 }
	 }
	
}
