package dabells.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.CommonProxy;
import dabells.DaBells;
import dabells.Infofile;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemPasteLuminous extends Item
{
	public ItemPasteLuminous(String itemname)
	{
		setCreativeTab(DaBells.DaBellsTab);
		setUnlocalizedName(itemname);
		name = itemname;
	}

	public String name;

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister icon)
	{this.itemIcon = icon.registerIcon(Infofile.NAME + ":" + CommonProxy.resolution + "/" + name);}
	
}
