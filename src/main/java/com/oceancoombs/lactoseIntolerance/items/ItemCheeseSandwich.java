package com.oceancoombs.lactoseIntolerance.items;
import com.oceancoombs.lactoseIntolerance.Reference;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemCheeseSandwich extends Item {
	public ItemCheeseSandwich() {
		setUnlocalizedName(Reference.OcmodItems.CHEESESANDWICH.getUnlocalizedName());
		setRegistryName(Reference.OcmodItems.CHEESESANDWICH.getRegistryName());
		this.setCreativeTab(CreativeTabs.FOOD);
	}

}
