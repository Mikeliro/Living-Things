package com.tristankechlo.livingthings.client.renderer;

import com.tristankechlo.livingthings.client.model.ElephantModel;
import com.tristankechlo.livingthings.entities.ElephantEntity;
import com.tristankechlo.livingthings.LivingThings;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class ElephantRenderer extends MobRenderer<ElephantEntity, ElephantModel<ElephantEntity>> {
	protected static final ResourceLocation TEXTURE = new ResourceLocation(LivingThings.MOD_ID,	"textures/entity/elephant_entity.png");

	public ElephantRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new ElephantModel<>(), 1.2F);
	}

	public ResourceLocation getEntityTexture(ElephantEntity entity) {
		return TEXTURE;
	}
}