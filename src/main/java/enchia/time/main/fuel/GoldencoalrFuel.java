
package enchia.time.main.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import enchia.time.main.item.GoldenCoalItem;

@Mod.EventBusSubscriber
public class GoldencoalrFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == GoldenCoalItem.block)
			event.setBurnTime(19800);
	}
}
