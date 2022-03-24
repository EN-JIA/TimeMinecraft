package enchia.time.main.procedures;

import net.minecraft.world.IWorld;

import java.util.Map;

import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class OverlayCloseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure OverlayClose!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (TimeModVariables.MapVariables.get(world).gui == 0) {
			TimeModVariables.MapVariables.get(world).gui = 1;
			TimeModVariables.MapVariables.get(world).syncData(world);
		}
		if (TimeModVariables.MapVariables.get(world).gui == 1) {
			TimeModVariables.MapVariables.get(world).gui = 0;
			TimeModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
