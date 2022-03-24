package enchia.time.main.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

import enchia.time.main.block.Mcy400grassBlock;
import enchia.time.main.TimeMod;

public class Mcy400dirtUpdateTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure Mcy400dirtUpdateTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure Mcy400dirtUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure Mcy400dirtUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure Mcy400dirtUpdateTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Mcy400grassBlock.block.getDefaultState(), 3);
		}
	}
}
