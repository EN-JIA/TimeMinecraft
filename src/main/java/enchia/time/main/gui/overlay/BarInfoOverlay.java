
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

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber
public class BarInfoOverlay {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGH)
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
			if (true) {
				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/waterbarbackground.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 109, 0, 0, 80, 9, 80, 9);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/bedguibackground.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 99, 0, 0, 80, 9, 80, 9);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/sanitybackgrounud.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 88, 0, 0, 80, 9, 80, 9);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/magicbackground.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 77, 0, 0, 80, 9, 80, 9);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/powerbackground.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 67, 0, 0, 80, 9, 80, 9);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/frozenbackground.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 56, 0, 0, 80, 9, 80, 9);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/evilbackground.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 45, 0, 0, 80, 9, 80, 9);

				Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("time:textures/healthybackground.png"));
				Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + -210, posY + 34, 0, 0, 80, 9, 80, 9);

			}
			RenderSystem.depthMask(true);
			RenderSystem.enableDepthTest();
			RenderSystem.enableAlphaTest();
			RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
	}
}
