package dabells;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;


public class UpdateCheck
{
	int notifiedCount = 0;
	public String curVers = Infofile.VERS;
	public String lateVers;
	boolean isNotified = true;
	
	@SubscribeEvent
	public void onLogIn(PlayerEvent.PlayerLoggedInEvent event)
	{
		if (event.player != null)
		{
			EntityPlayer player = event.player;
			versCheck(player);
		}
		else
		{
			System.out.println("Something is wrong::Player is NULL");
		}
	}
	
	public void versCheck(EntityPlayer player)
	{
		try	
		{
			lateVers = getLatestVers();
		}
		catch (Exception e) {e.printStackTrace();}
		if (!curVers.equals(lateVers))
		{
			System.out.println("DaBells has been updated to v" + lateVers);
			System.out.println("You are running DaBells v" + curVers);
			Notify(player, lateVers);
		}
		else 
		{
			System.out.println("DaBells is up-to-date!! v" + lateVers);
		}
	}
	
	public String getLatestVers() throws Exception
	{
		URL versionIn = new URL("https://raw.githubusercontent.com/SkyNetAB/DaBells/master/vers");
		BufferedReader in = new BufferedReader(new InputStreamReader(versionIn.openStream()));
		String inputLine = in.readLine();
		return inputLine;
	}
	
	public boolean Notify(EntityPlayer player, String lateVers)
	{
		String msg = "DaBells has been updated to v" + lateVers + " :: You are running v" + curVers;
		if (notifiedCount == 0)
		{
			System.out.println("Trying to notify you via Chat");
			player.addChatMessage(new ChatComponentText(msg));
			notifiedCount++;
			return isNotified;
		}
		else if (notifiedCount > 0)
		{
			System.out.println("You've already been notified before");
			return isNotified;
		}
		return isNotified;
	}
}