package com.tristankechlo.livingthings.config.entity;

import java.util.Arrays;
import java.util.List;

import com.tristankechlo.livingthings.config.LivingThingsConfig;
import com.tristankechlo.livingthings.init.RegisterEntitiesToBiomes;

import net.minecraft.world.biome.Biomes;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class PenguinConfig {

	public final ConfigValue<Double> health;

	public final ConfigValue<List<? extends String>> spawnBiomes;
	public final ConfigValue<Integer> weight;
	public final ConfigValue<Integer> minSpawns;
	public final ConfigValue<Integer> maxSpawns;

	public PenguinConfig(ForgeConfigSpec.Builder builder) {

		builder.comment("Mob-Config for Penguin").push("Penguin");
		
		health = builder.comment(LivingThingsConfig.requiresRestart).worldRestart().define("Health", 10.0D);

		builder.comment(LivingThingsConfig.requiresRestart + " | " + LivingThingsConfig.disableSpawning + " | " + LivingThingsConfig.spawningVanilla).push("Spawns");
		spawnBiomes = builder.worldRestart().defineList("SpawnBoimes",
					Arrays.asList(Biomes.SNOWY_TUNDRA.getLocation().toString(),
						Biomes.SNOWY_MOUNTAINS.getLocation().toString(),
						Biomes.SNOWY_BEACH.getLocation().toString(),
						Biomes.SNOWY_TAIGA.getLocation().toString(),
						Biomes.SNOWY_TAIGA_HILLS.getLocation().toString(),
						Biomes.SNOWY_TAIGA_MOUNTAINS.getLocation().toString()),
					biome -> RegisterEntitiesToBiomes.checkBiome("Penguin", biome));
		weight = builder.worldRestart().define("SpawnWeight", 12);
		minSpawns = builder.worldRestart().define("MinSpawns", 3);
		maxSpawns = builder.worldRestart().define("MaxSpawns", 6);
		builder.pop();
		
		builder.pop();
		
	}
}
