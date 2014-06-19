package dabells;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import dabells.blocks.BlockBellGold;
import dabells.blocks.BlockBellSilver;

@Mod(modid = Infofile.ID, name = Infofile.NAME, version = Infofile.VERS)

public class DaBells
{
	public static final Block BellGold = new BlockBellGold().setBlockName("BellGold");
	public static final Block BellSilver = new BlockBellSilver().setBlockName("BellSilver");
	
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
		
		
		GameRegistry.registerBlock(BellGold, "BellGold");
		GameRegistry.registerBlock(BellSilver, "BellSilver");
				
		ItemStack nuggold46 = new ItemStack(Items.gold_nugget, 46);
		ItemStack ingiron6 = new ItemStack(Items.iron_ingot, 6);
		GameRegistry.addRecipe(new ItemStack(BellGold, 1), new Object[]
				{"TYT", "YXY", "YZY", 'T', Items.stick, 'Y', Items.gold_ingot, 'X', Items.string, 'Z', Items.gold_nugget});
		GameRegistry.addRecipe(new ItemStack(BellSilver, 1), new Object[]
				{"TYT", "YXY", "YYY", 'T', Items.stick, 'Y', Items.iron_ingot, 'X', Items.string});
		
		GameRegistry.addSmelting(BellGold, nuggold46, 0.0F);
		GameRegistry.addSmelting(BellSilver, ingiron6, 0.0F);
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{proxy.registerRenderers();}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent fmlpostinitializationevent) {}
}
