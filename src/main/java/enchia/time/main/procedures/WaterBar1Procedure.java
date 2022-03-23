package enchia.time.main.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import java.util.Map;

import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class WaterBar1Procedure {

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure WaterBar1!");
			return false;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure WaterBar1!");
			return false;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (TimeModVariables.MapVariables.get(world).gui == 0) {
			if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new TimeModVariables.PlayerVariables())).Water == 1) {
				return true;
			}
		}
		return false;
	}
}
