package net.en_jia.minecraft.forge.tpwa.abyss.time.entity.renderer;

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

import net.en_jia.minecraft.forge.tpwa.abyss.time.entity.MimicEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class MimicRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MimicEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelmimic_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/ender.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.5.4
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class Modelmimic_model extends EntityModel<Entity> {
		private final ModelRenderer base_left;
		private final ModelRenderer base_left_rotation;
		private final ModelRenderer base_right;
		private final ModelRenderer base_right_rotation;
		private final ModelRenderer knob_left;
		private final ModelRenderer knob_left_rotation;
		private final ModelRenderer knob_right;
		private final ModelRenderer knob_right_rotation;
		private final ModelRenderer lid_left;
		private final ModelRenderer lid_left_rotation;
		private final ModelRenderer lid_right;
		private final ModelRenderer lid_right_rotation;
		private final ModelRenderer base;
		private final ModelRenderer base_rotation;
		private final ModelRenderer knob;
		private final ModelRenderer knob_rotation;
		private final ModelRenderer lid;
		private final ModelRenderer lid_rotation;

		public Modelmimic_model() {
			textureWidth = 64;
			textureHeight = 64;
			base_left = new ModelRenderer(this);
			base_left.setRotationPoint(8.0F, 10.0F, -8.0F);
			base_left_rotation = new ModelRenderer(this);
			base_left_rotation.setRotationPoint(-8.0F, 7.0F, 8.0F);
			base_left.addChild(base_left_rotation);
			setRotationAngle(base_left_rotation, 3.1416F, 0.0F, 0.0F);
			base_right = new ModelRenderer(this);
			base_right.setRotationPoint(-8.0F, 10.0F, -8.0F);
			base_right_rotation = new ModelRenderer(this);
			base_right_rotation.setRotationPoint(8.0F, 7.0F, 8.0F);
			base_right.addChild(base_right_rotation);
			setRotationAngle(base_right_rotation, 3.1416F, 0.0F, 0.0F);
			knob_left = new ModelRenderer(this);
			knob_left.setRotationPoint(8.0F, 18.0F, -8.0F);
			knob_left_rotation = new ModelRenderer(this);
			knob_left_rotation.setRotationPoint(-8.0F, -1.0F, 8.0F);
			knob_left.addChild(knob_left_rotation);
			setRotationAngle(knob_left_rotation, 3.1416F, 0.0F, 0.0F);
			knob_right = new ModelRenderer(this);
			knob_right.setRotationPoint(-8.0F, 18.0F, -8.0F);
			knob_right_rotation = new ModelRenderer(this);
			knob_right_rotation.setRotationPoint(8.0F, -1.0F, 8.0F);
			knob_right.addChild(knob_right_rotation);
			setRotationAngle(knob_right_rotation, 3.1416F, 0.0F, 0.0F);
			lid_left = new ModelRenderer(this);
			lid_left.setRotationPoint(8.0F, 19.0F, -7.0F);
			lid_left_rotation = new ModelRenderer(this);
			lid_left_rotation.setRotationPoint(-8.0F, -2.0F, 7.0F);
			lid_left.addChild(lid_left_rotation);
			setRotationAngle(lid_left_rotation, 3.1416F, 0.0F, 0.0F);
			lid_right = new ModelRenderer(this);
			lid_right.setRotationPoint(-8.0F, 19.0F, -7.0F);
			lid_right_rotation = new ModelRenderer(this);
			lid_right_rotation.setRotationPoint(8.0F, -2.0F, 7.0F);
			lid_right.addChild(lid_right_rotation);
			setRotationAngle(lid_right_rotation, 3.1416F, 0.0F, 0.0F);
			base = new ModelRenderer(this);
			base.setRotationPoint(8.0F, 10.0F, -8.0F);
			base_rotation = new ModelRenderer(this);
			base_rotation.setRotationPoint(-8.0F, 7.0F, 8.0F);
			base.addChild(base_rotation);
			setRotationAngle(base_rotation, 3.1416F, 0.0F, 0.0F);
			base_rotation.setTextureOffset(0, 19).addBox(-7.0F, -7.0F, -7.0F, 14.0F, 10.0F, 14.0F, 0.0F, false);
			knob = new ModelRenderer(this);
			knob.setRotationPoint(8.0F, 18.0F, -8.0F);
			knob_rotation = new ModelRenderer(this);
			knob_rotation.setRotationPoint(-8.0F, -1.0F, 8.0F);
			knob.addChild(knob_rotation);
			setRotationAngle(knob_rotation, 2.7925F, 0.0F, 0.0F);
			knob_rotation.setTextureOffset(0, 0).addBox(-1.0F, 4.0F, 7.0F, 2.0F, 4.0F, 1.0F, 0.0F, false);
			lid = new ModelRenderer(this);
			lid.setRotationPoint(8.0F, 19.0F, -7.0F);
			lid_rotation = new ModelRenderer(this);
			lid_rotation.setRotationPoint(-8.0F, -2.0F, 7.0F);
			lid.addChild(lid_rotation);
			setRotationAngle(lid_rotation, 2.7925F, 0.0F, 0.0F);
			lid_rotation.setTextureOffset(0, 0).addBox(-7.0F, 5.0F, -7.0F, 14.0F, 5.0F, 14.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			base_left.render(matrixStack, buffer, packedLight, packedOverlay);
			base_right.render(matrixStack, buffer, packedLight, packedOverlay);
			knob_left.render(matrixStack, buffer, packedLight, packedOverlay);
			knob_right.render(matrixStack, buffer, packedLight, packedOverlay);
			lid_left.render(matrixStack, buffer, packedLight, packedOverlay);
			lid_right.render(matrixStack, buffer, packedLight, packedOverlay);
			base.render(matrixStack, buffer, packedLight, packedOverlay);
			knob.render(matrixStack, buffer, packedLight, packedOverlay);
			lid.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

		}
	}

}
