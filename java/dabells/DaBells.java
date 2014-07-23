package dabells;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dabells.blocks.BlockBell;
import dabells.blocks.BlockBellNetherStar;
import dabells.blocks.BlockHardenedBell;
import dabells.blocks.BlockMasterBell;
import dabells.blocks.BlockPlatedBell;
import dabells.items.ItemPasteLuminous;
import dabells.items.ItemPlating;

@Mod(modid = Infofile.ID, name = Infofile.NAME, version = Infofile.VERS)

public class DaBells
{
	public static CreativeTabs DaBellsTab = new CreativeTabs("DaBells")
	{
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(BellSilver);
		}
	};
		
//Blocks
	//Tier 0 (Decorative) Bell Blocks
		public static final Block BellSilver = new BlockBell("BellSilver");
		public static final Block BellQuartz = new BlockBell("BellQuartz");
		public static final Block BellRedStone = new BlockBell("BellRedStone");
		public static final Block BellLazurite = new BlockBell("BellLazurite");
		public static final Block BellGold = new BlockBell("BellGold");
		public static final Block BellDiamond = new BlockBell("BellDiamond");
		public static final Block BellEnder = new BlockBell("BellEnder");
		public static final Block BellEmerald = new BlockBell("BellEmerald");
	//Tier I (Light Potion) Bell Blocks
		public static final Block HardenedBellSilver = new BlockHardenedBell("HardenedBellSilver");
		public static final Block HardenedBellQuartz = new BlockHardenedBell("HardenedBellQuartz");
		public static final Block HardenedBellRedStone = new BlockHardenedBell("HardenedBellRedStone");
		public static final Block HardenedBellLazurite = new BlockHardenedBell("HardenedBellLazurite");
		public static final Block HardenedBellGold = new BlockHardenedBell("HardenedBellGold");
		public static final Block HardenedBellDiamond = new BlockHardenedBell("HardenedBellDiamond");
		public static final Block HardenedBellEnder = new BlockHardenedBell("HardenedBellEnder");
		public static final Block HardenedBellEmerald = new BlockHardenedBell("HardenedBellEmerald");
	//Tier II (Heavy Potion) Bell Blocks
		public static final Block PlatedBellSilver = new BlockPlatedBell("PlatedBellSilver");
		public static final Block PlatedBellQuartz = new BlockPlatedBell("PlatedBellQuartz");
		public static final Block PlatedBellRedStone = new BlockPlatedBell("PlatedBellRedStone");
		public static final Block PlatedBellLazurite = new BlockPlatedBell("PlatedBellLazurite");
		public static final Block PlatedBellGold = new BlockPlatedBell("PlatedBellGold");
		public static final Block PlatedBellDiamond = new BlockPlatedBell("PlatedBellDiamond");
		public static final Block PlatedBellEnder = new BlockPlatedBell("PlatedBellEnder");
		public static final Block PlatedBellEmerald = new BlockPlatedBell("PlatedBellEmerald");
	//Tier III (Master) Bell Blocks
		public static final Block MasterBellSilver = new BlockMasterBell("MasterBellSilver");
		public static final Block MasterBellQuartz = new BlockMasterBell("MasterBellQuartz");
		public static final Block MasterBellRedStone = new BlockMasterBell("MasterBellRedStone");
		public static final Block MasterBellLazurite = new BlockMasterBell("MasterBellLazurite");
		public static final Block MasterBellGold = new BlockMasterBell("MasterBellGold");
		public static final Block MasterBellDiamond = new BlockMasterBell("MasterBellDiamond");
		public static final Block MasterBellEnder = new BlockMasterBell("MasterBellEnder");
		public static final Block MasterBellEmerald = new BlockMasterBell("MasterBellEmerald");
	//Tier IV (Ultimate) Bell Blocks
		public static final Block BellNetherStar = new BlockBellNetherStar("BellNetherStar");
	//Other

