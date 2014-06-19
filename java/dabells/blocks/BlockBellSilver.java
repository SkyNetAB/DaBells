package dabells.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.Infofile;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBellSilver extends Block 
{ 
	public BlockBellSilver() 
	{
		super(Material.iron); 
		setHardness(3F); 
		setResistance(5F); 
		setLightLevel(0.0F);
		setStepSound(soundTypeMetal);
		setCreativeTab(CreativeTabs.tabBlock);
		setHarvestLevel("pickaxe", 2);
	} 
	
	public Item getItemDropped(int x, Random y, int z)
	{return Item.getItemFromBlock(this);} 
	
	public int quantityDropped(Random random) 
	{return 1;}  
	
	public boolean renderAsNormalBlock()
	{return false;}   
	
	public boolean isOpaqueCube() 
	{return false;}
	
	public int getRenderType() 
	{return 1;}  
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon)
	{this.blockIcon = icon.registerIcon(Infofile.NAME + ":BellSilver");}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int x, int y)
	{return this.blockIcon;}   
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int id1, float id2, float id3, float id4) 
	{
		world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, Infofile.NAME + ":bellsmack", 1.0F, 1.5F, false);
		return true;
	}
}
