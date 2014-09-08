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
import dabells.tileentities.TEHBellDiamond;
import dabells.tileentities.TEHBellEmerald;
import dabells.tileentities.TEHBellEnder;
import dabells.tileentities.TEHBellGold;
import dabells.tileentities.TEHBellLazurite;
import dabells.tileentities.TEHBellQuartz;
import dabells.tileentities.TEHBellRedStone;
import dabells.tileentities.TEHBellSilver;

public class BlockHardenedBell extends BlockContainer
{
	
	public BlockHardenedBell(String blkname)
	{
		super(Material.iron); 
		setHardness(2F); 
		setResistance(5F); 
		setLightLevel(0.25F);
		setStepSound(soundTypeWood);
		setCreativeTab(DaBells.DaBellsTab);
		setHarvestLevel("pickaxe", 2);
		setBlockName(blkname);
		name = blkname;
	}

	public String name;
	
	public PotionEffect getbelleffect1()
	{
		PotionEffect belleffect1 = null;
		if (name == "HardenedBellSilver")
			belleffect1 = new PotionEffect(Potion.jump.id, 100, 0, false);
		else if (name == "HardenedBellQuartz")
			belleffect1 = new PotionEffect(Potion.nightVision.id, 100, 0, false);
		else if (name == "HardenedBellRedStone")
			belleffect1 = new PotionEffect(Potion.moveSpeed.id, 100, 0, false);
		else if (name == "HardenedBellLazurite")
			belleffect1 = new PotionEffect(Potion.waterBreathing.id, 100, 0, false);
		else if (name == "HardenedBellGold")
			belleffect1 = new PotionEffect(Potion.damageBoost.id, 100, 0, false);
		else if (name == "HardenedBellDiamond")
			belleffect1 = new PotionEffect(Potion.invisibility.id, 100, 0, false);
		else if (name == "HardenedBellEnder")
			belleffect1 = new PotionEffect(Potion.fireResistance.id, 100, 0, false);
		else if (name == "HardenedBellEmerald")
			belleffect1 = new PotionEffect(Potion.regeneration.id, 100, 0, false);
		return belleffect1;
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
			
			if (name == "HardenedBellSilver") tileentity = new TEHBellSilver();
			else if (name == "HardenedBellQuartz") tileentity = new TEHBellQuartz();
			else if (name == "HardenedBellRedStone") tileentity = new TEHBellRedStone();
			else if (name == "HardenedBellLazurite") tileentity = new TEHBellLazurite();
			else if (name == "HardenedBellGold") tileentity = new TEHBellGold();
			else if (name == "HardenedBellDiamond") tileentity = new TEHBellDiamond();
			else if (name == "HardenedBellEnder") tileentity = new TEHBellEnder();
			else if (name == "HardenedBellEmerald") tileentity = new TEHBellEmerald();
			
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
		world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, Infofile.NAME + ":bellsmack", 1.0F, 1.66F, false);
		player.addPotionEffect(getbelleffect1());
		return true;
	}
}