//Items
	//Bell Plating
		public static final Item PlatingIron = new ItemPlating("PlatingIron");
		public static final Item PlatingQuartz = new ItemPlating("PlatingQuartz");
		public static final Item PlatingRedStone = new ItemPlating("PlatingRedStone");
		public static final Item PlatingLazurite = new ItemPlating("PlatingLazurite");
		public static final Item PlatingGold = new ItemPlating("PlatingGold");
		public static final Item PlatingDiamond = new ItemPlating("PlatingDiamond");
		public static final Item PlatingEnder = new ItemPlating("PlatingEnder");
		public static final Item PlatingEmerald = new ItemPlating("PlatingEmerald");
	//Dust & More
		public static final Item PasteLuminous = new ItemPasteLuminous("PasteLuminous");


	@Instance(Infofile.NAME)
	public static DaBells instance;
	
	@SidedProxy(clientSide=Infofile.CLIENTPROXY + "ClientProxy", serverSide=Infofile.COMMONPROXY + "CommonProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.registerRenderers();
		
		ModMetadata mod = event.getModMetadata(); 
		mod.autogenerated = false;
		mod.authorList.add(Infofile.AUTH);
		mod.credits = Infofile.CRED;
		mod.description = Infofile.DESCRIP;
		mod.logoFile = Infofile.LOGO;
		mod.modId = Infofile.ID;
		mod.name = Infofile.NAME;
		mod.parent = Infofile.PARENT;
		mod.screenshots = Infofile.SCREEN;
		mod.updateUrl = Infofile.UDURL;
		mod.url = Infofile.URL;
		mod.version = Infofile.VERS;
		
//Tier 0 Bell Blocks
     	GameRegistry.registerBlock(BellSilver, "BellSilver");
      	GameRegistry.registerBlock(BellQuartz, "BellQuartz");
      	GameRegistry.registerBlock(BellRedStone, "BellRedStone");
      	GameRegistry.registerBlock(BellLazurite, "BellLazurite");
      	GameRegistry.registerBlock(BellGold, "BellGold");
      	GameRegistry.registerBlock(BellDiamond, "BellDiamond");
      	GameRegistry.registerBlock(BellEnder, "BellEnder");
      	GameRegistry.registerBlock(BellEmerald, "BellEmerald");
//Tier I (Light Potion) Bell Blocks
     	GameRegistry.registerBlock(HardenedBellSilver, "HardenedBellSilver");
      	GameRegistry.registerBlock(HardenedBellQuartz, "HardenedBellQuartz");
      	GameRegistry.registerBlock(HardenedBellRedStone, "HardenedBellRedStone");
      	GameRegistry.registerBlock(HardenedBellLazurite, "HardenedBellLazurite");
      	GameRegistry.registerBlock(HardenedBellGold, "HardenedBellGold");
      	GameRegistry.registerBlock(HardenedBellDiamond, "HardenedBellDiamond");
      	GameRegistry.registerBlock(HardenedBellEnder, "HardenedBellEnder");
      	GameRegistry.registerBlock(HardenedBellEmerald, "HardenedBellEmerald");
//Tier II (Heavy Potion) Bell Blocks
     	GameRegistry.registerBlock(PlatedBellSilver, "PlatedBellSilver");
      	GameRegistry.registerBlock(PlatedBellQuartz, "PlatedBellQuartz");
      	GameRegistry.registerBlock(PlatedBellRedStone, "PlatedBellRedStone");
      	GameRegistry.registerBlock(PlatedBellLazurite, "PlatedBellLazurite");
      	GameRegistry.registerBlock(PlatedBellGold, "PlatedBellGold");
      	GameRegistry.registerBlock(PlatedBellDiamond, "PlatedBellDiamond");
      	GameRegistry.registerBlock(PlatedBellEnder, "PlatedBellEnder");
      	GameRegistry.registerBlock(PlatedBellEmerald, "PlatedBellEmerald");
//Tier III (Master) Bell Blocks
      	GameRegistry.registerBlock(MasterBellSilver, "MasterBellSilver");
      	GameRegistry.registerBlock(MasterBellQuartz, "MasterBellQuartz");
      	GameRegistry.registerBlock(MasterBellRedStone, "MasterBellRedStone");
      	GameRegistry.registerBlock(MasterBellLazurite, "MasterBellLazurite");
      	GameRegistry.registerBlock(MasterBellGold, "MasterBellGold");
      	GameRegistry.registerBlock(MasterBellDiamond, "MasterBellDiamond");
      	GameRegistry.registerBlock(MasterBellEnder, "MasterBellEnder");
      	GameRegistry.registerBlock(MasterBellEmerald, "MasterBellEmerald");
//Tier IV (Ultimate) Bell Blocks
     	GameRegistry.registerBlock(BellNetherStar, "BellNetherStar");
//Blocks
      	
//Items
      	GameRegistry.registerItem(PlatingIron, "PlatingIron");
      	GameRegistry.registerItem(PlatingQuartz, "PlatingQuartz");
      	GameRegistry.registerItem(PlatingRedStone, "PlatingRedStone");
      	GameRegistry.registerItem(PlatingLazurite, "PlatingLazurite");
      	GameRegistry.registerItem(PlatingGold, "PlatingGold");
      	GameRegistry.registerItem(PlatingDiamond, "PlatingDiamond");
      	GameRegistry.registerItem(PlatingEnder, "PlatingEnder");
      	GameRegistry.registerItem(PlatingEmerald, "PlatingEmerald");
      	GameRegistry.registerItem(PasteLuminous, "PasteLuminous");


//Bell Recipes
	//Blocks
      	//ItemStacks
      	ItemStack Lapis = new ItemStack(Items.dye, 1, 4);
     	ItemStack Fish = new ItemStack(Items.fish, 1, 3);
     //Tier 0 (Decorative) Bell Blocks
     	GameRegistry.addRecipe(new ItemStack(BellSilver, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.iron_ingot, 'X', Items.string});
		GameRegistry.addRecipe(new ItemStack(BellQuartz, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.quartz, 'X', Items.string});
		GameRegistry.addRecipe(new ItemStack(BellRedStone, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.redstone, 'X', Items.string});
		GameRegistry.addRecipe(new ItemStack(BellLazurite, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Lapis, 'X', Items.string});
		GameRegistry.addRecipe(new ItemStack(BellGold, 1), new Object[]
				{"TYT", "YXY", "YZY", 'T', Items.stick, 'Y', Items.gold_ingot, 'X', Items.string, 'Z', Items.gold_nugget});
		GameRegistry.addRecipe(new ItemStack(BellDiamond, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.diamond, 'X', Items.string});
		GameRegistry.addRecipe(new ItemStack(BellEnder, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.ender_pearl, 'X', Items.string});
		GameRegistry.addRecipe(new ItemStack(BellEmerald, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.emerald, 'X', Items.string});
	//Tier I (Light Potion) Bell Blocks
		GameRegistry.addRecipe(new ItemStack(HardenedBellSilver, 1), new Object[]
				{"TZT", "YXY", "YYY", 'T', Blocks.planks, 'Y', Blocks.iron_block , 'X', BellSilver, 'Z', Items.feather});
		GameRegistry.addRecipe(new ItemStack(HardenedBellQuartz, 1), new Object[]
				{"TZT", "YXY", "YYY", 'T', Blocks.planks, 'Y', Blocks.quartz_block, 'X', BellQuartz, 'Z', Items.golden_carrot});
		GameRegistry.addRecipe(new ItemStack(HardenedBellRedStone, 1), new Object[]
				{"TZT", "YXY", "YYY", 'T', Blocks.planks, 'Y', Blocks.redstone_block, 'X', BellRedStone, 'Z', Items.sugar});
		GameRegistry.addRecipe(new ItemStack(HardenedBellLazurite, 1), new Object[]
				{"TZT", "YXY", "YYY", 'T', Blocks.planks, 'Y', Blocks.lapis_block, 'X', BellLazurite, 'Z', Fish});
		GameRegistry.addRecipe(new ItemStack(HardenedBellGold, 1), new Object[]
				{"TZT", "YXY", "YYY", 'T', Blocks.planks, 'Y', Blocks.gold_block, 'X', BellGold, 'Z', Items.blaze_powder});
		GameRegistry.addRecipe(new ItemStack(HardenedBellDiamond, 1), new Object[]
				{"ZTU", "YXY", "YYY", 'T', Blocks.planks, 'Y', Blocks.diamond_block, 'X', BellDiamond, 'Z', Items.golden_carrot, 'U', Items.fermented_spider_eye});
		GameRegistry.addRecipe(new ItemStack(HardenedBellEnder, 1), new Object[]
				{"TZT", "YXY", "YYY", 'T', Blocks.planks, 'Y', Items.ender_eye, 'X', BellEnder, 'Z', Items.magma_cream});
		GameRegistry.addRecipe(new ItemStack(HardenedBellEmerald, 1), new Object[]
				{"TZT", "YXY", "YYY", 'T', Blocks.planks, 'Y', Blocks.emerald_block, 'X', BellEmerald, 'Z', Items.ghast_tear});
	//Tier II (Heavy Potion) Bell Blocks
		GameRegistry.addRecipe(new ItemStack(PlatedBellSilver, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingIron, 'X', HardenedBellSilver, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(PlatedBellQuartz, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingQuartz, 'X', HardenedBellQuartz, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(PlatedBellRedStone, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingRedStone, 'X', HardenedBellRedStone, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(PlatedBellLazurite, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingLazurite, 'X', HardenedBellLazurite, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(PlatedBellGold, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingGold, 'X', HardenedBellGold, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(PlatedBellDiamond, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingDiamond, 'X', HardenedBellDiamond, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(PlatedBellEnder, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingEnder, 'X', HardenedBellEnder, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(PlatedBellEmerald, 1), new Object[]
				{"TZT", "YXY", "ZYZ", 'T', Blocks.planks, 'Y', PlatingEmerald, 'X', HardenedBellEmerald, 'Z', PasteLuminous});
	//Tier III (Master) Bell Blocks
		GameRegistry.addRecipe(new ItemStack(MasterBellSilver, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingIron, 'X', PlatedBellSilver, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(MasterBellQuartz, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingQuartz, 'X', PlatedBellQuartz, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(MasterBellRedStone, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingRedStone, 'X', PlatedBellRedStone, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(MasterBellLazurite, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingLazurite, 'X', PlatedBellLazurite, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(MasterBellGold, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingGold, 'X', PlatedBellGold, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(MasterBellDiamond, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingDiamond, 'X', PlatedBellDiamond, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(MasterBellEnder, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingEnder, 'X', PlatedBellEnder, 'Z', PasteLuminous});
		GameRegistry.addRecipe(new ItemStack(MasterBellEmerald, 1), new Object[]
				{"TYT", "ZXZ", "YZY", 'T', Blocks.planks, 'Y', PlatingEmerald, 'X', PlatedBellEmerald, 'Z', PasteLuminous});
	//Tier IV (Ultimate) Bell Blocks
		GameRegistry.addRecipe(new ItemStack(BellNetherStar, 1), new Object[]
				{"ABC", "DXE", "FGH",
			'A', MasterBellSilver, 'B', MasterBellQuartz, 'C', MasterBellRedStone,
			'D', MasterBellLazurite, 'E', MasterBellGold, 'F', MasterBellDiamond,
			'G', MasterBellEnder, 'H', MasterBellEmerald, 'X', Items.nether_star});

	//Item
		GameRegistry.addShapelessRecipe(new ItemStack(PasteLuminous, 3), new Object[]
				{Items.redstone, Items.glowstone_dust, Items.slime_ball});
		
//Smelting (only for Tier 0 Bells)		
		//ItemStacks for Bell Breakdown		
		ItemStack ingiron6 = new ItemStack(Items.iron_ingot, 6);
		ItemStack quartz6 = new ItemStack(Items.quartz, 6);
		ItemStack redstone6 = new ItemStack(Items.redstone, 6);
		ItemStack lapis6 = new ItemStack(Items.dye, 6, 4);
		ItemStack nuggold46 = new ItemStack(Items.gold_nugget, 46);
		ItemStack diamond6 = new ItemStack(Items.diamond, 6);
		ItemStack enderpearl6 = new ItemStack(Items.ender_pearl, 6);
		ItemStack emerald6 = new ItemStack(Items.emerald, 6);
		//Bell Smelting		
		GameRegistry.addSmelting(BellSilver, ingiron6, 0.0F);
		GameRegistry.addSmelting(BellQuartz, quartz6, 0.0F);
		GameRegistry.addSmelting(BellRedStone, redstone6, 0.0F);
		GameRegistry.addSmelting(BellLazurite, lapis6, 0.0F);
		GameRegistry.addSmelting(BellGold, nuggold46, 0.0F);
		GameRegistry.addSmelting(BellDiamond, diamond6, 0.0F);
		GameRegistry.addSmelting(BellEnder, enderpearl6, 0.0F);
		GameRegistry.addSmelting(BellEmerald, emerald6, 0.0F);
		
		//ItemStacks for Plating
		ItemStack plateiron = new ItemStack(PlatingIron, 1);
		ItemStack platequartz = new ItemStack(PlatingQuartz, 1);
		ItemStack plateredstone = new ItemStack(PlatingRedStone, 1);
		ItemStack platelazurite = new ItemStack(PlatingLazurite, 1);
		ItemStack plategold = new ItemStack(PlatingGold, 1);
		ItemStack platediamond = new ItemStack(PlatingDiamond, 1);
		ItemStack plateender = new ItemStack(PlatingEnder, 1);
		ItemStack plateemerald = new ItemStack(PlatingEmerald, 1);
		//Plate Smelting		
		GameRegistry.addSmelting(Blocks.iron_block, plateiron, 0.0F);
		GameRegistry.addSmelting(Blocks.quartz_block, platequartz, 0.0F);
		GameRegistry.addSmelting(Blocks.redstone_block, plateredstone, 0.0F);
		GameRegistry.addSmelting(Blocks.lapis_block, platelazurite, 0.0F);
		GameRegistry.addSmelting(Blocks.gold_block, plategold, 0.0F);
		GameRegistry.addSmelting(Blocks.diamond_block, platediamond, 0.0F);
		GameRegistry.addSmelting(Items.ender_eye, plateender, 0.0F);
		GameRegistry.addSmelting(Blocks.emerald_block, plateemerald, 0.0F);
		
		MinecraftForge.EVENT_BUS.register(new EventHook());
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{proxy.registerRenderers();}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		FMLCommonHandler.instance().bus().register(new UpdateCheck());
	}
}
