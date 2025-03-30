
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.amod.item.Music4Item;
import net.mcreator.amod.item.Music3Item;
import net.mcreator.amod.item.Music2Item;
import net.mcreator.amod.item.Music1Item;
import net.mcreator.amod.item.BugmodItem;
import net.mcreator.amod.AModMod;

import java.util.function.Function;

public class AModModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(AModMod.MODID);
	public static final DeferredItem<Item> STONEFRUIT = register("stonefruit", BugmodItem::new);
	public static final DeferredItem<Item> MUSIC_1 = register("music_1", Music1Item::new);
	public static final DeferredItem<Item> MUSIC_2 = register("music_2", Music2Item::new);
	public static final DeferredItem<Item> MUSIC_3 = register("music_3", Music3Item::new);
	public static final DeferredItem<Item> MUSIC_4 = register("music_4", Music4Item::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}
