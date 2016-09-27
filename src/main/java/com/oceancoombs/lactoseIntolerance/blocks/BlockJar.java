package com.oceancoombs.lactoseIntolerance.blocks;

import com.oceancoombs.lactoseIntolerance.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockJar extends Block {
	public BlockJar() {
		super(Material.CLAY);
		setUnlocalizedName(Reference.OcmodBlocks.JAR.getUnlocalizedName());
		setRegistryName(Reference.OcmodBlocks.JAR.getRegistryName());
		this.setCreativeTab(CreativeTabs.FOOD);
	}
}
