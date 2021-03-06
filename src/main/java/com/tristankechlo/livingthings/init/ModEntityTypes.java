package com.tristankechlo.livingthings.init;

import com.tristankechlo.livingthings.entities.CrabEntity;
import com.tristankechlo.livingthings.entities.ElephantEntity;
import com.tristankechlo.livingthings.entities.FlamingoEntity;
import com.tristankechlo.livingthings.entities.GiraffeEntity;
import com.tristankechlo.livingthings.entities.LionEntity;
import com.tristankechlo.livingthings.entities.MantarayEntity;
import com.tristankechlo.livingthings.entities.OstrichEntity;
import com.tristankechlo.livingthings.entities.OwlEntity;
import com.tristankechlo.livingthings.entities.PenguinEntity;
import com.tristankechlo.livingthings.entities.RaccoonEntity;
import com.tristankechlo.livingthings.entities.SharkEntity;

import java.util.List;

import com.google.common.collect.Lists;
import com.tristankechlo.livingthings.LivingThings;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntitySpawnPlacementRegistry;
import net.minecraft.entity.EntitySpawnPlacementRegistry.PlacementType;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Properties;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.Heightmap;

public class ModEntityTypes {
		
	@SuppressWarnings("rawtypes")
	public static final List<EntityType> ENTITIES = Lists.newArrayList();
    public static final List<Item> SPAWN_EGGS = Lists.newArrayList();
    
    public static final EntityType<ElephantEntity> ELEPHANT_ENTITY = createEntity("elephant", ElephantEntity::new, EntityClassification.CREATURE, 1.85F, 2.7F, 0x000000, 0x4e4e4e);
    public static final EntityType<GiraffeEntity> GIRAFFE_ENTITY = createEntity("giraffe", GiraffeEntity::new, EntityClassification.CREATURE, 1.5F, 3.2F, 0xebb26c, 0x785f40);
    public static final EntityType<LionEntity> LION_ENTITY = createEntity("lion", LionEntity::new, EntityClassification.CREATURE, 1.25F, 1.5F, 0xebb26c, 0xFFFFFF);
    public static final EntityType<SharkEntity> SHARK_ENTIY = createEntity("shark", SharkEntity::new, EntityClassification.WATER_CREATURE, 1.4F, 1.1F, 0x707187, 0x595a6b);
    public static final EntityType<PenguinEntity> PENGUIN_ENTITY = createEntity("penguin", PenguinEntity::new, EntityClassification.CREATURE, 0.8F, 1.45F, 0x000000, 0xFFFFFF);
    public static final EntityType<OstrichEntity> OSTRICH_ENTIY = createEntity("ostrich", OstrichEntity::new, EntityClassification.CREATURE, 0.8F, 1.8F, 0x130d08, 0xa56f5b);
    public static final EntityType<FlamingoEntity> FLAMINGO_ENTIY = createEntity("flamingo", FlamingoEntity::new, EntityClassification.CREATURE, 0.6F, 1.25F, 0xf38989, 0x2d0404);
    public static final EntityType<CrabEntity> CRAB_ENTITY = createEntity("crab", CrabEntity::new, EntityClassification.CREATURE, 0.4F, 0.4F, 0xeb4034, 0x73706f);
    public static final EntityType<MantarayEntity> MANTARAY_ENTITY = createEntity("mantaray", MantarayEntity::new, EntityClassification.WATER_AMBIENT, 0.75F, 0.45F, 0x000896, 0x595a6b);
    public static final EntityType<RaccoonEntity> RACCOON_ENTITY = createEntity("raccoon", RaccoonEntity::new, EntityClassification.CREATURE, 0.5F, 0.75F, 0x6e6e6e, 0x000000);
    public static final EntityType<OwlEntity> OWL_ENTITY = createEntity("owl", OwlEntity::new, EntityClassification.CREATURE, 0.5F, 0.99F, 0xedd7d5, 0x6e3834);


	/**
	 * register Attributes like Health/Speed ... 
	 */
	public static void registerAttributes(){
		GlobalEntityTypeAttributes.put(ELEPHANT_ENTITY, ElephantEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(GIRAFFE_ENTITY, GiraffeEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(LION_ENTITY, LionEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(SHARK_ENTIY, SharkEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(PENGUIN_ENTITY, PenguinEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(OSTRICH_ENTIY, OstrichEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(FLAMINGO_ENTIY, FlamingoEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(CRAB_ENTITY, CrabEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(MANTARAY_ENTITY, MantarayEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(RACCOON_ENTITY, RaccoonEntity.getAttributes().create());
		GlobalEntityTypeAttributes.put(OWL_ENTITY, OwlEntity.getAttributes().create());
	}

	/**
	 * add checks if entity can spawn on specific blocks inside a biome
	 */
	public static void registerEntitySpawnPlacements() {
		EntitySpawnPlacementRegistry.register(ELEPHANT_ENTITY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
		EntitySpawnPlacementRegistry.register(GIRAFFE_ENTITY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
		EntitySpawnPlacementRegistry.register(LION_ENTITY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
		EntitySpawnPlacementRegistry.register(SHARK_ENTIY, PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SharkEntity::canSharkSpawn);
		EntitySpawnPlacementRegistry.register(PENGUIN_ENTITY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
		EntitySpawnPlacementRegistry.register(OSTRICH_ENTIY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
		EntitySpawnPlacementRegistry.register(FLAMINGO_ENTIY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
		EntitySpawnPlacementRegistry.register(CRAB_ENTITY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, CrabEntity::canCrabSpawn);
		EntitySpawnPlacementRegistry.register(MANTARAY_ENTITY, PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MantarayEntity::canMantaraySpawn);
		EntitySpawnPlacementRegistry.register(RACCOON_ENTITY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
		EntitySpawnPlacementRegistry.register(OWL_ENTITY, PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, OwlEntity::canOwlSpawn);
	}

    /**
     * register Entity without SpawnEgg
     */
    private static <T extends CreatureEntity> EntityType<T> createEntity(String entity_name, EntityType.IFactory<T> factory, EntityClassification classification, float width, float height) {
        
    	ResourceLocation location = new ResourceLocation(LivingThings.MOD_ID, entity_name);
        EntityType<T> entity_type = EntityType.Builder.create(factory, classification).size(width, height).build(location.toString());
        entity_type.setRegistryName(location);
        ENTITIES.add(entity_type);
        
        return entity_type;
    }

	/**
     * register Entity with SpawnEgg
     */
    private static <T extends CreatureEntity> EntityType<T> createEntity(String entity_name, EntityType.IFactory<T> factory, EntityClassification classification, float width, float height, int eggPrimaryColor, int eggSecondaryColor) {
        
    	EntityType<T> entity_type = createEntity(entity_name, factory, classification, width, height);        
        addSpawnEggToEntity(entity_name, entity_type, eggPrimaryColor, eggSecondaryColor);
        
        return entity_type;
    }
    
    /**
	 * create SpawnEgg
     */
    private static <T extends CreatureEntity> void addSpawnEggToEntity(String entity_name, EntityType<T> entity_type, int eggPrimaryColor, int eggSecondaryColor) {
    	
    	final Properties standard_properties = new Item.Properties().group(ModItemGroups.General);
    	
        Item spawnEggItem = new SpawnEggItem(entity_type, eggPrimaryColor, eggSecondaryColor, standard_properties);
        spawnEggItem.setRegistryName(new ResourceLocation(LivingThings.MOD_ID, entity_name + "_spawn_egg"));
        SPAWN_EGGS.add(spawnEggItem);
    }

}
