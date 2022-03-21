package com.red_s2.trampoline.Blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;

import java.util.Random;

public class White extends Block {
    public White(){

        super(Block.Properties.of(Material.METAL)
        .explosionResistance(2f)
        .jumpFactor(2)
        .speedFactor(0.75f)
        .strength(2, 2)
        .dynamicShape());
        
    }
    
    @Override
    public void fallOn(Level level, BlockState blockState, BlockPos blockPos, Entity entity, float fIoat){
        entity.setDeltaMovement(entity.getDeltaMovement().add(entity.getDeltaMovement().x+new Random().nextDouble(0.25)-0.125, entity.getDeltaMovement().y+new Random().nextInt(1), entity.getDeltaMovement().z+new Random().nextDouble(0.25)-0.125));
    }

    @Override
    public VoxelShape getShape(BlockState p_60555_, BlockGetter p_60556_, BlockPos p_60557_, CollisionContext p_60558_) {
        return createShape();
    }

    public static VoxelShape createShape(){
        VoxelShape shape = Shapes.box(0.125, 0, 0.8125, 0.1875, 0.8125, 0.875);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0, 0.125, 0.875, 0.8125, 0.1875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0, 0.125, 0.1875, 0.8125, 0.1875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.8125, 0, 0.8125, 0.875, 0.8125, 0.875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.292893125, 0.74375, 0, 0.707106875, 0.80625, 0.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.292893125, 0.74375, 0, 0.707106875, 0.80625, 0.0625), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.292893125, 0.74375, 0.9375, 0.707106875, 0.80625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.292893125, 0.74375, 0.9375, 0.707106875, 0.80625, 1), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.74375, 0.292893125, 0.0625, 0.80625, 0.707106875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0, 0.74375, 0.292893125, 0.0625, 0.80625, 0.707106875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.74375, 0.292893125, 1, 0.80625, 0.707106875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.9375, 0.74375, 0.292893125, 1, 0.80625, 0.707106875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.125, 0.8125, 0.25, 0.125, 0.875, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(-0.125, 0.8125, 0.25, 0.125, 0.875, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.8125, 0.25, 1.125, 0.875, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.8125, -0.125, 0.75, 0.875, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.8125, 0.875, 0.75, 0.875, 1.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.875, 0.8125, 0.25, 1.125, 0.875, 0.75), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.8125, -0.125, 0.75, 0.875, 0.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.25, 0.8125, 0.875, 0.75, 0.875, 1.125), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.40676, 0.765625, 0.03125, 0.59324, 0.796875, 0.96875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.40676, 0.765625, 0.03125, 0.59324, 0.796875, 0.96875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.40676, 0.765625, 0.03125, 0.59324, 0.796875, 0.96875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.40676, 0.765625, 0.03125, 0.59324, 0.796875, 0.96875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.40676, 0.765625, 0.03125, 0.59324, 0.796875, 0.96875), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.03125, 0.765625, 0.40676, 0.96875, 0.796875, 0.59324), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.03125, 0.765625, 0.40676, 0.96875, 0.796875, 0.59324), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.03125, 0.765625, 0.40676, 0.96875, 0.796875, 0.59324), BooleanOp.OR);
        shape = Shapes.join(shape, Shapes.box(0.125, 0.78125, 0.125, 0.8125, 0.79375, 0.875), BooleanOp.OR);

        return shape;
    }
}
