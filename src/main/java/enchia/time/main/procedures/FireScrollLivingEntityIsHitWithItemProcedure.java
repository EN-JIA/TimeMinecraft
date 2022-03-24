package enchia.time.main.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import enchia.time.main.item.FireScrollItem;
import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class FireScrollLivingEntityIsHitWithItemProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				TimeMod.LOGGER.warn("Failed to load dependency entity for procedure FireScrollLivingEntityIsHitWithItem!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new TimeModVariables.PlayerVariables())).Magic >= 3) {
			{
				double _setval = ((entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new TimeModVariables.PlayerVariables())).Magic - 3);
				entity.getCapability(TimeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Magic = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(FireScrollItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
			entity.setFire((int) 9999);
		}
	}
}
