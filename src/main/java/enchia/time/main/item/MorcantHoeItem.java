
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
public class MorcantHoeItem extends TimeModElements.ModElement {
	@ObjectHolder("time:morcant_hoe")
	public static final Item block = null;

	public MorcantHoeItem(TimeModElements instance) {
		super(instance, 161);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 520;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(MorcantGemItem.block));
			}
		}, 0, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("morcant_hoe"));
	}
}
