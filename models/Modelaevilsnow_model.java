// Made with Blockbench 3.5.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelaevilsnow_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer left_hand;
	private final ModelRenderer right_hand;
	private final ModelRenderer body;
	private final ModelRenderer body_bottom;

	public Modelaevilsnow_model() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 4.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, true);
		head.setTextureOffset(0, 0).addBox(-11.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, true);
		head.setTextureOffset(0, 0).addBox(3.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F, true);
		head.setTextureOffset(0, 0).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		left_hand = new ModelRenderer(this);
		left_hand.setRotationPoint(15.0F, 6.0F, 0.0F);
		left_hand.setTextureOffset(32, 0).addBox(-31.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F, true);

		right_hand = new ModelRenderer(this);
		right_hand.setRotationPoint(-5.0F, 6.0F, 0.0F);
		right_hand.setTextureOffset(32, 0).addBox(9.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F, true);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 13.0F, 0.0F);
		body.setTextureOffset(0, 16).addBox(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F, true);

		body_bottom = new ModelRenderer(this);
		body_bottom.setRotationPoint(0.0F, 24.0F, 0.0F);
		body_bottom.setTextureOffset(0, 40).addBox(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F, true);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		left_hand.render(matrixStack, buffer, packedLight, packedOverlay);
		right_hand.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		body_bottom.render(matrixStack, buffer, packedLight, packedOverlay);
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
		this.right_hand.rotateAngleY = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.left_hand.rotateAngleY = MathHelper.cos(f * 0.6662F) * f1;
	}
}