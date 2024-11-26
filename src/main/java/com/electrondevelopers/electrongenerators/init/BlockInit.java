package com.electrondevelopers.electrongenerators.init;

import com.electrondevelopers.electrongenerators.ElectronGenerators;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ElectronGenerators.MODID);

    public static final RegistryObject<Block> antimatter_block = BLOCKS.register("antimatter_block",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_BLACK)
                    .strength(1.0f, 100f)
                    .lightLevel(value -> 10)
                    .requiresCorrectToolForDrops()
                    .noOcclusion()
    ));
}
