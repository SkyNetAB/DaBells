package dabells.blocks;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import dabells.CommonProxy;
import dabells.Infofile;

@SideOnly(Side.CLIENT)
public class RenderBell extends TileEntitySpecialRenderer
{
	public RenderBell(String blkname, String metadata) 
	{
		this.model = new BellModel();
		this.name = blkname;
		this.metaString = metadata;
		textured();
	}

	public String name;
	private BellModel model;
	public String metaString;
	public String meta;
	private ResourceLocation texture;
	
	private void textured()
	{
		if (name == "BellNetherStar0" || name == "BellNetherStar1" ||
			name == "BellNetherStar2" || name == "BellNetherStar3" ||
			name == "BellNetherStar4" || name == "BellNetherStar5" ||
			name == "BellNetherStar6" || name == "BellNetherStar7")
		{
			if (metaString == "0") meta = "Silver";
			else if (metaString == "1") meta = "Quartz";
			else if (metaString == "2") meta = "RedStone";
			else if (metaString == "3") meta = "Lazurite";
			else if (metaString == "4") meta = "Gold";
			else if (metaString == "5") meta = "Diamond";
			else if (metaString == "6") meta = "Ender";
			else if (metaString == "7") meta = "Emerald";
			else meta = "Silver";
			
			String nameNS = "BellNetherStar";
			texture = new ResourceLocation(Infofile.NAME + ":" + "textures/tileentities/" + CommonProxy.resolution + "/" + nameNS + meta + ".png");
		}
		else
			texture = new ResourceLocation(Infofile.NAME + ":" + "textures/tileentities/" + CommonProxy.resolution + "/" + name + ".png");
		
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f)
	{
		GL11.glPushMatrix();
			GL11.glTranslatef((float)x + 0.5F, (float)y + 1F, (float)z + 0.5F);
			GL11.glRotatef(180, 0F, 0F, 1F);
		
			this.bindTexture(texture);
		
				GL11.glPushMatrix();
					this.model.renderModel(0.0625F);
				GL11.glPopMatrix();
		GL11.glPopMatrix();
		
	}

}
