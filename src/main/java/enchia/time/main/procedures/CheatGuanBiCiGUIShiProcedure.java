package enchia.time.main.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.gui.widget.TextFieldWidget;

import java.util.Map;
import java.util.HashMap;

import enchia.time.main.TimeMod;

public class CheatGuanBiCiGUIShiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure CheatGuanBiCiGUIShi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure CheatGuanBiCiGUIShi!");
			return;
		}
		if (dependencies.get("guistate") == null) {
			if (!dependencies.containsKey("guistate"))
				TimeMod.LOGGER.warn("Failed to load dependency guistate for procedure CheatGuanBiCiGUIShi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
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
									if (entity instanceof LivingEntity)
										((LivingEntity) entity).addPotionEffect(
												new EffectInstance(Effects.REGENERATION, (int) 1000000, (int) 255, (false), (false)));
									if (entity instanceof PlayerEntity)
										((PlayerEntity) entity).closeScreen();
								} else {
									if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
										((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("Invalid content!"), (false));
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
