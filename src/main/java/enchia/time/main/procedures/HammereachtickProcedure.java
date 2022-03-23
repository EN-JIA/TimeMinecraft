package enchia.time.main.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.Minecraft;
import net.minecraft.block.Block;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

import enchia.time.main.enchantment.HammerEnchantment;
import enchia.time.main.TimeMod;

public class HammereachtickProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onBlockBreak(BlockEvent.BreakEvent event) {
			Entity entity = event.getPlayer();
			IWorld world = event.getWorld();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("xpAmount", event.getExpToDrop());
			dependencies.put("x", event.getPos().getX());
			dependencies.put("y", event.getPos().getY());
			dependencies.put("z", event.getPos().getZ());
			dependencies.put("px", entity.getPosX());
			dependencies.put("py", entity.getPosY());
			dependencies.put("pz", entity.getPosZ());
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("blockstate", event.getState());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure Hammereachtick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure Hammereachtick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure Hammereachtick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure Hammereachtick!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure Hammereachtick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack pickaxe = ItemStack.EMPTY;
		double EnchtSize = 0;
		double i = 0;
		double j = 0;
		double k = 0;
		if (!entity.isSneaking()) {
			pickaxe = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
			EnchtSize = (EnchantmentHelper.getEnchantmentLevel(HammerEnchantment.enchantment, (pickaxe)));
			i = (x - EnchtSize);
			for (int index0 = 0; index0 < (int) (EnchtSize * 2 + 1); index0++) {
				j = (y - EnchtSize);
				for (int index1 = 0; index1 < (int) (EnchtSize * 2 + 1); index1++) {
					k = (z - EnchtSize);
					for (int index2 = 0; index2 < (int) (EnchtSize * 2 + 1); index2++) {
						if (world.getBlockState(new BlockPos((int) i, (int) j, (int) k)).isSolid()
								&& (pickaxe).getItem().canHarvestBlock((world.getBlockState(new BlockPos((int) i, (int) j, (int) k))))
								&& world.getBlockState(new BlockPos((int) i, (int) j, (int) k)).getBlockHardness(world,
										new BlockPos((int) i, (int) j, (int) k)) >= 0) {
							if (new Object() {
								public boolean checkGamemode(Entity _ent) {
									if (_ent instanceof ServerPlayerEntity) {
										return ((ServerPlayerEntity) _ent).interactionManager.getGameType() == GameType.CREATIVE;
									} else if (_ent instanceof PlayerEntity && _ent.world.isRemote()) {
										NetworkPlayerInfo _npi = Minecraft.getInstance().getConnection()
												.getPlayerInfo(((AbstractClientPlayerEntity) _ent).getGameProfile().getId());
										return _npi != null && _npi.getGameType() == GameType.CREATIVE;
									}
									return false;
								}
							}.checkGamemode(entity)) {
								world.destroyBlock(new BlockPos((int) i, (int) j, (int) k), false);
							} else {
								if (world instanceof World) {
									Block.spawnDrops(world.getBlockState(new BlockPos((int) i, (int) j, (int) k)), (World) world,
											new BlockPos((int) i, (int) j, (int) k));
									world.destroyBlock(new BlockPos((int) i, (int) j, (int) k), false);
								}
								{
									ItemStack _ist = (pickaxe);
									if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
										_ist.shrink(1);
										_ist.setDamage(0);
									}
								}
							}
						}
						k = (k + 1);
					}
					j = (j + 1);
				}
				i = (i + 1);
			}
		}
	}
}
