package enchia.time.main.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Mirror;

import java.util.Map;

import enchia.time.main.TimeMod;

public class RandomcenterOnStructureInstanceGeneratedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure RandomcenterOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure RandomcenterOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure RandomcenterOnStructureInstanceGenerated!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure RandomcenterOnStructureInstanceGenerated!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) z),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) z),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_utmzomibe_spawn"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 16)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_z-_traproom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 16)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_z-_traproom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 8)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 8)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_z-_normal"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 8)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_z-_traproom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 8)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_phantom_spawn"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 24)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_blaze_spawn"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 24)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_slime_spawn"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 16)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "spawn_slime_spawn"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 16)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 24)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 24)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 32)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 32)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 32)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 32)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 40)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 40)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 40)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_skeletion"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 40)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_skeletion"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 48)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 48)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 56)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 56)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 56)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_skeletion"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 56)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 64)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 64)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 64)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 64)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "boss_room_3"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "boss_room_2"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 72)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 72)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 72)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "boss_room_1"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 80)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (Math.random() < 0.5) {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("time", "boss_room_2"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 80)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			} else {
				if (world instanceof ServerWorld) {
					Template template = ((ServerWorld) world).getStructureTemplateManager()
							.getTemplateDefaulted(new ResourceLocation("time", "boss_room_3"));
					if (template != null) {
						template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 80)),
								new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
								((World) world).rand);
					}
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "boss_room_3"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "boss_room_3"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 88)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 96)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 96)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 96)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 96)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 104)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 104)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "cl_main_room_start"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 104)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 104)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 112)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 112)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 120)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 120)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 128)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 128)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 136)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (world instanceof ServerWorld) {
			Template template = ((ServerWorld) world).getStructureTemplateManager().getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
			if (template != null) {
				template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 136)),
						new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
						((World) world).rand);
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 148)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 148)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "waterroom"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 148)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_1block"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 148)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 156)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 156)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_room_2floor"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 156)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_headlesszomibe"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 156)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 164)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 164)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_icetrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 164)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "mysdungeon_walk_lavatrap"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 164)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
		if (Math.random() < 0.5) {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "boss_room_1"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z + 172)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		} else {
			if (world instanceof ServerWorld) {
				Template template = ((ServerWorld) world).getStructureTemplateManager()
						.getTemplateDefaulted(new ResourceLocation("time", "undefined"));
				if (template != null) {
					template.func_237144_a_((ServerWorld) world, new BlockPos((int) x, (int) y, (int) (z - 164)),
							new PlacementSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setChunk(null).setIgnoreEntities(false),
							((World) world).rand);
				}
			}
		}
	}
}
