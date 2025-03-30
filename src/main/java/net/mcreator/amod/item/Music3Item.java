
package net.mcreator.amod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.amod.AModMod;

public class Music3Item extends Item {
	public Music3Item(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(AModMod.MODID, "music_3"))));
	}
}
