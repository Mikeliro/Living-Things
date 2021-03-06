package com.tristankechlo.livingthings.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.tristankechlo.livingthings.entities.OwlEntity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OwlModel<T extends OwlEntity> extends EntityModel<T> {

	private final ModelRenderer Body;
	private final ModelRenderer LeftWing;
	private final ModelRenderer RightWing;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer LeftFoot;
	private final ModelRenderer RightToeLeftFoot;
	private final ModelRenderer LeftToeLeftFoot;
	private final ModelRenderer RightLeg;
	private final ModelRenderer RightFoot;
	private final ModelRenderer RightToeRightFoot;
	private final ModelRenderer LeftToeRightFoot;
	private final ModelRenderer Tail;
	private final ModelRenderer Head;
	private final ModelRenderer Beak;

	public OwlModel() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 21.5F, 1.0F);
		setRotationAngle(Body, 0.1745F, 0.0F, 0.0F);
		Body.setTextureOffset(0, 17).addBox(-3.5F, -9.025F, -3.5F, 7.0F, 9.0F, 6.0F, 0.0F, false);

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(3.5F, -8.5792F, -0.4056F);
		Body.addChild(LeftWing);
		setRotationAngle(LeftWing, 0.0F, 0.0F, -0.1309F);
		LeftWing.setTextureOffset(0, 1).addBox(0.0F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);

		RightWing = new ModelRenderer(this);
		RightWing.setRotationPoint(-3.5F, -8.5792F, -0.4056F);
		Body.addChild(RightWing);
		setRotationAngle(RightWing, 0.0F, 0.0F, 0.1309F);
		RightWing.setTextureOffset(15, 1).addBox(-1.0F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.0F, -1.9107F, -1.5699F);
		Body.addChild(LeftLeg);
		setRotationAngle(LeftLeg, -0.2618F, 0.0F, 0.0F);
		LeftLeg.setTextureOffset(31, 1).addBox(-1.0F, 0.1224F, -0.5671F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		LeftFoot = new ModelRenderer(this);
		LeftFoot.setRotationPoint(0.0667F, 3.0978F, 0.5107F);
		LeftLeg.addChild(LeftFoot);
		setRotationAngle(LeftFoot, 0.0873F, 0.0F, 0.0F);
		LeftFoot.setTextureOffset(40, 3).addBox(-1.0667F, -0.0681F, -1.058F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		RightToeLeftFoot = new ModelRenderer(this);
		RightToeLeftFoot.setRotationPoint(-0.5667F, 0.4082F, -1.0494F);
		LeftFoot.addChild(RightToeLeftFoot);
		setRotationAngle(RightToeLeftFoot, 0.0F, 0.1745F, 0.0F);
		RightToeLeftFoot.setTextureOffset(49, 4).addBox(-0.5F, -0.475F, -0.925F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftToeLeftFoot = new ModelRenderer(this);
		LeftToeLeftFoot.setRotationPoint(0.4333F, 0.4332F, -1.0494F);
		LeftFoot.addChild(LeftToeLeftFoot);
		setRotationAngle(LeftToeLeftFoot, 0.0F, -0.1745F, 0.0F);
		LeftToeLeftFoot.setTextureOffset(54, 4).addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.0F, -1.9107F, -1.5699F);
		Body.addChild(RightLeg);
		setRotationAngle(RightLeg, -0.2618F, 0.0F, 0.0F);
		RightLeg.setTextureOffset(31, 7).addBox(-1.0F, 0.1224F, -0.5671F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		RightFoot = new ModelRenderer(this);
		RightFoot.setRotationPoint(0.0667F, 3.0978F, 0.5107F);
		RightLeg.addChild(RightFoot);
		setRotationAngle(RightFoot, 0.0873F, 0.0F, 0.0F);
		RightFoot.setTextureOffset(40, 9).addBox(-1.0667F, -0.0681F, -1.058F, 2.0F, 1.0F, 2.0F, 0.0F, false);

		RightToeRightFoot = new ModelRenderer(this);
		RightToeRightFoot.setRotationPoint(-0.5667F, 0.4082F, -1.0494F);
		RightFoot.addChild(RightToeRightFoot);
		setRotationAngle(RightToeRightFoot, 0.0F, 0.1745F, 0.0F);
		RightToeRightFoot.setTextureOffset(49, 10).addBox(-0.5F, -0.475F, -0.925F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		LeftToeRightFoot = new ModelRenderer(this);
		LeftToeRightFoot.setRotationPoint(0.4333F, 0.4332F, -1.0494F);
		RightFoot.addChild(LeftToeRightFoot);
		setRotationAngle(LeftToeRightFoot, 0.0F, -0.1745F, 0.0F);
		LeftToeRightFoot.setTextureOffset(54, 10).addBox(-0.5F, -0.5F, -0.925F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -0.7652F, 1.3264F);
		Body.addChild(Tail);
		setRotationAngle(Tail, -0.9599F, 0.0F, 0.0F);
		Tail.setTextureOffset(31, 13).addBox(-1.0F, -0.5186F, -0.2595F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -8.5045F, -0.1394F);
		Body.addChild(Head);
		setRotationAngle(Head, -0.1745F, 0.0F, 0.0F);
		Head.setTextureOffset(27, 20).addBox(-3.5F, -6.0F, -3.25F, 7.0F, 6.0F, 6.0F, 0.0F, false);

		Beak = new ModelRenderer(this);
		Beak.setRotationPoint(0.0F, -2.25F, -2.7F);
		Head.addChild(Beak);
		setRotationAngle(Beak, 0.4363F, 0.0F, 0.0F);
		Beak.setTextureOffset(42, 14).addBox(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		if (this.isChild) {
			matrixStack.scale(0.5F, 0.5F, 0.5F);
			matrixStack.translate(0, 1.5D, 0);
		}
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	@Override
	public void setRotationAngles(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,	float headPitch) {
		this.setRotationAngles(getOwlState(entity), entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw,	headPitch);
	}

	@Override
	public void setLivingAnimations(T entity, float limbSwing, float limbSwingAmount, float partialTick) {
		this.setLivingAnimations(getOwlState(entity), entity);
	}

	public void setRotationAngles(OwlState state, T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.rotateAngleX = -0.174532F + headPitch * ((float) Math.PI / 180F);
		this.Head.rotateAngleY = netHeadYaw * ((float) Math.PI / 180F);
	    this.Head.rotateAngleZ = 0.0F;
	    this.Head.rotationPointX = 0.0F;
	    this.Body.rotationPointX = 0.0F;
	    this.Tail.rotationPointX = 0.0F;
	    this.RightWing.rotationPointX = -3.5F;
	    this.LeftWing.rotationPointX = 3.5F;
		switch (state) {
			case SITTING:
				break;				
			case STANDING:
		         this.LeftLeg.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
		         this.RightLeg.rotateAngleX += MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
				break;				
			case FLYING:
			default:
		         this.Tail.rotateAngleX = -0.959931F + MathHelper.cos(limbSwing * 0.6662F) * 0.3F * limbSwingAmount;
		         this.LeftWing.rotateAngleZ = -0.0873F - ageInTicks;
		         this.RightWing.rotateAngleZ = 0.0873F + ageInTicks;
		         break;
		}

	}

	public void setLivingAnimations(OwlState state, OwlEntity owl) {
	    this.Body.rotateAngleX = 0.174532F;
	    
	    this.LeftWing.rotateAngleX = 0F;
	    this.LeftWing.rotateAngleY = 0F;
	    this.LeftWing.rotateAngleZ = -0.130899F;
	    
	    this.RightWing.rotateAngleX = 0F;
	    this.RightWing.rotateAngleY = 0F;
	    this.RightWing.rotateAngleZ = 0.130899F;
	    
	    this.LeftLeg.rotateAngleX = -0.261799F;
	    this.LeftLeg.rotationPointY = -1.9107F;
	    this.LeftLeg.rotateAngleZ = 0F;
	    
	    this.RightLeg.rotateAngleX = -0.261799F;
	    this.RightLeg.rotationPointY = -1.9107F;
	    this.RightLeg.rotateAngleZ = 0F;	    
	    
		switch (state) {
			case SITTING:
				this.Body.rotateAngleX = 0F;
			    this.LeftLeg.rotateAngleX = 0F;
			    this.RightLeg.rotateAngleX = 0F;
				break;
			case FLYING:
				if (Entity.horizontalMag(owl.getMotion()) > 1.0E-7D) {
			        this.LeftLeg.rotateAngleX += 0.6981317F;
			        this.RightLeg.rotateAngleX += 0.6981317F;
				}
				break;
			case STANDING:	
			default:
				break;
		}
	}

	private static OwlState getOwlState(OwlEntity owl) {
		if (owl.isSitting() || owl.isSleeping()) {
			return OwlState.SITTING;
		} else {
			return owl.isFlying() ? OwlState.FLYING : OwlState.STANDING;
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static enum OwlState {
		FLYING, STANDING, SITTING;
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
