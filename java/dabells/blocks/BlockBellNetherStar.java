package dabells.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.CommonProxy;
import dabells.DaBells;
import dabells.Infofile;
import dabells.tileentities.TEBellNetherStar0;
import dabells.tileentities.TEBellNetherStar1;
import dabells.tileentities.TEBellNetherStar2;
import dabells.tileentities.TEBellNetherStar3;
import dabells.tileentities.TEBellNetherStar4;
import dabells.tileentities.TEBellNetherStar5;
import dabells.tileentities.TEBellNetherStar6;
import dabells.tileentities.TEBellNetherStar7;

public class BlockBellNetherStar extends BlockContainer
{
	public int maxMeta = 8;

	private IIcon[] texture;
	
	public BlockBellNetherStar(String blkname)
	{
		super(Material.iron);
		setHardness(5F); 
		setResistance(5F); 
		setLightLevel(0.625F);
		setStepSound(soundTypeWood);
		setCreativeTab(DaBells.DaBellsTab);
		setHarvestLevel("pickaxe", 2);
		setBlockName(blkname);
		name = blkname;
		if (CommonProxy.resolution == 0)
		{
			texture = new IIcon[maxMeta];
		}
		
	}

	public String name;
			
	public PotionEffect[] getbelleffect4()
	{
		PotionEffect[] belleffect4 = null;
		if (name == "BellNetherStar")
		{
			belleffect4 = new PotionEffect[8];
			belleffect4[0] = new PotionEffect(Potion.jump.id, 6000, 2, false);
			belleffect4[1] = new PotionEffect(Potion.nightVision.id, 6000, 0, false);
			belleffect4[2] = new PotionEffect(Potion.moveSpeed.id, 6000, 2, false);
			belleffect4[3] = new PotionEffect(Potion.waterBreathing.id, 6000, 0, false);
			belleffect4[4] = new PotionEffect(Potion.damageBoost.id, 6000, 2, false);
			belleffect4[5] = new PotionEffect(Potion.invisibility.id, 6000, 0, false);
			belleffect4[6] = new PotionEffect(Potion.fireResistance.id, 6000, 0, false);
			belleffect4[7] = new PotionEffect(Potion.regeneration.id, 6000, 2, false);
		}
		return belleffect4;
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
	
	public TileEntity createNewTileEntity(World world, int meta)
	{
		if (CommonProxy.resolution == 0)
		{
			switch (meta)
			{
			case 0: return new TEBellNetherStar0();
			case 1: return new TEBellNetherStar1();
			case 2: return new TEBellNetherStar2();
			case 3: return new TEBellNetherStar3();
			case 4: return new TEBellNetherStar4();
			case 5: return new TEBellNetherStar5();
			case 6: return new TEBellNetherStar6();
			case 7: return new TEBellNetherStar7();
			default: return new TEBellNetherStar0();
			}
		}
		else return null;
	}
	
	public int getMetadata(int meta)
	{
		return this.damageDropped(meta);
	}
	
	@Override
	public int damageDropped(int meta)
	{return meta;}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon)
	{
		if (CommonProxy.resolution == 0)
		{
			for(int i = 0; i < maxMeta ; i++)
			{
				texture[i] = icon.registerIcon(Infofile.NAME + ":" + CommonProxy.resolution + "/" + name + i);
			}	
		}
		else
		{this.blockIcon = icon.registerIcon(Infofile.NAME + ":" + CommonProxy.resolution + "/" + name);}
		
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item block, List<ItemStack> list)
	{
		for(int i = 0; i < maxMeta; i++)
		{list.add(new ItemStack(block, 1, i));}
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if (CommonProxy.resolution == 0)
		{return texture[meta];}
		else {return this.blockIcon;}
	}
	
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) 
	{
		int i = 0;
		double d0 = 5;
		AxisAlignedBB axis = AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)(x + 1), (double)(y + 1), (double)(z + 1)).expand(d0, d0, d0);
		List<?> list = world.getEntitiesWithinAABB(EntityPlayer.class, axis);
		Iterator<?> iterator = list.iterator();
		world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, Infofile.NAME + ":starbellsmack", 1.0F, 1.0F, false);
		
		while (iterator.hasNext())
		{
			player = (EntityPlayer)iterator.next();
			PotionEffect[] belleffect4 = getbelleffect4();
			for (i = 0; i < 8; i++)
			{
				player.addPotionEffect(belleffect4[i]);
			}
		}
		return true;
	}
}