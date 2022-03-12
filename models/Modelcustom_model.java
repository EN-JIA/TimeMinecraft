// Made with Blockbench
// Paste this code into your mod.
// Make sure to generate all required imports

public static class Modelcustom_model extends ModelBase {
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
		right_foot.cubeList.add(new ModelBox(right_foot, 8, 24, -1.0F, 5.0F, -3.7F, 2, 1, 7, 0.0F, true));

		left_thigh = new ModelRenderer(this);
		left_thigh.setRotationPoint(-3.0F, 17.5F, 4.7F);
		left_thigh.cubeList.add(new ModelBox(left_thigh, 32, 0, -1.0F, -0.5F, -0.2F, 2, 4, 5, 0.0F, true));

		right_thigh = new ModelRenderer(this);
		right_thigh.setRotationPoint(3.0F, 17.5F, 4.7F);
		right_thigh.cubeList.add(new ModelBox(right_thigh, 30, 15, -1.0F, -0.5F, -0.2F, 2, 4, 5, 0.0F, true));

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 15.0F, 9.0F);
		body.cubeList.add(new ModelBox(body, 0, 0, -3.0F, -2.0F, -10.0F, 6, 5, 10, 0.0F, false));

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 17.0F, -1.0F);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.0F, 17.0F, -1.0F);
		right_arm.cubeList.add(new ModelBox(right_arm, 0, 15, -1.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, true));
		right_arm.cubeList.add(new ModelBox(right_arm, 0, 15, -7.0F, 0.0F, -1.0F, 2, 7, 2, 0.0F, true));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.0F, -1.0F);
		head.cubeList.add(new ModelBox(head, 32, 0, -2.5F, -4.0F, -5.0F, 5, 3, 5, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 32, 0, -2.5F, -1.0F, -4.0F, 5, 1, 4, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 0, -3.5F, -5.0F, -3.0F, 2, 2, 2, 0.0F, true));
		head.cubeList.add(new ModelBox(head, 0, 5, 1.5F, -5.0F, -3.0F, 2, 2, 2, 0.0F, true));

		tail = new ModelRenderer(this);
		tail.setRotationPoint(0.0F, 16.25F, 9.0F);
		tail.cubeList.add(new ModelBox(tail, 52, 6, -1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F, true));

		nose = new ModelRenderer(this);
		nose.setRotationPoint(-1.0F, 16.0F, -2.0F);
		setRotationAngle(nose, 0.0F, 0.0873F, 0.0F);
		nose.cubeList.add(new ModelBox(nose, 8, 24, -3.9088F, 5.0F, 4.5419F, 2, 1, 7, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		right_foot.render(f5);
		left_thigh.render(f5);
		right_thigh.render(f5);
		body.render(f5);
		left_arm.render(f5);
		right_arm.render(f5);
		head.render(f5);
		tail.render(f5);
		nose.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.right_foot.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.right_arm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_arm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.left_thigh.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.right_thigh.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}