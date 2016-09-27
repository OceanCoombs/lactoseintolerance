package com.oceancoombs.lactoseIntolerance.items;
import com.oceancoombs.lactoseIntolerance.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCheese extends Item {
	public ItemCheese() {
		setUnlocalizedName(Reference.OcmodItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.OcmodItems.CHEESE.getRegistryName());
		this.setCreativeTab(CreativeTabs.FOOD);
	}

}
