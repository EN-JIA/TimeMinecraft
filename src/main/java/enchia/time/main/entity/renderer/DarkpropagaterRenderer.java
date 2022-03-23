package enchia.time.main.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import enchia.time.main.entity.DarkpropagaterEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class DarkpropagaterRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(DarkpropagaterEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modeldarkpropagater_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/darkpropagater.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modeldarkpropagater_model extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer headwear;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;

		public Modeldarkpropagater_model() {
			textureWidth = 64;
			textureHeight = 32;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, -18.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, -18.0F, 0.0F);
			addBoxHelper(head, 22, 0, -4.0F, -19.0F, -2.0F, 8, 31, 5, 0.0F, true);
			addBoxHelper(head, 0, 0, -3.0F, -25.0F, -3.0F, 6, 6, 7, 0.0F, true);
			headwear = new ModelRenderer(this);
			headwear.setRotationPoint(0.0F, -18.0F, 0.0F);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(5.0F, -16.0F, 0.0F);
			addBoxHelper(right_arm, 56, 0, -11.0F, -21.0F, -1.0F, 2, 49, 2, 0.0F, true);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(-5.0F, -16.0F, 0.0F);
			addBoxHelper(left_arm, 56, 0, 9.0F, -21.0F, -1.0F, 2, 49, 2, 0.0F, true);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(2.0F, -6.0F, 0.0F);
			addBoxHelper(right_leg, 56, 0, -1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-2.0F, -6.0F, 0.0F);
			addBoxHelper(left_leg, 56, 0, -1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			headwear.render(ms, vb, i1, i2, f1, f2, f3, f4);
			right_arm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			left_arm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			right_leg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			left_leg.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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
