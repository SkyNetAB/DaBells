package dabells.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.CommonProxy;
import dabells.DaBells;
import dabells.Infofile;
import dabells.tileentities.TEPBellDiamond;
import dabells.tileentities.TEPBellEmerald;
import dabells.tileentities.TEPBellEnder;
import dabells.tileentities.TEPBellGold;
import dabells.tileentities.TEPBellLazurite;
import dabells.tileentities.TEPBellQuartz;
import dabells.tileentities.TEPBellRedStone;
import dabells.tileentities.TEPBellSilver;

public class BlockPlatedBell extends BlockContainer
{
	
	public BlockPlatedBell(String blkname)
	{
		super(Material.iron); 
		setHardness(3F); 
		setResistance(5F); 
		setLightLevel(0.375F);
		setStepSound(soundTypeWood);
		setCreativeTab(DaBells.DaBellsTab);
		setHarvestLevel("pickaxe", 2);
		setBlockName(blkname);
		name = blkname;
	}

	public String name;
		
	public PotionEffect getbelleffect2()
	{
		PotionEffect belleffect2 = null;
		if (name == "PlatedBellSilver")
			belleffect2 = new PotionEffect(Potion.jump.id, 1200, 0, false);
		else if (name == "PlatedBellQuartz")
			belleffect2 = new PotionEffect(Potion.nightVision.id, 1200, 0, false);
		else if (name == "PlatedBellRedStone")
			belleffect2 = new PotionEffect(Potion.moveSpeed.id, 1200, 0, false);
		else if (name == "PlatedBellLazurite")
			belleffect2 = new PotionEffect(Potion.waterBreathing.id, 1200, 0, false);
		else if (name == "PlatedBellGold")
			belleffect2 = new PotionEffect(Potion.damageBoost.id, 1200, 0, false);
		else if (name == "PlatedBellDiamond")
			belleffect2 = new PotionEffect(Potion.invisibility.id, 1200, 0, false);
		else if (name == "PlatedBellEnder")
			belleffect2 = new PotionEffect(Potion.fireResistance.id, 1200, 0, false);
		else if (name == "PlatedBellEmerald")
			belleffect2 = new PotionEffect(Potion.regeneration.id, 1200, 0, false);
		return belleffect2;
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
	{
		if (CommonProxy.resolution == 0) return -1;
		else return 1;
	}
	
	public TileEntity createNewTileEntity(World world, int var2)
	{
		if (CommonProxy.resolution == 0) 
		{
			TileEntity tileentity = null;
			
			if (name == "PlatedBellSilver") tileentity = new TEPBellSilver();
			else if (name == "PlatedBellQuartz") tileentity = new TEPBellQuartz();
			else if (name == "PlatedBellRedStone") tileentity = new TEPBellRedStone();
			else if (name == "PlatedBellLazurite") tileentity = new TEPBellLazurite();
			else if (name == "PlatedBellGold") tileentity = new TEPBellGold();
			else if (name == "PlatedBellDiamond") tileentity = new TEPBellDiamond();
			else if (name == "PlatedBellEnder") tileentity = new TEPBellEnder();
			else if (name == "PlatedBellEmerald") tileentity = new TEPBellEmerald();
			
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
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) 
	{
		world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, Infofile.NAME + ":bellsmack", 1.0F, 1.33F, false);
		player.addPotionEffect(getbelleffect2());
		return true;
	}
}