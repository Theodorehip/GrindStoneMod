package com.millstone.blocks;

import com.millstone.MillstoneMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class ObsidianBlock extends Block{

	public ObsidianBlock(Material material) {
		super(material);
		
		this.setHardness(10F);
		this.setResistance(30F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(MillstoneMod.MODID + ":" + "RefObsBlock");
		
	}

}
