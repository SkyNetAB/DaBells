package dabells.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.DaBells;
import dabells.Infofile;

public class BlockBellNetherStar extends Block
{
	
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
	{return 1;}  

	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int x, int y)
	{return this.blockIcon;}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister icon)
	{this.blockIcon = icon.registerIcon(Infofile.NAME + ":" + name);}
	
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