package dabells;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
	public void registerRenderers() {}

	public static String curVers = Infofile.VERS;
	public static String lateVers;
		
	public static int notified = 1;
				
	public void config(FMLPreInitializationEvent event) 
	{
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
        try 
        {
            cfg.load();
        
            Property checkerCount = cfg.get(Configuration.CATEGORY_GENERAL, "versChecker", notified);
            checkerCount.comment = "Notify player of new versions when joining world?\n(Note: Console will still have notifications.)\n1 - YES, Gimme the updates!!\n0 - NAH, Keep your stinking updates to yourself!!";
            
            URL versionIn = new URL("https://raw.githubusercontent.com/SkyNetAB/DaBells/master/vers");
    		BufferedReader in = new BufferedReader(new InputStreamReader(versionIn.openStream()));
    		String newVers = in.readLine();
    		
    		if (!newVers.equals(curVers))
    		{
    			System.out.println("You are running DaBells v" + curVers);
    			System.out.println("DaBells has been updated to v" + newVers);
    			System.out.println("Get the latest version of DaBells from - mods.atomicbase.com");
    			if (checkerCount.getInt() == 1)
    			{
    				notified = 1;
    				lateVers = newVers;
    			}
    			else
    			{
    				notified = 0;
    				checkerCount.set(0);
    				lateVers = newVers;
    			}
    		}
    		else
    		{
    			lateVers = newVers;
    		}
        }
        catch (Exception e) 
        {
        	System.out.println("Unable to load configuration for DaBells");
            lateVers = curVers;
        } 
        finally 
        {
            cfg.save();
        }	
	}
	
	public static boolean Notify(EntityPlayer player, String lateVers)
	{
		if (notified == 1)
		{
			String msg = "DaBells has been updated to v" + lateVers + " :: You are running v" + curVers;
			String msg2 = "Get the latest version of DaBells from - mods.atomicbase.com";
			System.out.println("Trying to notify you via Chat");
			player.addChatMessage(new ChatComponentText(msg));
			player.addChatMessage(new ChatComponentText(msg2));
			return true;
		}
		else
		{
			System.out.println("You are running DaBells v" + curVers);
			System.out.println("DaBells has been updated to v" + lateVers);
			System.out.println("Get the latest version of DaBells from - mods.atomicbase.com");
			return false;
		}
	}
}