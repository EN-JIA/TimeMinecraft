
package enchia.time.main.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import java.util.List;
import java.util.Collections;

import enchia.time.main.itemgroup.TIMEItemGroup;
import enchia.time.main.item.VitreousItem;
import enchia.time.main.TimeModElements;

@TimeModElements.ModElement.Tag
public class VitreousOreBlock extends TimeModElements.ModElement {
	@ObjectHolder("time:vitreous_ore")
	public static final Block block = null;

	public VitreousOreBlock(TimeModElements instance) {
		super(instance, 218);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(TIMEItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(6f, 8.705505632961241f).setLightLevel(s -> 0)
					.harvestLevel(4).harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("vitreous_ore");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(VitreousItem.block));
		}
	}
}
