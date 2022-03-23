package enchia.time.main.procedures;

import net.minecraft.world.IWorld;
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
import java.util.Collections;

import enchia.time.main.block.GlowStoneBrickBlock;
import enchia.time.main.TimeMod;

public class MCY400UndergroundPlayerEntersDimensionProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure MCY400UndergroundPlayerEntersDimension!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure MCY400UndergroundPlayerEntersDimension!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		world.setBlockState(new BlockPos((int) 0, (int) 100, (int) 0), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) 0, (int) 101, (int) 0), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) 0, (int) 102, (int) 0), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) 0, (int) 109, (int) 0), Blocks.AIR.getDefaultState(), 3);
		world.setBlockState(new BlockPos((int) 0, (int) 108, (int) 0), GlowStoneBrickBlock.block.getDefaultState(), 3);
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(0, 100, 0);
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(0, 100, 0, _ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		if (entity instanceof ServerPlayerEntity) {
			Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) entity).server).getAdvancementManager()
					.getAdvancement(new ResourceLocation("time:eternal_frost"));
			AdvancementProgress _ap = ((ServerPlayerEntity) entity).getAdvancements().getProgress(_adv);
			if (!_ap.isDone()) {
				Iterator _iterator = _ap.getRemaningCriteria().iterator();
				while (_iterator.hasNext()) {
					String _criterion = (String) _iterator.next();
					((ServerPlayerEntity) entity).getAdvancements().grantCriterion(_adv, _criterion);
				}
			}
		}
	}
}
