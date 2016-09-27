package com.oceancoombs.lactoseIntolerance.blocks;
import com.oceancoombs.lactoseIntolerance.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCheese extends Block {

	public BlockCheese() {
		super(Material.CAKE);
		setUnlocalizedName(Reference.OcmodBlocks.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.OcmodBlocks.CHEESE.getRegistryName());
		this.setCreativeTab(CreativeTabs.FOOD);
	}

}
