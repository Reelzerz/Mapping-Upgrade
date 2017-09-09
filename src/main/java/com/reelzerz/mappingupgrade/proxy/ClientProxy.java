package com.reelzerz.mappingupgrade.proxy;

import init.ModArmor;
import init.ModBlocks;
import init.ModItems;

public class ClientProxy implements CommonProxy {
	

	@Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModArmor.registerRenders();
	}
	public void registerRenders() {
	}
}
