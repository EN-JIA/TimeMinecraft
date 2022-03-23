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

import enchia.time.main.entity.FrogEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class FrogRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FrogEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcustom_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/brown.png");
					}
				};
			});
		}
	}

	// Made with Blockbench
	// Paste this code into your mod.
	// Make sure to generate all required imports
	public static class Modelcustom_model extends EntityModel<Entity> {
		private final ModelRenderer right_foot;
		private final ModelRenderer left_thigh;
		private final ModelRenderer right_thigh;
		private final ModelRenderer body;
		private final ModelRenderer left_arm;
		private final ModelRenderer right_arm;
		private final ModelRenderer head;
		private final ModelRenderer tail;
		private final ModelRenderer nose;

		public Modelcustom_model() {
			textureWidth = 64;
			textureHeight = 32;
			right_foot = new ModelRenderer(this);
			right_foot.setRotationPoint(3.0F, 16.0F, 6.2F);
			setRotationAngle(right_foot, 0.0F, -0.1745F, 0.0F);
			addBoxHelper(right_foot, 8, 24, -1.0F, 5.0F, -3.7F, 2, 1, 7, 0.0F, true);
			left_thigh = new ModelRenderer(this);
			left_thigh.setRotationPoint(-3.0F, 17.5F, 4.7F);
			addBoxHelper(left_thigh, 32, 0, -1.0F, -0.5F, -0.2F, 2, 4, 5, 0.0F, true);
			right_thigh = new ModelRenderer(this);
			right_thigh.setRotationPoint(3.0F, 17.5F, 4.7F);
			addBoxHelper(right_thigh, 30, 15, -1.0F, -0.5F, -0.2F, 2, 4, 5, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 15.0F, 9.0F);
			addBoxHelper(body, 0, 0, -3.0F, -2.0F, -10.0F, 6, 5, 10, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(-3.0F, 17.0F, -1.0F);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(3.0F, 17.0F, -1.0F);
			addBoxHelper(right_arm, 0, 15, -1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, true);
			addBoxHelper(right_arm, 0, 15, -7.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, true);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 16.0F, -1.0F);
			addBoxHelper(head, 32, 0, -2.5F, -4.0F, -5.0F, 5, 3, 5, 0.0F, true);
			addBoxHelper(head, 32, 0, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F, true);
			addBoxHelper(head, 0, 0, -3.5F, -5.0F, -3.0F, 2, 2, 2, 0.0F, true);
			addBoxHelper(head, 0, 5, 1.5F, -5.0F, -3.0F, 2, 2, 2, 0.0F, true);
			tail = new ModelRenderer(this);
			tail.setRotationPoint(0.0F, 16.25F, 9.0F);
			addBoxHelper(tail, 52, 6, -1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F, true);
			nose = new ModelRenderer(this);
			nose.setRotationPoint(-1.0F, 16.0F, -2.0F);
			setRotationAngle(nose, 0.0F, 0.0873F, 0.0F);
			addBoxHelper(nose, 8, 24, -3.9088F, 5.0F, 4.5419F, 2, 1, 7, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			right_foot.render(ms, vb, i1, i2, f1, f2, f3, f4);
			left_thigh.render(ms, vb, i1, i2, f1, f2, f3, f4);
			right_thigh.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			left_arm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			right_arm.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			tail.render(ms, vb, i1, i2, f1, f2, f3, f4);
			nose.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_foot.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
			this.left_thigh.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_thigh.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
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
