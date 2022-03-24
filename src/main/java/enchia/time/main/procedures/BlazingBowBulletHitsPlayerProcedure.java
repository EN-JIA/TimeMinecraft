package enchia.time.main.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

import enchia.time.main.TimeMod;

public class BlazingBowBulletHitsPlayerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure BlazingBowBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setFire((int) 10);
	}
}
