package com.tristankechlo.livingthings.client.renderer;

import com.tristankechlo.livingthings.LivingThings;
import com.tristankechlo.livingthings.client.model.FlamingoModel;
import com.tristankechlo.livingthings.entities.FlamingoEntity;

import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FlamingoRenderer extends MobRenderer<FlamingoEntity, FlamingoModel<FlamingoEntity>>{
	
	protected static final ResourceLocation TEXTURE = new ResourceLocation(LivingThings.MOD_ID,	"textures/entity/flamingo/flamingo_entity.png");

	public FlamingoRenderer(EntityRendererManager renderManagerIn) {
		super(renderManagerIn, new FlamingoModel<>(), 0.35F);
	}

	@Override
	public ResourceLocation getEntityTexture(FlamingoEntity entity) {
		return TEXTURE;
	}

}
