
package enchia.time.main.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import enchia.time.main.item.FrozenCoalfuelItem;

@Mod.EventBusSubscriber
public class FrozenCoalFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == FrozenCoalfuelItem.block)
			event.setBurnTime(1600);
	}
}
