package com.red_s2.trampoline.Blocks;
import  static  com.red_s2.trampoline.Blocks.Voxel.create;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.CollisionContext;

import java.util.*;

public class Trampoline extends Block{
    public Trampoline(Properties props) {
        super(props);
    }
    
    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float fIoat){
        entity.setDeltaMovement(entity.getDeltaMovement().add(entity.getDeltaMovement().x+new Random().nextDouble(0.25)-0.125, entity.getDeltaMovement().y+new Random().nextInt(1), entity.getDeltaMovement().z+new Random().nextDouble(0.25)-0.125));
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return create();
    }
}
