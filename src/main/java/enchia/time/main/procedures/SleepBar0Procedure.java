package enchia.time.main.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class SleepBar0Procedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure SleepBar0!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TimeModVariables.PlayerVariables())).Sleep == 0) {
			return true;
		}
		return false;
	}
}
