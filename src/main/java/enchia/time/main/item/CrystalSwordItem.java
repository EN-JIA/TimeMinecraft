
package enchia.time.main.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import enchia.time.main.itemgroup.TIMEItemGroup;
import enchia.time.main.TimeModElements;

@TimeModElements.ModElement.Tag
public class CrystalSwordItem extends TimeModElements.ModElement {
	@ObjectHolder("time:crystal_sword")
	public static final Item block = null;

	public CrystalSwordItem(TimeModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 4028;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 14f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 32;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CrystalGemItem.block));
			}
		}, 3, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("crystal_sword"));
	}
}
