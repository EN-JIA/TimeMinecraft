package enchia.time.main.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.Util;
import net.minecraft.server.MinecraftServer;

import java.util.Map;

import enchia.time.main.TimeModVariables;
import enchia.time.main.TimeMod;

public class UpdateCheakProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				TimeMod.LOGGER.warn("Failed to load dependency world for procedure UpdateCheak!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (TimeModVariables.MapVariables.get(world).Language == 0) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent(
							"The current version is not the latest version. Please go to curseforge or our discord to download the latest version."),
							ChatType.SYSTEM, Util.DUMMY_UUID);
			}
		}
		if (TimeModVariables.MapVariables.get(world).Language == 1) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("?????????????????Discord???????????"), ChatType.SYSTEM,
							Util.DUMMY_UUID);
			}
		}
		if (TimeModVariables.MapVariables.get(world).Language == 2) {
			if (!world.isRemote()) {
				MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
				if (mcserv != null)
					mcserv.getPlayerList().func_232641_a_(new StringTextComponent("?????????????????QQ???????????"), ChatType.SYSTEM,
							Util.DUMMY_UUID);
			}
		}
	}
}
