package net.en_jia.minecraft.forge.tpwa.abyss.time.entity.renderer;

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

import net.en_jia.minecraft.forge.tpwa.abyss.time.entity.CluckshroomEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CluckshroomRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CluckshroomEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcluckroom_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/cluckshroom.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modelcluckroom_model extends EntityModel<Entity> {
		private final ModelRenderer head;
		private final ModelRenderer body;
		private final ModelRenderer body_sub_2;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_wing;
		private final ModelRenderer left_wing;
		private final ModelRenderer bill;
		private final ModelRenderer chin;

		public Modelcluckroom_model() {
			textureWidth = 64;
			textureHeight = 32;
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 15.0F, -4.0F);
			addBoxHelper(head, 0, 0, -2.0F, -6.0F, -2.0F, 4, 6, 3, 0.0F, true);
			addBoxHelper(head, 18, 9, -1.5F, -10.0F, -0.5F, 5, 4, 0, 0.0F, true);
			addBoxHelper(head, 18, 4, 1.0F, -10.0F, -3.0F, 0, 4, 5, 0.0F, true);
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 16.0F, 0.0F);
			addBoxHelper(body, 0, 9, -3.0F, -4.0F, -3.0F, 6, 8, 6, 0.0F, true);
			body_sub_2 = new ModelRenderer(this);
			body_sub_2.setRotationPoint(0.0F, 8.0F, 0.0F);
			setRotationAngle(body_sub_2, -1.5708F, 0.0F, 0.0F);
			body.addChild(body_sub_2);
			addBoxHelper(body_sub_2, 28, 3, -1.0F, -8.0F, -9.0F, 0, 5, 5, 0.0F, true);
			addBoxHelper(body_sub_2, 28, 8, -3.5F, -8.0F, -6.5F, 5, 5, 0, 0.0F, true);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(2.0F, 19.0F, 1.0F);
			addBoxHelper(right_leg, 26, 0, -2.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F, true);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(-1.0F, 19.0F, 1.0F);
			addBoxHelper(left_leg, 26, 0, -2.0F, 0.0F, -3.0F, 3, 5, 3, 0.0F, true);
			right_wing = new ModelRenderer(this);
			right_wing.setRotationPoint(4.0F, 13.0F, 0.0F);
			addBoxHelper(right_wing, 24, 13, -8.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F, true);
			left_wing = new ModelRenderer(this);
			left_wing.setRotationPoint(-4.0F, 13.0F, 0.0F);
			addBoxHelper(left_wing, 24, 13, 7.0F, 0.0F, -3.0F, 1, 4, 6, 0.0F, true);
			bill = new ModelRenderer(this);
			bill.setRotationPoint(0.0F, 15.0F, -4.0F);
			addBoxHelper(bill, 14, 0, -2.0F, -4.0F, -4.0F, 4, 2, 2, 0.0F, true);
			chin = new ModelRenderer(this);
			chin.setRotationPoint(0.0F, 15.0F, -4.0F);
			addBoxHelper(chin, 14, 4, -1.0F, -2.0F, -3.0F, 2, 2, 2, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			head.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body.render(ms, vb, i1, i2, f1, f2, f3, f4);
			right_leg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			left_leg.render(ms, vb, i1, i2, f1, f2, f3, f4);
			right_wing.render(ms, vb, i1, i2, f1, f2, f3, f4);
			left_wing.render(ms, vb, i1, i2, f1, f2, f3, f4);
			bill.render(ms, vb, i1, i2, f1, f2, f3, f4);
			chin.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.right_wing.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.left_wing.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
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
