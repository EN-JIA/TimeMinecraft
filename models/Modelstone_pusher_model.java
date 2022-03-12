//Made with Blockbench
//Paste this code into your mod.

public static class Modelstone_pusher_model extends ModelBase {
	private final ModelRenderer bb_main;

	public Modelstone_pusher_model() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -6.0F, -10.0F, -6.0F, 12, 10, 12, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 36, 36, -4.0F, -20.0F, -4.0F, 8, 10, 8, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 22, -6.0F, -30.0F, -5.0F, 12, 10, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 34, 27, -11.0F, -16.0F, -2.0F, 7, 2, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 34, 22, 4.0F, -16.0F, -2.0F, 7, 2, 3, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 42, -11.0F, -16.0F, -7.0F, 2, 2, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 36, 0, 9.0F, -16.0F, -7.0F, 2, 2, 5, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -11.0F, -15.0F, -3.0F, 1, 1, 1, 0.0F, false));
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
	}
}