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
import dabells.tileentities.TEBellNetherStar;
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
	@Override
	public void registerRenderers()
	{
		TileEntitySpecialRenderer BellSilverRender = new RenderBell("BellSilver");
		TileEntitySpecialRenderer BellQuartzRender = new RenderBell("BellQuartz");
		TileEntitySpecialRenderer BellRedStoneRender = new RenderBell("BellRedStone");
		TileEntitySpecialRenderer BellLazuriteRender = new RenderBell("BellLazurite");
		TileEntitySpecialRenderer BellGoldRender = new RenderBell("BellGold");
		TileEntitySpecialRenderer BellDiamondRender = new RenderBell("BellDiamond");
		TileEntitySpecialRenderer BellEnderRender = new RenderBell("BellEnder");
		TileEntitySpecialRenderer BellEmeraldRender = new RenderBell("BellEmerald");
		TileEntitySpecialRenderer HardenedBellSilverRender = new RenderBell("HardenedBellSilver");
		TileEntitySpecialRenderer HardenedBellQuartzRender = new RenderBell("HardenedBellQuartz");
		TileEntitySpecialRenderer HardenedBellRedStoneRender = new RenderBell("HardenedBellRedStone");
		TileEntitySpecialRenderer HardenedBellLazuriteRender = new RenderBell("HardenedBellLazurite");
		TileEntitySpecialRenderer HardenedBellGoldRender = new RenderBell("HardenedBellGold");
		TileEntitySpecialRenderer HardenedBellDiamondRender = new RenderBell("HardenedBellDiamond");
		TileEntitySpecialRenderer HardenedBellEnderRender = new RenderBell("HardenedBellEnder");
		TileEntitySpecialRenderer HardenedBellEmeraldRender = new RenderBell("HardenedBellEmerald");
		TileEntitySpecialRenderer PlatedBellSilverRender = new RenderBell("PlatedBellSilver");
		TileEntitySpecialRenderer PlatedBellQuartzRender = new RenderBell("PlatedBellQuartz");
		TileEntitySpecialRenderer PlatedBellRedStoneRender = new RenderBell("PlatedBellRedStone");
		TileEntitySpecialRenderer PlatedBellLazuriteRender = new RenderBell("PlatedBellLazurite");
		TileEntitySpecialRenderer PlatedBellGoldRender = new RenderBell("PlatedBellGold");
		TileEntitySpecialRenderer PlatedBellDiamondRender = new RenderBell("PlatedBellDiamond");
		TileEntitySpecialRenderer PlatedBellEnderRender = new RenderBell("PlatedBellEnder");
		TileEntitySpecialRenderer PlatedBellEmeraldRender = new RenderBell("PlatedBellEmerald");
		TileEntitySpecialRenderer MasterBellSilverRender = new RenderBell("MasterBellSilver");
		TileEntitySpecialRenderer MasterBellQuartzRender = new RenderBell("MasterBellQuartz");
		TileEntitySpecialRenderer MasterBellRedStoneRender = new RenderBell("MasterBellRedStone");
		TileEntitySpecialRenderer MasterBellLazuriteRender = new RenderBell("MasterBellLazurite");
		TileEntitySpecialRenderer MasterBellGoldRender = new RenderBell("MasterBellGold");
		TileEntitySpecialRenderer MasterBellDiamondRender = new RenderBell("MasterBellDiamond");
		TileEntitySpecialRenderer MasterBellEnderRender = new RenderBell("MasterBellEnder");
		TileEntitySpecialRenderer MasterBellEmeraldRender = new RenderBell("MasterBellEmerald");
		TileEntitySpecialRenderer BellNetherStarRender = new RenderBell("BellNetherStar");
		
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
		ClientRegistry.bindTileEntitySpecialRenderer(TEBellNetherStar.class, BellNetherStarRender);

	}
}