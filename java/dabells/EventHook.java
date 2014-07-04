package dabells;

import net.minecraft.potion.Potion;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class EventHook
{
	public void onEntityUpdate(LivingUpdateEvent event) 
	{
	     if (event.entityLiving.getActivePotionEffect(Potion.invisibility).getDuration()<=0)
	     {
             event.entityLiving.removePotionEffect(Potion.invisibility.id);
	     }
	     if (event.entityLiving.getActivePotionEffect(Potion.nightVision).getDuration()<=0)
	     {
             event.entityLiving.removePotionEffect(Potion.nightVision.id);
	     }
	     if (event.entityLiving.getActivePotionEffect(Potion.regeneration).getDuration()<=0)
	     {
             event.entityLiving.removePotionEffect(Potion.regeneration.id);
	     }
	     if (event.entityLiving.getActivePotionEffect(Potion.moveSpeed).getDuration()<=0)
	     {
             event.entityLiving.removePotionEffect(Potion.moveSpeed.id);
	     }
	     if (event.entityLiving.getActivePotionEffect(Potion.damageBoost).getDuration()<=0)
	     {
             event.entityLiving.removePotionEffect(Potion.damageBoost.id);
	     }
	     if (event.entityLiving.getActivePotionEffect(Potion.fireResistance).getDuration()<=0)
	     {
        	 event.entityLiving.removePotionEffect(Potion.fireResistance.id);
	     }
	     if (event.entityLiving.getActivePotionEffect(Potion.jump).getDuration()<=0)
	     {
             event.entityLiving.removePotionEffect(Potion.jump.id);
	     }
	     if (event.entityLiving.getActivePotionEffect(Potion.waterBreathing).getDuration()<=0)
	     {
	    	 event.entityLiving.removePotionEffect(Potion.waterBreathing.id);
	     }
	}
}