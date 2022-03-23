
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

import enchia.time.main.procedures.SanityBar1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber
public class Sanity1Overlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGHEST)
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
			if (SanityBar1Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity2.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 86, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 77, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 68, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 59, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 50, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 41, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 32, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 23, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 14, 0, 0, 16, 16, 16, 16);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanity1.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -171, posY + 5, 0, 0, 16, 16, 16, 16);

			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
