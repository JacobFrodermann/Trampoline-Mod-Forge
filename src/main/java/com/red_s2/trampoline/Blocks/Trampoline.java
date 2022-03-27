package com.red_s2.trampoline.Blocks;
import  static  com.red_s2.trampoline.Blocks.Voxel.create;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;

import java.util.*;

public class Trampoline extends Block{
    public Trampoline(Properties props) {
        super(props);
    }
    
    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float p_154571_) {
        if (entity.isSuppressingBounce()) {
            super.fallOn(level, blockState, blockPos, entity, p_154571_);
        } else {
            entity.causeFallDamage(p_154571_/3, 0.0F, DamageSource.FALL);
        }

    }

    public void updateEntityAfterFallOn(BlockGetter p_56406_, Entity p_56407_) {
        if (p_56407_.isSuppressingBounce()) {
            super.updateEntityAfterFallOn(p_56406_, p_56407_);
        } else {
            this.bounceUp(p_56407_);
        }

    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return create();
    }

    private void bounceUp(Entity p_56404_) {//copied from Slime BLock
        Vec3 vec3 = p_56404_.getDeltaMovement();
        if (vec3.y < 0.0D) {
            double d0 = p_56404_ instanceof LivingEntity ? 1.0D : 0.8D;
            p_56404_.setDeltaMovement(vec3.x, -vec3.y * d0, vec3.z);
        }
    }
}
