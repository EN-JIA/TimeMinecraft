package enchia.time.main.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Block;

import java.util.Map;

import enchia.time.main.TimeMod;

public class CrystalPickaxeBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure CrystalPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure CrystalPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure CrystalPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure CrystalPickaxeBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (World) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (World) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (World) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), (World) world, new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
		}
		if (world instanceof World) {
			Block.spawnDrops(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (World) world,
					new BlockPos((int) x, (int) y, (int) z));
			world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
		}
	}
}
