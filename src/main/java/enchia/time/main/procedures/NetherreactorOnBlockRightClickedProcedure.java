package enchia.time.main.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Map;
import java.util.Iterator;

import enchia.time.main.block.Netherreactor2Block;
import enchia.time.main.block.GlowingobsidianBlock;
import enchia.time.main.TimeMod;

public class NetherreactorOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure NetherreactorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure NetherreactorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure NetherreactorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure NetherreactorOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure NetherreactorOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.COBBLESTONE) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.COBBLESTONE) {
				if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)))).getBlock() == Blocks.COBBLESTONE) {
					if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.COBBLESTONE) {
						if ((world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.COBBLESTONE) {
							if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 0)))).getBlock() == Blocks.COBBLESTONE) {
								if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
										.getBlock() == Blocks.GOLD_BLOCK) {
									if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1))))
											.getBlock() == Blocks.GOLD_BLOCK) {
										if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1))))
												.getBlock() == Blocks.GOLD_BLOCK) {
											if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
													.getBlock() == Blocks.GOLD_BLOCK) {
												if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1))))
														.getBlock() == Blocks.GOLD_BLOCK) {
													if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z - 1))))
															.getBlock() == Blocks.COBBLESTONE) {
														if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z - 1))))
																.getBlock() == Blocks.COBBLESTONE) {
															if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) (z + 1))))
																	.getBlock() == Blocks.COBBLESTONE) {
																if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 0), (int) (z + 1))))
																		.getBlock() == Blocks.COBBLESTONE) {
																	if ((world
																			.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) (z + 0))))
																					.getBlock() == Blocks.COBBLESTONE) {
																		if ((world.getBlockState(
																				new BlockPos((int) (x - 1), (int) (y + 1), (int) (z + 0))))
																						.getBlock() == Blocks.COBBLESTONE) {
																			if ((world.getBlockState(
																					new BlockPos((int) (x - 0), (int) (y + 1), (int) (z + 1))))
																							.getBlock() == Blocks.COBBLESTONE) {
																				if ((world.getBlockState(
																						new BlockPos((int) (x - 0), (int) (y + 1), (int) (z - 1))))
																								.getBlock() == Blocks.COBBLESTONE) {
																					world.setBlockState(
																							new BlockPos((int) (x - 0), (int) (y - 1), (int) (z + 0)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 0)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 0)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x + 0), (int) (y - 1), (int) (z + 1)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x + 0), (int) (y - 1), (int) (z - 1)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x - 1), (int) (y - 1), (int) (z + 1)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z + 1)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(
																							new BlockPos((int) (x + 1), (int) (y - 1), (int) (z - 1)),
																							GlowingobsidianBlock.block.getDefaultState(), 3);
																					world.setBlockState(new BlockPos((int) x, (int) y, (int) z),
																							Netherreactor2Block.block.getDefaultState(), 3);
																					if (world instanceof World && !((World) world).isRemote) {
																						((World) world).createExplosion(null, (int) x, (int) y,
																								(int) z, (float) 6, Explosion.Mode.BREAK);
																					}
																					if (world instanceof ServerWorld)
																						((ServerWorld) world).setDayTime((int) 20000);
																					if (entity instanceof ServerPlayerEntity) {
																						Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server)
																								.getAdvancementManager()
																								.getAdvancement(new ResourceLocation(
																										"time:carefulexplosion"));
																						AdvancementProgress _ap = ((ServerPlayerEntity) entity)
																								.getAdvancements().getProgress(_adv);
																						if (!_ap.isDone()) {
																							Iterator _iterator = _ap.getRemaningCriteria().iterator();
																							while (_iterator.hasNext()) {
																								String _criterion = (String) _iterator.next();
																								((ServerPlayerEntity) entity).getAdvancements()
																										.grantCriterion(_adv, _criterion);
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
			}
		}
	}
}
