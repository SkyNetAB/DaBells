package dabells.client;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import cpw.mods.fml.client.registry.ClientRegistry;
import dabells.CommonProxy;
import dabells.blocks.RenderBell;
import dabells.tileentities.TEBellDiamond;
import dabells.tileentities.TEBellEmerald;
import dabells.tileentities.TEBellEnder;
import dabells.tileentities.TEBellGold;
import dabells.tileentities.TEBellLazurite;
import dabells.tileentities.TEBellNetherStar0;
import dabells.tileentities.TEBellNetherStar1;
import dabells.tileentities.TEBellNetherStar2;
import dabells.tileentities.TEBellNetherStar3;
import dabells.tileentities.TEBellNetherStar4;
import dabells.tileentities.TEBellNetherStar5;
import dabells.tileentities.TEBellNetherStar6;
import dabells.tileentities.TEBellNetherStar7;
//import dabells.tileentities.TEBellNetherStar;
import dabells.tileentities.TEBellQuartz;
import dabells.tileentities.TEBellRedStone;
import dabells.tileentities.TEBellSilver;
import dabells.tileentities.TEHBellDiamond;
import dabells.tileentities.TEHBellEmerald;
import dabells.tileentities.TEHBellEnder;
import dabells.tileentities.TEHBellGold;
import dabells.tileentities.TEHBellLazurite;
import dabells.tileentities.TEHBellQuartz;
import dabells.tileentities.TEHBellRedStone;
import dabells.tileentities.TEHBellSilver;
import dabells.tileentities.TEMBellDiamond;
import dabells.tileentities.TEMBellEmerald;
import dabells.tileentities.TEMBellEnder;
import dabells.tileentities.TEMBellGold;
import dabells.tileentities.TEMBellLazurite;
import dabells.tileentities.TEMBellQuartz;
import dabells.tileentities.TEMBellRedStone;
import dabells.tileentities.TEMBellSilver;
import dabells.tileentities.TEPBellDiamond;
import dabells.tileentities.TEPBellEmerald;
import dabells.tileentities.TEPBellEnder;
import dabells.tileentities.TEPBellGold;
import dabells.tileentities.TEPBellLazurite;
import dabells.tileentities.TEPBellQuartz;
import dabells.tileentities.TEPBellRedStone;
import dabells.tileentities.TEPBellSilver;

public class ClientProxy extends CommonProxy
{
	final static String[] subBlocks = new String[]{"0","1","2","3","4","5","6","7"};
	
