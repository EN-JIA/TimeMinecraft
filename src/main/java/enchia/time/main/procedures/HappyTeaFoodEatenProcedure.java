package enchia.time.main.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import enchia.time.main.TimeMod;

public class HappyTeaFoodEatenProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure HappyTeaFoodEaten!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure HappyTeaFoodEaten!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure HappyTeaFoodEaten!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure HappyTeaFoodEaten!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure HappyTeaFoodEaten!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (Math.random() < 0.3) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 300, (int) 255, (false), (false)));
		} else {
			if (Math.random() < 0.3) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 300, (int) 255, (false), (false)));
			} else {
				if (Math.random() < 0.3) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 300, (int) 255, (false), (false)));
				} else {
					if (Math.random() < 0.3) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HUNGER, (int) 300, (int) 255, (false), (false)));
					} else {
						if (Math.random() < 0.3) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity)
										.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 300, (int) 255, (false), (false)));
						} else {
							if (Math.random() < 0.3) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity)
											.addPotionEffect(new EffectInstance(Effects.BLINDNESS, (int) 300, (int) 255, (false), (false)));
							} else {
								if (Math.random() < 0.3) {
									if (entity instanceof LivingEntity)
										((LivingEntity) entity)
												.addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 300, (int) 255, (false), (false)));
								} else {
									if (Math.random() < 0.3) {
										if (entity instanceof LivingEntity)
											((LivingEntity) entity)
													.addPotionEffect(new EffectInstance(Effects.WITHER, (int) 300, (int) 255, (false), (false)));
									} else {
										if (Math.random() < 0.3) {
											if (entity instanceof LivingEntity)
												((LivingEntity) entity)
														.addPotionEffect(new EffectInstance(Effects.POISON, (int) 300, (int) 255, (false), (false)));
										} else {
											if (Math.random() < 0.3) {
												if (entity instanceof LivingEntity)
													((LivingEntity) entity).addPotionEffect(
															new EffectInstance(Effects.LEVITATION, (int) 300, (int) 255, (false), (false)));
											} else {
												if (Math.random() < 0.3) {
													if (entity instanceof LivingEntity)
														((LivingEntity) entity).addPotionEffect(
																new EffectInstance(Effects.BAD_OMEN, (int) 300, (int) 255, (false), (false)));
												} else {
													if (world instanceof World && !((World) world).isRemote) {
														((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 20,
																Explosion.Mode.BREAK);
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
