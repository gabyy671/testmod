package net.gaby.gabytestmod.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.List;

public class SpeedyBlock extends Block {

    public SpeedyBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        if(pLevel.isClientSide()){
            if(pEntity instanceof LivingEntity){
                LivingEntity livingEntity = ((LivingEntity) pEntity);
                livingEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60));
            }

        }

        super.stepOn(pLevel, pPos, pState, pEntity);

    }


}
