package com.tristankechlo.livingthings.init;

import com.tristankechlo.livingthings.LivingThings;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModSounds {

	public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LivingThings.MOD_ID);
	
	
	public static final RegistryObject<SoundEvent> LION_AMBIENT = SOUNDS.register("lion_ambient", () -> new SoundEvent(getSound("lion.ambient")));
	public static final RegistryObject<SoundEvent> LION_HURT = SOUNDS.register("lion_hurt", () -> new SoundEvent(getSound("lion.hurt")));
	public static final RegistryObject<SoundEvent> LION_DEATH = SOUNDS.register("lion_death", () -> new SoundEvent(getSound("lion.death")));
	
	public static final RegistryObject<SoundEvent> PENGUIN_AMBIENT = SOUNDS.register("penguin_ambient", () -> new SoundEvent(getSound("penguin.ambient")));
	public static final RegistryObject<SoundEvent> PENGUIN_HURT = SOUNDS.register("penguin_hurt", () -> new SoundEvent(getSound("penguin.hurt")));
	public static final RegistryObject<SoundEvent> PENGUIN_DEATH = SOUNDS.register("penguin_death", () -> new SoundEvent(getSound("penguin.death")));
	
	
	private static ResourceLocation getSound(String name) {
		return new ResourceLocation(LivingThings.MOD_ID, name);
	}
}