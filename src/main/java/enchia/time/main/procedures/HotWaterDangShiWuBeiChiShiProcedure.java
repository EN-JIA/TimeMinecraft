package enchia.time.main.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class HotWaterDangShiWuBeiChiShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure HotWaterDangShiWuBeiChiShi!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TimeModVariables.PlayerVariables())).Water <= 6) {
			{
				double _setval = ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TimeModVariables.PlayerVariables())).Water + 4);
				entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Water = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
