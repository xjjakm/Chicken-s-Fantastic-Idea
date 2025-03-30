
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.amod.AModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class AModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> AMOD = REGISTRY.register("amod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.a_mod.amod")).icon(() -> new ItemStack(AModModItems.STONEFRUIT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AModModItems.STONEFRUIT.get());
				tabData.accept(AModModItems.MUSIC_1.get());
				tabData.accept(AModModItems.MUSIC_2.get());
				tabData.accept(AModModItems.MUSIC_3.get());
				tabData.accept(AModModItems.MUSIC_4.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(AModModItems.STONEFRUIT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(AModModItems.MUSIC_1.get());
			tabData.accept(AModModItems.MUSIC_2.get());
			tabData.accept(AModModItems.MUSIC_3.get());
			tabData.accept(AModModItems.MUSIC_4.get());
		}
	}
}
