
package net.en_jia.minecraft.forge.tpwa.abyss.time.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.en_jia.minecraft.forge.tpwa.abyss.time.item.LogoItem;
import net.en_jia.minecraft.forge.tpwa.abyss.time.TimeModElements;

@TimeModElements.ModElement.Tag
public class TIMEItemGroup extends TimeModElements.ModElement {
	public TIMEItemGroup(TimeModElements instance) {
		super(instance, 859);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtime") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LogoItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
