//Made with Blockbench
//Paste this code into your mod.

public static class Modelair_modle extends ModelBase {
	private final ModelRenderer bb_main;

	public Modelair_modle() {
		textureWidth = 100;
		textureHeight = 100;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 48, -6.0F, -9.0F, -6.0F, 12, 9, 11, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, -2, 6.0F, -8.0F, -5.0F, 1, 8, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -7.0F, -8.0F, -5.0F, 1, 8, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -5.0F, -10.0F, -5.0F, 10, 1, 9, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bb_main.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bb_main.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}