
package enchia.time.main.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import enchia.time.main.itemgroup.TIMEItemGroup;
import enchia.time.main.TimeModElements;

@TimeModElements.ModElement.Tag
public class AquamarineHoeItem extends TimeModElements.ModElement {
	@ObjectHolder("time:aquamarine_hoe")
	public static final Item block = null;

	public AquamarineHoeItem(TimeModElements instance) {
		super(instance, 158);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1981;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return -1f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AquamarineGemItem.block));
			}
		}, 0, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("aquamarine_hoe"));
	}
}
