
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
public class JadeHoeItem extends TimeModElements.ModElement {
	@ObjectHolder("time:jade_hoe")
	public static final Item block = null;

	public JadeHoeItem(TimeModElements instance) {
		super(instance, 156);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(JadeGemItem.block));
			}
		}, 0, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("jade_hoe"));
	}
}
