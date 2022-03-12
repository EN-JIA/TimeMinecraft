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

import net.en_jia.minecraft.forge.tpwa.abyss.time.entity.SnowMonster4Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SnowMonster4Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SnowMonster4Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsnow_monster4(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/snow_monster4.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.7.5
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelsnow_monster4 extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer head;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer left_leg1;
		private final ModelRenderer right_leg;
		private final ModelRenderer left_leg2;
		private final ModelRenderer right_leg2;

		public Modelsnow_monster4() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 24.0F, 0.0F);
			body.setTextureOffset(0, 0).addBox(-5.0F, -14.0F, -9.0F, 10.0F, 7.0F, 17.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 12.4373F, -7.4617F);
			head.setTextureOffset(0, 24).addBox(-4.0F, -6.4373F, -5.5383F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(1.0F, -8.6254F, -7.4235F);
			head.addChild(cube_r1);
			setRotationAngle(cube_r1, -1.1345F, 0.0F, 0.0F);
			cube_r1.setTextureOffset(0, 10).addBox(-2.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(1.0F, -4.4373F, -2.5383F);
			head.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.6545F, 0.0F, 0.0F);
			cube_r2.setTextureOffset(32, 32).addBox(-2.0F, -1.0F, -6.0F, 2.0F, 2.0F, 7.0F, 0.0F, false);
			left_leg1 = new ModelRenderer(this);
			left_leg1.setRotationPoint(-3.5F, 16.5F, -6.5F);
			left_leg1.setTextureOffset(12, 40).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(3.5F, 16.5F, -6.5F);
			right_leg.setTextureOffset(0, 40).addBox(-1.5F, 0.5F, -1.5F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			left_leg2 = new ModelRenderer(this);
			left_leg2.setRotationPoint(-3.0F, 17.0F, 5.0F);
			left_leg2.setTextureOffset(37, 0).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
			right_leg2 = new ModelRenderer(this);
			right_leg2.setRotationPoint(3.0F, 17.0F, 5.0F);
			right_leg2.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -1.0F, 3.0F, 7.0F, 3.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg1.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.body.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.left_leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.cube_r1.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.cube_r2.rotateAngleX = f3 / (180F / (float) Math.PI);
		}
	}

}
