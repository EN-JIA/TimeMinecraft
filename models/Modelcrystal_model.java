//Made with Blockbench
//Paste this code into your mod.

public static class Modelcrystal_model extends ModelBase {
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
		body1.cubeList.add(new ModelBox(body1, 0, 16, -10.0F, 3.9F, -0.5F, 20, 3, 3, 0.0F, true));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(2.0F, 6.9F, -0.5F);
		body2.cubeList.add(new ModelBox(body2, 0, 22, -4.0F, 0.0F, 0.0F, 3, 10, 3, 0.0F, true));
		body2.cubeList.add(new ModelBox(body2, 24, 22, -8.0F, 1.5F, 0.5F, 11, 2, 2, 0.0F, true));
		body2.cubeList.add(new ModelBox(body2, 24, 22, -8.0F, 4.0F, 0.5F, 11, 2, 2, 0.0F, true));
		body2.cubeList.add(new ModelBox(body2, 24, 22, -8.0F, 6.5F, 0.5F, 11, 2, 2, 0.0F, true));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(2.0F, 16.9F, -0.5F);
		body3.cubeList.add(new ModelBox(body3, 12, 22, -4.0F, 0.0F, 0.0F, 3, 6, 3, 0.0F, true));

		head1 = new ModelRenderer(this);
		head1.setRotationPoint(1.0F, 0.0F, 0.0F);
		head1.cubeList.add(new ModelBox(head1, 0, 35, -5.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F, true));
		head1.cubeList.add(new ModelBox(head1, 16, 11, -3.0F, -10.0F, -2.0F, 4, 4, 4, 0.0F, true));
		head1.cubeList.add(new ModelBox(head1, 16, 11, 1.0F, -9.0F, -2.0F, 3, 2, 4, 0.0F, true));
		head1.cubeList.add(new ModelBox(head1, 16, 11, -6.0F, -9.0F, -2.0F, 3, 2, 4, 0.0F, true));
		head1.cubeList.add(new ModelBox(head1, 18, 17, -2.0F, -6.0F, -1.0F, 2, 2, 2, 0.0F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(9.0F, 4.0F, -1.0F);
		head2.cubeList.add(new ModelBox(head2, 32, 0, -3.0F, -4.0F, -3.0F, 6, 6, 6, 0.0F, true));

		head3 = new ModelRenderer(this);
		head3.setRotationPoint(-9.0F, 4.0F, -1.0F);
		head3.cubeList.add(new ModelBox(head3, 32, 0, -3.0F, -4.0F, -3.0F, 6, 6, 6, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body1.render(f5);
		body2.render(f5);
		body3.render(f5);
		head1.render(f5);
		head2.render(f5);
		head3.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head1.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head1.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.head2.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head2.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.head3.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head3.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}