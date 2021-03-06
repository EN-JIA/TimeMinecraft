
package enchia.time.main.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import enchia.time.main.TimeModElements;

@TimeModElements.ModElement.Tag
public class StrawberryLogStairsBlock extends TimeModElements.ModElement {
	@ObjectHolder("time:strawberry_log_stairs")
	public static final Block block = null;

	public StrawberryLogStairsBlock(TimeModElements instance) {
		super(instance, 1594);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(0.8999999999999999f, 0.6f)
					.setLightLevel(s -> 0)).getDefaultState(),
					Block.Properties.create(Material.WOOD).sound(SoundType.WOOD).hardnessAndResistance(0.8999999999999999f, 0.6f)
							.setLightLevel(s -> 0));
			setRegistryName("strawberry_log_stairs");
		}

		@Override
		public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
			return 2;
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
