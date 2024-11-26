package com.electrondevelopers.electrongenerators.init;

import com.electrondevelopers.electrongenerators.ElectronGenerators;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ElectronGenerators.MODID);

    public static final RegistryObject<Item> ANTIMATTER_SHARD = ITEMS.register("antimatter_shard",
            () -> new Item(new Item.Properties()
                    .stacksTo(16)
            )
    );


    public static final RegistryObject<Item> ANTIMATTER_GLOB = ITEMS.register("antimatter_glob",
            ()-> new Item(new Item.Properties()
                    .stacksTo(1)
                    .food(new FoodProperties.Builder()
                            .nutrition(5)
                            .saturationMod(0.2f)
                            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 100, 3),1.0f)
                            .build())
                    .rarity(Rarity.EPIC)
            )
    );

    public static final RegistryObject<BlockItem> antimatter_block_item = ITEMS.register("antimatter_block",
            () -> new BlockItem(
                    BlockInit.antimatter_block.get(), new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.EPIC)
            )
    );

}
