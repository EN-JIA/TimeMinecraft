
package enchia.time.main.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import enchia.time.main.procedures.IceCrystalsSwordMobIsHitWithToolProcedure;
import enchia.time.main.itemgroup.TIMEItemGroup;
import enchia.time.main.TimeModElements;

@TimeModElements.ModElement.Tag
public class IceCrystalsSwordItem extends TimeModElements.ModElement {
	@ObjectHolder("time:ice_crystals_sword")
	public static final Item block = null;

	public IceCrystalsSwordItem(TimeModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3412;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 15f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BigSnowItem.block));
			}
		}, 3, -3f, new Item.Properties().group(TIMEItemGroup.tab)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;

				IceCrystalsSwordMobIsHitWithToolProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("ice_crystals_sword"));
	}
}
