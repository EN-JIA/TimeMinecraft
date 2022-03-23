package enchia.time.main.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

import enchia.time.main.item.MineralizationScrollItem;
import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class MineralizationScrollRightClickedOnBlockProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure MineralizationScrollRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure MineralizationScrollRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure MineralizationScrollRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure MineralizationScrollRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure MineralizationScrollRightClickedOnBlock!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TimeModVariables.PlayerVariables())).Magic >= 3) {
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(MineralizationScrollItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.STONE) {
				if (Math.random() < 0.3) {
					world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.COAL_ORE.getDefaultState(), 3);
				} else {
					if (Math.random() < 0.3) {
						world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.IRON_ORE.getDefaultState(), 3);
					} else {
						if (Math.random() < 0.3) {
							world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.REDSTONE_ORE.getDefaultState(), 3);
						} else {
							if (Math.random() < 0.3) {
								world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.GOLD_ORE.getDefaultState(), 3);
							} else {
								if (Math.random() < 0.3) {
									world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.LAPIS_ORE.getDefaultState(), 3);
								} else {
									if (Math.random() < 0.3) {
										world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIAMOND_ORE.getDefaultState(), 3);
									} else {
										world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.LAPIS_ORE.getDefaultState(), 3);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
