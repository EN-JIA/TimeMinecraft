
package enchia.time.main.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import enchia.time.main.itemgroup.TIMEItemGroup;
import enchia.time.main.block.MCY400StoneBlock;
import enchia.time.main.TimeModElements;

@TimeModElements.ModElement.Tag
public class FrozenPickaxeItem extends TimeModElements.ModElement {
	@ObjectHolder("time:frozen_pickaxe")
	public static final Item block = null;

	public FrozenPickaxeItem(TimeModElements instance) {
		super(instance, 87);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(MCY400StoneBlock.block));
			}
		}, 1, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
		}.setRegistryName("frozen_pickaxe"));
	}
}
