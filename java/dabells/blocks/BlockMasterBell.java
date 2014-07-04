package dabells.blocks;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.DaBells;
import dabells.Infofile;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockMasterBell extends Block
{
	
	public BlockMasterBell(String blkname)
	{
		super(Material.iron); 
		setHardness(4F); 
		setResistance(5F); 
		setLightLevel(0.5F);
		setStepSound(soundTypeWood);
		setCreativeTab(DaBells.DaBellsTab);
		setHarvestLevel("pickaxe", 2);
		setBlockName(blkname);
		name = blkname;
	}

	public String name;

	
	public PotionEffect getbelleffect3()
	{
		PotionEffect belleffect3 = null;
		if (name == "MasterBellSilver")
			belleffect3 = new PotionEffect(Potion.jump.id, 2400, 1, false);
		else if (name == "MasterBellQuartz")
			belleffect3 = new PotionEffect(Potion.nightVision.id, 2400, 0, false);
		else if (name == "MasterBellRedStone")
			belleffect3 = new PotionEffect(Potion.moveSpeed.id, 2400, 1, false);
		else if (name == "MasterBellLazurite")
			belleffect3 = new PotionEffect(Potion.waterBreathing.id, 2400, 0, false);
		else if (name == "MasterBellGold")
			belleffect3 = new PotionEffect(Potion.damageBoost.id, 2400, 1, false);
		else if (name == "MasterBellDiamond")
			belleffect3 = new PotionEffect(Potion.invisibility.id, 2400, 0, false);
		else if (name == "MasterBellEnder")
			belleffect3 = new PotionEffect(Potion.fireResistance.id, 2400, 0, false);
		else if (name == "MasterBellEmerald")
			belleffect3 = new PotionEffect(Potion.regeneration.id, 2400, 1, false);
		return belleffect3;
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
		world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, Infofile.NAME + ":bellsmack", 1.0F, 1.0F, false);
		player.addPotionEffect(getbelleffect3());
		return true;
	}
}