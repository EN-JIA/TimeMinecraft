
package net.en_jia.minecraft.forge.tpwa.abyss.time.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.en_jia.minecraft.forge.tpwa.abyss.time.itemgroup.TIMEItemGroup;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeModElements;

import java.util.List;
import java.util.Collections;

@TimeModElements.ModElement.Tag
public class GlowstoneStairsBlock extends TimeModElements.ModElement {
	@ObjectHolder("time:glowstone_stairs")
	public static final Block block = null;

	public GlowstoneStairsBlock(TimeModElements instance) {
		super(instance, 554);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TIMEItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(
					Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.2f, 10f).setLightLevel(s -> 15))
							.getDefaultState(),
					Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(0.2f, 10f).setLightLevel(s -> 15));
			setRegistryName("glowstone_stairs");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
