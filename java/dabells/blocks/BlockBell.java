package dabells.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.CommonProxy;
import dabells.DaBells;
import dabells.Infofile;
import dabells.tileentities.TEBellDiamond;
import dabells.tileentities.TEBellEmerald;
import dabells.tileentities.TEBellEnder;
import dabells.tileentities.TEBellGold;
import dabells.tileentities.TEBellLazurite;
import dabells.tileentities.TEBellQuartz;
import dabells.tileentities.TEBellRedStone;
import dabells.tileentities.TEBellSilver;

public class BlockBell extends BlockContainer
{
	
	public BlockBell(String blkname)
	{
		super(Material.iron); 
		setHardness(1F); 
		setResistance(5F); 
		setLightLevel(0.125F);
		setStepSound(soundTypeWood);
		setCreativeTab(DaBells.DaBellsTab);
		setHarvestLevel("pickaxe", 2);
		setBlockName(blkname);
		name = blkname;
	}

	public String name;

	public Item getItemDropped(int x, Random y, int z)
	{return Item.getItemFromBlock(this);} 
	
	public int quantityDropped(Random random) 
	{return 1;}  
	
	public boolean renderAsNormalBlock()
	{return false;}   
	
	public boolean isOpaqueCube() 
	{return false;}
	
	public int getRenderType() 
	{
		if (CommonProxy.resolution == 0) return -1;
		else return 1;
	}
	
	public TileEntity createNewTileEntity(World world, int var2)
	{
		if (CommonProxy.resolution == 0) 
		{
			TileEntity tileentity = null;
		
			if (name == "BellSilver") tileentity = new TEBellSilver();
			else if (name == "BellQuartz") tileentity = new TEBellQuartz();
			else if (name == "BellRedStone") tileentity = new TEBellRedStone();
			else if (name == "BellLazurite") tileentity = new TEBellLazurite();
			else if (name == "BellGold") tileentity = new TEBellGold();
			else if (name == "BellDiamond") tileentity = new TEBellDiamond();
			else if (name == "BellEnder") tileentity = new TEBellEnder();
			else if (name == "BellEmerald") tileentity = new TEBellEmerald();
		
			return tileentity;
		}
		else return null;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int x, int y)
	{return this.blockIcon;}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon)
	{this.blockIcon = icon.registerIcon(Infofile.NAME + ":" + CommonProxy.resolution + "/" + name);}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int id1, float id2, float id3, float id4) 
	{
		world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, Infofile.NAME + ":bellsmack", 1.0F, 2.0F, false);
		return true;
	}

}