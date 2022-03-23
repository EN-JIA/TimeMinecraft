package enchia.time.main.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;
import net.minecraft.client.gui.widget.TextFieldWidget;

import java.util.Map;
import java.util.HashMap;

import enchia.time.main.TimeMod;

public class CheatCiGUIKaiQiShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure CheatCiGUIKaiQiShi!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				TimeMod.LOGGER.warn("Failed to load dependency x for procedure CheatCiGUIKaiQiShi!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				TimeMod.LOGGER.warn("Failed to load dependency y for procedure CheatCiGUIKaiQiShi!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				TimeMod.LOGGER.warn("Failed to load dependency z for procedure CheatCiGUIKaiQiShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure CheatCiGUIKaiQiShi!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				TimeMod.LOGGER.warn("Failed to load dependency guistate for procedure CheatCiGUIKaiQiShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		HashMap guistate = (HashMap) dependencies.get("guistate");
		if ((new Object() {
			public String getText() {
				TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
				if (_tf != null) {
					return _tf.getText();
				}
				return "";
			}
		}.getText()).equals("breakfast")) {
			if (world instanceof ServerWorld)
				((ServerWorld) world).setDayTime((int) 1000);
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
		} else {
			if ((new Object() {
				public String getText() {
					TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
					if (_tf != null) {
						return _tf.getText();
					}
					return "";
				}
			}.getText()).equals("goodnight")) {
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
				if (world instanceof ServerWorld)
					((ServerWorld) world).setDayTime((int) 13000);
			} else {
				if ((new Object() {
					public String getText() {
						TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
						if (_tf != null) {
							return _tf.getText();
						}
						return "";
					}
				}.getText()).equals("rocket")) {
					if (entity instanceof PlayerEntity)
						((PlayerEntity) entity).closeScreen();
					if (entity instanceof LivingEntity)
						((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, (int) 1000000, (int) 5, (false), (false)));
				} else {
					if ((new Object() {
						public String getText() {
							TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
							if (_tf != null) {
								return _tf.getText();
							}
							return "";
						}
					}.getText()).equals("milk")) {
						if (entity instanceof PlayerEntity)
							((PlayerEntity) entity).closeScreen();
						{
							Entity _ent = entity;
							if (!_ent.world.isRemote && _ent.world.getServer() != null) {
								_ent.world.getServer().getCommandManager()
										.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "effect clear @s");
							}
						}
					} else {
						if ((new Object() {
							public String getText() {
								TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
								if (_tf != null) {
									return _tf.getText();
								}
								return "";
							}
						}.getText()).equals("goodbye")) {
							if (entity instanceof PlayerEntity)
								((PlayerEntity) entity).closeScreen();
							{
								Entity _ent = entity;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager()
											.handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "kill");
								}
							}
						} else {
							if ((new Object() {
								public String getText() {
									TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
									if (_tf != null) {
										return _tf.getText();
									}
									return "";
								}
							}.getText()).equals("skyfall")) {
								if (entity instanceof PlayerEntity)
									((PlayerEntity) entity).closeScreen();
								{
									Entity _ent = entity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "tp @s ~ 255 ~");
									}
								}
							} else {
								if ((new Object() {
									public String getText() {
										TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
										if (_tf != null) {
											return _tf.getText();
										}
										return "";
									}
								}.getText()).equals("loser!!!")) {
									if (entity instanceof PlayerEntity)
										((PlayerEntity) entity).closeScreen();
									if (entity instanceof LivingEntity)
										((LivingEntity) entity).addPotionEffect(
												new EffectInstance(Effects.REGENERATION, (int) 1000000, (int) 255, (false), (false)));
								} else {
									if ((new Object() {
										public String getText() {
											TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
											if (_tf != null) {
												return _tf.getText();
											}
											return "";
										}
									}.getText()).equals("main")) {
										if (entity instanceof PlayerEntity)
											((PlayerEntity) entity).closeScreen();
										{
											Entity _ent = entity;
											if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
												RegistryKey<World> destinationType = World.OVERWORLD;
												ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
												if (nextWorld != null) {
													((ServerPlayerEntity) _ent).connection
															.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
													((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
															nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw,
															_ent.rotationPitch);
													((ServerPlayerEntity) _ent).connection
															.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
													for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent).getActivePotionEffects()) {
														((ServerPlayerEntity) _ent).connection
																.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
													}
													((ServerPlayerEntity) _ent).connection
															.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
												}
											}
										}
									} else {
										if ((new Object() {
											public String getText() {
												TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
												if (_tf != null) {
													return _tf.getText();
												}
												return "";
											}
										}.getText()).equals("gm1")) {
											if (entity instanceof PlayerEntity)
												((PlayerEntity) entity).closeScreen();
											if (world instanceof ServerWorld) {
												((World) world).getServer().getCommandManager()
														.handleCommand(
																new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO,
																		(ServerWorld) world, 4, "", new StringTextComponent(""),
																		((World) world).getServer(), null).withFeedbackDisabled(),
																"gamemode survival");
											}
										} else {
											if ((new Object() {
												public String getText() {
													TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
													if (_tf != null) {
														return _tf.getText();
													}
													return "";
												}
											}.getText()).equals("100")) {
												if (entity instanceof PlayerEntity)
													((PlayerEntity) entity).closeScreen();
												{
													Entity _ent = entity;
													if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
														RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
																new ResourceLocation("time:deleted_mod_element"));
														ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
														if (nextWorld != null) {
															((ServerPlayerEntity) _ent).connection.sendPacket(
																	new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
															((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
																	nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(),
																	_ent.rotationYaw, _ent.rotationPitch);
															((ServerPlayerEntity) _ent).connection
																	.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
															for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent)
																	.getActivePotionEffects()) {
																((ServerPlayerEntity) _ent).connection
																		.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
															}
															((ServerPlayerEntity) _ent).connection
																	.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
														}
													}
												}
											} else {
												if ((new Object() {
													public String getText() {
														TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
														if (_tf != null) {
															return _tf.getText();
														}
														return "";
													}
												}.getText()).equals("400")) {
													if (entity instanceof PlayerEntity)
														((PlayerEntity) entity).closeScreen();
													{
														Entity _ent = entity;
														if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
															RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
																	new ResourceLocation("time:mcy_400"));
															ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
															if (nextWorld != null) {
																((ServerPlayerEntity) _ent).connection.sendPacket(
																		new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
																((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
																		nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(),
																		_ent.rotationYaw, _ent.rotationPitch);
																((ServerPlayerEntity) _ent).connection.sendPacket(
																		new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
																for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent)
																		.getActivePotionEffects()) {
																	((ServerPlayerEntity) _ent).connection.sendPacket(
																			new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
																}
																((ServerPlayerEntity) _ent).connection
																		.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
															}
														}
													}
												} else {
													if ((new Object() {
														public String getText() {
															TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
															if (_tf != null) {
																return _tf.getText();
															}
															return "";
														}
													}.getText()).equals("1600")) {
														if (entity instanceof PlayerEntity)
															((PlayerEntity) entity).closeScreen();
														{
															Entity _ent = entity;
															if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
																RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY,
																		new ResourceLocation("time:mcy_1600"));
																ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
																if (nextWorld != null) {
																	((ServerPlayerEntity) _ent).connection.sendPacket(
																			new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
																	((ServerPlayerEntity) _ent).teleport(nextWorld, nextWorld.getSpawnPoint().getX(),
																			nextWorld.getSpawnPoint().getY() + 1, nextWorld.getSpawnPoint().getZ(),
																			_ent.rotationYaw, _ent.rotationPitch);
																	((ServerPlayerEntity) _ent).connection.sendPacket(
																			new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
																	for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent)
																			.getActivePotionEffects()) {
																		((ServerPlayerEntity) _ent).connection.sendPacket(
																				new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
																	}
																	((ServerPlayerEntity) _ent).connection
																			.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
																}
															}
														}
													} else {
														if ((new Object() {
															public String getText() {
																TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
																if (_tf != null) {
																	return _tf.getText();
																}
																return "";
															}
														}.getText()).equals("102400")) {
															if (entity instanceof PlayerEntity)
																((PlayerEntity) entity).closeScreen();
															{
																Entity _ent = entity;
																if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
																	RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(
																			Registry.WORLD_KEY, new ResourceLocation("time:mcy_102400"));
																	ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
																	if (nextWorld != null) {
																		((ServerPlayerEntity) _ent).connection.sendPacket(new SChangeGameStatePacket(
																				SChangeGameStatePacket.field_241768_e_, 0));
																		((ServerPlayerEntity) _ent).teleport(nextWorld,
																				nextWorld.getSpawnPoint().getX(),
																				nextWorld.getSpawnPoint().getY() + 1,
																				nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw,
																				_ent.rotationPitch);
																		((ServerPlayerEntity) _ent).connection.sendPacket(
																				new SPlayerAbilitiesPacket(((ServerPlayerEntity) _ent).abilities));
																		for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent)
																				.getActivePotionEffects()) {
																			((ServerPlayerEntity) _ent).connection.sendPacket(
																					new SPlayEntityEffectPacket(_ent.getEntityId(), effectinstance));
																		}
																		((ServerPlayerEntity) _ent).connection
																				.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
																	}
																}
															}
														} else {
															if ((new Object() {
																public String getText() {
																	TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
																	if (_tf != null) {
																		return _tf.getText();
																	}
																	return "";
																}
															}.getText()).equals("409600")) {
																if (entity instanceof PlayerEntity)
																	((PlayerEntity) entity).closeScreen();
																{
																	Entity _ent = entity;
																	if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
																		RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(
																				Registry.WORLD_KEY, new ResourceLocation("time:mcy_409600"));
																		ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
																		if (nextWorld != null) {
																			((ServerPlayerEntity) _ent).connection.sendPacket(
																					new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_,
																							0));
																			((ServerPlayerEntity) _ent).teleport(nextWorld,
																					nextWorld.getSpawnPoint().getX(),
																					nextWorld.getSpawnPoint().getY() + 1,
																					nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw,
																					_ent.rotationPitch);
																			((ServerPlayerEntity) _ent).connection
																					.sendPacket(new SPlayerAbilitiesPacket(
																							((ServerPlayerEntity) _ent).abilities));
																			for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent)
																					.getActivePotionEffects()) {
																				((ServerPlayerEntity) _ent).connection
																						.sendPacket(new SPlayEntityEffectPacket(_ent.getEntityId(),
																								effectinstance));
																			}
																			((ServerPlayerEntity) _ent).connection.sendPacket(
																					new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
																		}
																	}
																}
															} else {
																if ((new Object() {
																	public String getText() {
																		TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
																		if (_tf != null) {
																			return _tf.getText();
																		}
																		return "";
																	}
																}.getText()).equals("1638400")) {
																	if (entity instanceof PlayerEntity)
																		((PlayerEntity) entity).closeScreen();
																	{
																		Entity _ent = entity;
																		if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
																			RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(
																					Registry.WORLD_KEY, new ResourceLocation("time:mcy_1638400"));
																			ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
																			if (nextWorld != null) {
																				((ServerPlayerEntity) _ent).connection
																						.sendPacket(new SChangeGameStatePacket(
																								SChangeGameStatePacket.field_241768_e_, 0));
																				((ServerPlayerEntity) _ent).teleport(nextWorld,
																						nextWorld.getSpawnPoint().getX(),
																						nextWorld.getSpawnPoint().getY() + 1,
																						nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw,
																						_ent.rotationPitch);
																				((ServerPlayerEntity) _ent).connection
																						.sendPacket(new SPlayerAbilitiesPacket(
																								((ServerPlayerEntity) _ent).abilities));
																				for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent)
																						.getActivePotionEffects()) {
																					((ServerPlayerEntity) _ent).connection.sendPacket(
																							new SPlayEntityEffectPacket(_ent.getEntityId(),
																									effectinstance));
																				}
																				((ServerPlayerEntity) _ent).connection.sendPacket(
																						new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
																			}
																		}
																	}
																} else {
																	if ((new Object() {
																		public String getText() {
																			TextFieldWidget _tf = (TextFieldWidget) guistate.get("text:Cheat_code");
																			if (_tf != null) {
																				return _tf.getText();
																			}
																			return "";
																		}
																	}.getText()).equals("overworld")) {
																		if (entity instanceof PlayerEntity)
																			((PlayerEntity) entity).closeScreen();
																		{
																			Entity _ent = entity;
																			if (!_ent.world.isRemote && _ent instanceof ServerPlayerEntity) {
																				RegistryKey<World> destinationType = World.OVERWORLD;
																				ServerWorld nextWorld = _ent.getServer().getWorld(destinationType);
																				if (nextWorld != null) {
																					((ServerPlayerEntity) _ent).connection
																							.sendPacket(new SChangeGameStatePacket(
																									SChangeGameStatePacket.field_241768_e_, 0));
																					((ServerPlayerEntity) _ent).teleport(nextWorld,
																							nextWorld.getSpawnPoint().getX(),
																							nextWorld.getSpawnPoint().getY() + 1,
																							nextWorld.getSpawnPoint().getZ(), _ent.rotationYaw,
																							_ent.rotationPitch);
																					((ServerPlayerEntity) _ent).connection
																							.sendPacket(new SPlayerAbilitiesPacket(
																									((ServerPlayerEntity) _ent).abilities));
																					for (EffectInstance effectinstance : ((ServerPlayerEntity) _ent)
																							.getActivePotionEffects()) {
																						((ServerPlayerEntity) _ent).connection.sendPacket(
																								new SPlayEntityEffectPacket(_ent.getEntityId(),
																										effectinstance));
																					}
																					((ServerPlayerEntity) _ent).connection.sendPacket(
																							new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
																				}
																			}
																		}
																	} else {
																		if ((new Object() {
																			public String getText() {
																				TextFieldWidget _tf = (TextFieldWidget) guistate
																						.get("text:Cheat_code");
																				if (_tf != null) {
																					return _tf.getText();
																				}
																				return "";
																			}
																		}.getText()).equals("loser!!!")) {
																			if (entity instanceof PlayerEntity)
																				((PlayerEntity) entity).closeScreen();
																			if (entity instanceof LivingEntity)
																				((LivingEntity) entity)
																						.addPotionEffect(new EffectInstance(Effects.REGENERATION,
																								(int) 1000000, (int) 255, (false), (false)));
																		} else {
																			if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
																				((PlayerEntity) entity).sendStatusMessage(
																						new StringTextComponent("Invalid content!"), (false));
																			}
																			if (entity instanceof PlayerEntity)
																				((PlayerEntity) entity).closeScreen();
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
