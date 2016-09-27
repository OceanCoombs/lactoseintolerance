package com.oceancoombs.lactoseIntolerance.init;

import com.oceancoombs.lactoseIntolerance.Reference;
import com.oceancoombs.lactoseIntolerance.items.ItemCheese;
import com.oceancoombs.lactoseIntolerance.items.ItemCheeseSandwich;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item cheese;
	public static Item cheeseSandwich;
	
	public static void init(){
		cheese = new ItemCheese();
		cheeseSandwich = new ItemCheeseSandwich();	
	}
	
	public static void register(){
		GameRegistry.register(cheese);
		GameRegistry.register(cheeseSandwich);
		registerRenders();
	}
	
	public static void registerRenders(){
		registerRender(cheese);
		registerRender(cheeseSandwich);
	}
	private static void registerRender(Item item){
		System.out.println(item.getRegistryName() + "7777777777777777777777777777777777777777777777777777777777777");
//		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
