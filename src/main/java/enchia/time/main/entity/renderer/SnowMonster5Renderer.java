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

import enchia.time.main.entity.SnowMonster5Entity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class SnowMonster5Renderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SnowMonster5Entity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelsnow_monster5(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/snow_monster5.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.9.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelsnow_monster5 extends EntityModel<Entity> {
		private final ModelRenderer body;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;
		private final ModelRenderer right_arm;
		private final ModelRenderer left_arm;
		private final ModelRenderer cube_r1;
		private final ModelRenderer cube_r2;
		private final ModelRenderer cube_r3;
		private final ModelRenderer cube_r4;
		private final ModelRenderer cube_r5;
		private final ModelRenderer cube_r6;
		private final ModelRenderer cube_r7;
		private final ModelRenderer head;

		public Modelsnow_monster5() {
			textureWidth = 64;
			textureHeight = 64;
			body = new ModelRenderer(this);
			body.setRotationPoint(0.0F, 7.5F, 0.0F);
			body.setTextureOffset(26, 16).addBox(-4.0F, -5.5F, -2.0F, 8.0F, 11.0F, 4.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(2.0F, 13.5F, 0.0F);
			left_leg.setTextureOffset(16, 42).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(-2.0F, 13.5F, 0.0F);
			right_leg.setTextureOffset(0, 34).addBox(-2.0F, -0.5F, -2.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
			right_arm = new ModelRenderer(this);
			right_arm.setRotationPoint(-6.0F, 3.0F, 0.0F);
			right_arm.setTextureOffset(32, 46).addBox(-2.0F, -1.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			left_arm = new ModelRenderer(this);
			left_arm.setRotationPoint(5.625F, 2.8125F, 0.125F);
			left_arm.setTextureOffset(46, 27).addBox(-1.625F, -0.8125F, -2.125F, 4.0F, 10.0F, 4.0F, 0.0F, false);
			cube_r1 = new ModelRenderer(this);
			cube_r1.setRotationPoint(-0.625F, -0.8125F, -0.125F);
			left_arm.addChild(cube_r1);
			setRotationAngle(cube_r1, -0.829F, 0.0F, 0.3491F);
			cube_r1.setTextureOffset(32, 0).addBox(0.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r2 = new ModelRenderer(this);
			cube_r2.setRotationPoint(0.375F, -1.8125F, 0.875F);
			left_arm.addChild(cube_r2);
			setRotationAngle(cube_r2, -0.9599F, 0.0F, 1.309F);
			cube_r2.setTextureOffset(16, 34).addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r3 = new ModelRenderer(this);
			cube_r3.setRotationPoint(0.375F, 0.1875F, -0.125F);
			left_arm.addChild(cube_r3);
			setRotationAngle(cube_r3, -0.6981F, 0.0F, 1.1345F);
			cube_r3.setTextureOffset(32, 31).addBox(0.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
			cube_r4 = new ModelRenderer(this);
			cube_r4.setRotationPoint(-0.625F, 2.1875F, -0.125F);
			left_arm.addChild(cube_r4);
			setRotationAngle(cube_r4, 0.6109F, -0.829F, 0.6545F);
			cube_r4.setTextureOffset(17, 16).addBox(0.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			cube_r5 = new ModelRenderer(this);
			cube_r5.setRotationPoint(0.375F, 0.1875F, -0.125F);
			left_arm.addChild(cube_r5);
			setRotationAngle(cube_r5, 0.6109F, 0.0F, 0.6545F);
			cube_r5.setTextureOffset(0, 0).addBox(0.0F, -6.0F, -1.0F, 2.0F, 6.0F, 2.0F, 0.0F, false);
			cube_r6 = new ModelRenderer(this);
			cube_r6.setRotationPoint(0.375F, -0.8125F, -0.125F);
			left_arm.addChild(cube_r6);
			setRotationAngle(cube_r6, 0.6109F, 0.0F, -0.1309F);
			cube_r6.setTextureOffset(24, 0).addBox(0.0F, -5.0F, -1.0F, 2.0F, 5.0F, 2.0F, 0.0F, false);
			cube_r7 = new ModelRenderer(this);
			cube_r7.setRotationPoint(0.375F, -0.8125F, -0.125F);
			left_arm.addChild(cube_r7);
			setRotationAngle(cube_r7, -0.3927F, 0.0F, 0.5672F);
			cube_r7.setTextureOffset(0, 16).addBox(0.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
			head = new ModelRenderer(this);
			head.setRotationPoint(-0.6667F, 1.8333F, 0.0F);
			head.setTextureOffset(0, 0).addBox(-3.3333F, -7.8333F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);
			head.setTextureOffset(0, 16).addBox(-3.8333F, -8.3333F, -4.5F, 4.0F, 9.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(32, 0).addBox(0.1667F, -5.3333F, -4.5F, 1.0F, 6.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(32, 33).addBox(1.1667F, -3.3333F, -4.5F, 1.0F, 4.0F, 9.0F, 0.0F, false);
			head.setTextureOffset(17, 31).addBox(2.1667F, -1.3333F, -4.5F, 3.0F, 2.0F, 9.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			body.render(matrixStack, buffer, packedLight, packedOverlay);
			left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
			right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
			head.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.left_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.cube_r4.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.cube_r5.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.cube_r6.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.cube_r7.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.body.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.cube_r1.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.cube_r2.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.cube_r3.rotateAngleX = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.right_leg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
			this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

}
