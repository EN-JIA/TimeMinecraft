package enchia.time.main.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import enchia.time.main.entity.AirEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class AirRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AirEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelair_modle(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/air.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modelair_modle extends EntityModel<Entity> {
		private final ModelRenderer bb_main;

		public Modelair_modle() {
			textureWidth = 100;
			textureHeight = 100;
			bb_main = new ModelRenderer(this);
			bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
			addBoxHelper(bb_main, 16, 48, -6.0F, -9.0F, -6.0F, 12, 9, 11, 0.0F, false);
			addBoxHelper(bb_main, 0, -2, 6.0F, -8.0F, -5.0F, 1, 8, 10, 0.0F, false);
			addBoxHelper(bb_main, 0, 0, -7.0F, -8.0F, -5.0F, 1, 8, 10, 0.0F, false);
			addBoxHelper(bb_main, 0, 0, -5.0F, -10.0F, -5.0F, 10, 1, 9, 0.0F, false);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			bb_main.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.bb_main.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.bb_main.rotateAngleX = f4 / (180F / (float) Math.PI);
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta) {
		addBoxHelper(renderer, texU, texV, x, y, z, dx, dy, dz, delta, renderer.mirror);
	}

	@OnlyIn(Dist.CLIENT)
	public static void addBoxHelper(ModelRenderer renderer, int texU, int texV, float x, float y, float z, int dx, int dy, int dz, float delta,
			boolean mirror) {
		renderer.mirror = mirror;
		renderer.addBox("", x, y, z, dx, dy, dz, delta, texU, texV);
	}
}
