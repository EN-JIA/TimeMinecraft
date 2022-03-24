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

import enchia.time.main.entity.CrystalGuardianEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CrystalGuardianRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(CrystalGuardianEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelcrystal_model(), 0.5f) {

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("time:textures/wither.png");
					}
				};
			});
		}
	}

	//Made with Blockbench
	//Paste this code into your mod.
	public static class Modelcrystal_model extends EntityModel<Entity> {
		private final ModelRenderer body1;
		private final ModelRenderer body2;
		private final ModelRenderer body3;
		private final ModelRenderer head1;
		private final ModelRenderer head2;
		private final ModelRenderer head3;

		public Modelcrystal_model() {
			textureWidth = 64;
			textureHeight = 64;
			body1 = new ModelRenderer(this);
			body1.setRotationPoint(0.0F, 0.0F, 0.0F);
			addBoxHelper(body1, 0, 16, -10.0F, 3.9F, -0.5F, 20, 3, 3, 0.0F, true);
			body2 = new ModelRenderer(this);
			body2.setRotationPoint(2.0F, 6.9F, -0.5F);
			addBoxHelper(body2, 0, 22, -4.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F, true);
			addBoxHelper(body2, 24, 22, -8.0F, 1.5F, 0.5F, 11, 2, 2, 0.0F, true);
			addBoxHelper(body2, 24, 22, -8.0F, 4.0F, 0.5F, 11, 2, 2, 0.0F, true);
			addBoxHelper(body2, 24, 22, -8.0F, 6.5F, 0.5F, 11, 2, 2, 0.0F, true);
			body3 = new ModelRenderer(this);
			body3.setRotationPoint(2.0F, 16.9F, -0.5F);
			addBoxHelper(body3, 12, 22, -4.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F, true);
			head1 = new ModelRenderer(this);
			head1.setRotationPoint(1.0F, 0.0F, 0.0F);
			addBoxHelper(head1, 0, 35, -5.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F, true);
			addBoxHelper(head1, 16, 11, -3.0F, -10.0F, -2.0F, 4, 4, 4, 0.0F, true);
			addBoxHelper(head1, 16, 11, 1.0F, -9.0F, -2.0F, 3, 2, 4, 0.0F, true);
			addBoxHelper(head1, 16, 11, -6.0F, -9.0F, -2.0F, 3, 2, 4, 0.0F, true);
			addBoxHelper(head1, 18, 17, -2.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false);
			head2 = new ModelRenderer(this);
			head2.setRotationPoint(9.0F, 4.0F, -1.0F);
			addBoxHelper(head2, 32, 0, -3.0F, -4.0F, -3.0F, 6, 6, 6, 0.0F, true);
			head3 = new ModelRenderer(this);
			head3.setRotationPoint(-9.0F, 4.0F, -1.0F);
			addBoxHelper(head3, 32, 0, -3.0F, -4.0F, -3.0F, 6, 6, 6, 0.0F, true);
		}

		@Override
		public void render(MatrixStack ms, IVertexBuilder vb, int i1, int i2, float f1, float f2, float f3, float f4) {
			body1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			body3.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head1.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head2.render(ms, vb, i1, i2, f1, f2, f3, f4);
			head3.render(ms, vb, i1, i2, f1, f2, f3, f4);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {

			this.head1.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head1.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.head2.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head2.rotateAngleX = f4 / (180F / (float) Math.PI);
			this.head3.rotateAngleY = f3 / (180F / (float) Math.PI);
			this.head3.rotateAngleX = f4 / (180F / (float) Math.PI);
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
