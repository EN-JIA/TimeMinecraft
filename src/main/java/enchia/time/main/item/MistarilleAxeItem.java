
package enchia.time.main.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import enchia.time.main.itemgroup.TIMEItemGroup;
import enchia.time.main.TimeModElements;

@TimeModElements.ModElement.Tag
public class MistarilleAxeItem extends TimeModElements.ModElement {
	@ObjectHolder("time:mistarille_axe")
	public static final Item block = null;

	public MistarilleAxeItem(TimeModElements instance) {
		super(instance, 92);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("mistarille_axe"));
	}
}
