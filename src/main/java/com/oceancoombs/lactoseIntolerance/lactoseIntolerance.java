package com.oceancoombs.lactoseIntolerance;

import com.oceancoombs.lactoseIntolerance.init.ModBlocks;
import com.oceancoombs.lactoseIntolerance.init.ModItems;
import com.oceancoombs.lactoseIntolerance.proxy.CommonProxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)

public class lactoseIntolerance {
	@Instance
	public static lactoseIntolerance instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		System.out.println("preInit");
		ModItems.init();
		ModItems.register();
		ModItems.registerRenders();
		
		ModBlocks.init();
		ModBlocks.register();
		ModBlocks.registerRenders();
	}
	@EventHandler
	public void init(FMLInitializationEvent event){
		System.out.println("init");
		proxy.init();
	}
	@EventHandler
	public void postInt(FMLPostInitializationEvent event){
		System.out.println("postInit");
	}
}
