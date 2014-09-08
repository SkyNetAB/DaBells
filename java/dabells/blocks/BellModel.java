package dabells.blocks;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class BellModel extends ModelBase
{
  //fields
    ModelRenderer TopSqr;
    ModelRenderer TopRight;
    ModelRenderer TopLeft;
    ModelRenderer TopBack;
    ModelRenderer TopFront;
    ModelRenderer Handle;
    ModelRenderer Bell1;
    ModelRenderer Bell2;
    ModelRenderer Bell3;
    ModelRenderer Bell4;
    ModelRenderer BellBack1;
    ModelRenderer BellFront1;
    ModelRenderer BellRight1;
    ModelRenderer BellLeft1;
    ModelRenderer BellBack2;
    ModelRenderer BellFront2;
    ModelRenderer BellRight2;
    ModelRenderer BellLeft2;
    ModelRenderer Clapper;
  
  public BellModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      TopSqr = new ModelRenderer(this, 0, 0);
      TopSqr.addBox(-4F, 0F, -4F, 8, 2, 8);
      TopSqr.setRotationPoint(0F, 0F, 0F);
      TopSqr.setTextureSize(64, 64);
      TopSqr.mirror = true;
      setRotation(TopSqr, 0F, 0F, 0F);
      TopRight = new ModelRenderer(this, 4, 0);
      TopRight.addBox(-8F, 0F, -4F, 4, 2, 8);
      TopRight.setRotationPoint(0F, 0F, 0F);
      TopRight.setTextureSize(64, 64);
      TopRight.mirror = true;
      setRotation(TopRight, 0F, 0F, 0F);
      TopLeft = new ModelRenderer(this, 4, 0);
      TopLeft.addBox(4F, 0F, -4F, 4, 2, 8);
      TopLeft.setRotationPoint(0F, 0F, 0F);
      TopLeft.setTextureSize(64, 64);
      TopLeft.mirror = true;
      setRotation(TopLeft, 0F, 0F, 0F);
      TopBack = new ModelRenderer(this, 4, 4);
      TopBack.addBox(0F, 0F, 0F, 8, 2, 4);
      TopBack.setRotationPoint(-4F, 0F, 4F);
      TopBack.setTextureSize(64, 64);
      TopBack.mirror = true;
      setRotation(TopBack, 0F, 0F, 0F);
      TopFront = new ModelRenderer(this, 4, 4);
      TopFront.addBox(-4F, 0F, -8F, 8, 2, 4);
      TopFront.setRotationPoint(0F, 0F, 0F);
      TopFront.setTextureSize(64, 64);
      TopFront.mirror = true;
      setRotation(TopFront, 0F, 0F, 0F);
      Handle = new ModelRenderer(this, 32, 10);
      Handle.addBox(-1F, 0F, -1F, 2, 2, 2);
      Handle.setRotationPoint(0F, 2F, 0F);
      Handle.setTextureSize(64, 64);
      Handle.mirror = true;
      setRotation(Handle, 0F, 0F, 0F);
      Bell1 = new ModelRenderer(this, 30, 14);
      Bell1.addBox(-1.5F, 0F, -1.5F, 3, 1, 3);
      Bell1.setRotationPoint(0F, 4F, 0F);
      Bell1.setTextureSize(64, 64);
      Bell1.mirror = true;
      setRotation(Bell1, 0F, 0F, 0F);
      Bell2 = new ModelRenderer(this, 28, 18);
      Bell2.addBox(-2F, 0F, -2F, 4, 1, 4);
      Bell2.setRotationPoint(0F, 5F, 0F);
      Bell2.setTextureSize(64, 64);
      Bell2.mirror = true;
      setRotation(Bell2, 0F, 0F, 0F);
      Bell3 = new ModelRenderer(this, 26, 23);
      Bell3.addBox(-2.5F, 0F, -2.5F, 5, 2, 5);
      Bell3.setRotationPoint(0F, 6F, 0F);
      Bell3.setTextureSize(64, 64);
      Bell3.mirror = true;
      setRotation(Bell3, 0F, 0F, 0F);
      Bell4 = new ModelRenderer(this, 24, 30);
      Bell4.addBox(-3F, 0F, -3F, 6, 3, 6);
      Bell4.setRotationPoint(0F, 8F, 0F);
      Bell4.setTextureSize(64, 64);
      Bell4.mirror = true;
      setRotation(Bell4, 0F, 0F, 0F);
      BellBack1 = new ModelRenderer(this, 0, 10);
      BellBack1.addBox(-3.5F, 0F, 2.5F, 7, 1, 1);
      BellBack1.setRotationPoint(0F, 11F, 0F);
      BellBack1.setTextureSize(64, 64);
      BellBack1.mirror = true;
      setRotation(BellBack1, 0F, 0F, 0F);
      BellFront1 = new ModelRenderer(this, 0, 10);
      BellFront1.addBox(-3.5F, 0F, -3.5F, 7, 1, 1);
      BellFront1.setRotationPoint(0F, 11F, 0F);
      BellFront1.setTextureSize(64, 64);
      BellFront1.mirror = true;
      setRotation(BellFront1, 0F, 0F, 0F);
      BellRight1 = new ModelRenderer(this, 0, 12);
      BellRight1.addBox(-3.5F, 0F, -2.5F, 1, 1, 5);
      BellRight1.setRotationPoint(0F, 11F, 0F);
      BellRight1.setTextureSize(64, 64);
      BellRight1.mirror = true;
      setRotation(BellRight1, 0F, 0F, 0F);
      BellLeft1 = new ModelRenderer(this, 0, 12);
      BellLeft1.addBox(2.5F, 0F, -2.5F, 1, 1, 5);
      BellLeft1.setRotationPoint(0F, 11F, 0F);
      BellLeft1.setTextureSize(64, 64);
      BellLeft1.mirror = true;
      setRotation(BellLeft1, 0F, 0F, 0F);
      BellBack2 = new ModelRenderer(this, 0, 18);
      BellBack2.addBox(-4F, 0F, 3F, 8, 1, 1);
      BellBack2.setRotationPoint(0F, 12F, 0F);
      BellBack2.setTextureSize(64, 64);
      BellBack2.mirror = true;
      setRotation(BellBack2, 0F, 0F, 0F);
      BellFront2 = new ModelRenderer(this, 0, 18);
      BellFront2.addBox(-4F, 0F, -4F, 8, 1, 1);
      BellFront2.setRotationPoint(0F, 12F, 0F);
      BellFront2.setTextureSize(64, 64);
      BellFront2.mirror = true;
      setRotation(BellFront2, 0F, 0F, 0F);
      BellRight2 = new ModelRenderer(this, 0, 20);
      BellRight2.addBox(-4F, 0F, -3F, 1, 1, 6);
      BellRight2.setRotationPoint(0F, 12F, 0F);
      BellRight2.setTextureSize(64, 64);
      BellRight2.mirror = true;
      setRotation(BellRight2, 0F, 0F, 0F);
      BellLeft2 = new ModelRenderer(this, 0, 20);
      BellLeft2.addBox(3F, 0F, -3F, 1, 1, 6);
      BellLeft2.setRotationPoint(0F, 12F, 0F);
      BellLeft2.setTextureSize(64, 64);
      BellLeft2.mirror = true;
      setRotation(BellLeft2, 0F, 0F, 0F);
      Clapper = new ModelRenderer(this, 32, 12);
      Clapper.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
      Clapper.setRotationPoint(0F, 11F, 0F);
      Clapper.setTextureSize(64, 64);
      Clapper.mirror = true;
      setRotation(Clapper, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    TopSqr.render(f5);
    TopRight.render(f5);
    TopLeft.render(f5);
    TopBack.render(f5);
    TopFront.render(f5);
    Handle.render(f5);
    Bell1.render(f5);
    Bell2.render(f5);
    Bell3.render(f5);
    Bell4.render(f5);
    BellBack1.render(f5);
    BellFront1.render(f5);
    BellRight1.render(f5);
    BellLeft1.render(f5);
    BellBack2.render(f5);
    BellFront2.render(f5);
    BellRight2.render(f5);
    BellLeft2.render(f5);
    Clapper.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

  public void renderModel(float f)
  {
    TopSqr.render(f);
    TopRight.render(f);
    TopLeft.render(f);
    TopBack.render(f);
    TopFront.render(f);
    Handle.render(f);
    Bell1.render(f);
    Bell2.render(f);
    Bell3.render(f);
    Bell4.render(f);
    BellBack1.render(f);
    BellFront1.render(f);
    BellRight1.render(f);
    BellLeft1.render(f);
    BellBack2.render(f);
    BellFront2.render(f);
    BellRight2.render(f);
    BellLeft2.render(f);
    Clapper.render(f);  
  }
}
