
package net.en_jia.minecraft.forge.tpwa.abyss.time.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.en_jia.minecraft.forge.tpwa.abyss.time.item.GoldenCoalItem;

@Mod.EventBusSubscriber
public class GoldencoalrFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == GoldenCoalItem.block)
			event.setBurnTime(19800);
	}
}
