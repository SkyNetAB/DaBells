package dabells.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class BellNetherStarMeta extends ItemBlock
{

	public BellNetherStarMeta(Block block)
	{
		super(block);
		this.setHasSubtypes(true);
	}
	
	final static String[] subBlocks = new String[]{"0","1","2","3","4","5","6","7"};
	
	public String getUnlocalizedName (ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();
		if (i < 0 || i >= subBlocks.length) i = 0;
		return super.getUnlocalizedName() + "." + subBlocks[i];
	}
	
	@Override
	public int getMetadata(int meta)
	{
		return meta;
	}

}
