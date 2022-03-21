package com.red_s2.trampoline.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

import static com.red_s2.trampoline.Blocks.Voxel.create;

public class Red extends Block{
    public Red(Properties props) {
        super(props);
    }
    
    /*@Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float fIoat){
        entity.e
    }*/

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return create();
    }
}
