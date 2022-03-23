
package enchia.time.main.gui.overlay;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import enchia.time.main.procedures.SleepBar1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber
public class Sleep1Overlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.LOWEST)
	public static void eventHandler(RenderGameOverlayEvent.Post event) {
		if (event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int w = event.getWindow().getScaledWidth();
			int h = event.getWindow().getScaledHeight();
			int posX = w / 2;
			int posY = h / 2;
			World _world = null;
			double _x = 0;
			double _y = 0;
			double _z = 0;
			PlayerEntity entity = Minecraft.getInstance().player;
			if (entity != null) {
				_world = entity.world;
				_x = entity.getPosX();
				_y = entity.getPosY();
				_z = entity.getPosZ();
			}
			World world = _world;
			double x = _x;
			double y = _y;
			double z = _z;
			RenderSystem.disableDepthTest();
			RenderSystem.depthMask(false);
			RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
					GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
			RenderSystem.disableAlphaTest();
			if (SleepBar1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -176, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -167, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -181, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -185, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -190, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -194, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -199, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -203, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_4.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -172, posY + 100, 0, 0, 8, 8, 8, 8);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedicon_2.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -208, posY + 100, 0, 0, 8, 8, 8, 8);

			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
