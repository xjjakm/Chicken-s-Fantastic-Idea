
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.amod.AModMod;

public class AModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, AModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> QBY = REGISTRY.register("qby", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("a_mod", "qby")));
	public static final DeferredHolder<SoundEvent, SoundEvent> YSYY = REGISTRY.register("ysyy", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("a_mod", "ysyy")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LDXQ = REGISTRY.register("ldxq", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("a_mod", "ldxq")));
	public static final DeferredHolder<SoundEvent, SoundEvent> AAA = REGISTRY.register("aaa", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("a_mod", "aaa")));
}
