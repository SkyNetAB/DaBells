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
	public RenderBell(String blkname) 
	{
		this.model = new BellModel();
		this.name = blkname;
		textured();
	}
	
	public String name;
	private BellModel model;
	private ResourceLocation texture;
	
	private void textured()
	{texture = new ResourceLocation(Infofile.NAME + ":" + "textures/tileentities/" + CommonProxy.resolution + "/" + name + ".png");}
	
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
