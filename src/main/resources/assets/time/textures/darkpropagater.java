//Made with Blockbench
//Paste this code into your mod.

import org.lwjgl.opengl.GL11;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer right_arm;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_leg;
	private final ModelRenderer left_leg;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -18.0F, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -18.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 22, 0, -4.0F, -19.0F, -2.0F, 8, 31, 5, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -25.0F, -3.0F, 6, 6, 7, 0.0F, true));

		headwear = new ModelRenderer(this);
		headwear.setRotationPoint(0.0F, -18.0F, 0.0F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(5.0F, -16.0F, 0.0F);
		right_arm.cubeList.add(new ModelBox(right_arm, 56, 0, -11.0F, -21.0F, -1.0F, 2, 49, 2, 0.0F, true));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-5.0F, -16.0F, 0.0F);
		left_arm.cubeList.add(new ModelBox(left_arm, 56, 0, 9.0F, -21.0F, -1.0F, 2, 49, 2, 0.0F, true));

		right_leg = new ModelRenderer(this);
		right_leg.setRotationPoint(2.0F, -6.0F, 0.0F);
		right_leg.cubeList.add(new ModelBox(right_leg, 56, 0, -1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F, true));

		left_leg = new ModelRenderer(this);
		left_leg.setRotationPoint(-2.0F, -6.0F, 0.0F);
		left_leg.cubeList.add(new ModelBox(left_leg, 56, 0, -1.0F, 0.0F, -1.0F, 2, 30, 2, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		head.render(f5);
		headwear.render(f5);
		right_arm.render(f5);
		left_arm.render(f5);
		right_leg.render(f5);
		left_leg.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}