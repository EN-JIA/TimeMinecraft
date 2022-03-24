package enchia.time.main.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.item.ExperienceOrbEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

import enchia.time.main.entity.ExpLordEntity;
import enchia.time.main.block.XpBlockoBlock;
import enchia.time.main.block.MagicBlockoBlock;
import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class XpAltarOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure XpAltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure XpAltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure XpAltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure XpAltarOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure XpAltarOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos((int) (x + 2), (int) y, (int) z))).getBlock() == XpBlockoBlock.block) {
			if ((world.getBlockState(new BlockPos((int) (x - 2), (int) y, (int) z))).getBlock() == XpBlockoBlock.block) {
				if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)))).getBlock() == MagicBlockoBlock.block) {
					if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)))).getBlock() == MagicBlockoBlock.block) {
						if (world instanceof ServerWorld) {
							Entity entityToSpawn = new ExpLordEntity.CustomEntity(ExpLordEntity.entity, (World) world);
							entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
							if (entityToSpawn instanceof MobEntity)
								((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world,
										world.getDifficultyForLocation(entityToSpawn.getPosition()), SpawnReason.MOB_SUMMONED,
										(ILivingEntityData) null, (CompoundNBT) null);
							world.addEntity(entityToSpawn);
						}
						if (TimeModVariables.MapVariables.get(world).Language == 0) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Exp Lord summoned!"), (false));
							}
						}
						if (TimeModVariables.MapVariables.get(world).Language == 1) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("???????"), (false));
							}
						}
						if (TimeModVariables.MapVariables.get(world).Language == 2) {
							if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
								((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("?????????"), (false));
							}
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1);
						} else {
							((World) world).playSound(x, y, z,
									(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ambient.cave")),
									SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
						}
						if (world instanceof World && !world.isRemote()) {
							((World) world).addEntity(new ExperienceOrbEntity(((World) world), x, y, z, (int) 2));
						}
						if (world instanceof ServerWorld) {
							LightningBoltEntity _ent = EntityType.LIGHTNING_BOLT.create((World) world);
							_ent.moveForced(Vector3d.copyCenteredHorizontally(new BlockPos((int) x, (int) y, (int) z)));
							_ent.setEffectOnly(false);
							((World) world).addEntity(_ent);
						}
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 2)), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 2)), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) (x - 2), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
						world.setBlockState(new BlockPos((int) (x + 2), (int) y, (int) z), Blocks.AIR.getDefaultState(), 3);
					}
				}
			}
		}
	}
}