	@Override
	public void registerRenderers()
	{
		TileEntitySpecialRenderer BellSilverRender = new RenderBell("BellSilver", null);
		TileEntitySpecialRenderer BellQuartzRender = new RenderBell("BellQuartz", null);
		TileEntitySpecialRenderer BellRedStoneRender = new RenderBell("BellRedStone", null);
		TileEntitySpecialRenderer BellLazuriteRender = new RenderBell("BellLazurite", null);
		TileEntitySpecialRenderer BellGoldRender = new RenderBell("BellGold", null);
		TileEntitySpecialRenderer BellDiamondRender = new RenderBell("BellDiamond", null);
		TileEntitySpecialRenderer BellEnderRender = new RenderBell("BellEnder", null);
		TileEntitySpecialRenderer BellEmeraldRender = new RenderBell("BellEmerald", null);
		TileEntitySpecialRenderer HardenedBellSilverRender = new RenderBell("HardenedBellSilver", null);
		TileEntitySpecialRenderer HardenedBellQuartzRender = new RenderBell("HardenedBellQuartz", null);
		TileEntitySpecialRenderer HardenedBellRedStoneRender = new RenderBell("HardenedBellRedStone", null);
		TileEntitySpecialRenderer HardenedBellLazuriteRender = new RenderBell("HardenedBellLazurite", null);
		TileEntitySpecialRenderer HardenedBellGoldRender = new RenderBell("HardenedBellGold", null);
		TileEntitySpecialRenderer HardenedBellDiamondRender = new RenderBell("HardenedBellDiamond", null);
		TileEntitySpecialRenderer HardenedBellEnderRender = new RenderBell("HardenedBellEnder", null);
		TileEntitySpecialRenderer HardenedBellEmeraldRender = new RenderBell("HardenedBellEmerald", null);
		TileEntitySpecialRenderer PlatedBellSilverRender = new RenderBell("PlatedBellSilver", null);
		TileEntitySpecialRenderer PlatedBellQuartzRender = new RenderBell("PlatedBellQuartz", null);
		TileEntitySpecialRenderer PlatedBellRedStoneRender = new RenderBell("PlatedBellRedStone", null);
		TileEntitySpecialRenderer PlatedBellLazuriteRender = new RenderBell("PlatedBellLazurite", null);
		TileEntitySpecialRenderer PlatedBellGoldRender = new RenderBell("PlatedBellGold", null);
		TileEntitySpecialRenderer PlatedBellDiamondRender = new RenderBell("PlatedBellDiamond", null);
		TileEntitySpecialRenderer PlatedBellEnderRender = new RenderBell("PlatedBellEnder", null);
		TileEntitySpecialRenderer PlatedBellEmeraldRender = new RenderBell("PlatedBellEmerald", null);
		TileEntitySpecialRenderer MasterBellSilverRender = new RenderBell("MasterBellSilver", null);
		TileEntitySpecialRenderer MasterBellQuartzRender = new RenderBell("MasterBellQuartz", null);
		TileEntitySpecialRenderer MasterBellRedStoneRender = new RenderBell("MasterBellRedStone", null);
		TileEntitySpecialRenderer MasterBellLazuriteRender = new RenderBell("MasterBellLazurite", null);
		TileEntitySpecialRenderer MasterBellGoldRender = new RenderBell("MasterBellGold", null);
		TileEntitySpecialRenderer MasterBellDiamondRender = new RenderBell("MasterBellDiamond", null);
		TileEntitySpecialRenderer MasterBellEnderRender = new RenderBell("MasterBellEnder", null);
		TileEntitySpecialRenderer MasterBellEmeraldRender = new RenderBell("MasterBellEmerald", null);
		
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellSilver.class, BellSilverRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellQuartz.class, BellQuartzRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellRedStone.class, BellRedStoneRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellLazurite.class, BellLazuriteRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellGold.class, BellGoldRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellDiamond.class, BellDiamondRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellEnder.class, BellEnderRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellEmerald.class, BellEmeraldRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellSilver.class, HardenedBellSilverRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellQuartz.class, HardenedBellQuartzRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellRedStone.class, HardenedBellRedStoneRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellLazurite.class, HardenedBellLazuriteRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellGold.class, HardenedBellGoldRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellDiamond.class, HardenedBellDiamondRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellEnder.class, HardenedBellEnderRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEHBellEmerald.class, HardenedBellEmeraldRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellSilver.class, PlatedBellSilverRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellQuartz.class, PlatedBellQuartzRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellRedStone.class, PlatedBellRedStoneRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellLazurite.class, PlatedBellLazuriteRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellGold.class, PlatedBellGoldRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellDiamond.class, PlatedBellDiamondRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellEnder.class, PlatedBellEnderRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEPBellEmerald.class, PlatedBellEmeraldRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellSilver.class, MasterBellSilverRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellQuartz.class, MasterBellQuartzRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellRedStone.class, MasterBellRedStoneRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellLazurite.class, MasterBellLazuriteRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellGold.class, MasterBellGoldRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellDiamond.class, MasterBellDiamondRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellEnder.class, MasterBellEnderRender);
		ClientRegistry.bindTileEntitySpecialRenderer(TEMBellEmerald.class, MasterBellEmeraldRender);
		
		TileEntitySpecialRenderer BellNetherStarRender0 = new RenderBell("BellNetherStar0", "0");
		TileEntitySpecialRenderer BellNetherStarRender1 = new RenderBell("BellNetherStar1", "1");
		TileEntitySpecialRenderer BellNetherStarRender2 = new RenderBell("BellNetherStar2", "2");
		TileEntitySpecialRenderer BellNetherStarRender3 = new RenderBell("BellNetherStar3", "3");
		TileEntitySpecialRenderer BellNetherStarRender4 = new RenderBell("BellNetherStar4", "4");
		TileEntitySpecialRenderer BellNetherStarRender5 = new RenderBell("BellNetherStar5", "5");
		TileEntitySpecialRenderer BellNetherStarRender6 = new RenderBell("BellNetherStar6", "6");
		TileEntitySpecialRenderer BellNetherStarRender7 = new RenderBell("BellNetherStar7", "7");

		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar0.class, BellNetherStarRender0);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar1.class, BellNetherStarRender1);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar2.class, BellNetherStarRender2);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar3.class, BellNetherStarRender3);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar4.class, BellNetherStarRender4);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar5.class, BellNetherStarRender5);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar6.class, BellNetherStarRender6);
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar7.class, BellNetherStarRender7);

	}
}